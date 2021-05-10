package com.lip6.entities;

/**
 *  Plusieurs voyageurs peuvent etre inscrits sur le meme voyage (exemple famille).
 */
public class Voyageur extends Personne {


	/** 
	 *  numero de passeport ou de carte d'identit? (compose de chiffres et de lettre donc on met par d?faut un type String)
	 */
	private String numeroPieceIdentite;
	private int age;
	//public Reservation reservation;
	
	
	
	public Voyageur(String numeroPieceIdentite, int age) {
		this.numeroPieceIdentite = numeroPieceIdentite;
		this.age = age;

	}
	public Voyageur() {
		super();
		
	}
	public String getNumeroPieceIdentite() {
		return numeroPieceIdentite;
	}
	public void setNumeroPieceIdentite(String numeroPieceIdentite) {
		this.numeroPieceIdentite = numeroPieceIdentite;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}






}