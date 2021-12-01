package org.generation.italy.christmas;

import java.util.ArrayList;

public class LetteraBabboNatale {

	// attributi
	private String nome;
	private String indirizzo;
	private ArrayList<String> listaDesideri;

	// costruttore
	public LetteraBabboNatale(String nome, String indirizzo, ArrayList<String> listaDesideri) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.listaDesideri = listaDesideri;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public ArrayList<String> getListaDesideri() {
		return listaDesideri;
	}

	public void setListaDesideri(ArrayList<String> listaDesideri) {
		this.listaDesideri = listaDesideri;
	}

	// metodo
	public String invia() throws Exception {
		if (listaDesideri.size() <= 5) {
			return nome + " " + indirizzo + " " + listaDesideri;
		} else {
			// errore
			throw new Exception("Errore: la lunghezza massima di desideri consentita è di 5 desideri ");
		}

	}

}
