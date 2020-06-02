package com.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import sun.security.krb5.Config;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static{
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();
    }

    public static Session getSession(){
        Session session = sessionFactory.openSession();
        return session;
    }
}
