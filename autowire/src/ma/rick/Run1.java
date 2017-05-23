/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class Run1 {

	/**
	 * @param args the command line arguments
	 */

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("ma/rick/beans_default-autowire.xml");
		//byName
		Computer computer1 = (Computer) ac.getBean("computer1");
		System.out.println("autowire=\"byName\":");
		computer1.run();

		//byType
		Computer computer2 = (Computer) ac.getBean("computer2");
		System.out.println("autowire=\"byType\":");
		computer2.run();

		//default
		Computer computer3 = (Computer) ac.getBean("computer3");
		System.out.println("autowire=\"default\":");
		computer3.run();

		
		/*
		Spring IoC容器已经为我们自动的装配好的“电脑”，从而配置文件简洁了许多。但是，自动装配并不是十全十美的，我们不论是使用byName还是byType的方法，Spring不一定就能很准确的为我们找到JavaBean依赖的对象。另外，如果使用自动装配，Spring配置文件的可读性也大大降低，我们不能很容易的看出个bean之间的依赖关系，这也在一定程度上降低了程序可维护性。因此在使用自动装配时，应当权衡利弊，合理的与ref的方法相结合，尽量在降低工作量的同时，保证应用的可维护度。
		*/
	}

}
