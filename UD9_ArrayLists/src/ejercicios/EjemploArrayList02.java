package ejercicios;

import java.util.ArrayList;

public class EjemploArrayList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(18);
		a.add(22);
		a.add(-30);
		a.add(5);
		a.add(80);
		a.add(-18);
		
		System.out.println("Nº de elementos: " + a.size());
		
		System.out.println("El elemento de la posicion 1 es: " + a.get(0));
		
		System.out.println("");
		
		//Elimina parametros selectivamente.
		a.removeIf(numero -> numero < (10));
		
		for(int i=0 ; i < a.size() ; i++) {
			System.out.println(a.get(i));
		}
	}

}
