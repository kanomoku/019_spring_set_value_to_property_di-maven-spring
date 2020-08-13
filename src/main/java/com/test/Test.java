package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.People;
import com.pojo.PeopleSetListMapArrayProperty;

/**
 * 如何给bean的属性赋值(注入)
 * 
 * IOC 控制反转 由程序员主动实例化的过程转交给了spring
 * DI 当我们一个类需要依赖另一个对象，把另一个对象实例化之后注入给这个对象的过程我们称之为DI
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
//		五.如何给Bean 的属性赋值(注入)
//		1.通过构造方法设置值.
//		2.设置注入(通过set方法)
//			2.1 如果属性是基本数据类型或String等简单
//			2.2 如果属性是Set<?>
//			2.3 如果属性是List<?>
//				2.3.1 如果list中就只有一个值
//			2.4 如果属性是数组
//				2.4.1 如果数组中就只有一个值,可以直接通过value属性赋值
//			2.5 如果属性是map
//			2.6 如果属性Properties 类型
//		六. DI
//		1. DI:中文名称:依赖注入
//		2. 英文名称((Dependency Injection)
//			3. DI 是什么?
//				3.1 DI 和IoC 是一样的
//				3.2 当一个类(A)中需要依赖另一个类()对象时,把B 赋值给A 的过程就叫做依赖注入.
//		4. 代码体现:
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//1.构造方法设置值
		
		//2.设置 注入(通过set方法)
		People bean = ac.getBean("peo",People.class);
		System.out.println(bean);
		System.out.println("-----------------------------------");
		
		People bean1 = ac.getBean("peo1",People.class);
		System.out.println(bean1);
		System.out.println("-----------------------------------");
		
		PeopleSetListMapArrayProperty bean2 = ac.getBean("peopleSetListMapArrayProperty",PeopleSetListMapArrayProperty.class);
		System.out.println(bean2);
		System.out.println("-----------------------------------");

	}
}
