package br.com.xt.dio.java.challenge.banco.entidades;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Banco {

	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<Conta>();
	}
	
	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void listaClientes() {
		int id = 1;
		for (Conta c : this.contas) {
			String tipo = c instanceof ContaCorrente ? "Corrente" : "Poupança";
			System.out.println(String.format("%d - Tipo: %s, Nome: %s, CPF: %s, Idade: %d", id, tipo, c.getCliente().getNome(), c.getCliente().getCpf(), c.getCliente().getIdade()));
			id++;
		}
	}
}
