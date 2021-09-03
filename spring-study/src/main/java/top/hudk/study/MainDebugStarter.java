package top.hudk.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.hudk.study.beans.User;

/**
 * 描述：
 *
 * @author hudongkang
 * @date 2021-09-03 14:15
 */
public class MainDebugStarter {


	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = context.getBean(User.class);
		System.out.println(user.toString());
		context.close();
	}

}
