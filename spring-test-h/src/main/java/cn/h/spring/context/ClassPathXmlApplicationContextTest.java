package cn.h.spring.context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huanghao
 * @version 1.0
 * @description
 * @date 2020/11/17 0:14
 */
public class ClassPathXmlApplicationContextTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext =
				new ClassPathXmlApplicationContext("simple.xml");

		System.out.println(classPathXmlApplicationContext);
	}
}
