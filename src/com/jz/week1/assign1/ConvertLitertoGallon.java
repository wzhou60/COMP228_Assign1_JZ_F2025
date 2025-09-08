package com.jz.week1.assign1;

import java.util.Scanner;

public class ConvertLitertoGallon {


public void Convert(){
 
    System.out.println("Enter the volume in liters: ");
    Scanner scanner = new Scanner(System.in);
    double liters = scanner.nextDouble();
    double gallons = liters / 3.785;
    System.out.println("The volume in gallons is: " + String.format("%.2f", gallons)+" gallons");
    scanner.close();

}


}
