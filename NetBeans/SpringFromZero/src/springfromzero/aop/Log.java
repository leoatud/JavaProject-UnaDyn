/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springfromzero.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author cliu
 */
@Aspect
public class Log {

   @Before("execution(* )")
   public void before() {
      System.out.println("execute before");
   }

   @After("execution(* )")
   public void after() {
      System.out.println("execute after");
   }
   
   
   
}
