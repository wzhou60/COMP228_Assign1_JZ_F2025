package com.jz.week1.assign1;

public class ConvertCADtoUSD {

    public void Convert() {

        System.out.println("Enter the amount in CAD: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double cad = scanner.nextDouble();
        double usd = cad * 0.72;
        System.out.println("The amount in USD is: " + String.format("%.2f", usd) + " USD");
        scanner.close();

    }
}
