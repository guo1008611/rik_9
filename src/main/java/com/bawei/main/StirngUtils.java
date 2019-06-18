package com.bawei.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/** 

* @author 作者 郭成龙: 

* @version 创建时间：2019年6月18日 下午7:10:00 

* 类说明 :

*/
public class StirngUtils {


	
	@Test
	public static void main(String[] args) {
		String cc[]= {"aa","bb","cc","dd","aa","aa"};
		String cc2[]= {"aa","bb","cc","dd","aa","aa"};
		String cc3[]= {"aa","bb","cc","dd","aa","aa"};
		HashMap  dd=new HashMap();
		dd.put(cc, 1);
		dd.put(cc2, 2);
		dd.put(cc3, 3);
		
		
			Set set = dd.keySet();
			Iterator iterator = set.iterator();
			for (Object object : set) {
				System.out.println(object);
			}
		
		/*for (String aa : cc) {
			if(aa.equals("aa")) {
				dd1+=1;
			}
			System.out.println(dd1);
		}*/
	}
	
}
