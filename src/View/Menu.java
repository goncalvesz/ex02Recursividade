package View;

import javax.swing.JOptionPane;

import Controller.RecursividadeController;;

public class Menu {
	public static void main(String[] args) {
		
		RecursividadeController Rec = new RecursividadeController();
		
		//Para essa atividade, escolhi usar a função split que permite dividir uma variável String em partes, essas partes vão ser números inteiros e convertidas para um vetor inteiro, assim prosseguindo o exercício como solicitado pelo enunciado
		
		int val = 0; //Valor inserido para preencher cada "casa" do vetor uma a uma
		int tamanho = 0; //Quantos valores o vetor vai ter
		
		StringBuilder numeros = new StringBuilder(""); //StringBuilder foi utilizado ao invés de String por ser mais rápido em memória em caso de sobreposição de valores
		
		while (val != 999 || tamanho==0) { //Loop para criar vetor
			try { //Confere se o valor é inteiro
				val = Integer.parseInt(JOptionPane.showInputDialog("Insira o " + (tamanho+1) + " º número do vetor. Insira 999 para prosseguir"));
				if (val != 999) { //Somente adiciona ao vetor caso o valor não seja 999
					numeros.append(val + ",");
					tamanho++;
				}

			} catch (NumberFormatException nfe) { //Saida de erro
				JOptionPane.showMessageDialog(null, "Insira um número!");
			} //Fim Catch
		} //Fim While
		
		String convertor = numeros.toString(); //Convertido para String após a definição de todos os valores, evitando lixo em memória
		
		String[] vetorString = convertor.split(","); //Retira as , deixando apenas os numeros inteiros separados em um vetor
		int vetorInt[] = new int[tamanho]; //Vetor que vai receber as partes (números) separados
		
		for (int i = 0; i < tamanho; i++) { //VetorInt[i] = VetorString[i]
			vetorInt[i] = Integer.parseInt(vetorString[i]) ;
			
		}
		
		System.out.println(Rec.menorValorVetor(vetorInt, tamanho, vetorInt[tamanho-1]));
	}
	
}


