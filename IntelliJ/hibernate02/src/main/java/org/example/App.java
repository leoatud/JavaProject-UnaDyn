package org.example;

import com.hibernate.pojo.YfuserEntity;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{


    public void executeQuery(){
        Session session = HibernateUtil.getSession();

        YfuserEntity user = session.get(YfuserEntity.class, 2);

        System.out.println(user.toString());
    }



    public static void main( String[] args )
    {
        App app = new App();


        System.out.println( "Hello World!" );
    }
}
