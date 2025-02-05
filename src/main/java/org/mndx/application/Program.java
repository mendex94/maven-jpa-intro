package org.mndx.application;

import org.mndx.domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
		public static void main(String[] args) {
				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
				EntityManager entityManager = entityManagerFactory.createEntityManager();

				Person person = entityManager.find(Person.class, 1);

				System.out.println(person);

				entityManagerFactory.close();
				entityManager.close();
		}
}