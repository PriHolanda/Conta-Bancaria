package br.com.contaBancaria.model;

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca() {
	super();
    }

    public ContaPoupanca(String titular, String numConta, Double saldo) {
	super(titular, numConta, saldo);		
    }
	
    public void depositar(Double valor, Double taxaDeJuros) {		
	saldo += valor + (valor * taxaDeJuros);
    }
}
