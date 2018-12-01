package com.pizza.main;

import java.util.Scanner;

import com.pizza.hut.PizzaHut;

public class PizzaMg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("---------------------------------");
			System.out.println("|   SCHOOL MANAGEMENT SYSTEM    |");
			System.out.println("---------------------------------");
			System.out.println("|   1. ADMIN                    |");
			System.out.println("|   2. CUSTOMER                 |");
			System.out.println("|   3. EXIT                     |");
			System.out.println("---------------------------------");
			System.out.println("Enter Your Choice ?");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				PizzaHut.adminmenu();
				break;
			case 2:
				PizzaHut.Customermenu();
				break;
			case 3:
				System.exit(0);
				default:
					System.out.println("please enter 1-3 value only");
			}
		}

	}

}
