import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String args[]) {
    // Operadores lógicos
    int a, b;
    a = 4;
    b = 8;

    System.out.println(a > b); // false
    System.out.println(a < b); // true
    System.out.println(a < b && a == 4); // true
    System.out.println(a < b || a == 5); // true
    System.out.println("----------------------------------------------");
    
    // Condicional simples
    int nota1 = 6;
    
    if (nota1 >= 5) {
        System.out.println("Aprovado");
    }

    System.out.println("----------------------------------------------");

    // Condicional composta
    int nota2 = 2;
    
    if (nota2 >= 5) {
        System.out.println("Aprovado");
    } else {
        System.out.println("Reprovado");
    }

    System.out.println("----------------------------------------------");

    // Condicional aninhada
    int nota3 = 7;
    
    if (nota3 >= 5) {
        System.out.println("Aprovado");
    } else if (nota3 >= 3 && nota3 < 5) {
        System.out.println("Exame");
    } else {
        System.out.println("Reprovado");
    }

    System.out.println("----------------------------------------------");

    // Múltipla escolha
    Scanner entrada = new Scanner(System.in);
    System.out.println("Escolha uma opção:");
    System.out.println("1 - Cadastrar alunos;");
    System.out.println("2 - Cadastrar notas;");
    System.out.println("3 - Listar alunos e nota.");

    int numero = entrada.nextInt();

    switch (numero) {
        case 1:
            System.out.println("Cadastrando alunos.");
            break;
        case 2:
            System.out.println("Cadastrando notas.");
            break;
        case 3:
            System.out.println("Listando alunos e notas.");
            break;
        default:
            System.out.println("Número inválido.");
    }

    System.out.println("----------------------------------------------");

    // Jogo
    Random gerador = new Random();
    int numAleatorio = gerador.nextInt(100);

    Scanner entrada2 = new Scanner(System.in);

    System.out.println("Adivinhe o número que estou pensando...");

    int numUsuario = entrada2.nextInt();

    if (numUsuario == numAleatorio) {
        System.out.println("Parabéns, você acertou!");
    } else {
        System.out.println("Você errou, eu pensei no " + numAleatorio);
    }
  }
}

