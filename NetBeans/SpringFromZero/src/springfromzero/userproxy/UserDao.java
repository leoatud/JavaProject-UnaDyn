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
public interface UserDao {
   
   public void add();
   
   public void delete();
   
   public void update();
   
   public void deleteAll();
   
   public void search(long id);
   
}
