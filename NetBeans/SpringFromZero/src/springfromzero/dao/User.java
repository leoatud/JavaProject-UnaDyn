/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springfromzero.dao;

import java.io.Serializable;

/**
 *
 * @author cliu
 */
public class User implements Serializable {

   private static final long serialVersionUID = 1L;
   public static int counter;

   private Long id;
   private String userName;
   private String password;
   private String email;
   private String regTime;

   public User(Long id, String userName) {
      counter++;
      this.id = id;
      this.userName = userName;
      System.out.println("No " + counter + ": 2 input value User created");

   }

   public User(String userName) {
      this.userName = userName;
      System.out.println("No " + counter + ": 1 input value User created");
   }

   public User() {
      counter++;
      System.out.println("No " + counter + ": non input value User created");
   }

   public void show() {
      System.out.println("name = " + userName);
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getRegTime() {
      return regTime;
   }

   public void setRegTime(String regTime) {
      this.regTime = regTime;
   }

}
