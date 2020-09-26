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
        int delete = adminDao.delete(paramMap);
        return delete;
    }

    @Override
    public int update(Map<String, Object> paramMap) {
        return 0;
    }

    @Override
    public List<Admin> query(Map<String, Object> paramMap) {
        return null;
    }

    @Override
    public Admin detail(Map<String, Object> paramMap) {
        return null;
    }

    @Override
    public int count(Map<String, Object> paramMap) {
        return 0;
    }
}
