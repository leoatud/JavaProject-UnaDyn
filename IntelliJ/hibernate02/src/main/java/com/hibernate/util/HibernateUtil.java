package com.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static Configuration configuration;
    private static SessionFactory sessionFactory;
    static{
        configuration = new Configuration().configure("hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();
    }

    public static  Session getSession(){
        Session session  = sessionFactory.openSession();
        return session;
    }

    public static Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
}

