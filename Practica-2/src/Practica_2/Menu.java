package Practica_2;

import java.util.Scanner;

public class Menu {
	private int opcion;
	private Consola consola;
	private Calzado calzado;
	private Telefono telefono;
	private Audifono audifono;
	private Guitarra guitarra;
	private Scanner leer;
	
	public Menu() {
		consola = new Consola();
		calzado = new Calzado();
		telefono = new Telefono();
		audifono = new Audifono();
		guitarra = new Guitarra();
		leer = new Scanner(System.in);
	}
	
	public void desplegar() 
	{
		do
		{
			System.out.println("CLASES");
			System.out.println("1.- Consola");
			System.out.println("2.- Calzado");
			System.out.println("3.- Telefono");
			System.out.println("4.- Audifono");
			System.out.println("5.- Guitarra");
			System.out.print("OP: ");
				opcion = leer.nextInt();
						
					switch(opcion) 
					{
						case 1:
							System.out.println("QUE DESEA HACER?");
							System.out.println("1.- Capturar Atributos");
							System.out.println("2.- Imprimir objetos");
							System.out.print("OP: ");
							opcion = leer.nextInt();
							switch(opcion)
							{
								case 1:
									consola.capturar();
									break;
								case 2:
									consola.Imprimir_objetos();
									break;	
							}
						case 2:
							System.out.println("QUE DESEA HACER?");
							System.out.println("1.- Capturar Atributos");
							System.out.println("2.- Imprimir objetos");
							System.out.print("OP: ");
							opcion = leer.nextInt();
							switch(opcion)
							{
								case 1:
									calzado.capturar();
									break;
								case 2:
									calzado.Imprimir_objetos();
									break;		
							}
						case 3:
							System.out.println("QUE DESEA HACER?");
							System.out.println("1.- Capturar Atributos");
							System.out.println("2.- Imprimir objetos");
							System.out.print("OP: ");
							opcion = leer.nextInt();
							switch(opcion)
							{
								case 1:
									telefono.capturar();
									break;
								case 2:
									telefono.Imprimir_objetos();
									break;			
							}
						case 4:
							System.out.println("QUE DESEA HACER?");
							System.out.println("1.- Capturar Atributos");
							System.out.println("2.- Imprimir objetos");
							System.out.print("OP: ");
							opcion = leer.nextInt();
							switch(opcion)
							{
								case 1:
									audifono.capturar();
									break;
								case 2:
									audifono.Imprimir_objetos();
									break;	
							}
						case 5:
							System.out.println("QUE DESEA HACER?");
							System.out.println("1.- Capturar Atributos");
							System.out.println("2.- Imprimir objetos");
							System.out.print("OP: ");
							opcion = leer.nextInt();
							switch(opcion)
							{
								case 1:
									guitarra.capturar();
									break;
								case 2:
									guitarra.Imprimir_objetos();
									break;		
							}
					}
				
		}while(opcion != 5);
		
	}
}