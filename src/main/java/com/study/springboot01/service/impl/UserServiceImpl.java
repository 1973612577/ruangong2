package com.study.springboot01.service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.study.springboot01.entity.User;
import com.study.springboot01.dao.UserDao;
import com.study.springboot01.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 用户信息表(User)表服务实现类
 *
 * @author makejava
 * @since 2020-06-01 16:29:45
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer id) {
        return this.userDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return this.userDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userDao.deleteById(id) > 0;
    }

    @Override
    
    public String getToken(User user) {
        Date start=new Date();//获取当前时间作为token开始时间
        long currentTime=System.currentTimeMillis()+60*60*1000;//一小时有效时间
        Date end=new Date(currentTime);//把刚刚设置的一个小时后作为token的结束时间
        String token="";
        token= JWT.create().withAudience(user.getUsername()).withIssuedAt(start).withExpiresAt(end).sign(Algorithm.HMAC256(user.getPassword()));
        return token;

    }
}