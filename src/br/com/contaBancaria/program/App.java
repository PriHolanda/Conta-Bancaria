package br.com.contaBancaria.program;

import java.util.Scanner;
import br.com.contaBancaria.model.Conta;

public class App {
    public static void main(String[] args) {
       Scanner ent = new Scanner(System.in);
	
       Conta b1 = new Conta("Prriscila", "3062002", 4000.0);
       int opcao;
       Double sacar, depositar;
		
       System.out.println("Informações da conta: " + b1.toString());
       System.out.println("Digite 1 para sacar ou 2 para depositar: ");
       opcao = ent.nextInt();
		
       switch(opcao) {
       case 1: System.out.println("Digite o valor a sacar: ");
       sacar = ent.nextDouble();
       b1.sacar(sacar);
       break;
	
       case 2: System.out.println("Digite o valor a ser depositado: ");
       depositar = ent.nextDouble();
       b1.depositar(depositar);
       break;
	
       default: System.out.println("Erro! Operação inválida! ");
       break;
       }
		
       System.out.println("Informações da conta: " + b1.toString());
    }
}
