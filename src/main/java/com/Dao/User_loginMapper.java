package com.Dao;

import com.until.User_login;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

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
    public List<User_login> page(Map m);
    public List<User_login> page();
    public int adduser_login(Map m);
    public void queryuser_login(Map<String,Object> map);
    public List<User_login> querytest2(Map<String,Object> map);
    public List<User_login> querytest3(Map<String,Object> map);
    public List<User_login> querytest4(Map<String,Object> map);
    public int setuser_login(User_login u);
    public List<User_login> user_loginid();
}
