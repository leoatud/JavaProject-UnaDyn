/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springfromzero.proxy;

import springfromzero.userproxy.UserDao;
import springfromzero.userproxy.UserDaoImpl;

/**
 *
 * @author cliu
 */
public class Client {
   public static void main(String[] args) {
      Host host = new Host();
      springfromzero.userproxy.UserDao userDao = new UserDaoImpl();
      
      
      ProxyInvocationHandler pih = new ProxyInvocationHandler(userDao);
      
      UserDao proxy = (UserDao)pih.getProxy();
      
      proxy.add();
   }
}
