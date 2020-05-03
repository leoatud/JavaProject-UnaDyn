/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springfromzero.proxy;

/**
 *
 * @author cliu
 */
public class Host implements Rent{
   
   @Override
   public void rent(){
      System.out.println("house rent from Host");
   }
   
}
