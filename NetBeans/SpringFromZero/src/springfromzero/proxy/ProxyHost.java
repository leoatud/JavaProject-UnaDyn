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
public class ProxyHost implements Rent {

   private Host host;

   public ProxyHost() {
   }

   public ProxyHost(Host host) {
      this.host = host;
   }

   public Host getHost() {
      return host;
   }

   public void setHost(Host host) {
      this.host = host;
   }

   @Override
   public void rent() {
      System.out.println("rent from Proxy -->");
      
      visitHouse();
      
      host.rent();
      
      chargeFee();
   }
   
   private void visitHouse(){
      System.out.println("proxy visit house");
   }
   
   private void chargeFee(){
      System.out.println("proxy charge fees");
   }

}
