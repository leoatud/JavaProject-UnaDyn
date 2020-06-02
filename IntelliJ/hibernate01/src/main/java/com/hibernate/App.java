package com.hibernate;

import com.hibernate.pojo.YfUser;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{

    private Configuration configuration;
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction tx;

    public void initTable(){
        configuration = new Configuration().configure("hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();
    }

    public void addUser(){
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        YfUser user = new YfUser();
        user.setPassword("12222");
        user.setUsername("caicaicai");
        session.save(user);
        tx.commit();
        session.close();
        sessionFactory.close();

    }

    public void findById(Integer id){
        Session s = HibernateUtil.getSession();
        YfUser user = s.get(YfUser.class, id);
        System.out.println(user);
        s.close();
    }

    public static void main( String[] args )
    {
            App app = new App();
            app.findById(2);
    }
}
