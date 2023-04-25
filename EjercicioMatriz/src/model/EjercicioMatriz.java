package model;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioMatriz {

	//CREAR Y CARGAR UNA MATRIZ DE TAMAÑO N X M Y DECIR SI ES SIMETRICA O NO
	
	public EjercicioMatriz() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz [][], nFilas, nColumnas;
		int matrizTraspuesta [][];
		
		System.out.println("digite el numero de filas");
		nFilas = sc.nextInt();
		System.out.println("digite el numero de columnas");
		nColumnas = sc.nextInt();
		
		matriz = new int [nFilas][nColumnas];
		matrizTraspuesta = new int [nColumnas][nFilas];
		
		System.out.println("digite la matriz ");
		for(int i=0; i<nFilas; i++) {
			for(int j=0; j<nColumnas; j++) {
				System.out.println("matriz ["+i+"]["+j+"]: ");
				matriz [i][j] = sc.nextInt();
				matrizTraspuesta[j][i] = matriz [i][j];
					
				/*
				 * Cuando hay un bucle for dentro de otro bucle for (bucles 
				 * for anidados), el bucle externo ejecuta su primera iteración y 
				 * luego el bucle interno se ejecuta por completo para cada 
				 * luego el bucle interno se ejecuta por completo para cada 
				 * iteración del bucle externo.
				 * 
				 * Esto significa que el bucle interno debe completar todas sus 
				 * iteraciones antes de que el bucle externo avance a su siguiente 
				 * iteración. El bucle interno se reinicia desde su valor inicial en 
				 * cada iteración del bucle externo.
				 */
			}
			
		}
		if (nFilas!=nColumnas) {
			System.out.println("su matriz no es cuadrada");
				}
		
		boolean sonIguales = Arrays.deepEquals(matriz, matrizTraspuesta);
				
		if (sonIguales) {
			System.out.println("su matriz es simetrica");
				}
		
		else {
			System.out.println("su matriz no es simetrica");
		 		}
		
		for(int l=0; l<nFilas; l++) {
			for(int p=0; p<nColumnas; p++) {
				System.out.print(matriz[l][p]);
					}
			System.out.println(" ");
				}
			
		
	
		}
	
	
		
	}


