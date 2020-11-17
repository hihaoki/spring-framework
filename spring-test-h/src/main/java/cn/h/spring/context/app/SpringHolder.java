package cn.h.spring.context.app;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author huanghao
 * @version 1.0
 * @description
 * @date 2020/11/17 10:15
 */
@Component
public class SpringHolder implements  ApplicationContextAware {


	private static ApplicationContext applicationContext;

//	@Override
//	public void initialize(ConfigurableApplicationContext applicationContext) {
//		System.out.println("SpringHolder ==> initialize");
//	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("SpringHolder ==> setApplicationContext");
		SpringHolder.applicationContext = applicationContext;
	}
}
