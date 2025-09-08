package com.jz.week1.assign1.Driver;

import com.jz.week1.assign1.ConvertLitertoGallon;
import com.jz.week1.assign1.ConvertMiletoKM;
import com.jz.week1.assign1.GradeCalculation;
import java.util.Scanner;

public class DriverMain {

    public static void main(String[] args) {

        /*
		 * Create objects for classes of task a-d
		 * 
         */
        GradeCalculation gc = new GradeCalculation();
        ConvertMiletoKM con = new ConvertMiletoKM();
        ConvertLitertoGallon cl = new ConvertLitertoGallon();

        // create object for all classes, then call method using switch case
        System.out.println("Enter the choice for operation 1-GradeCalc, 2-MilestoKM, ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Doing Grade Calculations");
                gc.GradeCalc();
                break;

            case 2:
                System.out.println("Converting Miles to KM");
                con.ConvertToKM();
                break;

            case 3:
                System.out.println("Doing Liters to Gallons");
                cl.Convert();
                break;

        }

    }

}
