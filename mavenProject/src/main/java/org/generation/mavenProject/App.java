package org.generation.mavenProject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, DocumentException{
        Document doc = new Document();
        
        try {
        	PdfWriter.getInstance(doc, new FileOutputStream("CH13.pdf"));
        	doc.open();
        	doc.add(new Paragraph("CH13 cracks...." ));
		} catch ( FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO: handle exception
			e.printStackTrace();
		}// catch
        doc.close();
    } //main
}// class
