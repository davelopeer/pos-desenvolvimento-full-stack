// import java.util.Scanner;

// import java.util.ArrayList;

class Desenho {
  // método sem parâmetro
  public void mostrar() {
    for(int i=0; i<10; i++) {
      System.out.println("*");
    }
  }

  // método com 1 parâmetro
  public void mostrar(char simb) {
    for(int i=0; i<10; i++) {
      System.out.println(simb);
    }
  }

  // método com 1 parâmetro
  public void mostrar(char simb, int n) {
    for(int i=0; i<n; i++) {
      System.out.println(simb);
    }
  }
}


public class Main {
  public static void main(String args[]) {
    // Polimorfismo
    
    Quadrado q1 = new Quadrado();
    q1.desenhar();
    
    Circulo c1 = new Circulo();
    c1.desenhar();

    System.out.println("----------------------------------------------");
    
    // Sobrecarga de métodos

    Desenho d1 = new Desenho();
    d1.mostrar();
    d1.mostrar('%');
    d1.mostrar('&', 5);

    System.out.println("----------------------------------------------");

    String primeira = "Java";
    String segunda = "Javascript";
    String terceira = new String("Python");

    System.out.println(primeira.toUpperCase());
    System.out.println(segunda.length());
    System.out.println(terceira.concat(terceira));
    System.out.println("Terceira é igual a segunda: " + terceira.equals(segunda));

    System.out.println("----------------------------------------------");


  }
}