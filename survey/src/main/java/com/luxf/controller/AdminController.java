package com.luxf.controller;

import com.luxf.entity.Admin;
import com.luxf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Timber
 * @date : 2020/9/20
 * @description:
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/add")
    public void add(){
        Admin admin = new Admin();
        admin.setAccount("admin");
        admin.setName("系统操作员");
        admin.setPassword("123456");
        adminService.add(admin);
    }

}
