package br.com.xt.dio.java.challenge.banco;

import br.com.xt.dio.java.challenge.banco.entidades.Cliente;
import br.com.xt.dio.java.challenge.banco.entidades.Conta;
import br.com.xt.dio.java.challenge.banco.entidades.ContaCorrente;
import br.com.xt.dio.java.challenge.banco.entidades.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
