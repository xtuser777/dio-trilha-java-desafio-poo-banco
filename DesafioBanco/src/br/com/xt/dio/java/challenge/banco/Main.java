package br.com.xt.dio.java.challenge.banco;

import br.com.xt.dio.java.challenge.banco.entidades.Banco;
import br.com.xt.dio.java.challenge.banco.entidades.Cliente;
import br.com.xt.dio.java.challenge.banco.entidades.Conta;
import br.com.xt.dio.java.challenge.banco.entidades.ContaCorrente;
import br.com.xt.dio.java.challenge.banco.entidades.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente("Venilton", "111.111.111-11", "Rua tal", 34);
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		
		Banco bc = new Banco("Inter");
		bc.adicionarConta(cc);
		bc.adicionarConta(poupanca);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		bc.listaClientes();
	}
}
