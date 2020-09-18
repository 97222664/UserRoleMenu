package com.kuang.model.pojo;

import com.kuang.model.Vo.MenuVo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private int menuId;
    private String menuName;
    private String menuCode;
    private int parentId;
    private String root;
    private String url;
    private int sort;
    private int level;
    private int isDelete;

    /**
     * 子菜单集合
     */
    List<Menu> childMenu;








}
