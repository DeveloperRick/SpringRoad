package ma.rick;

import java.util.Properties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Go {

	public static void main(String[] args) {
		ApplicationContext ac, ac1, ac2, ac3;

		ac = new ClassPathXmlApplicationContext("ma/rick/methodInvokingFactoryBean.xml");
		System.out.println("--------new ClassPathXmlApplicationContext:ac完成-----------");
		Properties sysProps = (Properties) ac.getBean("sysProps");
		System.out.println(sysProps);
		System.out.println("☆sysProps☆Java version is " + sysProps.get("java.version"));


		ac1 = new ClassPathXmlApplicationContext("ma/rick/methodInvokingFactoryBean_1.xml");
		System.out.println("--------new ClassPathXmlApplicationContext:ac1完成-----------");
		Properties sysProps_x = (Properties) ac1.getBean("sysProps_x");
		System.out.println("☆sysProps_x☆Java version is " + sysProps_x.get("java.version"));
		Properties sysProps_y = (Properties) ac1.getBean("sysProps_y");
		System.out.println("☆sysProps_y☆Java version is " + sysProps_y.get("java.version"));

		ac2 = new ClassPathXmlApplicationContext("ma/rick/methodInvokingFactoryBean_2.xml");
		System.out.println("--------new ClassPathXmlApplicationContext:ac2完成-----------");
		Properties sysProps22 = (Properties) ac2.getBean("sysProps22");
		System.out.println("This website is: " + sysProps22.get("site"));


		ac3 = new ClassPathXmlApplicationContext("ma/rick/methodInvokingFactoryBean_3.xml");
		System.out.println("--------new ClassPathXmlApplicationContext:ac3完成-----------");
		Boolean result3 = (Boolean) ac3.getBean("result3");
		System.out.println("Is Empty? The result is: " + result3);
		Boolean result3_z = (Boolean) ac3.getBean("result3_z");
		System.out.println("Is Empty? The result is(result3_z): " + result3_z);
		String result_os = (String) ac3.getBean("result_os");
		System.out.println("This os.name is: " + result_os);
		String result_java_version = (String) ac3.getBean("result_java_version");
		System.out.println("This java_version is: " + result_java_version);


	}

}
