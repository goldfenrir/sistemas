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
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import javax.swing.JTable;
import javax.swing.table.TableModel;



import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Utils {
    
    public static void writeXLSXFile(JTable table,String path) throws IOException {
		TableModel model = table.getModel(); //Table model
                
		String excelFileName = path;//name of excel file
 
		String sheetName = "Sheet1";//name of sheet
 
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet(sheetName) ;
 
		//iterating r number of rows
		for (int r=0;r < 5; r++ )
		{
			XSSFRow row = sheet.createRow(r);
 
			//iterating c number of columns
			for (int c=0;c < 5; c++ )
			{
				XSSFCell cell = row.createCell(c);
	
				cell.setCellValue("Cell "+r+" "+c);
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

    static void imageToPDF(BufferedImage img){
        try{
            Document document = new Document();

        PdfWriter writer = PdfWriter.getInstance(document,
                               new FileOutputStream("Image.pdf"));
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
