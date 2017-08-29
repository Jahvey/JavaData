package com.wh.spring.ref;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.wh.spring.helloworld.User;

public class MyBeanPostProcessor implements BeanPostProcessor {

	//�÷����� init ����֮�󱻵���
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		if(arg1.equals("boy")){
			System.out.println("postProcessAfterInitialization..." + arg0 + "," + arg1);
			User user = (User) arg0;
			user.setUserName("�����");
		}
		return arg0;
	}

	//�÷����� init ����֮ǰ������
	//���Թ������صĶ������������շ��ظ� getBean �����Ķ�������һ��, ����ֵ��ʲô
	/**
	 * @param arg0: ʵ��Ҫ���صĶ���
	 * @param arg1: bean �� id ֵ
	 */
	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		if(arg1.equals("boy"))
			System.out.println("postProcessBeforeInitialization..." + arg0 + "," + arg1);
		return arg0;
	}

}
