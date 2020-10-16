package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.model.Employee;

public class MainApplication {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("com/config/hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction(); // commit & rollback
		Employee employee = new Employee();
		employee.setEmpNo(10);
		
		
		employee.setEmpName("Hibernate demo 1");
		
		employee.setSalary(444f);
		
		session.save(employee);
		transaction.commit(); // persist
		System.out.println("successfully saved");
		session.close();
		factory.close();
	}
}