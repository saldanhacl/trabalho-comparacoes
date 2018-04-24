package algoritmos;

import util.Utils;

public class Merge {

    private static long tempoInicial = 0;
    private static long tempoFinal = 0;

    private int[] array;
    private int[] tempMergArr;
    private int length;
 
    public void sort(int inputArr[]) {

        Utils.contCompMerge = 0;
        Utils.tempoExecucaoMerge = 0;
        tempoInicial = System.currentTimeMillis();

        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);

        tempoFinal = System.currentTimeMillis();
        Utils.tempoExecucaoMerge = tempoFinal - tempoInicial;
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {

        Utils.contCompMerge++;
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            Utils.contCompMerge++;
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
}