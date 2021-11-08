package com.Functional_Program;

import java.util.Scanner;

public class Distance {


	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	 System.out.println("Enter the value of X Point ");
	 int x=scanner.nextInt();  
	 System.out.println("Enter the value of Y point");
	 int y=scanner.nextInt();  
	 scanner.close();
	 float distance = (float) Math.sqrt((x * x) + (y * y));
	 System.out.println("Euclidean Distance of (" + x + "," + y + ") is " + distance);
}

}