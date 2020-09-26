package com.luxf.dao;

import com.luxf.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


public interface AdminDao {

    /**
     * 新增用户
     * @param admin
     */
    public int create(Admin admin);

    /**
     * 删除用户
     * @param paramMap
     * @return
     */
    public int delete(Map<String,Object> paramMap);

    /**
     * 更新用户
     * @param paramMap
     * @return
     */
    public int update(Map<String,Object> paramMap);

    /**
     * 查询所有
     * @param paramMap
     * @return
     */
    public List<Admin> query(Map<String, Object> paramMap);

    /**
     * 查看个人
     * @param paramMap
     * @return
     */
    public Admin detail(Map<String, Object> paramMap);

    /**
     * 查询记录数
     * @param paramMap
     * @return
     */
    public int count(Map<String, Object> paramMap);


}
