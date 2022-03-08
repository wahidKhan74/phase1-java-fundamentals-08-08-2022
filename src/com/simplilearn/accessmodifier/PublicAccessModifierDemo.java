package com.simplilearn.accessmodifier;

public class PublicAccessModifierDemo {

	public static void main(String[] args) {
		
		Govn govn = new Govn();

		System.out.println("The public transport is : "+ govn.transportation);
		System.out.println("The public park is : "+ govn.park);
		System.out.println("The public assets is : "+ govn.assets);
		
		System.out.println(govn.showPark());
		System.out.println(govn.showPublicAssets());
	}

}

class Govn {
	
	// public variable 
	public String transportation = "Train";
	public String park = "XYZ park";
	public double assets = 45689043542d;
	
	//public method
	public double showPublicAssets() {
		return assets;
	}
	
	public String showPark() {
		return park;
	}
	
	// public constructor
	public Govn() {}
}