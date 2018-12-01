package com.pizza.bean;

public class Pizza {

	public int qty;
	public int pno;
	public int amount;
	public String pname;
	public int total;

	public Pizza() {
	}

	

	public Pizza(int qty, int pno, int amount, String pname, int total) {
		super();
		this.qty = qty;
		this.pno = pno;
		this.amount = amount;
		this.pname = pname;
		this.total = total;
	}



	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}



	@Override
	public String toString() {
		return  qty + "\t" + pno + "\t" + amount + "\t" + pname + "\t" + total
				+ "]";
	}

	

}
