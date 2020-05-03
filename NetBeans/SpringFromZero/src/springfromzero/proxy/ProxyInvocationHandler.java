/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springfromzero.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * @author cliu
 */
public class ProxyInvocationHandler implements InvocationHandler {

   private Object target; //method belongs to Rent, so use Interface here

   public ProxyInvocationHandler(Object target) {  //also can use setter
      this.target = target;
   }

   public Object getProxy() {
      return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
   }

   @Override
   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      System.out.println("this is from proxy");
      Object result = method.invoke(target, args);
      System.out.println("failed");
      return result;
   }

}
