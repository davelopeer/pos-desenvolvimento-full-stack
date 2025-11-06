import java.util.Scanner;


public class Main {
  public static void main(String args[]) {
    // // For
    // for (int i=0; i<10; i++) {
    //     System.out.println(i+1);
    // }

    // System.out.println("----------------------------------------------");

    // // While
    // int opcao = 0;

    // while (opcao != 99) {
    //     System.out.println("Digite um valor qualquer ou 99 para sair:");
    //     Scanner entrada = new Scanner(System.in);
    //     opcao = entrada.nextInt();

    // }

    // System.out.println("----------------------------------------------");

    // // Do While
    // int opcao2;

    // do {
    //     System.out.println("Digite um valor ou 99 para sair");
    //     Scanner entrada2 = new Scanner(System.in);
    //     opcao2 = entrada2.nextInt();
    // } while (opcao2 != 99);

    // System.out.println("Obrigado, tchau!");


    // System.out.println("----------------------------------------------");


    // // Repetições aninhadas
    // for(int i=0; i<=10; i++) {
    //   for(int j=0; j<=10; j++) {
    //     System.out.println(i + " x " + j + " = " + j*i);
    //   }
    // }


    // System.out.println("----------------------------------------------");

    // // Métodos

    // int total = Main.somar(10,50);
    // System.out.println(total);

    // System.out.println("----------------------------------------------");

    // // Exercicio: mostrar os 5 filmes favoritos.

    // System.out.println("Enumere seus 5 filmes favoritos:");

    // for(int i=1; i<=5; i++) {
    //   System.out.println("Filme " + i + ":");
    //   Scanner entrada3 = new Scanner(System.in);
    //   String filme = entrada3.nextLine();
    // }

    // System.out.println("----------------------------------------------");

    int x=4, y=8, r=0;

    	
    for(int i=0; i<x; i++){
      r = r + y;
    }
    System.out.println(r);

  }

  private static int somar(int a, int b) {
    return (a+b);
  }
}