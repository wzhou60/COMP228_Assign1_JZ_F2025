package com.jz.week1.assign1;

import java.util.Scanner;

public class ConvertMiletoKM {

	public void ConvertToKM() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the distance in miles: ");
		double miles = scanner.nextDouble();
		double km = miles * 1.609344;
		System.out.println("The distance in kilometers is: " + String.format("%.2f", km)+" km");
		scanner.close();



	}

}
