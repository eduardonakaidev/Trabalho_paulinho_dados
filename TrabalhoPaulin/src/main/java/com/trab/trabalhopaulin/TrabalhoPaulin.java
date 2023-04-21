/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.trab.trabalhopaulin;

import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public class TrabalhoPaulin {

    public static void main(String[] args) {
       
        
        String inp ;
        int num ;
        
        inp = JOptionPane.showInputDialog("Digite o tamanho do vetor: ");
        
        // conversao da entrada para inteiro 
        
        num = Integer.parseInt(inp);
        
        int[] vetor = new int[num];
        
        for ( int i = 0; i < vetor.length; i++ ) {
            inp = JOptionPane.showInputDialog("Insira número para o vetor: ");
            vetor[i] = Integer.parseInt(inp);
        }
        
        int op;
        inp = JOptionPane.showInputDialog("Escolha um método de ordenação "
                + "\n 1 - Ordenação Seleção"
                + "\n 2 -  Ordenação bolha "
                + "\n 3 - Ordenação Inserção");
        op = Integer.parseInt(inp);
        
        
        
        
        
        
        // ordenacao selecao
        if (op == 1){
            
            System.out.println("Ordenação Seleção");
                System.out.println("Vetor original: ");
                ImprimeVetor(vetor);
                long inicioSelecao = System.nanoTime();
                System.out.println("Vetor ordenado por Seleção: ");
                OrdenacaoSelecao(vetor);
                ImprimeVetor(vetor);
                long fimSelecao = System.nanoTime();
                long tempoExecucaoSelecao = fimSelecao - inicioSelecao;
                System.out.println("O tempo de execução foi de: " + tempoExecucaoSelecao);
              
            
            
            
        }
        
        // ordenacao bolha
        if (op == 2){
            
            System.out.println("Ordenação bolha");
                System.out.println("Vetor original: ");
                ImprimeVetor(vetor);

                long inicio = System.nanoTime();
                System.out.println("Vetor ordenado por bolha: ");
                OrdenacaoBolha(vetor);
                ImprimeVetor(vetor);
                long fi = System.nanoTime();
                long tempoExecucao = fi - inicio;
                System.out.println("O tempo de execução foi de: " + tempoExecucao);
            
            
        }
        
        // ordenaçâo insercao 
        if( op == 3){
            
            System.out.println("Ordenação Inserção");
                System.out.println("Vetor original: ");
                ImprimeVetor(vetor);
                long inicioInser = System.nanoTime();
                System.out.println("Vetor ordenado por Inserção: ");
                OrdenacaoInsercao(vetor);
                ImprimeVetor(vetor);
                long fimInser = System.nanoTime();
                long tempoExecucaoInsercao = fimInser - inicioInser;
                System.out.println("tempo de execução: " + tempoExecucaoInsercao);
        }
        
        inp = JOptionPane.showInputDialog("Deseja comparar com os outros métodos? 1(sim) OU 2(não)");
        
        op = Integer.parseInt(inp);
        if (op == 1){
            System.out.println("original:");
            System.out.println("___________________________");
            ImprimeVetor(vetor);

            long inicio = System.nanoTime();
            System.out.println("_____________________________");
            System.out.println("ordenado por bolha: ");
            OrdenacaoBolha(vetor);
            long fim = System.nanoTime();
            long tempoExecucao = fim - inicio;
            System.out.println("tempo de execução: " + tempoExecucao);

            long inicioSelecao = System.nanoTime();
            System.out.println("----------------------------");
            System.out.println("ordenado por Seleção: ");
            OrdenacaoSelecao(vetor);
            long fimSelecao = System.nanoTime();
            long tempoExecucaoSelecao = fimSelecao - inicioSelecao;
            System.out.println("tempo de execução: " + tempoExecucaoSelecao);

            long inicioInsercao = System.nanoTime();
            System.out.println("----------------------------");
            System.out.println("ordenado por Inserção: ");
            OrdenacaoInsercao(vetor);
            long fimInsercao = System.nanoTime();
            long tempoExecucaoInsercao = fimInsercao - inicioInsercao;
            System.out.println("tempo de execução:" + tempoExecucaoInsercao);
        }
        else {
            System.out.println("finalizado");
        }
 
    } 
    
    // modulos para fazer cada ordenacao 
    
     public static void OrdenacaoSelecao(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int posMenor = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posMenor]) {
                    posMenor = j;
                }
            }

            if (posMenor != i) {
                int aux = vetor[i];
                vetor[i] = vetor[posMenor];
                vetor[posMenor] = aux;
            }

        }

    }
     
    public static void OrdenacaoBolha(int[] vetor) {
        boolean troca = true;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }

        }
    }
    
    public static void OrdenacaoInsercao(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int atual = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > atual) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;
        }

    }
    
    // modulo de impressao 
    public static void ImprimeVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "] = " + vetor[i]);
        }
    }
    
   
}
