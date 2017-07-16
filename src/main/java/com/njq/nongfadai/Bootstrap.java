/**
 * Project Name:maven-assembly
 * File Name:Bootstrap.java
 * Package Name:com.njq.nongfadai
 * Date:2017年7月15日上午11:07:25
 * Copyright (c) 2017, yangjie_software@163.com All Rights Reserved.
*/

package com.njq.nongfadai;

import com.google.common.base.Joiner;
import com.njq.nongfadai.util.PropsUtils;

/**
 * ClassName: Bootstrap
 * Description: TODO.
 * Date: 2017年7月15日 上午11:07:25
 * Copyright (c) 2017, yangjie_software@163.com All Rights Reserved
 * Author: Jerrik
 */
public class Bootstrap {

	public static void main(String[] args) {
		System.out.println("程序启动 begin()...");
		
		String[] strs = new String[]{"I","am","good","boy",",","I","love","java."};
		System.out.println("result: " + Joiner.on(" ").join(strs));
		
		System.out.println("config.properties..." + PropsUtils.getPropsValue("jdbc.url"));
		
		System.out.println("程序结束 end()...");
	}

}

