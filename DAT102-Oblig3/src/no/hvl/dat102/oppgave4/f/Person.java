package no.hvl.dat102.oppgave4.f;

import java.util.ArrayList;

public class Person {
	
	private String navn;
	private ArrayList<String> hobbyer;
	
	public Person(String navn, String ...hobbyer) {
		
		this.navn = navn;
		this.hobbyer = new ArrayList<>();
		for(String s : hobbyer) this.hobbyer.add(s);
		
	}
	
	public String getNavn() {
		
		return navn;
		
	}
	
	public ArrayList<String> getHobbyer() {
		
		return hobbyer;
		
	}
	
	public void addHobby(String newHobby) {
		
		hobbyer.add(newHobby);
		
	}
	
}
