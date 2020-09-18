package com.kuang.mapper;

import com.kuang.model.Vo.MenuVo;
import com.kuang.model.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MenuMapper {

    //查询菜单列表
    List<Menu> queryMenuList();

    //通过菜单id查询菜单列表
    Menu queryMenuListById(int id);


    //通过用户id查询权限
    List<Menu> queryMenus(int userId);
}
