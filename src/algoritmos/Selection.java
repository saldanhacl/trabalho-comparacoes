package algoritmos;

import util.Utils;

public class Selection {

    private static long tempoInicial = 0;
    private static long tempoFinal = 0;
	 
    public static int[] doSelectionSort(int[] arr){

        Utils.contCompSelection = 0;
        Utils.tempoExecucaoSelection = 0;
        tempoInicial = System.currentTimeMillis();


        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                Utils.contCompSelection++;
                if (arr[j] < arr[index])
                    index = j;
            }
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

        tempoFinal = System.currentTimeMillis();
        Utils.tempoExecucaoSelection = tempoFinal - tempoInicial;

        return arr;
    }

}