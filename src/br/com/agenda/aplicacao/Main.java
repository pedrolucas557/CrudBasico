package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Pedrin");
		contato.setId(20);
		contato.setDataCadastro(new Date());
	}
}
