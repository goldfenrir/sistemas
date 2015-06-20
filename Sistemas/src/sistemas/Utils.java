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
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Chart;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.charts.AxisCrosses;
import org.apache.poi.ss.usermodel.charts.AxisPosition;
import org.apache.poi.ss.usermodel.charts.ChartAxis;
import org.apache.poi.ss.usermodel.charts.ChartDataSource;
import org.apache.poi.ss.usermodel.charts.ChartLegend;
import org.apache.poi.ss.usermodel.charts.DataSources;
import org.apache.poi.ss.usermodel.charts.LegendPosition;
import org.apache.poi.ss.usermodel.charts.LineChartData;
import org.apache.poi.ss.usermodel.charts.ValueAxis;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Utils {
    
    public static void chartExcel(ArrayList<Object> actuales, ArrayList<Object>futuros, String path) throws Exception {
        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("linechart");
        final int NUM_OF_ROWS = 30;
        final int NUM_OF_COLUMNS = 5;

        // Create a row and put some cells in it. Rows are 0 based.
        Row row;
        Cell cell;
        for(int i = 0; i<15; i++){
            row = sheet.createRow((short) i);
            cell = row.createCell((short) 0);
            cell.setCellValue(i+1);
            cell = row.createCell((short) 1);
            if(actuales.get(i) instanceof Integer)
            cell.setCellValue((Integer)actuales.get(i));
            else
                cell.setCellValue((Double)actuales.get(i));
            cell = row.createCell((short) 3);
            cell.setCellValue(i+1);
            cell = row.createCell((short) 4);
            cell.setCellValue((Double)futuros.get(i));
        }
        for(int i =15; i<30;i++){
            row = sheet.createRow((short)i);
            cell = row.createCell(3);
            cell.setCellValue(i+1);
            cell = row.createCell(4);
            cell.setCellValue((Double)futuros.get(i));
        }

        Drawing drawing = sheet.createDrawingPatriarch();
        ClientAnchor anchor = drawing.createAnchor(0, 0, 0, 0, 0, 35, 10, 45);

        Chart chart = drawing.createChart(anchor);
        ChartLegend legend = chart.getOrCreateLegend();
        legend.setPosition(LegendPosition.TOP_RIGHT);

        LineChartData data = chart.getChartDataFactory().createLineChartData();

        // Use a category axis for the bottom axis.
        ChartAxis bottomAxis = chart.getChartAxisFactory().createCategoryAxis(AxisPosition.BOTTOM);
        ValueAxis leftAxis = chart.getChartAxisFactory().createValueAxis(AxisPosition.LEFT);
        leftAxis.setCrosses(AxisCrosses.AUTO_ZERO);

        ChartDataSource<Number> xs = DataSources.fromNumericCellRange(sheet, new CellRangeAddress(0, 29, 3, 3));
        ChartDataSource<Number> ys1 = DataSources.fromNumericCellRange(sheet, new CellRangeAddress(0, 29, 1, 1));
        ChartDataSource<Number> ys2 = DataSources.fromNumericCellRange(sheet, new CellRangeAddress(0, 29, 4, 4));


        data.addSeries(xs, ys1);
        data.addSeries(xs, ys2);

        chart.plot(data, bottomAxis, leftAxis);

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream(path);
        wb.write(fileOut);
        fileOut.close();
    }
    
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
        for(int i = 0; i<15;i++){
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
        
        int n = cants.size()/2;
        pendiente = ((n*sumaProd)-(sumaX*sumaY))/((n*sumaX2)-(sumaX*sumaX));
        return pendiente;
    }
    
    public static double getConstant(ArrayList<Object> cants, double pend){
        double constante;
        double sumaY = 0, sumaX = 0;
        for(int i = 0; i<15;i++){
            sumaX += (i+1);
            if(cants.get(i) instanceof Integer){
                sumaY += (Integer)cants.get(i);
            }
            else
                sumaY += (Double)cants.get(i);
        }
        constante = (sumaY - (pend * sumaX))/cants.size()/2;
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
    
    public static double calculateExpB(ArrayList<Object>cants){
        double sumatXlnY =0, sumatX = 0, sumatX2 = 0, sumatLnY = 0;
        double promLnY = 0, promX = 0;
        for(int i = 0; i<15; i++){
            sumatX += (i+1);
            sumatX2 += (i+1)*(i+1);
            if(cants.get(i) instanceof Double){
                double num = (Double)(cants.get(i));
                if(num>0){
                sumatXlnY += (Math.log(num)*(i+1));
                sumatLnY += Math.log(num);
                }
            }
            if(cants.get(i) instanceof Integer){
                
                int num = (Integer)cants.get(i);
                if(num>0){
                ///System.out.println("ese numero" + num);
                sumatXlnY += (Math.log(num)*(i+1));
                //System.out.println("ese numero xlny" + sumatXlnY);
                sumatLnY += Math.log(num);
                }
            }
        }
        //System.out.println("resultados de b, sumatxlny: "+ sumatXlnY);
        //System.out.println("resultados de b, sumatlny: "+ sumatLnY);
        promLnY = (sumatLnY*1.0)/15;
        promX = (sumatX)/15;
        //System.out.println("sumatoria x " + sumatX + " promedio x: "+promX);
        //System.out.println("promedio lny: " +promLnY);
        double b = (sumatXlnY - (promLnY*sumatX))/(sumatX2 -( promX*sumatX));
        return b;
    }
    
    public static ArrayList<Double> generarValoresExp(double a, double b){
        ArrayList<Double> list = new ArrayList<Double>();
        for(int i = 1; i<=30 ;i++){
            double num = a*Math.exp(b*i);
            list.add(num);
        }
        return list;
    }
    
    public static double calculateExpA(ArrayList<Object> cants, double b){
        double sumatLnY = 0, sumatX = 0, promX, promLnY;
        for(int i = 0; i<15;i++){
            sumatX += (i+1);
            if(cants.get(i) instanceof Double){
                double num = (Double)cants.get(i);
                if(num>0)
                sumatLnY += Math.log(num);
            }
            else{
                int num = (Integer)cants.get(i);
                if(num>0)
                sumatLnY += Math.log(num);
            }
        }
        promX = (sumatX *1.0)/ 15;
        promLnY = (sumatLnY * 1.0)/15;
        double a = Math.exp(promLnY - (b*promX));
        return a;
    }
    
    public static JFreeChart JTableToExpChart(JTable table, double a, double b, int type){
        final XYSeries series1 = new XYSeries("Valores Actuales");
         final XYSeries series2 = new XYSeries("Valores proyectados");
         for(int i = 0; i + 1 < table.getModel().getRowCount() - 1; i++){
             String st = (String)table.getModel().getValueAt(i,2);
             st.replaceAll("\\s", "");
             if(st != null && st != "")
                if(type == 1) series1.add((i+1)*1.0, (Integer.parseInt(st))*1.0);
                else series1.add((i+1), Double.parseDouble(st));
         }
         ArrayList<Double> values = generarValoresExp(a, b);
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
      final JFreeChart chart = ChartFactory.createXYLineChart("Proyección de ventas", "Días", "Ventas", coll1, PlotOrientation.VERTICAL, true, true, false);
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
    
    public static JFreeChart JTableToLinearChart(JTable table, double constant, double pend, int type){
         final XYSeries series1 = new XYSeries("Valores Actuales");
         final XYSeries series2 = new XYSeries("Valores Proyectados");
         for(int i = 0; i < table.getModel().getRowCount() ; i++){
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
