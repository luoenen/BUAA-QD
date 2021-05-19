package edu.buaa.qd.service.impl;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: TopicServiceImpl
 * @date: 2021/5/18 20:35
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/

import edu.buaa.qd.dao.TopicDao;
import edu.buaa.qd.entity.Topic;
import edu.buaa.qd.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    private TopicDao topicDao;

    @Autowired
    public void setTopicDao(TopicDao topicDao) {
        this.topicDao = topicDao;
    }

    @Override
    public Integer findMaxTid(String partitions) {
        return topicDao.getMaxTid(partitions);
    }

    @Override
    public void addTopic(Topic topic) {
        topicDao.insertTopic(topic);
    }

    @Override
    public Integer findSizeRecord(String partitions) {
        return topicDao.getSizeRecord(partitions);
    }

    @Override
    public List<Topic> findTopicPage(String partitions, int page, int pageSize) {
        return topicDao.getTopicPage(partitions,page,pageSize);
    }

    @Override
    public Topic findTopicByTid(int tid) {
        return topicDao.getTopByTid(tid);
    }

    @Override
    public Topic findTopicByTidAndPartitions(Integer tid, String partitions) {
        return topicDao.getTopicByTidAndPartitions(tid,partitions);
    }
}
