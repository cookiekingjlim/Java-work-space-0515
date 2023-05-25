package com.kh.example.practice4.model;

public class Snack {

	
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
//		alt + shift + s ---> constructor super class ----> generate constructor 웅앵..----> generate getter seller 'select all' -----> generate toString
	public Snack() {}
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
		
		
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getNumOf() {
		return numOf;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return "kind : " + kind + ", name : " + name + ", flavor : " + flavor + ", numOf : " + numOf + ", price : "+ price;
		
	}
	
}
