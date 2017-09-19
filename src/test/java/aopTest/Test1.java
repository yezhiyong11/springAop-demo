package aopTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.ToDo;
import com.aop.ToHead;




public class Test1 {
	public static void main(String[] args) {
		@SuppressWarnings({ "resource", "unused" })
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ToDo aaa=(ToDo)appCtx.getBean("toDo");
		aaa.toEat();
		ToHead bbb=(ToHead)appCtx.getBean("toHead");
		bbb.toStart();
	}
}
