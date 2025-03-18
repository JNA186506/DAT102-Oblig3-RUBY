package Uke11_Oppg4;

import java.util.HashSet;
import java.util.Random;

public class HashSetSok {

	public static void main(String[] args) {
		 
		int antElmt = 100000;
		int maxVerdi = 1000000;
		
		HashSet<Integer> hashSet = new HashSet<>();
		int tall = 376; 
        for (int i = 0; i < antElmt; i++) {
			hashSet.add(tall);
			tall = (tall + 45713) % maxVerdi;
        }
        
    	int antallSok = 10000;
    	Random tilfeldig = new Random();
    	int[] sokTab = new int[antallSok];
    	for (int i = 0; i < antallSok; i++) {
    		sokTab[i] = tilfeldig.nextInt(maxVerdi);
    		}
    	
    	long startTid = System.nanoTime();
    	int funnet = 0; 
    	for (int tallSok : sokTab) {
    		if (hashSet.contains(tallSok)) {
    			funnet++; 
    		}
    	}
    	long sluttTid = System.nanoTime();
    	long tid = sluttTid - startTid;
    	
    	System.out.println("Antall treff med søk i HashSet: " + funnet);
    	System.out.println("Tid med sok i HashSet: " + tid/1000000.0 + "ms");
	}
	
}
