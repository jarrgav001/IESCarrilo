package ejercicios;

import java.util.ArrayList;

import java.util.Iterator;

public class EjemploArrayList03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("rojo");
		a.add("verde");
		a.add("azul");
		a.add("amarillo");
		a.add("negro");
		
		System.out.println("Contenido de la lista: ");
		
		//Mostrar array con for.
		for(int i=0 ; i < a.size() ; i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("");
		
		//Mostrar array con for each.
		for (String string : a) {
			System.out.println(string);
		}
		
		System.out.println("");
		
		//Mostrar con iterator.
		Iterator<String> it = a.iterator();
		
		while(it.hasNext()) {
			String colores = it.next();
			System.out.println(colores);
		}
		
	
	}
	
}
