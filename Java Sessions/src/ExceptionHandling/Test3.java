package ExceptionHandling;

import java.util.Scanner;

import Encapsulation.main2;

public class Test3 {
	static void studentregistration(int weight,int age) {
		if(weight<40 && age<12) {
			throw new ArithmeticException("student is not eligible for registration");
		}else {
			System.out.println("student entry is valid");
		}
	}
	public static void main(String[] args) {
		System.out.println("welcome to student registration");
		studentregistration(39, 11);
        System.out.println("Thank you");
}}
