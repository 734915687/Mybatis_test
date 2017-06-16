package com.Dao;

import com.until.User_login;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface User_loginMapper {
    //@Select("select * from user_login where user_login_id=#{id}")
    public User_login selectById(String id);
    //@Select( "select * from user_login" )
             public List<User_login> select();
    //@Insert( "insert into user_login(user_login_name,user_login_pwd) values (#{name},#{pwd})")
    public int insert(@Param( "name" )String user_login_name,@Param( "pwd" )String user_login_pwd);
    //分页
   // @Select( "select * from user_login limit #{start},#{end}" )
    public List<User_login> selectfy(@Param( "start" ) int s,@Param( "end" ) int e);

}
