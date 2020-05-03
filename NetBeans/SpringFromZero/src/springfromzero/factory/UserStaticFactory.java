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
public class UserStaticFactory {

   public UserStaticFactory() {
      System.out.println("user static factory init");
   }
   
   

   public static User newInstance(Long id, String name) {
      return new User(id, name);
   }

}
