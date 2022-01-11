package com.paic.egis.mpush.alloc.msgplat.dispensecenter.core.type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class PhoneTypeB1Handler {


	public List<String> fetchSendDtoList(List<String> taskStateList){
		List InitList=null;
		Map<String, Map<String, String>> seceneMap=new HashMap();
		Map<String, String> in=new HashMap();
		seceneMap.put("getTask",in);
		in.put("sceneCode","t1");

		for (String taskStatePackage : taskStateList) {

			System.out.println(taskStatePackage);
			Map<String, String> platMap = seceneMap.get("getTask");
			try{
				if (taskStatePackage.equals(platMap.get("sceneCode"))) {
					System.out.println("这个值是："+taskStatePackage);
				}
				if(!taskStatePackage.equals(platMap.get("sceneCode"))){
					System.out.println("这个值不是："+taskStatePackage);
				}

				try{
					System.out.println("Map<String, String> variables=(\"sceneCode\",\"t1\");");
				}catch(Exception e) {
					System.out.println("className:{},method:{},BusinessInfo:{}转换异常!");

				}
				System.out.println("系统正在处理！！");
				InitList.add("getTask,sceneCode,t1");
			}catch (Exception e){
				System.out.println("系统异常！！");
			}
		}
		return InitList;
	}

	public static void main(String[] args) {
		List<String> little = new ArrayList<String>();
		PhoneTypeB1Handler ph = new PhoneTypeB1Handler();
		for(int i=1;i<=3;i++){
			String str = "t"+i;
			little.add(str);
		}
		ph.fetchSendDtoList(little);
	}
}