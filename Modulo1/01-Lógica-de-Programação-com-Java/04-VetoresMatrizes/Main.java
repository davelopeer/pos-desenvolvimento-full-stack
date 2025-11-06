// import java.util.Scanner;

import java.util.ArrayList;

public class Main {
  public static void main(String args[]) {
    // Vetores
    int[] dados = new int[5];

    dados[3] = 45;
    dados[0] = 02;

    System.out.println(dados); // Endereço na memória
    System.out.println(dados[3]); // 42
    System.out.println(dados[0]); // 2
    System.out.println(dados[1]); // 0

    System.out.println("----------------------------------------------");

    //Matrizes

    int[][] dados2= new int[3][3];

    for(int i=0; i<3; i++)
      for(int j=0; j<3; j++)
        dados2[i][j] = j;

    for(int i=0; i<3; i++)
      for(int j=0; j<3; j++)
        System.out.println(dados2[i][j]);


    System.out.println("----------------------------------------------");

    // Utilizando Vetores

    int[] passarosPorDia = {2,5,0,7,4,1,3,0,2,5,0,1,3,1};

    int totalPassaros = 0;
    int passarosPrimeiraSemana = 0;
    int passarosSegundaSemana = 0;

    for(int i=0; i<14; i++) {
      totalPassaros += passarosPorDia[i];
    }

    System.out.println("Total de pássaros: " + totalPassaros);

    for(int i=0; i<7; i++) {
      passarosPrimeiraSemana += passarosPorDia[i];
    }

    System.out.println("Total de pássaros da primeira semana: " + passarosPrimeiraSemana);

    for(int i=7; i<14; i++) {
      passarosSegundaSemana += passarosPorDia[i];
    }

    System.out.println("Total de pássaros da segunda semana: " + passarosSegundaSemana);

    System.out.println("----------------------------------------------");

    // Utilizando Matrizes

    int[][] matriz = {{9,8,7}, {5,3,2}, {6,6,7}};

    int[] maiorLinha = new int[3];
    int[] menorColuna = new int[3];

    for(int i=0; i<3; i++) {
      maiorLinha[i] = 0;
    }

    for(int i=0; i<3; i++) {
      menorColuna[i] = 10;
    }

    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        if(matriz[i][j] > maiorLinha[i]) {
          maiorLinha[i] = matriz[i][j];
        }
        if(matriz[i][j] < menorColuna[j]) {
          menorColuna[j] = matriz[i][j];
        }
      }
    }
    System.out.println("Maiores de cada linha");

    System.out.println(maiorLinha[0] + " " + maiorLinha[1] + " " + maiorLinha[2]);

    System.out.println("Menores de cada coluna");

    System.out.println(menorColuna[0]);
    System.out.println(menorColuna[1]);
    System.out.println(menorColuna[2]);

    System.out.println("----------------------------------------------");

    // List e Arrays

    ArrayList<String> estados= new ArrayList<>();

    estados.add("Espirito Santo");
    estados.add("Ceará");
    estados.add("Rio de Janeiro");
    estados.add("Pernambuco");
    estados.add("Pará");


    System.out.println(estados); // [Espirito Santo, Ceará, Rio de Janeiro, Pernambuco, Pará]
    
    estados.remove("Ceará");
    
    System.out.println(estados); // [Espirito Santo, Rio de Janeiro, Pernambuco, Pará]
    System.out.println(estados.contains("Ceará")); // false

    estados.remove(0);
    System.out.println(estados); // [Rio de Janeiro, Pernambuco, Pará]

    // Continuando com ArrayLists

    ArrayList<Integer> numPrimos = new ArrayList<>();

    numPrimos.add(3);
    numPrimos.add(2);
    numPrimos.add(7);

    System.out.println(numPrimos); // [3, 7, 2]

    numPrimos.remove(numPrimos.indexOf(2)); // Removendo o 2

    System.out.println(numPrimos); // [3, 7]

    numPrimos.add(numPrimos.indexOf(7), 13);

    System.out.println(numPrimos); // [3, 13, 7]

    numPrimos.clear();

    System.out.println(numPrimos); // []


    System.out.println("----------------------------------------------");

  }   
}