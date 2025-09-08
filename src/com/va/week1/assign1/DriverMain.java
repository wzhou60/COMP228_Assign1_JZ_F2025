package com.va.week1.assign1;

import java.util.Scanner;

public class DriverMain {

	public static void main(String[] args) {

		/*
		 * Create objects for classes of task a-d
		 * 
		 */

		GradeCalculation gc = new GradeCalculation();

		// create object for all classes, then call method using switch case
		System.out.println("Enter th choic for opertaion 1-GradeCalc, 2-MilestoKM, ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			System.out.println("Doing Grade Calculations");
			gc.GradeCalc();
			break;

		case 2:
			System.out.println("Doing");
			break;

		}

	}

}
