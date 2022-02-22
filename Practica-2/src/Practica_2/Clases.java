package Practica_2;

import java.util.Scanner;
public class Clases {
		String nombre;
		String marca;
		String modelo;
		String color;
		String precio;
		String memoria;		
		public void capturar(){
			System.out.println("Consola: ");	
			Scanner t = new Scanner(System.in);
			nombre = t.nextLine();
			
			System.out.println("Marca: ");
			marca = t.nextLine();

			System.out.println("Modelo: ");
			modelo = t.nextLine();

			System.out.println("Color: ");
			color = t.nextLine();

			System.out.println("Precio: ");
			precio = t.nextLine();

			System.out.println("Memoria: ");
			memoria = t.nextLine();
			
			}
		
		public void Imprimir_objetos(){
			System.out.println("Consola: " + nombre);
			System.out.println("Marca: " + marca);
			System.out.println("Modelo: " + modelo);
			System.out.println("Color: " + color);
			System.out.println("Precio: $" + precio);
			System.out.println("Memoria: " + memoria +"GB");
		}
		
}
