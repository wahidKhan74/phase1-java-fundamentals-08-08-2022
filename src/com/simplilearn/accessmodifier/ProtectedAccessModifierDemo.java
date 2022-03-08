package com.simplilearn.accessmodifier;

import com.simplilearn.typecasting.SuperHero;

public class ProtectedAccessModifierDemo extends SuperHero {

	public static void main(String[] args) {

		Hero hero = new Hero();

		System.out.println("Power : " + hero.power);
		System.out.println("Rank : " + hero.rank);

		hero.showPower();
		hero.showRank();

		// create a super hero object

		SuperHero superhero = new SuperHero();
		// superhero.rank; // compile time error
		// superhero.name; // compile time error
		// superhero.power; // compile time error
		// superhero.showHero(); // compile time error

		ProtectedAccessModifierDemo pamd = new ProtectedAccessModifierDemo();
		System.out.println(pamd.rank); // no compile time error
		System.out.println(pamd.name); // no compile time error
		System.out.println(pamd.power) ; // no compile time error
		pamd.showHero(); // no compile time error

	}

}

class Hero {

	// protected data
	protected int rank = 1;
	protected String power = "Healing Power :: Wolworeen !";

	// protected method
	protected String showPower() {
		System.out.println("The hero power is " + power);
		return power;
	}

	// public method
	public void showRank() {
		System.out.println("The rank is : " + rank);
	}
}