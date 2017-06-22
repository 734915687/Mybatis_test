package com;
import com.Dao.MemberMapper;
import com.Dao.ScoreMapper;
import com.Dao.StudentMapper;
import com.Dao.User_loginMapper;
import com.until.Member;
import com.until.Score;
import com.until.Student;
import com.until.User_login;
import com.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    @Test
    public void aaa() throws SQLException {

//            SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
//            SqlSession session = sf.openSession();
//           User_loginMapper sdao = session.getMapper(User_loginMapper.class);
//           List<User_login> li = sdao.select();
//            for(User_login stu : li){
//                System.out.print(stu.getUser_login_id()+" ");
//                System.out.print(stu.getUser_login_name()+" ");
//                System.out.println(stu.getUser_login_pwd());
//            }
//            System.out.println( "接口打印完毕" );
//            st.setUser_login_name( "王五" );
//            st.setUser_login_pwd( "000000" );
//            st.setUr_id( "3" );
//            sdao.insert(st);
//            session.commit();
        MybatisUtil mu = new MybatisUtil();
        SqlSession s = mu.getSession();
//        Connection conn = s.getConnection();
//        PreparedStatement pst = conn.prepareStatement( "select * from user_login" );
//        ResultSet rs = pst.executeQuery();
//        List<User_login> l = new ArrayList<User_login>();
//        while (rs.next()) {
//            User_login u = new User_login();
//            u.setUser_login_id( rs.getString( "user_login_id" ) );
//            u.setUser_login_name( rs.getString( "user_login_name" ) );
//            u.setUser_login_pwd( rs.getString( "user_login_pwd" ) );
//            u.setUr_id( rs.getString( "ur_id" ) );
//            l.add( u );
//        }
//        for (User_login stu : l) {
//            System.out.print( stu.getUser_login_id() + " " );
//            System.out.print( stu.getUser_login_name() + " " );
//            System.out.print( stu.getUser_login_pwd() + " " );
//            System.out.println( stu.getUr_id() + "....." );
//        }
                      //物理分页动态查询
     //   User_loginMapper sm = s.getMapper(User_loginMapper.class);
    //        List<User_login> list = session.selectList("com.Dao.User_loginMapper.queryAll");
//        Map<String,Object> m = new HashMap<String,Object>();
//        m.put("start",0);
//        m.put("size",2);
//        List<User_login> li = sm.page(m);
//            for(User_login stu : li){
//                System.out.print(stu.getUser_login_id()+" ");
//                System.out.print(stu.getUser_login_name()+" ");
//                System.out.print(stu.getUser_login_pwd()+" ");
//                System.out.println( stu.getUr_id() );
//            }
        //        Map<String,Object> m = new HashMap<String,Object>();
//        m.put("start",0);
//        m.put("size",2);
//        List<User_login> li = sm.page(m);
//            for(User_login stu : li){
//                System.out.print(stu.getUser_login_id()+" ");
//                System.out.print(stu.getUser_login_name()+" ");
//                System.out.print(stu.getUser_login_pwd()+" ");
//                System.out.println( stu.getUr_id() );
//            }
        Map<String,Object> m = new HashMap<String,Object>();
       // m.put( "id1",0 );
       // m.put( "id2",2 );
       // sm.queryuser_login(m);
       // m.put( "user_login_id",2 );
     //   m.put( "user_name_login","李四" );
//        List<User_login> li = sm.querytest3(m);
//            for(User_login stu : li){
//                System.out.print(stu.getUser_login_id()+" ");
//                System.out.print(stu.getUser_login_name()+" ");
//                System.out.print(stu.getUser_login_pwd()+" ");
//                System.out.println( stu.getUr_id() );
//            }
//        m.put( "ii",new int[]{1,2,5,6,7,8});
//        List<User_login> li = sm.querytest4(m);
//        for(User_login stu : li){
//            System.out.print(stu.getUser_login_id()+" ");
//            System.out.print(stu.getUser_login_name()+" ");
//            System.out.print(stu.getUser_login_pwd()+" ");
//            System.out.println( stu.getUr_id() );
//        }
//      User_login u=new User_login();
//        u.setUser_login_id( "11" );
//        List<User_login> lii=sm.user_loginid();
//        //查询数据库中所有的user_login_id
//        u.setUser_login_pwd( "111111" );
//         System.out.print( sm.setuser_login( u ) );
     //   System.out.println( sm.setuser_login( u ));

//        User_loginMapper sdao = s.getMapper( User_loginMapper.class );
//        List<User_login> list = sdao.page( 1, 2 );
//        for (User_login stu : list) {
//            System.out.print( stu.getUser_login_id() + " " );
//            System.out.print( stu.getUser_login_name() + " " );
//            System.out.print( stu.getUser_login_pwd() + " " );
//            System.out.println( stu.getUr_id() );
        //一对多
        StudentMapper sm = s.getMapper(StudentMapper.class);
        m.put("Id",901);
        Student ss=sm.queryStudent( m );
        System.out.print( ss.getName() );
        s.clearCache(); //清除一级缓存

         s.commit();
        SqlSession sss = mu.getSession();
        StudentMapper smm = sss.getMapper(StudentMapper.class);
        Student ssmm=smm.queryStudent( m );
        System.out.print( ssmm.getName() );
      //  System.out.print( ss.getScore());

        //一对一
//         MemberMapper sm = s.getMapper(MemberMapper.class);
//        Member mm=  sm.queryById( 1 );
//        System.out.print( mm.getAddress());

//        List<Map<String,Object>> li=sm.queryAll();
//        for (Map<String,Object> m1:li){
//            System.out.print( m1 );
//        }
        s.commit();
            s.close();
        }
    }
