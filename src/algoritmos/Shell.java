package algoritmos;

public class Shell {

	  /*  O metodo é invocado atraves de chamada estatica passando a copia da referencia     |
	  |  do vetor a ser ordenado como parametro, e esse parametro, fazendo com que o objeto  |
	  |  vetor seja ordenado, devido a serem referencias ao mesmo objeto, não é necessario   |
	  |  retornar nada, pois na proxima chamada do objeto, o mesmo já estara ordenado.       |
	  |        Exmplo de chamada:  int vetor = ShellSort.ordenar(vetor);                    */
	  
		public static void ordenar(int[] vet){
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
		}	
	}