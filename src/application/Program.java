package application;

import java.util.Locale;
import java.util.Scanner;

import entities.product;

public class Program {

	public static void main(String[] args, String product) {
		Locale.setDefault ( Locale.US);
		Scanner sc = new  Scanner (System.in);
		product pro = new product();
		
		System.out.print("Entre com o id do produto: ");
		int id = sc.nextInt();
		System.out.print("Entre com o nome do produto: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		if (price < 0) {
			System.out.println("Nao entra no estoque pois nao tem price");
		}else if (price > 0) {
		System.out.print("Quantity in stock: " );
		}
		double quantity = sc.nextDouble();
	    System.out.println();
		System.out.println("Product data: " + pro);
		
		 System.out.println();
	     System.out.println("Deseja atualiza o estoque: ");
	     quantity = sc.nextDouble();
		

		sc.close();
	}

}
