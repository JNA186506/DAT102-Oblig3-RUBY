package Uke11_Oppg4;

import java.util.Arrays;
import java.util.Random;

public class Tabell {

	public static void main(String[] args) {
		
		int antElmt = 100000;
		int maxVerdi = 1000000;
		int[] tabell = new int[antElmt];
		
		
		int tall = 376;
		for (int i = 0; i < antElmt; i++) {
			tabell[i] = tall;
			tall = (tall + 45713) % maxVerdi;
			
		}
		Arrays.sort(tabell);
		
		
		int antallSok = 10000;
		Random tilfeldig = new Random();
		int[] sokTab = new int[antallSok];
		for (int i = 0; i < antallSok; i++) {
			sokTab[i] = tilfeldig.nextInt(maxVerdi);
			}
			
		long startTid = System.nanoTime();
		int funnetSok = 0; 	
		for(int tallSok : sokTab) {
			if (Arrays.binarySearch(tabell, tallSok) >= 0) {
					funnetSok++;
			}
		}
		long sluttTid = System.nanoTime();
		long Tid = sluttTid - startTid;
			
		
		System.out.println("Antall treff med binærsøk: " + funnetSok);
		System.out.println("Tid for binærsøk = " + Tid/1000000.0 + "ms");
	}
	
}
