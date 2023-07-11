package com.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf= Persistence.createEntityManagerFactory("emp");
		EntityManager em= emf.createEntityManager();
		
		Employee e = new Employee(1 , "Pooja" , 10000);	
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("Object Persisite");
		System.out.println(e);
		
		Employee e1 = new Employee(2 , "Divya" , 12000);	
		em.getTransaction().begin();
		em.persist(e1);
		em.getTransaction().commit();
		System.out.println("Object Persisite");
		System.out.println(e1);
		
		Employee e2 = em.find(Employee.class, 1);	     //get Perticuler id
		em.getTransaction().begin();
		em.remove(e2);           //remove object
		em.getTransaction().commit();
		System.out.println("Object Removed");
		//System.out.println(e2);
		
	}

}
