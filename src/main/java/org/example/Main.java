package org.example;

import java.util.Scanner;

public class Main {

  // Método desafio 1
    public static int calculateSum(int indice) {
      int sum = 0;
      int k = 0;

      while (k < indice) {
      k++;
      sum += k;
    }
    return sum;
  }

  // Método desafio 2
  public static void FibonacciSequence(int num) {
    int first = 0;
    int second = 1;

    System.out.print("Sequência de Fibonacci até " + num + ": ");

    System.out.print(first + " " + second + " ");
    while (second < num) {
        int sum = first + second;
        first = second;
        second = sum;
        System.out.print(second + " ");
    }
    if (second == num) {
      System.out.println("\nO número " + num + " pertence à sequência de Fibonacci.");
    } else {
      System.out.println("\nO número " + num + " não pertence à sequência de Fibonacci.");
    }
    }


  // Método desafio 5
  public static String reverseString(String str) {
    String invertedStr = "";

    for ( int i = str.length() - 1; i >= 0; i--) {
      invertedStr += str.charAt(i); // captura o caractere da string no indice especificado pelo "for"
    }
    return invertedStr;
  }


  public static void main(String[] args) {

    //  Desafio 1

    int indice = 13;    //  Este é o único parâmetro necessário para calcular a soma dos números. As outras variáveis são manipuladas dentro do método.

    int sumResult = calculateSum(indice);
    System.out.println("No desafio 1, o valor da soma é: " + sumResult);   //  No desafio 1, o valor da soma é: 91


    // Desafio 2

    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número inteiro positivo:  ");
    int num = scanner.nextInt();
    FibonacciSequence(num);



    // Dsafio 5

    String originalString = "Leandro-Bertholini";
    String invertedString = reverseString(originalString);
    System.out.println("Texto Original:  " + originalString);
    System.out.println("Texto Invertido:  " + invertedString);
 }
}

/* AS RESPOSTAS DOS DESAFIOS 3 E 4 ESTÃO NO ARQUIVO "perguntas_e_respostas.txt" */