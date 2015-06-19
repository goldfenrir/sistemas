/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.TableModel;



import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Utils {
    
    public static void writeXLSXFile(JTable table,String path) throws IOException {
		TableModel model = table.getModel(); //Table model
                
		String excelFileName = path;//name of excel file
 
		String sheetName = "Sheet1";//name of sheet
 
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet(sheetName) ;
                XSSFRow rowH = sheet.createRow(0);
                for(int headings = 0; headings < model.getColumnCount(); headings++){ //For each column
                    rowH.createCell(headings).setCellValue(model.getColumnName(headings));//Write column name
                }
		//iterating r number of rows
		for (int r=1;r <= model.getRowCount(); r++ )
		{
			XSSFRow row = sheet.createRow(r);
 
			//iterating c number of columns
			for (int c=0;c < model.getColumnCount(); c++ )
			{
				XSSFCell cell = row.createCell(c);
	
				cell.setCellValue(""+model.getValueAt(r-1, c));
			}
		}
 
		FileOutputStream fileOut = new FileOutputStream(excelFileName);
 
		//write this workbook to an Outputstream.
		wb.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}
    /*
    public static void writeToExcell(JTable table, Path path) throws FileNotFoundException, IOException {
   
    Row headerRow = sheet.createRow(0); //Create row at line 0
    for(int headings = 0; headings < model.getColumnCount(); headings++){ //For each column
        headerRow.createCell(headings).setCellValue(model.getColumnName(headings));//Write column name
    }

    for(int rows = 0; rows < model.getRowCount(); rows++){ //For each table row
        for(int cols = 0; cols < table.getColumnCount(); cols++){ //For each table column
            row.createCell(cols).setCellValue(model.getValueAt(rows, cols).toString()); //Write value
        }

        //Set the row to the next one in the sequence 
        row = sheet.createRow((rows + 3)); 
    }
    wb.write(new FileOutputStream(path.toString()));//Save the file     
    }*/

    static void imageToPDF(BufferedImage img,String path){
        try{
            Document document = new Document();

        PdfWriter writer = PdfWriter.getInstance(document,
                               new FileOutputStream(path));
        document.open();

        PdfContentByte pdfCB = new PdfContentByte(writer);
        Image image = Image.getInstance(pdfCB, img, 1);
        document.add(new Paragraph("Gráfico de ventas:\n"));
        document.add(image);
        
        // step 5
        document.close();
        //document.close();
        }catch( Exception e){
            e.printStackTrace();
        }
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static double getM(ArrayList<Object> cants){
        double pendiente;
        double sumaProd = 0, sumaX = 0, sumaY = 0, sumaX2=0;
        for(int i = 0; i<cants.size();i++){
            sumaX += (i+1);
            sumaX2 += (i+1)*(i+1);
            if(cants.get(i) instanceof Integer){
                sumaProd += (i+1)*(Integer)cants.get(i);
                sumaY += (Integer)cants.get(i);
            }
            else{
                sumaProd += (i+1)*(Double)cants.get(i);
                sumaY += (Double)(cants.get(i));
            }
        }
        
        int n = cants.size();
        pendiente = ((n*sumaProd)-(sumaX*sumaY))/((n*sumaX2)-(sumaX*sumaX));
        return pendiente;
    }
    
    public static double getConstant(ArrayList<Object> cants, double pend){
        double constante;
        double sumaY = 0, sumaX = 0;
        for(int i = 0; i<cants.size();i++){
            sumaX += (i+1);
            if(cants.get(i) instanceof Integer){
                sumaY += (Integer)cants.get(i);
            }
            else
                sumaY += (Double)cants.get(i);
        }
        constante = (sumaY - (pend * sumaX))/cants.size();
        return constante;
    }
    
    public static ArrayList<Double> generarValoresFuturos(double constant, double pend){
        ArrayList<Double> lista = new ArrayList<Double>();
        for(int i = 1; i<=30 ;i++){
            double num = constant + (pend*i);
            lista.add(num);
        }
        return lista;
    }
    
    public static JFreeChart JTableToLinearChart(JTable table, double constant, double pend, int type){
         final XYSeries series1 = new XYSeries("Graph1");
         final XYSeries series2 = new XYSeries("Graph2");
         for(int i = 0; i + 1 < table.getModel().getRowCount() - 1; i++){
             String st = (String)table.getModel().getValueAt(i,2);
             st.replaceAll("\\s", "");
             if(st != null && st != "")
                if(type == 1) series1.add((i+1)*1.0, (Integer.parseInt(st))*1.0);
                else series1.add((i+1), Double.parseDouble(st));
         }
         ArrayList<Double> values = generarValoresFuturos(constant, pend);
         for(int i = 0; i<values.size();i++){
             series2.add(i+1,values.get(i));
         }
        //final NumberAxis domainAxis = new NumberAxis("Dias ");
        //final ValueAxis rangeAxis = new NumberAxis("Cant Ventas ");

    // create plot ...
        final XYSeriesCollection coll1 = new XYSeriesCollection();
        coll1.addSeries(series1);
        coll1.addSeries(series2);
        //final IntervalXYDataset data0 = coll1;
        //final XYItemRenderer renderer0 = new XYLineAndShapeRenderer();
    // change "new XYBarRenderer(0.20)" to "StandardXYItemRenderer()" if you want to change  type of graph
      final JFreeChart chart = ChartFactory.createXYLineChart("Line Chart demo 6", "dia", "ventas", coll1, PlotOrientation.VERTICAL, true, true, false);
      chart.setBackgroundPaint(Color.white);
      final XYPlot plot = chart.getXYPlot();
      plot.setBackgroundPaint(Color.white);
      plot.setDomainGridlinePaint(Color.white);
      plot.setRangeGridlinePaint(Color.white);
      final XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
      renderer.setSeriesLinesVisible(0, true);
      renderer.setSeriesShapesVisible(1, false);
      plot.setRenderer(renderer);
      final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
      rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
      return chart;
    }
    
    public static JFreeChart JTableToPieChart(JTable table,String title,int ind){
        TableModel model = table.getModel(); 
        DefaultPieDataset data = new DefaultPieDataset();
        // 
        for (int i=0;i<model.getRowCount();i++){
            data.setValue(model.getValueAt(i, ind)+"", 
                    Double.parseDouble(""+model.getValueAt(i,model.getColumnCount()-1)));
        }
        

        // create a chart...
        JFreeChart chart = ChartFactory.createPieChart(
        title,
        data,
        true, // legend?
        true, // tooltips?
        false // URLs?
        );
        return chart;
    }
     public static JFreeChart JTableToBarChart(JTable table,String title,int ind){
         TableModel model = table.getModel(); 
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
          
         for (int i=0;i<model.getRowCount();i++){
            dataset.setValue(Double.parseDouble(""+model.getValueAt(i,model.getColumnCount()-1)),
                    "Total",
                    model.getValueAt(i, ind)+"");
        }
          
         JFreeChart chart = ChartFactory.createBarChart(
            "Bar Chart Demo",         // chart title
            "Category",               // domain axis label
            "Value",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );
           return chart;
     }
}
