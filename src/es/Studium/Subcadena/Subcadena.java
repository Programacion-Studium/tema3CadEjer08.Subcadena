package es.Studium.Subcadena;

import java.util.Scanner;

public class Subcadena 
{
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		String frase;
		int posicion, longitud;
		System.out.println("indique una frase");
		frase=teclado.nextLine();
		System.out.println("indique una posicion del 0 al "+frase.length());
		posicion=teclado.nextInt();
		if((posicion>frase.length())||(posicion<0))
		{
			System.out.println("Error la posicion tiene que estar entre 0 y "+frase.length());
		}
		else
		{
			System.out.println("indique una Longitud desde el "+posicion+" hasta "+frase.length());
			longitud=teclado.nextInt();
			
			if ((longitud>frase.length())||(longitud<0))
			{
				System.out.println("Error la longitud tiene que estar entre "+posicion+" y "+frase.length());
			}
			else
			{
			sbcadena(frase, posicion, longitud);
			}
		}
		
		teclado.close();
	}

	private static void sbcadena(String frase, int posicion, int longitud) {
		String subfrase;
		subfrase=frase.substring(posicion, longitud);
		System.out.println(subfrase);
	}
}
