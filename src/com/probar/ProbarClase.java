package com.probar;
import java.io.File;
import java.util.Scanner;

public class ProbarClase {

	 public static void main(String[] args) throws Exception {
	        File myFile = new File("src/examen/employees.xml");
	        System.out.println("Attempting to read from file in: "+myFile.getCanonicalPath());

	        Scanner input = new Scanner(myFile);
	        String in = "";
	        in = input.nextLine();
	    }
}
