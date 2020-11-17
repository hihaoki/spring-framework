package cn.h.spring.context.app.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author huanghao
 * @version 1.0
 * @description
 * @date 2020/11/17 10:21
 */
public class SpringEventDemo extends ApplicationEvent {
	private static final long serialVersionUID = -2397557338638281611L;

	/**
	 * Create a new {@code ApplicationEvent}.
	 *
	 * @param source the object on which the event initially occurred or with
	 *               which the event is associated (never {@code null})
	 */
	public SpringEventDemo(Object source) {
		super(source);
		System.out.println("SpringEventDemo");
	}
}
