package cn.h.spring.context;

import cn.h.spring.context.app.App;
import cn.h.spring.context.app.event.SpringEventDemo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author huanghao
 * @version 1.0
 * @description
 * @date 2020/11/16 22:52
 */
public class AnnotationApplicationContextTest {

	public static void main(String[] args) {


		AnnotationConfigApplicationContext ac =
				new AnnotationConfigApplicationContext(App.class);


		ac.publishEvent(new SpringEventDemo(ac));

		System.out.println(ac);
	}
}
