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
			System.out.print("Aggiungi un elemento alla lista dei desideri: ");
			listaDesideri.add(scanner.nextLine());
			System.out.println("La tua lista contiene " + listaDesideri.size() + " desiderio");
			System.out.print("Continuare? s/n ");
			scelta = scanner.nextLine();
		} while (scelta.equals("s"));

		Collections.sort(listaDesideri);
		System.out.println("Ecco la tua lista: ");
		for (int i = 0; i < listaDesideri.size(); i++) {
			System.out.println(listaDesideri.get(i));
		}

		System.out.print("Inserisci il tuo nome: ");
		String nome = scanner.nextLine();

		System.out.print("Inserisci il tuo indirizzo: ");
		String indirizzo = scanner.nextLine();

		LetteraBabboNatale lettera = new LetteraBabboNatale(nome, indirizzo, listaDesideri);
		try {
			System.out.println(lettera.invia());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		scanner.close();
	}
}
