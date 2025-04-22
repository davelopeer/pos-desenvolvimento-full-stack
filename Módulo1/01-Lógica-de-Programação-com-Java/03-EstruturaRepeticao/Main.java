import java.util.Scanner;


public class Main {
  public static void main(String args[]) {
    // For
    for (int i=0; i<10; i++) {
        System.out.println(i+1);
    }

    System.out.println("----------------------------------------------");

    // While
    int opcao = 0;

    while (opcao != 99) {
        System.out.println("Digite um valor qualquer ou 99 para sair:");
        Scanner entrada = new Scanner(System.in);
        opcao = entrada.nextInt();

    }

    System.out.println("----------------------------------------------");

    // Do While
    int opcao2;

    do {
        System.out.println("Digite um valor ou 99 para sair");
        Scanner entrada2 = new Scanner(System.in);
        opcao2 = entrada2.nextInt();
    } while (opcao2 != 99);

    System.out.println("Obrigado, tchau!");


    System.out.println("----------------------------------------------");



  }
}