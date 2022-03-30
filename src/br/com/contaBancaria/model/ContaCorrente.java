package br.com.contaBancaria.model;

public class ContaCorrente extends Conta {

    public ContaCorrente() {
	super();
    }

    public ContaCorrente(String titular, String numConta, Double saldo) {
	super(titular, numConta, saldo);	
    }
	
    public void sacar(Double valor, Double taxaDeJuros) {
	Double valorSacado;
	saldo -= valor;
	valorSacado = valor -  (valor * taxaDeJuros);
	System.out.println("Valor sacado: " + valorSacado);
    }
    
}
