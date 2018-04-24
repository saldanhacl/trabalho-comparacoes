package algoritmos;

import util.Utils;

public class Shell {


	private static long tempoInicial = 0;
	private static long tempoFinal = 0;

	  /*  O metodo � invocado atraves de chamada estatica passando a copia da referencia     |
	  |  do vetor a ser ordenado como parametro, e esse parametro, fazendo com que o objeto  |
	  |  vetor seja ordenado, devido a serem referencias ao mesmo objeto, n�o � necessario   |
	  |  retornar nada, pois na proxima chamada do objeto, o mesmo j� estara ordenado.       |
	  |        Exmplo de chamada:  int vetor = ShellSort.ordenar(vetor);                    */
	  
		public static void ordenar(int[] vet){

			Utils.contCompShell = 0;
			Utils.tempoExecucaoShell = 0;
			tempoInicial = System.currentTimeMillis();

		    int i , j , temp, size = vet.length;
		    
		    int incremento = 1;
		    while(incremento < size) {
		        incremento = 3 * incremento + 1;
		    }
		     
		    while (incremento > 1) {
		        incremento /= 3;
		        
		        for(i = incremento; i < size; i++) {
		            temp = vet[i];
		            j = i - incremento;
		            while (j >= 0 && temp < vet[j]) {
		                vet[j + incremento] = vet[j];
		                j -= incremento;
		            }
		            vet [j + incremento] = temp;
		        }
		    }
			tempoFinal = System.currentTimeMillis();
			Utils.tempoExecucaoShell = tempoFinal - tempoInicial;
		}	
	}