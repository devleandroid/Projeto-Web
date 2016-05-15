package br.projeto.web.control;

import java.sql.SQLException;

import javax.persistence.EntityManager;

import br.projeto.web.model.Cliente;
import br.projeto.web.repository.ClienteRepository;
import br.projeto.web.util.JpaUtil;

public class TesteCliente {

	private static Long id;

	public static void main(String[] args) throws SQLException {
		
		EntityManager manager = JpaUtil.getEntityManager();
		manager.getTransaction().begin();
		
		ClienteRepository clienteRepository = new ClienteRepository();
		if (manager.isOpen() == true) {
			
			System.out.println("Conexao Aberta !");
			System.out.println(clienteRepository.findAllClient());
			//System.out.println(manager.createQuery("from Cliente", Cliente.class).getResultList());
			//manager.find(Cliente.class, 1L);
			manager.close();
		} else if (manager.isOpen() == false) {
			System.out.println("Conexao fechada !");
		}		
	}
}
