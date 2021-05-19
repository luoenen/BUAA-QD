package edu.buaa.qd.dao;

import edu.buaa.qd.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: UserDao
 * @date: 2021/5/15 13:46
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/
@Repository
public interface UserDao {

    public Integer getMaxUid();

    public User getUserByUid(int uid);

    public void insertUser(@Param("user") User user);

    public User getUserByAccount( String account);

    public String getNicknameByAccount(String account);

    public User getUserByUuid(String uuid);
}
