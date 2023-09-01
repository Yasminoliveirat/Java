/*Criar uma coleção na linguagem Java com 10 elementos–	Inserir os elementos de 1 a 10 no vetor–	
Após a inserção, somente após a inserção mostrar o vetor.
Obs. Não efetuar a leitura de 10 elementos */

public class ex46 {
    public static void main (String args[]){
        int tamanho = 10;
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = i + 1;
        }
    
        System.out.println(java.util.Arrays.toString(vetor));
    }
}
