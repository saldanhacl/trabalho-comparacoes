package algoritmos;

import util.Utils;

public class Quick {

    private static long tempoInicial = 0;
    private static long tempoFinal = 0;

    private int array[];
    private int length;
 
    public void sort(int[] inputArr) {

        Utils.contCompQuick = 0;
        Utils.tempoExecucaoQuick = 0;
        tempoInicial = System.currentTimeMillis();

        Utils.contCompQuick++;
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);

        tempoFinal = System.currentTimeMillis();
        Utils.tempoExecucaoQuick = tempoFinal - tempoInicial;
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        Utils.contCompQuick++;
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which 
             * is greater then the pivot value, and also we will identify a number 
             * from right side which is less then the pivot value. Once the search 
             * is done, then we exchange both numbers.
             */
            Utils.contCompQuick++;
            while (array[i] < pivot) {
                i++;
            }
            Utils.contCompQuick++;
            while (array[j] > pivot) {
                j--;
            }
            Utils.contCompQuick++;
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        Utils.contCompQuick++;
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        Utils.contCompQuick++;
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
}