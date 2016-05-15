package br.projeto.web.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

private static EntityManagerFactory factory;//jpaPU
	
	static {
		factory = Persistence.createEntityManagerFactory("JTA");
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	
	public static void close() {
		factory.close();
	}
}
