package com.pizza.hut;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.pizza.DAOImpl.PizzaDAOImpl;
import com.pizza.bean.Pizza;
import com.pizza.main.PizzaMg;


public class PizzaHut {

	static Scanner sc = new Scanner(System.in);
	static PizzaDAOImpl PizzaDAO = new PizzaDAOImpl();

	public static void adminmenu() {
		System.out.println("---------------------------");
		System.out.println("|       ADMIN MENU        |");
		System.out.println("---------------------------");
		System.out.println("|  1. ADD PIZZA        |");
		System.out.println("|  2. VIEW PIZZA        |");
		System.out.println("|  3. VIEW ALL PIZZAS   |");
		System.out.println("|  4. UPDATE PIZZA      |");
		System.out.println("|  5. DELETE PIZZA      |");
		System.out.println("|  6. BACK                |");
		System.out.println("---------------------------");
		System.out.println("Enter Your Choice ?");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			
				PizzaDAO.addmenu();
			
			adminmenu();
			break;
		case 2:
			System.out.println("enter pizza number :");
			Pizza pizza = PizzaDAO.viewPizza(sc.nextInt());
			System.out.println("PNO" + "\t" + "PNAME" + "\t" + "PRICE");
			System.out.println("-----------------------------------------------------------------");
			System.out.println(pizza);
			adminmenu();
			break;
		case 3:
			List<Pizza> pizzas = PizzaDAO.viewAllPizzas();
			System.out.println("PNO" + "\t" + "PNAME" + "\t" + "PRICE");
			System.out.println("-----------------------------------------------------------------");
			for(Pizza p:pizzas) {
				System.out.println(p);
			}
			adminmenu();
			break;
		case 4:
			
		case 5:
			
		case 6:
			
			default:
				System.out.println("Enter correct number");
		}
	}
	
	public static void Customermenu() {
		System.out.println("---------------------------");
		System.out.println("|       STUDENT MENU      |");
		System.out.println("---------------------------");
		System.out.println("|  1. VIEW MENU           |");
		System.out.println("|  2. Choose pizza        |");
		System.out.println("|  3. PAY                 |");
		System.out.println("|  4. BACK                |");
		System.out.println("---------------------------");
		System.out.println("Enter Your Choice ?");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			List<Pizza> pizzas = PizzaDAO.viewAllPizzas();
			System.out.println("PNO" + "\t" + "PNAME" + "\t" + "PRICE");
			System.out.println("-----------------------------------------------------------------");
			for(Pizza p:pizzas) {
				System.out.println(p);
			}
			Customermenu();
			break;
			
		case 2:
			
		case 3:
		case 4:
			PizzaMg.main(null);
			break;
			default:
				System.out.println("enter correct choice : ");
			
		}
	}

}
