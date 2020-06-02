package com.study.springboot01.dao;

import com.study.springboot01.entity.Wages;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 工资(Wages)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-01 08:39:45
 */
@Mapper
public interface WagesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Wages queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Wages> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param wages 实例对象
     * @return 对象列表
     */
    List<Wages> queryAll(Wages wages);

    /**
     * 新增数据
     *
     * @param wages 实例对象
     * @return 影响行数
     */
    int insert(Wages wages);

    /**
     * 修改数据
     *
     * @param wages 实例对象
     * @return 影响行数
     */
    int update(Wages wages);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}