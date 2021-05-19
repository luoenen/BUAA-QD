package edu.buaa.qd.service.impl;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: UserServiceImpl
 * @date: 2021/5/15 13:46
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/

import edu.buaa.qd.dao.UserDao;
import edu.buaa.qd.entity.User;
import edu.buaa.qd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public Integer findMaxUid() {
        return userDao.getMaxUid();
    }

    @Override
    public User findUserByUid(int uid) {
        return userDao.getUserByUid(uid);
    }

    @Override
    public void addUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public User findUserByAccount(String account) {
        return userDao.getUserByAccount(account);
    }

    @Override
    public String findNicknameByAccount(String account) {
        return userDao.getNicknameByAccount(account);
    }

    @Override
    public User findUserByUuid(String uuid) {
        return userDao.getUserByUuid(uuid);
    }
}
