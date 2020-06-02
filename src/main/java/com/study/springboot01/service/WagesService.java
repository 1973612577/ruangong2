package com.study.springboot01.service;

import com.study.springboot01.entity.Wages;
import java.util.List;

/**
 * 工资(Wages)表服务接口
 *
 * @author makejava
 * @since 2020-06-01 08:39:45
 */
public interface WagesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Wages queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Wages> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param wages 实例对象
     * @return 实例对象
     */
    Wages insert(Wages wages);

    /**
     * 修改数据
     *
     * @param wages 实例对象
     * @return 实例对象
     */
    Wages update(Wages wages);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}