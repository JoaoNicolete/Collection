package testaColletions;

import java.util.ArrayList;

public class TestaAula {
	
	public static void main(String[] args) {
		
		Aula aula = new Aula("Lógica", 21);
		Aula aula2 = new Aula("Java 1", 88);
		Aula aula3 = new Aula("SpringBoot", 150);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(aula);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
	
		
	}

}
