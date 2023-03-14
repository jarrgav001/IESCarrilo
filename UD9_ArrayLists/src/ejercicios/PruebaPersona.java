package ejercicios;

import java.util.ArrayList;

public class PruebaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> a = new ArrayList<Persona>();
		
		a.add(new Persona("Pepe", "Sanchez", 22));
		a.add(new Persona("Jose", "Gavira", 50));
		a.add(new Persona("Maria", "Meca", 19));
		
		System.out.println("Array listado: ");
		System.out.println("");
		
		for(int i=0 ; i < a.size() ; i++) {
			System.out.println(a.get(i));
		}
	}
}
