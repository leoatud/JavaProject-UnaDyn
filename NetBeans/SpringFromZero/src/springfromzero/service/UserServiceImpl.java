/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springfromzero.service;

import springfromzero.dao.UserDao;

/**
 *
 * @author cliu
 */
public class UserServiceImpl implements UserService {

   @Override
   public void add() {
      System.out.println("add user from userService");
   }

   @Override
   public void delete() {
      System.out.println("delete user from userService");

   }

   @Override
   public void update() {
      System.out.println("update user from userService");

   }

   private UserDao userDao;

   public UserServiceImpl(UserDao userDao) {
      this.userDao = userDao;
   }

   @Override
   public void getUser() {
      userDao.getUser();
   }

   public void setUserDao(UserDao userDao) {
      this.userDao = userDao;
   }

}
