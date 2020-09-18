package com.kuang.model.Vo;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MenuVo {
    /**
     * 主键
     */
    private int menuId;

    /**
     * 名称
     */
    private String menuName;

    /**
     * 菜单编码
     */
    private String menuCode;

    /**
     * 父节点
     */
    private Long parentId;

    /**
     * 排序号
     */
    private Integer sort;

    /**
     * 页面对应的地址
     */
    private String url;

    /**
     * 层次
     */
    private Integer level;

    /**
     * 子菜单集合
     */
    List<MenuVo> childMenu;

}
