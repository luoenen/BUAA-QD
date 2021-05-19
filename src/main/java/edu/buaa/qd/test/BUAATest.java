package edu.buaa.qd.test;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: BUAATest
 * @date: 2021/5/15 17:12
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/

import edu.buaa.qd.entity.User;
import edu.buaa.qd.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-database.xml"})
public class BUAATest {

    private UserService service;

    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }

}
