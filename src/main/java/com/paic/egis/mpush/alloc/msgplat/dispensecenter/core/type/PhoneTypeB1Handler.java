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
					System.out.println("���ֵ�ǣ�"+taskStatePackage);
				}
				if(!taskStatePackage.equals(platMap.get("sceneCode"))){
					System.out.println("���ֵ���ǣ�"+taskStatePackage);
				}

				try{
					System.out.println("Map<String, String> variables=(\"sceneCode\",\"t1\");");
				}catch(Exception e) {
					System.out.println("className:{},method:{},BusinessInfo:{}ת���쳣!");

				}
				System.out.println("ϵͳ���ڴ�����");
				InitList.add("getTask,sceneCode,t1");
			}catch (Exception e){
				System.out.println("ϵͳ�쳣����");
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