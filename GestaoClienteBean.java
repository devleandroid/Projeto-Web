package br.projeto.web.control;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import br.projeto.web.model.Cliente;
import br.projeto.web.repository.ClienteRepository;

@Named
public class GestaoClienteBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private ClienteRepository clientes; 
	
	private List<Cliente> allClientes;
	
	public void findAllClientes(){
		allClientes = clientes.findAllClient();
	}

	public List<Cliente> getAllClientes() {
		return allClientes;
	}
	
}
