/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springfromzero.aop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author cliu
 */
public class LogAop implements MethodBeforeAdvice{

   /**
    * 
    * @param method target method object
    * @param os parameters from the method
    * @param target proxy target
    * @throws Throwable 
    */
   @Override
   public void before(Method method, Object[] os, Object target) throws Throwable {
      System.out.println(target.getClass().getName() + " " + method.getName() + " been executed");
   }

}
