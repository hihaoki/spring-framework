package h;

import org.junit.Test;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContextTests;
import org.springframework.core.io.ClassPathResource;

/**
 * @author huanghao
 * @version 1.0
 * @description
 * @date 2020/8/14 7:46
 */
public class XmlBeanFactoryTest {

	@Test
	public void test1 () {

//		ClassPathXmlApplicationContextTests
		ClassPathResource classPathResource = new ClassPathResource("h/h1.xml");
		// classPathResouce 包含path和AppClassLoader
		System.out.println(classPathResource);

		new XmlBeanFactory(classPathResource);
	}


	@Test
	public void test () {

	}
}
