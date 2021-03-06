package com.sun.modules.bean.po;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by sunguiyong on 2017/10/8.
 */
public class VideoPO {

    private Integer id;
    private String name;
    private String cid;
    private String picturePath;
    private String time;
    private String actors;
    private String type;
    private String url;
    private String detail;
    private String goodPercent;
    private String badPercent;
    private String manGoodPercent;
    private String womanGoodPercent;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date addTime = new Date();
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modificationTime;

    public VideoPO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getGoodPercent() {
        return goodPercent;
    }

    public void setGoodPercent(String goodPercent) {
        this.goodPercent = goodPercent;
    }

    public String getBadPercent() {
        return badPercent;
    }

    public void setBadPercent(String badPercent) {
        this.badPercent = badPercent;
    }

    public String getManGoodPercent() {
        return manGoodPercent;
    }

    public void setManGoodPercent(String manGoodPercent) {
        this.manGoodPercent = manGoodPercent;
    }

    public String getWomanGoodPercent() {
        return womanGoodPercent;
    }

    public void setWomanGoodPercent(String womanGoodPercent) {
        this.womanGoodPercent = womanGoodPercent;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(Date modificationTime) {
        this.modificationTime = modificationTime;
    }
}
