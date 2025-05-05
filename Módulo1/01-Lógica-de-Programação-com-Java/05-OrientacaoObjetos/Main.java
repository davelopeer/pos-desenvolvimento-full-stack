// import java.util.Scanner;

// import java.util.ArrayList;

public class Main {
  public static void main(String args[]) {
    // Classes
    Cao cachorro = new Cao(10, "Bob");

    cachorro.setPeso(34);
    cachorro.Andar();

    System.out.println(cachorro.nome + " tem " + cachorro.getIdade() + " ano(s).");
    System.out.println(cachorro.nome + " é " + cachorro.cor + ".");
    System.out.println(cachorro.nome + " tem " + cachorro.getPeso() + "kg.");
    System.out.println(cachorro.nome + " é velho: " + cachorro.VerificarIdade());

    System.out.println("----------------------------------------------");
    }   
}