package com.kuang.service.impl;

import com.kuang.mapper.RoleMapper;
import com.kuang.model.pojo.Role;
import com.kuang.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    /**
     *
     * @param name  角色名
     * @return
     */
    @Override
    public int addRole(String name) {

        //校验参数
        if (name == null) {
            name = "defaultName";
        }

        //代码处理参数

        //数据入库
        int id = roleMapper.addRole(name);

        //结果返回
        if (id > 0) {
            //成功返回
            return id;
        } else {
            //失败返回
            return 0;
        }
    }

    @Override
    public List<Role> queryRoleList() {
        return roleMapper.queryRoleList();
    }
}
