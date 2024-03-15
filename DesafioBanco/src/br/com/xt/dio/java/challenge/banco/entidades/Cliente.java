package br.com.xt.dio.java.challenge.banco.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cliente {

	private String nome;
	private String cpf;
	private String endereco;
	private int idade;
	
}
