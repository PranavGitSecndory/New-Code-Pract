package com.in;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskFileWrite {
public static void main(String[] args) {
	FileWriter fw=null;
	BufferedReader br;
	//InputStreamReader isr;
	
	try {
		fw =new FileWriter("Task.txt", true);
		br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter id");
		String id = br.readLine();
		System.out.println("Enter name");
		String name = br.readLine();
		System.out.println("enter Salary");
		String salary = br.readLine();
		
		fw.write(id);
		fw.write("#");
		fw.write(name);
		fw.write("#");
		fw.write(salary);
		fw.write("\n");
		
		
		
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	finally {
		try {
			fw.close();
		} catch (IOException e2) {
			// TODO: handle exception
		}
	}
}
}
