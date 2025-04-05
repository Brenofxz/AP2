import java.util.Scanner;

public class Ex1PesqSequencial {

    public static void main(String[] args) {
        int[] vetor = {8, 4, 0, 8, 3, 4, 6, 5};
        int indiceEncontrado;
        int valorParaEncontrar;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o valor a ser encontrado: ");
        valorParaEncontrar = in.nextInt();
        
        indiceEncontrado = buscaSequencial(vetor, valorParaEncontrar);
        
        if (indiceEncontrado == -1) {
            System.out.println("O valor não foi encontrado!");
        } else {
            System.out.println("Valor encontrado no índice: " + indiceEncontrado);
        }
        
        in.close();
    }

    static int buscaSequencial(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}