import java.util.Scanner;


public class Main {
  public static void main(String args[]) {
    // Strings 
    String valor = "Descomplica - Java";

    System.out.println(valor.contains("Java"));
    System.out.println(valor.length());
    System.out.println(valor.replace("Java", "Python"));

    System.out.println("----------------------------------------------"); // true

    // Entrada e Saída
    System.out.println("Informe seu nome:");
    
    String palavra;
    Scanner entrada = new Scanner(System.in);
    palavra = entrada.nextLine();

    System.out.println("Nome:" + palavra);

    System.out.println("----------------------------------------------"); // true

    // Operadores aritméticos
    double numA, numB, total;

    numA = 8;
    numB = 3;

    total = numA + numB;
    System.out.println("Soma é: " + total);

    total = numA * numB + 6 / 2 - 2;
    System.out.println("Resultado da operação é: " + total);

    total = numA % numB;
    System.out.println("Resto é: " + total);
  }
}

