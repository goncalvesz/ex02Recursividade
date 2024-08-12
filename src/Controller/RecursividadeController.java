package Controller;

/*
 * Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um vetor de inteiros, o
tamanho do vetor e o valor da úl�ma posição do vetor como o primeiro menor valor, retorne o menor
valor con�do neste vetor.
O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;
 * 
 */

public class RecursividadeController {

	public RecursividadeController(){
		
	}
	
	public int menorValorVetor(int[] vet, int tamanho, int menorValor) { //Vetor; Tamanho; O primeiro valor a ser conferido como menor
		if (tamanho > 0) { //Confere enquanto tamanho for maior que 0, ou seja, enquanto ainda restem valores a serem conferidos no vetor
			if (vet[(tamanho-1)] < menorValor) { //Confere se o valor atual é menor dos que os valores antes conferidos
				menorValor = vet[(tamanho-1)];
			}
			return menorValorVetor(vet, (tamanho-1), menorValor); //Verifica valor anterior
		}
		return menorValor; //Retorna o menor valor após a verificação de todos os valores
	}
}
