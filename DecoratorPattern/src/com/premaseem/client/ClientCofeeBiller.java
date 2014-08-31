package com.premaseem.client;

import java.util.Scanner;

import com.premaseem.decorator.AbstractCoffeRoot;
import com.premaseem.decorator.basecoffee.ColdCoffe;
import com.premaseem.decorator.basecoffee.HotCoffe;

public class ClientCofeeBiller {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {

			System.out.println("This is the Client Main Decorator Pattern ");

			System.out.println("What kind of coffee would you like to have ? ");
			System.out.println("Press 1 for Hot Coffe ");
			System.out.println("Press 2 for Cold Coffe ");
			Integer coffeType =   scan.nextInt();
			AbstractCoffeRoot abstractCoffeRoot =null;
			if(coffeType == 1){
				abstractCoffeRoot = new HotCoffe();
			}else{
				abstractCoffeRoot = new ColdCoffe();
			}
			
			System.out.println("Your final order is");
			System.out.println(abstractCoffeRoot.getDescription());
			System.out.println("Toal cost of order is " + abstractCoffeRoot.getCost());
			System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
			System.out.println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT ");
			repeatRunFlag = scan.nextInt();
		}
	}
}
