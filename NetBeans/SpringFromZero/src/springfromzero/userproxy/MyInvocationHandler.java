/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springfromzero.userproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @author cliu
 */
public class MyInvocationHandler implements InvocationHandler{

   private Object userDaoImpl;

   public MyInvocationHandler(Object userDaoImpl) {
      this.userDaoImpl = userDaoImpl;
   }
   
   
       
   private void preMethod(){
      
   }
   
   private void postMethod(){
      
   }
   
   @Override
   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      preMethod();
      
      Object ob = method.invoke(userDaoImpl, args);
      
      postMethod();
      
      return ob;
   }
   
}
