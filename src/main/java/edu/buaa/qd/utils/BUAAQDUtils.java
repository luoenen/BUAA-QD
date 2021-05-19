package edu.buaa.qd.utils;

/*-*-*-*-*-*-*-*-*-*-*-*-*-*
 * @project: BUAAQD
 * @author: 罗申申
 * @email: luoshenshen@buaa.edu.cn
 * @file: BUAAQDUtils
 * @date: 2021/5/17 18:24
 *-*-*-*-*-*-*-*-*-*-*-*-*-*/

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

public class BUAAQDUtils {

    public static enum college{
        软件学院,集成电路科学与工程学院,Pico青岛小鸟看看
    }

    public static enum state{
        在线,离线
    }

    public static String getUUID(){
        return UUID.randomUUID().toString();
    }

    public static String getIp(HttpServletRequest request){

        String ip = null;
        String ipAddresses = request.getHeader("X-Forwarded-For");
        if (ipAddresses == null || ipAddresses.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {

            ipAddresses = request.getHeader("Proxy-Client-IP");
        }
        if (ipAddresses == null || ipAddresses.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {

            ipAddresses = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ipAddresses == null || ipAddresses.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {

            ipAddresses = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ipAddresses == null || ipAddresses.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {

            ipAddresses = request.getHeader("X-Real-IP");
        }

        if (ipAddresses != null && ipAddresses.length() != 0) {
            ip = ipAddresses.split(",")[0];
        }

        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ipAddresses)) {
            ip = request.getRemoteAddr();
        }
        return ip.equals("0:0:0:0:0:0:0:1")?"127.0.0.1":ip;
    }
}
