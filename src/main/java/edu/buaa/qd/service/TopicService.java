package edu.buaa.qd.service;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: UserService
 * @date: 2021/5/15 13:46
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/

import edu.buaa.qd.dao.TopicDao;
import edu.buaa.qd.entity.Topic;
import edu.buaa.qd.entity.User;

import java.util.List;

public interface TopicService {

    public Integer findMaxTid(String partitions);

    public void addTopic(Topic topic);

    public Integer findSizeRecord(String partitions);

    public List<Topic> findTopicPage(String partitions,int page,int pageSize);

    public Topic findTopicByTid(int tid);

    public Topic findTopicByTidAndPartitions(Integer tid,String partitions);
}
