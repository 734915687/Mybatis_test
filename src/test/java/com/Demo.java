package com;

import com.Dao.User_loginMapper;
import com.until.User_login;
import com.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Demo {
    @Test
    public void aaa(){
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
            MybatisUtil mu=new MybatisUtil();
            SqlSession s=mu.getSession();
            List<User_login> list=s.selectList("com.Dao.User_loginMapper.queryAll"  );
//            List<User_login> list = session.selectList("com.Dao.User_loginMapper.queryAll");
//            for(User_login stu : list){
//                System.out.print(stu.getUser_login_id()+" ");
//                System.out.print(stu.getUser_login_name()+" ");
//                System.out.print(stu.getUser_login_pwd()+" ");
//                System.out.println( stu.getUr_id() );
//            }
            for(User_login stu : list){
                System.out.print(stu.getUser_login_id()+" ");
                System.out.print(stu.getUser_login_name()+" ");
                System.out.print(stu.getUser_login_pwd()+" ");
                System.out.println( stu.getUr_id() );
            }
            s.commit();
            s.close();
    }

}