package com.open.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 用户登录控制层
 * @author zhangli
 * @Date 2019/11/18 17:42
 */
@Controller
public class LoginController {

	/**
	 * 连接数据库
	 * @param username 连接hbase数据库的ip地址
	 * @param password 连接hbase数据库的密码
	 */
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public void login(String ip,String password,Integer port){
		//连接hbase数据库

	}
}
