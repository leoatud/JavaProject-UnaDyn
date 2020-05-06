/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.UserMapper;
import java.util.List;
import pojo.User;

/**
 *
 * @author cliu
 */
public class UserServiceImpl implements UserService {

   private UserMapper userMapper;

   public void setUserMapper(UserMapper userMapper) {
      this.userMapper = userMapper;
   }

   @Override
   public List<User> getUsers() {
      return userMapper.selectUser();
   }

}
