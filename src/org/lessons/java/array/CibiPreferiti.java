package org.lessons.java.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		String[] cibiPreferiti = {"Pizza", "Panini","Pasta fredda", "Pasta salsicce e zafferano", "Hamburger", "Lasagna", "Pollo", "Tiramisù", "Sorbetto al limone", "Panna cotta"};
		
		System.out.println(cibiPreferiti.length);
		System.out.println(cibiPreferiti[0]);
		System.out.println(cibiPreferiti[cibiPreferiti.length - 1]);
		
		int mediana = cibiPreferiti.length / 2;
		
		if (cibiPreferiti.length % 2 == 0) {
            System.out.println("Siccome l'array ha lunghezza pari consideriamo la mediana come " + cibiPreferiti[mediana - 1] + " oppure " + cibiPreferiti[mediana]);
        } else {
            System.out.println("Il cibo di mezza classifica è " + cibiPreferiti[mediana]);
        }
		
		
		
	}

}
