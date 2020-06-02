package com.study.springboot01.service.impl;

import com.study.springboot01.entity.Wages;
import com.study.springboot01.dao.WagesDao;
import com.study.springboot01.service.WagesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 工资(Wages)表服务实现类
 *
 * @author makejava
 * @since 2020-06-01 08:39:45
 */
@Service("wagesService")
public class WagesServiceImpl implements WagesService {
    @Resource
    private WagesDao wagesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Wages queryById(Integer id) {
        return this.wagesDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Wages> queryAllByLimit(int offset, int limit) {
        return this.wagesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param wages 实例对象
     * @return 实例对象
     */
    @Override
    public Wages insert(Wages wages) {
        this.wagesDao.insert(wages);
        return wages;
    }

    /**
     * 修改数据
     *
     * @param wages 实例对象
     * @return 实例对象
     */
    @Override
    public Wages update(Wages wages) {
        this.wagesDao.update(wages);
        return this.queryById(wages.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.wagesDao.deleteById(id) > 0;
    }
}