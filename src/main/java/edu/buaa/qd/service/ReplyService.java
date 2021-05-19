package edu.buaa.qd.service;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: ReplyService
 * @date: 2021/5/19 19:04
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/

import edu.buaa.qd.entity.Reply;

import java.util.List;

public interface ReplyService {

    public Integer findMaxRid();

    public List<Reply> findAllReplyForTid(Integer tid);

    public void addReply(Reply reply);
}
