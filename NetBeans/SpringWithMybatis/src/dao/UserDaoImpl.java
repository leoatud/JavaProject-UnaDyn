/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import pojo.User;

/**
 *
 * @author cliu
 */
public class UserDaoImpl implements UserDao {

   private UserMapper userMapper;
   private SqlSessionTemplate sqlSession;
//
//   public void setSqlSession(SqlSessionTemplate sqlSession) {
//      this.sqlSession = sqlSession;
//   }
//

   @Override
   public List<User> selectUser() {
      User user = new User("hahaha", "444");
      //sqlSession.insert("vo.user.mapper.add", user);
      //return getSqlSession().selectList("vo.user.mapper.selectAll");
      return userMapper.selectUser();
   }

   public void setUserMapper(UserMapper userMapper) {
      this.userMapper = userMapper;
   }

}
