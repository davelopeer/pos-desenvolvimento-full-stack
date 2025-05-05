// import java.util.Scanner;

// import java.util.ArrayList;

import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    // Herança
    
    Pessoa pessoa = new Pessoa();
    pessoa.nome = "Bruno";
    // p.comissao = 3.4;

    Vendedor vendedor = new Vendedor();
    vendedor.nome = "Laís";
    vendedor.comissao = 2.0;

    System.out.println("----------------------------------------------");

    // Composição

    Pedido pedido = new Pedido("Camisa"); // Inicia com uma instância de Itens

    System.out.println("----------------------------------------------");

    // Classes abstratas

    Conta contaPoupanca = new Poupanca();

    contaPoupanca.setSaldo(34.5);

    contaPoupanca.imprimeExtrato();

    System.out.println("----------------------------------------------");

    // Interface

    Poupanca2 contaPoupanca2 = new Poupanca2();
    
    contaPoupanca2.depositar(732);
    contaPoupanca2.depositar(1000);
    System.out.println("Saldo atual: " + contaPoupanca2.getSaldo());
    
    contaPoupanca2.sacar(100);
    System.out.println("Saldo atual: " + contaPoupanca2.getSaldo());

    System.out.println("----------------------------------------------");

    // Tratamento de exceções

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite um valor");

    try {
      int num1 = entrada.nextInt();
      System.out.println("Digitou: " + num1);
    } catch(Exception e) {
      System.out.println("ERRO - valor não é um número");
    }

    System.out.println("----------------------------------------------");

    // Herança na prática

    Cachorro cachorro = new Cachorro();
    cachorro.setNome("Bidu");

    Gato gato = new Gato();
    gato.setNome("Lola");

    cachorro.mostrar();
    cachorro.Comer();

    gato.mostrar();
    gato.Comer();

    System.out.println("----------------------------------------------");
    }   
}