package Entities;

import Abstracts.Entity;

public class Campaign implements Entity {
	
	private int id;
	private String name;
	private double discountPrice;
	
	public Campaign() {
		
	}

	public Campaign(int id, String name, double discountPrice) {
		super();
		this.id = id;
		this.name = name;
		this.discountPrice = discountPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}


	
	

}
