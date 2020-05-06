/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import pojo.User;

/**
 *
 * @author cliu
 */
public interface UserMapper {
   
   @Select("select * from user")
   public List<User> selectUser();
}
