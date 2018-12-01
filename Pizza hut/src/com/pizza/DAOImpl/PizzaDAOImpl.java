package com.pizza.DAOImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pizza.DAO.PizzaDAO;
import com.pizza.bean.Pizza;

public class PizzaDAOImpl implements PizzaDAO {

	Scanner sc = new Scanner(System.in);
	File orginal = new File("pizza.txt");
	File tempFile = new File("temp.txt");
	static List<Pizza> pizzas = new ArrayList<Pizza>();
	List<Pizza> tempList = new ArrayList<Pizza>();
	FileInputStream fis = null;
	FileOutputStream fos = null;
	ObjectInputStream ois = null;
	ObjectOutputStream oos = null;
	Pizza pizza = null;

	@Override
	public void addmenu()  {
		
		if (orginal.exists()) {
				try {
					orginal.createNewFile();
				
				fos = new FileOutputStream(orginal);
				oos = new ObjectOutputStream(fos);
				int i = 1;
				while (i == 1) {
					pizza = new Pizza();
					System.out.println("Enter pizza number :");
					pizza.setPno(sc.nextInt());
					System.out.println("Enter pizza name :");
					pizza.setPname(sc.next());
					System.out.println("Enter the price of the pizza :");
					pizza.setAmount(sc.nextInt());
					pizzas.add(pizza);
					System.out.println("Do you want to add more student press 1 else any number ?");
					i = sc.nextInt();
				}
				oos.writeObject(pizzas);
				oos.flush();
				System.out.println("Successfully student Record Inserted");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}

	}

	@Override
	public Pizza viewPizza(int pno) {
		Pizza p1 = new Pizza();
		try {
			List<Pizza> pizzas = new ArrayList<Pizza>();
			fis = new FileInputStream(orginal);
			ois = new ObjectInputStream(fis);
			pizzas = (List<Pizza>) ois.readObject();
			for (Pizza pizza : pizzas) {
				if (pizza.getPno() == pno) {
					p1 = pizza;
					break;
				}
			}
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p1;
	}

	@Override
	public List<Pizza> viewAllPizzas() {
		List<Pizza> pizzap1 = new ArrayList<Pizza>();
		try {
			FileInputStream fis1 = new FileInputStream(orginal);
			ObjectInputStream ois1 = new ObjectInputStream(fis1);
			pizzap1 = (List<Pizza>) ois1.readObject();
		} catch (ClassNotFoundException | ClassCastException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pizzap1;
	}

	@Override
	public void updatePizza(int pno) {
		// TODO Auto-generated method stub

	}

	
	@Override
	public void payBill() {
		

	}

	@Override
	public void deletePizza(int pno) {
		// TODO Auto-generated method stub
		
	}

}
