package com.eshipz.qa.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.lept.PIX;
import org.bytedeco.javacpp.tesseract.TessBaseAPI;
import org.testng.annotations.Test;

public class ReadFromImage 
{
	static String STR = "";
	@Test(enabled=true)
	public void image()
	{
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("C:\\Users\\Krupa\\Downloads\\EZ8220567.pdf"));
		    System.out.println(img);
		} catch (IOException e) {
		}
	}
	
@Test(enabled=false)
	public static void method2() {
	File file = new File("C:/Users/Krupa/Desktop/automate_image.jpg");
	BufferedImage image = null;
	
	try
    {
        image = ImageIO.read(file);
         System.out.println(image);
    } 
    catch (IOException e) 
    {
        e.printStackTrace();
    }
	
    }
	
}
