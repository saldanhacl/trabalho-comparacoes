package algoritmos;

import util.Utils;

import javax.rmi.CORBA.Util;

public class Insertion {

    private static long tempoInicial = 0;
    private static long tempoFinal = 0;

    public static int[] doInsertionSort(int[] array){

        Utils.contCompInsertion = 0;
        Utils.tempoExecucaoInsertion = 0;
        tempoInicial = System.currentTimeMillis();

        int temp;
        int[] retorno = new int[array.length];
        Utils.copiaArray(array, retorno);

        for (int i = 1; i < retorno.length; i++) {
            for(int j = i ; j > 0 ; j--){
                Utils.contCompInsertion++;
                if(retorno[j] < retorno[j-1]){
                    temp = retorno[j];
                    retorno[j] = retorno[j-1];
                    retorno[j-1] = temp;
                }
            }
        }
        tempoFinal = System.currentTimeMillis();
        Utils.tempoExecucaoInsertion = tempoFinal - tempoInicial;

        return retorno;
    }
}