import java.util.Scanner;

public class MenorNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Número de elementos --- Exemplo: 4 elementos
        System.out.print("Número de elementos nessa lista: ");
        int n = scanner.nextInt();

        // Elementos escolhidos --- Exemplo: 5 4 9 4
        int[] arr = new int[n];
        System.out.print("Digite " + n + " números inteiros separados com espaço: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Encontrar o menor elemento na lista
        int menor = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < menor) {
                menor = arr[i];
            }
        }

        // Contar quantas vezes o menor elemento aparece
        int contar = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == menor) {
                contar++;
            }
        }

        // Resultado
        System.out.println("O menor elemento na lista é: " + menor);
        System.out.println("O menor elemento aparece " + contar + " vez(es) na lista.");

        scanner.close();
    }
}
