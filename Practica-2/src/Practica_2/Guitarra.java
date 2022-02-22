package Practica_2;

import java.util.Scanner;
public class Guitarra {
		String marca;
		String modelo;
		String color;
		String precio;
		String pastillas;
		public void capturar(){
			System.out.println("Marca: ");
			Scanner t = new Scanner(System.in);
			marca = t.nextLine();

			System.out.println("Modelo: ");
			modelo = t.nextLine();

			System.out.println("Color: ");
			color = t.nextLine();

			System.out.println("Precio: ");
			precio = t.nextLine();

			System.out.println("Pastillas: ");
			pastillas= t.nextLine();

		}
		
		public void Imprimir_objetos(){
			System.out.println("Marca: " + marca);
			System.out.println("Modelo: " + modelo);
			System.out.println("Color: " + color);
			System.out.println("Precio: $" + precio);
			System.out.println("Pastillas: " + pastillas);
		}

}
