/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springfromzero.bean;

/**
 *
 * @author cliu
 */
public class Hello {

   public static int counter;
   private String name;
   private Address address;

   public Hello() {
      counter++;
      System.out.println("hello has been created at counter: " + counter);
   }

   public Address getAddress() {
      return address;
   }

   public void setAddress(Address address) {
      this.address = address;
   }

   
   
   // must has setter to create the value, even in spring
   public void setName(String name) {
      this.name = name;
   }

   public void show() {
      System.out.println("hello " + name);
   }

}
