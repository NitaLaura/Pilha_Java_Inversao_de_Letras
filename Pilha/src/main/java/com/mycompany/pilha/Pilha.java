/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilha;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class Pilha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String exemplo1 = "UM CIENTISTA DA COMPUTACAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String exemplo2 = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OACATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OACATUPMOC OD ODATSE ED SAIOG";

        System.out.println("Exemplo 1: " + Inversao.inverterPalavras(exemplo1));
        System.out.println("Exemplo 2: " + Inversao.inverterPalavras(exemplo2));

        System.out.print("\nDigite uma frase para inverter as palavras: ");
        String inputFrase = scanner.nextLine();
        String resultado = Inversao.inverterPalavras(inputFrase);

        System.out.println("Frase Invertida: " + resultado);

        scanner.close();
    }
}
