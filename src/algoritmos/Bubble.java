package algoritmos;

import util.Utils;

public class Bubble {

    private static long tempoInicial = 0;
    private static long tempoFinal = 0;


    // logic to sort the elements
    public static int[] bubble_srt(int array[]) {

        Utils.contCompBubble = 0;
        Utils.tempoExecucaoBubble = 0;
        tempoInicial = System.currentTimeMillis();

        int[] retorno = new int[array.length];
        Utils.copiaArray(array,retorno);

        int n = retorno.length;
        int k;

        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                Utils.contCompBubble++;
                if (retorno[i] > retorno[k]) {
                    swapNumbers(i, k, retorno);
                }
            }
        }
        tempoFinal = System.currentTimeMillis();
        Utils.tempoExecucaoBubble = tempoFinal - tempoInicial;

        return retorno;
    }
  
    private static void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
  

}
