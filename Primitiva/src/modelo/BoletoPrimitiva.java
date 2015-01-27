package modelo;

import java.util.Arrays;
import java.util.Random;

public class BoletoPrimitiva {
	
	
	private int[] combinacion;
	public BoletoPrimitiva(int numeroApuestas){
		combinacion = new int[numeroApuestas];
		for(int i=0;i<combinacion.length;i++)
			combinacion[i]=0;
		Random aleatorio = new Random();
		int contadorApuestas=0;
		
		while(contadorApuestas<numeroApuestas){
			int numeroAleatorio=aleatorio.nextInt(49)+1;
			if(!haSalido(numeroAleatorio)){
				combinacion[contadorApuestas]=numeroAleatorio;
				contadorApuestas++;
			}
		}
		
}
	
	
	
/****************************Geter y seters*********************************************/
	public int[] getCombinacion() {
		return combinacion;
	}

	public void setCombinacion(int[] combinacion) {
		this.combinacion = combinacion;
	}
/**************************                   *******************************************/
	
	
	
	
/*******************************Metodo que compara si esta repetido****************************************/
	public boolean haSalido(int numero){
		boolean encontrado=false; //se pone lo contraro que quieras obtener
		int i=0;
		while(i<combinacion.length&&!encontrado){
			if(combinacion[i]==numero){
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
/**********************************                                   ***********************************/
	
	
/*****************************Imprime los numeros************************************/
	public void imprimirCombinacion(){
		Arrays.sort(combinacion);
		for(int i=0;i<combinacion.length;i++)
			System.out.print(combinacion[i]+"-");
	}
/**************************************            **********************************/	
	
	
	
	public int getAciertos(int[]combinacionGanadora){
		
		int aciertos=0;
		for(int i=0;i<combinacionGanadora.length;i++){
			if(haSalido(combinacionGanadora[i]))
				aciertos++;
		}
		
		return aciertos;
	}
	
	

	
}
