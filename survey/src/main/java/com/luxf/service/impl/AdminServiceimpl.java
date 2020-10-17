package com.luxf.service.impl;

import com.luxf.dao.AdminDao;
import com.luxf.entity.Admin;
import com.luxf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author : Timber
 * @date : 2020/9/20
 * @description:
 */

@Service
public class AdminServiceimpl implements AdminService {

    private AdminDao adminDao;

    @Autowired
    public AdminServiceimpl(AdminDao adminDao) {
        this.adminDao = adminDao;
    }


    @Override
    public int create(Admin admin) {
        int i = adminDao.create(admin);
        return i;
    }

    @Override
    public int delete(Map<String, Object> paramMap) {
        paramMap.put("id", 11);
        int delete = adminDao.delete(paramMap);
        return delete;
    }

    @Override
    public int update(Map<String, Object> paramMap) {
        paramMap.put("id",12);
        paramMap.put("upAcount","Timber");
        paramMap.put("upPassword","lxf123");
        paramMap.put("upName","luxf");
        paramMap.put("upPhone","110");
        paramMap.put("upRremark","dever");
        int update = adminDao.update(paramMap);
        return update;
    }

    @Override
    public List<Admin> query(Map<String, Object> paramMap) {
        List<Admin> query = adminDao.query(paramMap);
        return query;
    }

    @Override
    public Admin detail(Map<String, Object> paramMap) {
        paramMap.put("name","admin");
        Admin query = adminDao.detail(paramMap);
        return query;
    }

    @Override
    public int count(Map<String, Object> paramMap) {
        paramMap.put("account", "admin");
        int count = adminDao.count(paramMap);
        return count;
    }
}
