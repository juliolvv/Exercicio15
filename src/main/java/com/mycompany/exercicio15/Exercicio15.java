package com.mycompany.exercicio15;
import javax.swing.JOptionPane;

// ALGORITMO PARA VERIFICAÇÃO DE IDADE ENTRE 15 E 25 ANOS
public class Exercicio15 {

    public static void main(String[] args) {
        
        String nome;
        nome = (JOptionPane.showInputDialog("Qual seu nome?: "));
        
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?: "));
        
        if (idade >= 15 && idade <= 25) {
            JOptionPane.showMessageDialog(null,"Aceita");
        }else {
            JOptionPane.showMessageDialog(null,"Não aceita");
        }
     
        
        
    }
}
