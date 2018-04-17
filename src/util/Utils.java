package util;

import java.util.Random;

public class Utils {

    public static long contCompBubble = 0;
    public static long contCompInsertion = 0;
    public static long tempoExecucaoBubble = 0;
    public static long tempoExecucaoInsertion = 0;

    public static void copiaArray(int[] copiarDE, int[] copiarPARA){
        for (int i = 0; i < copiarDE.length; i++) {
            copiarPARA[i] = copiarDE[i];
        }
    }

    public static void preencheCasoMedio(int[] array, int n){

        Random rd = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = rd.nextInt(100);
        }
    }

    public static void preencheMelhorCaso(int[] array, int n){

        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
    }

    public static void preenchePiorCaso(int[] array, int n){

        for (int i = n, j = 0; i > 0; i--, j++) {
            array[j] = i;
        }
    }

    public static void imprimeArray(int[] array){

        System.out.print("[ ");
        for (int i : array)
            System.out.print(i + " ");
        System.out.println(" ]");
    }

    public static void imprimeCompETempo(){

        System.out.println("----- Bubble Sort -----");
        System.out.print(Utils.contCompBubble + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoBubble + "ms");

        System.out.println("----- Insertion Sort -----");
        System.out.print(Utils.contCompInsertion + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoInsertion + "ms");

    }


}
