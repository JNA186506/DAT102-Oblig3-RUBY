package no.hvl.dat102.oppgave4.f;

import java.util.ArrayList;

public class HobbyMatchMain {

	public static void main(String[] args) {
		
		Person arne = new Person("Arne", "jakt", "sykling", "venner", "data");
		Person john = new Person("John", "fiske", "spill", "venner", "data");
		Person nils = new Person("Nils", "sport", "sykling", "poesi", "teater");
		
		System.out.println("Arne + John: " + match(arne, john));
		System.out.println("John + Nils: " + match(john, nils));
		System.out.println("Nils + Arne: " + match(nils, arne));
		System.out.println("Arne + Arne: " + match(arne, arne));
		System.out.println("John + Arne: " + match(john, arne));
		
	}
	
	static double match(Person a, Person b) {
		
		double antallFelles = 0;
		double antallKunHosDenEne = 0;
		double antallKunHosDenAndre = 0;
		double antallTotalt = 0;
		
		ArrayList<String> hobbyA = a.getHobbyer();
		ArrayList<String> hobbyB = b.getHobbyer();
		
		for(String s : hobbyA) {
			
			antallTotalt += 1;
			if(hobbyB.contains(s)) antallFelles += 1;
			else antallKunHosDenEne += 1;
			
		}
		
		for(String s : hobbyB) {
			
			antallTotalt += 1;
			if(!hobbyB.contains(s)) antallKunHosDenAndre += 1;
			
		}
		
		return antallFelles - (antallKunHosDenEne + antallKunHosDenAndre) / antallTotalt;
		
	}

}
