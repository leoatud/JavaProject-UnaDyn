/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springfromzero.aop;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

/**
 *
 * @author cliu
 */
public class AfterLogAop implements AfterReturningAdvice {

   @Override
   public void afterReturning(Object o, Method method, Object[] os, Object o1) throws Throwable {

      //method and logic need to be done in here
   }

}
