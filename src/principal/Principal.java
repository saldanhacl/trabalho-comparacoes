package principal;

import algoritmos.*;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		int n = 10;
		int[] array = new int[n];

		preencheCasoMedio(array, n);

		int[] bubble = Bubble.bubble_srt(array);
		imprimeArray(bubble);


	}

	private static void preencheCasoMedio(int[] array, int n){

		Random rd = new Random();

		for (int i = 0; i < n; i++) {
			array[i] = rd.nextInt(100);
		}
	}

	private static void imprimeArray(int[] array){

		System.out.print("[");
		for (int i : array)
			System.out.print(i + ", ");
		System.out.println("]");
	}


}
