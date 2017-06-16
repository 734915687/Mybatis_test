package com.util;

import lombok.Data;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
@Data
public class MybatisUtil {
    private SqlSessionFactory sf;
    private SqlSession session;
    public MybatisUtil(){
        try{
        sf = new SqlSessionFactoryBuilder().build( Resources.getResourceAsReader("mybatis-config.xml"));
        session = sf.openSession();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
