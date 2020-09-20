package com.luxf.dao;

import com.luxf.entity.Admin;
import org.apache.ibatis.annotations.Mapper;


public interface AdminDao {

    public void add(Admin admin);

}
