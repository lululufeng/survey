package com.luxf.service.impl;

import com.luxf.dao.AdminDao;
import com.luxf.entity.Admin;
import com.luxf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Timber
 * @date : 2020/9/20
 * @description:
 */

@Service
public class AdminServiceimpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public void add(Admin admin) {
        adminDao.add(admin);
    }
}
