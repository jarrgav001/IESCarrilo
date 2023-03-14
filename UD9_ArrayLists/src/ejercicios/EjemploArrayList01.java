package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;


public class EjemploArrayList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("rojo");
		a.add("verde");
		a.add("azul");
		
		System.out.println("Nº de elementos: " + a.size());
		
		a.add("blanco");
		
		System.out.println("Nº de elementos: " + a.size());
		
		System.out.println("El elemento de la posicion 1 es: " + a.get(0));
		System.out.println("El elemento de la posicion 4 es: " + a.get(3));
		
		a.remove(3);
		
		System.out.println("Nº de elementos: " + a.size());
		
		a.set(1, "Turquesa");
		
		System.out.println("");
		
		Iterator<String> it = a.iterator();
		
		while(it.hasNext()) {
			String colores = it.next();
			System.out.println(colores);
		}
		
		System.out.println("");
		
		//Añade un elemento a la posicion indicada sin machacar.
		a.add(1, "verde");
		
		for(int i=0 ; i < a.size() ; i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("");
		
		//Elimina parametros selectivamente.
		a.removeIf(palabra -> palabra.contains("a"));
		
		for(int i=0 ; i < a.size() ; i++) {
			System.out.println(a.get(i));
		}
	}

}
