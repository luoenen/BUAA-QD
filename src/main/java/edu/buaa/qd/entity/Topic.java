package edu.buaa.qd.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: Topic
 * @date: 2021/5/17 18:35
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
@Component
public class Topic implements Serializable {

    private Integer id;
    private Integer tid;
    private String title;
    private String description;
    private String content;
    private Integer uid;
    private String username;
    private String ip;
    private String partitions;
    private Date timeTag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPartitions() {
        return partitions;
    }

    public void setPartitions(String partitions) {
        this.partitions = partitions;
    }

    public Date getTimeTag() {
        return timeTag;
    }

    public void setTimeTag(Date timeTag) {
        this.timeTag = timeTag;
    }

    public Topic() {
    }

    public Topic(String title, String description, String content, Integer uid, String username, String ip, String partitions, Date timeTag) {
        this.title = title;
        this.description = description;
        this.content = content;
        this.uid = uid;
        this.username = username;
        this.ip = ip;
        this.partitions = partitions;
        this.timeTag = timeTag;
    }

    public Topic(Integer tid, String title, String description, String content, Integer uid, String username, String ip, String partitions, Date timeTag) {
        this.tid = tid;
        this.title = title;
        this.description = description;
        this.content = content;
        this.uid = uid;
        this.username = username;
        this.ip = ip;
        this.partitions = partitions;
        this.timeTag = timeTag;
    }

    public Topic(Integer id, Integer tid, String title, String description, String content, Integer uid, String username, String ip, String partitions, Date timeTag) {
        this.id = id;
        this.tid = tid;
        this.title = title;
        this.description = description;
        this.content = content;
        this.uid = uid;
        this.username = username;
        this.ip = ip;
        this.partitions = partitions;
        this.timeTag = timeTag;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", tid=" + tid +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", uid=" + uid +
                ", username='" + username + '\'' +
                ", ip='" + ip + '\'' +
                ", partitions='" + partitions + '\'' +
                ", timeTag=" + timeTag +
                '}';
    }
}
