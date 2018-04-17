package principal;

import algoritmos.*;
import util.Utils;
public class Principal {

	public static void main(String[] args) {

		int n = 10000;
		int[] array = new int[n];

		Utils.preencheCasoMedio(array, n);
		//Utils.preencheMelhorCaso(array, n);
		//Utils.preenchePiorCaso(array, n);

		int[] bubble = Bubble.bubble_srt(array);
		int[] insert = Insertion.doInsertionSort(array);
		Utils.imprimeCompETempo();


	}



}
