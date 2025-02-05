package org.mndx.application;

import org.mndx.domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
		public static void main(String[] args) {
				Person personOne = new Person(null, "Noah", "noah@example.com");
				Person personTwo = new Person(null, "Felipe", "felipe@example.com");
				Person personThree = new Person(null, "Maria", "maria@example.com");

				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
				EntityManager entityManager = entityManagerFactory.createEntityManager();

				entityManager.getTransaction().begin();
				entityManager.persist(personOne);
				entityManager.persist(personTwo);
				entityManager.persist(personThree);
				entityManager.getTransaction().commit();
		}
}