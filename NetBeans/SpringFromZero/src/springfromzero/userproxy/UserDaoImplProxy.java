/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springfromzero.userproxy;

/**
 *
 * @author cliu
 */
public class UserDaoImplProxy implements UserDao{

   private UserDaoImpl userDaoImpl;
   
   @Override
   public void add() {
      otherLogics();
      userDaoImpl.add();
   }

   @Override
   public void delete() {
      otherLogics();
      userDaoImpl.delete();
   }

   @Override
   public void update() {
      otherLogics();
      userDaoImpl.update();
   }

   @Override
   public void deleteAll() {
      otherLogics();
      userDaoImpl.deleteAll();
   }

   @Override
   public void search(long id) {
      otherLogics();
      userDaoImpl.search(id);
   }
   
   private void otherLogics(){
      
   }
}
