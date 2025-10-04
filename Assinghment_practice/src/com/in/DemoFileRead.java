package com.in;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileRead {
public static void main(String args[])
{
	FileReader fr;
	BufferedReader br;
	
	try {
		fr=new FileReader("C:\\AA Nikhil\\Steram2.txt");
		br =new BufferedReader(fr);
		//Read the first line 
		String data= br.readLine();

		while(data != null)
		{
			System.out.println(data);
			data =br.readLine();
		}
				
	} catch (FileNotFoundException e) {
		// TODO: handle exception
	
		e.printStackTrace();
	}
	catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
}
}
