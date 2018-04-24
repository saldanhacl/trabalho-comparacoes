package principal;

import util.Utils;
public class Principal {

	public static void main(String[] args) {

		int n = 10000;
		int[] array = new int[n];

		Utils.imprimeCompETempoBubble(array, n);
		Utils.imprimeCompETempoInsertion(array, n);
		Utils.imprimeCompETempoHeap(array, n);
		Utils.imprimeCompETempoMerge(array, n);
		Utils.imprimeCompETempoQuick(array, n);
		Utils.imprimeCompETempoSelection(array, n);
		Utils.imprimeCompETempoShell(array, n);


	}



}
