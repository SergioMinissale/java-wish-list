package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<String> listaDesideri = new ArrayList<String>();
		String scelta = " ";

		do {
			System.out.println("Aggiungi un elemento alla lista dei desideri: ");
			listaDesideri.add(scanner.nextLine());
			System.out.println("La tua lista contiene " + listaDesideri.size() + " desiderio");
			System.out.print("Continuare? s/n ");
			scelta = scanner.nextLine();
		} while (scelta.equals("s"));

		System.out.println("Ecco la tua lista: " + listaDesideri);
		
		Collections.sort(listaDesideri);
		System.out.println("Ecco la tua lista ordinata: " + listaDesideri);
		scanner.close();
	
	}

}
