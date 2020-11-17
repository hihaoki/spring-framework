package cn.h.spring.context.app.service.impl;

import cn.h.spring.context.app.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author huanghao
 * @version 1.0
 * @description
 * @date 2020/11/16 22:54
 */
@Service
public class UserServiceImpl implements UserService {

	public UserServiceImpl () {
		System.out.println("UserServiceImpl ==> construct");
	}
}
