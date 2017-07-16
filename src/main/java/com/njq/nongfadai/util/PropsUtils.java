/**
 * Project Name:maven-assembly
 * File Name:PropsUtils.java
 * Package Name:com.njq.nongfadai.util
 * Date:2017年7月16日下午2:00:00
 * Copyright (c) 2017, yangjie_software@163.com All Rights Reserved.
*/

package com.njq.nongfadai.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * ClassName: PropsUtils
 * Description: TODO.
 * Date: 2017年7月16日 下午2:00:00
 * Copyright (c) 2017, yangjie_software@163.com All Rights Reserved
 * Author: Jerrik
 */
public class PropsUtils {

	static  Properties props;
	
	static{
		try {
			InputStreamReader ir = new InputStreamReader(new FileInputStream(new File("src/main/resources/conf.properties")));
			props = new Properties();
			props.load(ir);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getPropsValue(String key){
		return props.getProperty(key);
	}
}

