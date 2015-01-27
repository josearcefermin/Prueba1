package controlador;

import modelo.BoletoPrimitiva;

public class Principal {

	public static void main(String[] args) {
		// int[] combinacionGanadora={1,2,3,4,5,6};
		int aciertos;
		BoletoPrimitiva combinacionFernando=new BoletoPrimitiva(8); //princi
		
		BoletoPrimitiva combinacionGanadora=new BoletoPrimitiva(6); //sec
		
		combinacionFernando.imprimirCombinacion(); //princ
		System.out.println();
		
		combinacionGanadora.imprimirCombinacion(); //sec
		
		aciertos=combinacionFernando.getAciertos(combinacionGanadora.getCombinacion());
		System.out.println();
		System.out.println("Numero de aciertos: " + aciertos);
		
		
		
		
		
		
		/*
		 * combinacion ganadora: 1-2-3-4-5-6
		 * Boleto generado aleatoriamente: 15-16-1-8-9-10
		 * Aciertos=1
		 */

	}

}
