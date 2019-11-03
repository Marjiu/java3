package com.example.lib;
import java.text.NumberFormat;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();                                                                               // 數字格式
        nf.setMaximumFractionDigits(2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("High:");
        double hight = scanner.nextDouble()/100;
        System.out.println("Wight:");
        double weight = scanner.nextDouble();
        double result = weight/(hight*hight);
        System.out.println("BMI:" + nf.format(result));
    }
}