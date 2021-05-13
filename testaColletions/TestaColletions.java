package testaColletions;

import java.util.ArrayList;
import java.util.Collections;

public class TestaColletions {

	public static void main(String[] args) {
		String aula1 = "Lógica de Programação";
		String aula2 = "Java 1";
		String aula3 = "Projeto final";
		String aula4 = "SpringBoot";
		
		ArrayList<String> aulas = new ArrayList<String>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		
		System.out.println(aulas);
		
		//aulas.remove(0);
		
		//System.out.println(aulas);
		// for especializado para arrays: foreach
		
		for(String aula: aulas) {
			System.out.println("Aula:  " + aula);
		}
		
		//String primeiraAula = aulas.get(3);
		System.out.println(aulas.get(3));
		
		for(int i=0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
		
		System.out.println(aulas.size());
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		Collections.shuffle(aulas);
		System.out.println(aulas);
		
		
		
	}

}
