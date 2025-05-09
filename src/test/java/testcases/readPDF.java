package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

public class readPDF {

	@Test
	public void readPDF1() throws IOException{
		File f = new File("C:\\Users\\vivaa\\Downloads\\Brookside Heights_dec.pdf");	
		PDDocument doc =  Loader.loadPDF(f);	
		PDFTextStripper ps = new PDFTextStripper();
		String test = ps.getText(doc);
		System.out.println(test);		
	}

}
