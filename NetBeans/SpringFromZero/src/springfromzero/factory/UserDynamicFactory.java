/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springfromzero.factory;

import springfromzero.dao.User;

/**
 *
 * @author cliu
 */
public class UserDynamicFactory {

   public UserDynamicFactory() {
      System.out.println("user dynamic factory init");
   }

   
   
   public User newInstance(String name) {
      return new User(name);
   }
}
