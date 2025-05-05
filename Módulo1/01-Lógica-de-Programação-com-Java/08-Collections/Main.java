// import java.util.Scanner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
  public static void main(String args[]) {
    // Iterator e Comparator
    ArrayList<Integer> numeros = new ArrayList<>();

    numeros.add(1);
    numeros.add(3);
    numeros.add(8);
    numeros.add(5);
    numeros.add(9);

    System.out.println("Números: " + numeros);
    
    Iterator<Integer> it = numeros.iterator();
    
    int numero1 = it.next();
    System.out.println("Elemento: " + numero1);
    int numero2 = it.next();
    System.out.println("Elemento: " + numero2);

    
    while (it.hasNext()) {
      System.out.println("Restaram:");
      it.forEachRemaining((value)-> System.out.println(value));

    }

    System.out.println("----------------------------------------------");

    // LinkedList
    LinkedList<String> animais = new LinkedList<>();

    animais.add("Cachorro");
    animais.add("Onça");
    animais.add("Vaca");

    System.out.println("Linkedlist: " + animais);
    
    animais.add(1, "Gato");
    System.out.println("Linkedlist: " + animais);

    System.out.println("----------------------------------------------");
    
    // HashSet

    HashSet<Integer> numeros2 = new HashSet<>();
    
    numeros2.add(2);
    numeros2.add(5);
    numeros2.add(9);

    System.out.println("HashSet: " + numeros2);

    Iterator<Integer> it2 = numeros2.iterator();

    while (it2.hasNext()) {
      System.out.println(it2.next());
    }

    System.out.println("----------------------------------------------");
    
    // TreeSet

    TreeSet<Integer> numeros3 = new TreeSet<>();

    numeros3.add(8);
    numeros3.add(6);
    numeros3.add(1);
    numeros3.add(0);
    numeros3.add(5);

    System.out.println("TreeSet: " + numeros3);

    boolean result = numeros3.remove(6);

    System.out.println("Removeu? " + result);
    System.out.println("TreeSet: " + numeros3);
    
    numeros3.removeAll(numeros3);

    System.out.println("Removendo tudo!");
    System.out.println("TreeSet: " + numeros3);

    System.out.println("----------------------------------------------");

    // Projeto com Listas

    ArrayList<String> linguagens = new ArrayList<>();

    linguagens.add("Python");
    linguagens.add("Java");
    linguagens.add("Golang");
    linguagens.add("C#");

    System.out.println("ArrayList: " + linguagens);

    String[] arr = new String[linguagens.size()];

    linguagens.toArray(arr);

    System.out.println(" --- ");
    System.out.println("Array: ");

    for(String item:arr) {
      System.out.println(item + ";");
    }

  }
}