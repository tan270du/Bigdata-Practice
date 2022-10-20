package com.data.spider.service.pojo;

import com.framework.hibernate.util.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "tb_scenic_info")
public class ScenicInfo extends Entity {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String city_code;
    private Double longitude, latitude;
    private Integer advice_hours;
    private Long father;
    private Integer is_city;
    private Integer status;
    private Integer order_num;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public Integer getOrder_num() {
        return order_num;
    }

    public void setOrder_num(Integer order_num) {
        this.order_num = order_num;
    }

    public Integer getAdvice_hours() {
        return advice_hours;
    }

    public void setAdvice_hours(Integer advice_hours) {
        this.advice_hours = advice_hours;
    }

    public Long getFather() {
        return father;
    }

    public void setFather(Long father) {
        this.father = father;
    }

    public Integer getIs_city() {
        return is_city;
    }

    public void setIs_city(Integer is_city) {
        this.is_city = is_city;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}