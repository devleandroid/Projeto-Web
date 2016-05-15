package br.projeto.web.control;

import javax.persistence.EntityManager;

import br.projeto.web.util.JpaUtil;

public class TestControl {

	
	public static void main(String[] args) {
		
		// Já existe uma classe com a criaçao dos metodos para realizar a oporação de conexao com o banco ! 
				//EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpaPU");
				EntityManager manager = JpaUtil.getEntityManager();
						
				try {
								
					if(manager!= null)
						manager.getTransaction().begin();
						System.out.println("Ok factory is not null");
					if (manager.isOpen() == true) {
						System.out.println("Tabela criada com sucesso !");
					}
					else {
						System.out.println("Não foi possive criar tabela !");
					}
						
					JpaUtil.close();
					manager.close();
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		
	}
}
