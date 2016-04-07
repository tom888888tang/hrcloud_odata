package myservice.table.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPA_TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Odata_Server_V1");  
        EntityManager em = factory.createEntityManager();  
          
        em.getTransaction().begin();
	}

}
