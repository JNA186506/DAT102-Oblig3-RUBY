package Uke11_Oppg4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class HashSetOgTabellSok {

	public static void main(String[] args) {
		 
		int antElmt = 100000;
		int maxVerdi = 1000000;
		
		int[] tabell = new int[antElmt];
		HashSet<Integer> hashSet = new HashSet<>();
		
		int tall = 376; 
        for (int i = 0; i < antElmt; i++) {
        	tabell[i] = tall;
			hashSet.add(tall);
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
    	
    	
		
    	long startTid2 = System.nanoTime();
    	int funnet = 0; 
    	for (int tallSok : sokTab) {
    		if (hashSet.contains(tallSok)) {
    			funnet++; 
    		}
    	}
    	long sluttTid2 = System.nanoTime();
    	long tid2 = sluttTid2 - startTid2;
    	
    	

		System.out.println("Antall treff med binærsøk: " + funnetSok);
		System.out.println("Tid for binærsøk = " + Tid/1000000.0 + "ms");
    	System.out.println("Antall treff med søk i HashSet: " + funnet);
    	System.out.println("Tid med sok i HashSet: " + tid2/1000000.0 + "ms");
	}
	
}
