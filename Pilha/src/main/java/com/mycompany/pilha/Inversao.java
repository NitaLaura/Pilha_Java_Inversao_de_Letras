/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilha;
import java.util.Stack;

/**
 *
 * @author Nyta
 */
public class Inversao {
    public static String inverterPalavras(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] palavras = input.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            Stack<Character> pilha = new Stack<>();
            for (char letra : palavra.toCharArray()) {
                pilha.push(letra);
            }
            while (!pilha.isEmpty()) {
                resultado.append(pilha.pop());
            }
            resultado.append(" ");
        }

        return resultado.toString().trim();
    }
}