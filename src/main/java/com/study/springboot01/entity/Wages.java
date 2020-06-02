package com.study.springboot01.entity;

import java.io.Serializable;

/**
 * 工资(Wages)实体类
 *
 * @author makejava
 * @since 2020-06-01 08:39:45
 */
public class Wages implements Serializable {
    private static final long serialVersionUID = 543362762951757839L;
    
    private Integer id;
    /**
    * 工资
    */
    private String wages;
    /**
    * 补贴
    */
    private String subsidies;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWages() {
        return wages;
    }

    public void setWages(String wages) {
        this.wages = wages;
    }

    public String getSubsidies() {
        return subsidies;
    }

    public void setSubsidies(String subsidies) {
        this.subsidies = subsidies;
    }

}