package edu.buaa.qd.dao;

import edu.buaa.qd.entity.Reply;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: ReplyDao
 * @date: 2021/5/19 18:53
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
@Repository
public interface ReplyDao {

    public Integer getMaxRid();

    public List<Reply> getAllReplyForTid(int tid);

    public void insertReply(@Param("reply") Reply reply);
}
