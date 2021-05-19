package edu.buaa.qd.dao;

import edu.buaa.qd.entity.Topic;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: TopicDao
 * @date: 2021/5/18 19:28
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
@Repository
public interface TopicDao {

    public Integer getMaxTid(String partitions);

    public void insertTopic(@Param("topic") Topic topic);

    public Integer getSizeRecord(String partitions);

    public List<Topic> getTopicPage(@Param("partitions")String partitions,@Param("page") int page, @Param("pageSize") int pageSize);

    public Topic getTopByTid(int tid);

    public Topic getTopicByTidAndPartitions(@Param("tid") Integer tid,@Param("partitions") String partitions);
}
