package com.hexa.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class CreateTable {
	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration().configure();
				SessionFactory sfac = cfg.buildSessionFactory();
				Session sess=sfac.openSession();
				System.out.println("Table Created");
		}
}
