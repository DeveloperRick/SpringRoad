/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 *
 * @author M
 */
public class EmailNotifier implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent e) {
		if (e instanceof EmailEvent) {
			EmailEvent emailEvent = (EmailEvent) e;
			System.out.println("Source是：" + emailEvent.getSource());
			System.out.println("接收地址是：" + emailEvent.address);
			System.out.println("邮件正文是：" + emailEvent.text);
		} else {

			System.out.println("容器本身的事件是：" + e.toString());
		}
	}

}
