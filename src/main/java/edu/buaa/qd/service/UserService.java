package edu.buaa.qd.service;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: UserService
 * @date: 2021/5/15 13:46
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/

import edu.buaa.qd.entity.User;

public interface UserService {

    public Integer findMaxUid();

    public User findUserByUid(int uid);

    public void addUser(User user);

    public User findUserByAccount(String account);

    public String findNicknameByAccount(String account);

    public User findUserByUuid(String uuid);
}
