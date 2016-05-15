package br.projeto.web.service;

import java.io.Serializable;

import javax.inject.Inject;

import br.projeto.web.model.Cliente;
import br.projeto.web.repository.ClienteRepository;

public class ClienteService implements Serializable{


	/*
	 * Dentro desta classe são feita todas as regras de negocios do sistema
	 * Onde poderam ter as condições para que seja feita uma exclusão de cliente ou inclusão
	 * */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private ClienteRepository clienteManager;
	
	//Sava o cliente na base
	public void saveCliente(Cliente cliente) {
		clienteManager.saveCliente(cliente);
	}
	//Deleta o cliente da base
	public void deleteCliente(Cliente cliente) {
		clienteManager.removeCliente(cliente);
	}
}
