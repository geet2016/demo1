package com.example.demo1;

import java.io.*;

import org.apache.commons.io.FileUtils;


public class ThreadEx extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		File f = new File("C:/Users/Gchoudhari/Desktop/ee.proc111");
	
		try {
				Thread.sleep(8000);
			method1(f);
		} 
		catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void method1(File f) throws IOException
	{
			System.out.println("deleting !!!!!!!!!!!!!"+f.exists());
			try {
				FileUtils.deleteDirectory(f);
				throw new IOException();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				StringWriter errorTrace = new StringWriter();
                e.printStackTrace(new PrintWriter(errorTrace));
            
		            System.out.println("deleting !!!!!!!!!!!!!"+errorTrace.toString());
			 FileUtils.deleteDirectory(f);
			}
	   
	}
}
