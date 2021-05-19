package edu.buaa.qd.service.impl;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: ReplyServiceImpl
 * @date: 2021/5/19 19:04
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/

import edu.buaa.qd.dao.ReplyDao;
import edu.buaa.qd.entity.Reply;
import edu.buaa.qd.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {

    private ReplyDao replyDao;

    @Autowired
    public void setReplyDao(ReplyDao replyDao) {
        this.replyDao = replyDao;
    }

    @Override
    public Integer findMaxRid() {
        return replyDao.getMaxRid();
    }

    @Override
    public List<Reply> findAllReplyForTid(Integer tid) {
        return replyDao.getAllReplyForTid(tid);
    }

    @Override
    public void addReply(Reply reply) {
        replyDao.insertReply(reply);
    }
}
