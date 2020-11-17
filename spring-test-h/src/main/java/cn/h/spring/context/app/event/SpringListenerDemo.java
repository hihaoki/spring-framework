package cn.h.spring.context.app.event;

import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author huanghao
 * @version 1.0
 * @description
 * @date 2020/11/17 10:22
 */
@Component
@Order(2)
public class SpringListenerDemo implements ApplicationListener<SpringEventDemo> {
	@Override
	public void onApplicationEvent(SpringEventDemo event) {
		System.out.println("SpringListenerDemo=== >" + event);
	}
}
