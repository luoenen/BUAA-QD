package edu.buaa.qd.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: Student
 * @date: 2021/5/14 22:45
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
@Component
public class User implements Serializable {

    private Integer id;
    private Integer uid;
    private String account;
    private String username;
    private String nickname;
    private String password;
    private String professional;
    private String college;
    private String department;
    private String wechat;
    private String uuid;
    private Date timeTag;
    private String online;
    private String ip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getTimeTag() {
        return timeTag;
    }

    public void setTimeTag(Date timeTag) {
        this.timeTag = timeTag;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public User() {
    }

    public User(String account, String username, String nickname, String password, String professional, String college, String department, String wechat, String uuid, Date timeTag, String online, String ip) {
        this.account = account;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.professional = professional;
        this.college = college;
        this.department = department;
        this.wechat = wechat;
        this.uuid = uuid;
        this.timeTag = timeTag;
        this.online = online;
        this.ip = ip;
    }

    public User(Integer uid, String account, String username, String nickname, String password, String professional, String college, String department, String wechat, String uuid, Date timeTag, String online, String ip) {
        this.uid = uid;
        this.account = account;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.professional = professional;
        this.college = college;
        this.department = department;
        this.wechat = wechat;
        this.uuid = uuid;
        this.timeTag = timeTag;
        this.online = online;
        this.ip = ip;
    }

    public User(Integer id, Integer uid, String account, String username, String nickname, String password, String professional, String college, String department, String wechat, String uuid, Date timeTag, String online, String ip) {
        this.id = id;
        this.uid = uid;
        this.account = account;
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.professional = professional;
        this.college = college;
        this.department = department;
        this.wechat = wechat;
        this.uuid = uuid;
        this.timeTag = timeTag;
        this.online = online;
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uid=" + uid +
                ", account='" + account + '\'' +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", professional='" + professional + '\'' +
                ", college='" + college + '\'' +
                ", department='" + department + '\'' +
                ", wechat='" + wechat + '\'' +
                ", uuid='" + uuid + '\'' +
                ", timeTag=" + timeTag +
                ", online='" + online + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }
}
