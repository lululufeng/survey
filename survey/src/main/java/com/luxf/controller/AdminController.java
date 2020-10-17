package com.luxf.controller;

import com.luxf.entity.Admin;
import com.luxf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Timber
 * @date : 2020/9/20
 * @description:
 */
@Controller
@RequestMapping("/admin")
@ResponseBody
public class AdminController {

    private AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @RequestMapping("/create")
    public void create(){
        Admin admin = new Admin();
        admin.setAccount("admin");
        admin.setName("系统操作员");
        admin.setPassword("12345678");
        adminService.create(admin);
    }

    @RequestMapping("/delete")
    public void delete(){
        Map<String, Object> paramMap = new HashMap<>();
        adminService.delete(paramMap);
    }

    @RequestMapping("/update")
    public void update(){
        Map<String, Object> paramMap = new HashMap<>();
        adminService.update(paramMap);
    }

    @RequestMapping("/query")
    public void query(){
        Map<String, Object> paramMap = new HashMap<>();
        adminService.query(paramMap);
    }

    @RequestMapping("/detail")
    public void detail(){
        Map<String, Object> paramMap = new HashMap<>();
        adminService.detail(paramMap);
    }

    @RequestMapping("/count")
    public void count(){
        Map<String, Object> paramMap = new HashMap<>();
        adminService.count(paramMap);
    }
}



























