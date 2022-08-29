package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDao = new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("Pedrin");
		contato.setIdade(20);
		contato.setDataCadastro(new Date());
		
		//contatoDao.save(contato);
		
		//Atualizar o contato
		Contato c1 = new Contato();
		c1.setNome("Pedrin Lucas");
		c1.setId(21);
		c1.setDataCadastro(new Date());
		c1.setId(1);
		
//		contatoDao.update(c1);
		
		//Deletar o contato pelo número ID
		contatoDao.deleteByID(1);
		
		//Vizualização dos registros do banco de dados TODOS
		
		for (Contato c: contatoDao.getContatos()) {
			System.out.println("Contato: " + c.getNome());
		}
	}
}
