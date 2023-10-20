/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilha;
import javax.swing.JOptionPane;

/**
 *
 * @author Nyta
 */
public class Pilha {

    public static void main(String[] args) {
        String exemplo1 = "UM CIENTISTA DA COMPUTACAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String exemplo2 = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OACATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OACATUPMOC OD ODATSE ED SAIOG";

        JOptionPane.showMessageDialog(null, "Exemplo 1: " + Inversao.inverterPalavras(exemplo1));
        JOptionPane.showMessageDialog(null, "Exemplo 2: " + Inversao.inverterPalavras(exemplo2));

        String inputFrase = JOptionPane.showInputDialog("Digite uma frase para inverter as palavras:");
        String resultado = Inversao.inverterPalavras(inputFrase);

        JOptionPane.showMessageDialog(null, "Frase Invertida: " + resultado);
    }
}
