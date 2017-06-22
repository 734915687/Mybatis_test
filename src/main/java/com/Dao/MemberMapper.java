package com.Dao;


import com.until.Member;

import java.util.List;
import java.util.Map;

public interface MemberMapper {
    public Member queryById(int id);
    public List<Map<String,Object>> query();
    public List<Map<String,Object>> queryAll();
}
