package com.app.fruits;
import java.util.*;
public class Fruits {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh=true;
	public Fruits()
	{
		this("",0,"",false);
	}
	public Fruits(String color, double weight, String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	public String taste()
	{
		return "No Specific Taste";
	}
	public void acceptData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter color of the fruit");
		this.color=sc.next();
		System.out.println("Enter weight of the fruit");
		this.weight=sc.nextDouble();
		System.out.println("Enter name of the fruit");
		this.name=sc.next();
		System.out.println("Enter 1 if fruit is fresh ");
		System.out.println("Enter 2 if fruit is not fresh");
		this.isFresh=sc.hasNext();
	}
	public void displayData()
	{
		System.out.println("Name = "+this.name);
		System.out.println("Weight = "+this.weight);
		System.out.println("Color = "+this.color);
		System.out.println(this.name+"is Fresh = "+this.isFresh);
	}
	@Override
	public String toString() {
		return (this.name+"  "+this.color+"  "+this.weight);
	}
}
