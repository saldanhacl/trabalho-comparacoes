package util;

import algoritmos.*;

import java.util.Random;

public class Utils {

    public static long contCompBubble = 0;
    public static long contCompInsertion = 0;
    public static long contCompHeap = 0;
    public static long contCompMerge = 0;
    public static long contCompQuick = 0;
    public static long contCompSelection = 0;
    public static long contCompShell = 0;
    public static long tempoExecucaoBubble = 0;
    public static long tempoExecucaoInsertion = 0;
    public static long tempoExecucaoHeap = 0;
    public static long tempoExecucaoMerge = 0;
    public static long tempoExecucaoQuick = 0;
    public static long tempoExecucaoSelection = 0;
    public static long tempoExecucaoShell = 0;

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



    public static void imprimeCompETempoBubble(int[] array, int n){

        Bubble b = new Bubble();

        System.out.println("------------  BUBBLE SORT -------------");

        System.out.println("----- Pior caso -----");

        for (int i=0; i<100; i++) {
            preenchePiorCaso(array, n);
            b.bubble_srt(array);
        }

        System.out.print(Utils.contCompBubble + " comparacoes | ");
        System.out.println( (b.tempoExec / b.numSorts) + "ms");

        b = new Bubble();
        System.out.println("----- Caso médio -----");

        for (int i=0; i<100; i++) {
            preenchePiorCaso(array, n);
            b.bubble_srt(array);
        }

        System.out.print(Utils.contCompBubble + " comparacoes | ");
        System.out.println((b.tempoExec / b.numSorts) + "ms");

        b = new Bubble();
        System.out.println("----- Melhor caso -----");

        for (int i=0; i<100; i++) {
            preenchePiorCaso(array, n);
            b.bubble_srt(array);
        }

        System.out.print(Utils.contCompBubble + " comparacoes | ");
        System.out.println((b.tempoExec / b.numSorts) + "ms");

        System.out.println("---------------------------------------\n\n");

    }

    public static void imprimeCompETempoInsertion(int[] array, int n){

        System.out.println("------------  INSERTION SORT -------------");

        System.out.println("----- Pior caso -----");
        preenchePiorCaso(array, n);
        Insertion.doInsertionSort(array);
        System.out.print(Utils.contCompInsertion + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoInsertion + "ms");


        System.out.println("----- Caso médio -----");
        preencheCasoMedio(array, n);
        Insertion.doInsertionSort(array);
        System.out.print(Utils.contCompInsertion + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoInsertion + "ms");


        System.out.println("----- Melhor caso -----");
        preencheMelhorCaso(array, n);
        Insertion.doInsertionSort(array);
        System.out.print(Utils.contCompInsertion + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoInsertion + "ms");

        System.out.println("---------------------------------------\n\n");

    }

    public static void imprimeCompETempoHeap(int[] array, int n){

        System.out.println("------------  HEAP SORT -------------");

        System.out.println("----- Pior caso -----");
        preenchePiorCaso(array, n);
        Heap.sort(array);
        System.out.print(Utils.contCompHeap + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoHeap + "ms");


        System.out.println("----- Caso médio -----");
        preencheCasoMedio(array, n);
        Heap.sort(array);
        System.out.print(Utils.contCompHeap + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoHeap + "ms");


        System.out.println("----- Melhor caso -----");
        preencheMelhorCaso(array, n);
        Heap.sort(array);
        System.out.print(Utils.contCompHeap + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoHeap + "ms");

        System.out.println("---------------------------------------\n\n");

    }

    public static void imprimeCompETempoMerge(int[] array, int n){

        Merge m = new Merge();

        System.out.println("------------  MERGE SORT -------------");

        System.out.println("----- Pior caso -----");
        preenchePiorCaso(array, n);
        m.sort(array);
        System.out.print(Utils.contCompMerge + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoMerge + "ms");


        System.out.println("----- Caso médio -----");
        preencheCasoMedio(array, n);
        m.sort(array);
        System.out.print(Utils.contCompMerge + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoMerge + "ms");


        System.out.println("----- Melhor caso -----");
        preencheMelhorCaso(array, n);
        m.sort(array);
        System.out.print(Utils.contCompMerge + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoMerge + "ms");

        System.out.println("---------------------------------------\n\n");

    }

    public static void imprimeCompETempoQuick(int[] array, int n){

        Quick q = new Quick();

        System.out.println("------------  QUICK SORT -------------");

        System.out.println("----- Pior caso -----");
        preenchePiorCaso(array, n);
        q.sort(array);
        System.out.print(Utils.contCompQuick + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoQuick + "ms");


        System.out.println("----- Caso médio -----");
        preencheCasoMedio(array, n);
        q.sort(array);
        System.out.print(Utils.contCompQuick + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoQuick + "ms");


        System.out.println("----- Melhor caso -----");
        preencheMelhorCaso(array, n);
        q.sort(array);
        System.out.print(Utils.contCompQuick + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoQuick + "ms");

        System.out.println("---------------------------------------\n\n");

    }

    public static void imprimeCompETempoSelection(int[] array, int n){

        System.out.println("------------  SELECTION SORT -------------");

        System.out.println("----- Pior caso -----");
        preenchePiorCaso(array, n);
        Selection.doSelectionSort(array);
        System.out.print(Utils.contCompSelection + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoSelection + "ms");


        System.out.println("----- Caso médio -----");
        preencheCasoMedio(array, n);
        Selection.doSelectionSort(array);
        System.out.print(Utils.contCompSelection + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoSelection + "ms");


        System.out.println("----- Melhor caso -----");
        preencheMelhorCaso(array, n);
        Selection.doSelectionSort(array);
        System.out.print(Utils.contCompSelection + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoSelection + "ms");

        System.out.println("---------------------------------------\n\n");

    }

    public static void imprimeCompETempoShell(int[] array, int n){

        System.out.println("------------  SHELL SORT -------------");

        System.out.println("----- Pior caso -----");
        preenchePiorCaso(array, n);
        Shell.ordenar(array);
        System.out.print(Utils.contCompShell + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoShell + "ms");


        System.out.println("----- Caso médio -----");
        preencheCasoMedio(array, n);
        Shell.ordenar(array);
        System.out.print(Utils.contCompShell + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoShell + "ms");


        System.out.println("----- Melhor caso -----");
        preencheMelhorCaso(array, n);
        Shell.ordenar(array);
        System.out.print(Utils.contCompShell + " comparacoes | ");
        System.out.println(Utils.tempoExecucaoShell + "ms");

        System.out.println("---------------------------------------\n\n");

    }



}
