package br.projeto.web.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import br.projeto.web.model.Cliente;
import br.projeto.web.util.JpaUtil;

public class ClienteRepository implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Realiza a conexao com o banco e dados via Persistece
	private EntityManager manager = JpaUtil.getEntityManager();
	
	public Cliente findForId(Long id) {
		return manager.find(Cliente.class, id);
	}
	
	public List<Cliente> findAllClient() {
		return manager.createQuery("from Cliente", Cliente.class).getResultList();
	}
	
	public Cliente saveCliente(Cliente cliente) {
		return manager.merge(cliente);
	}

	public void removeCliente(Cliente cliente) {
		cliente = findForId(cliente.getId());
		manager.remove(cliente);
		
	}
}
