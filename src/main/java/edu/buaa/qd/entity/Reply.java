package edu.buaa.qd.entity;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: Reply
 * @date: 2021/5/17 20:26
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
import java.io.Serializable;
import java.util.Date;

public class Reply implements Serializable {

    private Integer id;
    private Integer rid;
    private String content;
    private Integer tid;
    private Integer uid;
    private String username;
    private String ip;
    private Date timeTag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
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

    public Date getTimeTag() {
        return timeTag;
    }

    public void setTimeTag(Date timeTag) {
        this.timeTag = timeTag;
    }

    public Reply(String content, Integer tid, Integer uid, String username, String ip, Date timeTag) {
        this.content = content;
        this.tid = tid;
        this.uid = uid;
        this.username = username;
        this.ip = ip;
        this.timeTag = timeTag;
    }

    public Reply(Integer rid, String content, Integer tid, Integer uid, String username, String ip, Date timeTag) {
        this.rid = rid;
        this.content = content;
        this.tid = tid;
        this.uid = uid;
        this.username = username;
        this.ip = ip;
        this.timeTag = timeTag;
    }

    public Reply(Integer id, Integer rid, String content, Integer tid, Integer uid, String username, String ip, Date timeTag) {
        this.id = id;
        this.rid = rid;
        this.content = content;
        this.tid = tid;
        this.uid = uid;
        this.username = username;
        this.ip = ip;
        this.timeTag = timeTag;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "id=" + id +
                ", rid=" + rid +
                ", content='" + content + '\'' +
                ", tid=" + tid +
                ", uid=" + uid +
                ", username='" + username + '\'' +
                ", ip='" + ip + '\'' +
                ", timeTag=" + timeTag +
                '}';
    }
}
