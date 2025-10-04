package Tutorial_impl;

import Tutorial_Data.Tutorial_Data;

public class Sub_Class extends Tutorial_Data {
 public void show_Impl(int number) 
 {

System.out.println("Debug3");
	 Sub_Class d = new Sub_Class();
	 switch (number) {
     case 1:
         d.Static1();
         break;
     case 2:
         Class();
         break;
     case 3:
         Final();
         break;
     case 4:
         Private();
         break;
     case 5:
         Interface();
         break;
     case 6:
         Polymorphism();
         break;
     case 7:
         Exit();
         break;
     default:
         System.out.println("Invalid input. Please enter a number between 1 and 7.");
 }
	
 }}






 