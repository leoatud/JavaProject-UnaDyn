/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybatis.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author cliu
 */
public class MyBatisUtil {

   private static SqlSessionFactory sqlSessionFactory = null;

   static {
      try {
         InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
         System.out.println("suceesfully get mybatis configuration file");
         sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

      } catch (IOException ex) {
         ex.printStackTrace();
      }
   }

   private MyBatisUtil() {

   }

   public static SqlSession getSqlSession() {
      return sqlSessionFactory.openSession();
   }
}
