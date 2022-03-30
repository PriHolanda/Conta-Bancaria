package br.com.contaBancaria.model;

public class Conta {
    private String titular;
    private String numConta;
    protected Double saldo;
	
    public Conta() {
		
    }

    public Conta(String titular, String numConta, Double saldo) {
        this.titular = titular;
	this.numConta = numConta;
	this.saldo = saldo;
    }

    public String getTitular() {
	return titular;
    }

    public void setTitular(String titular) {
	this.titular = titular;
    }

    public String getNumConta() {
    	return numConta;
    }

    public void setNumConta(String numConta) {
	this.numConta = numConta;
    }

    public Double getSaldo() {
	return saldo;
    }

    @Override
    public String toString() {
	return "Conta: Titular = " + titular 
                + ", numConta = " + numConta + ", saldo = " + saldo + "";
    }

    public void sacar(Double valor) {
    	saldo -= valor;
    }
    public void depositar(Double valor) {
	saldo += valor;
    }
	    
}
