package com.study.springboot01.controller;

import com.study.springboot01.entity.Wages;
import com.study.springboot01.service.WagesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 工资(Wages)表控制层
 *
 * @author makejava
 * @since 2020-06-01 08:39:45
 */
@RestController
@RequestMapping("wages")
public class WagesController {
    /**
     * 服务对象
     */
    @Resource
    private WagesService wagesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Wages selectOne(Integer id) {
        return this.wagesService.queryById(id);
    }

}