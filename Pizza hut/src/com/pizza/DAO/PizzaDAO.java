package com.pizza.DAO;

import java.io.IOException;
import java.util.List;

import com.pizza.bean.Pizza;

public interface PizzaDAO {

	public void addmenu();

	public Pizza viewPizza(int pno);

	public List<Pizza> viewAllPizzas();

	public void updatePizza(int pno);

	public void deletePizza(int pno);

	public void payBill();

}
