// ZOA_CREATED! DO NOT EDIT IT! -- 
package com.paic.egis.mpush.alloc.msgplat.dispensecenter.core.type;
import com.process.ZoaExp;
import com.process.ZoaThreadLocal;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class PhoneTypeB1Handler {


	 public List<String> fetchSendDtoList(List<String> taskStateList){
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 1 0 5699964"); 
		 List InitList=null;
		 Map<String, Map<String, String>> seceneMap=new HashMap();
		 Map<String, String> in=new HashMap();
		 seceneMap.put("getTask",in);
		 in.put("sceneCode","t1");

		 for (String taskStatePackage : /* TRUE */taskStateList){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 1 1 5699964");ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 1 2 5699964"); {

			 System.out.println(taskStatePackage);
			 Map<String, String> platMap = seceneMap.get("getTask");
			 try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 1 3 5699964"); 
				 if ((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 1 4 5699964")|| true) && (taskStatePackage.equals(platMap.get("sceneCode"))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 1 0 0 1 0 ","5699964",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 1 0 0 0 0 ","5699964",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 1 5 5699964");  {
				 	System.out.println("这个值是"+taskStatePackage);
				 } }
				 if((ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 1 7 5699964")|| true) && (!taskStatePackage.equals(platMap.get("sceneCode"))? (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 1 1 1 1 0 ","5699964",true,1) || true): (ZoaExp.ZoaMCDC(ZoaThreadLocal.G_Ins().G_CInf() + " 1 1 1 0 0 ","5699964",false,0) && false))){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 1 8 5699964"); {
					 System.out.println("这个值不是"+taskStatePackage);
				 } }

				 try{ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 1 10 5699964"); 
					 System.out.println("Map<String, String> variables=(\"sceneCode\",\"t1\");");
				 }catch(Exception e) {ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 1 11 5699964"); 
					 System.out.println("className:{},method:{},BusinessInfo:{}转换异常");

				 }
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 1 12 5699964");
				 System.out.println("系统正在处理！！");
				 InitList.add("getTask,sceneCode,t1");
				 }catch (Exception e){ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 1 13 5699964"); 
				 System.out.println("系统异常！！");
				 }
		 }}
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1000 1 15 5699964");
		 return InitList;
	 }

	 public static void main(String[] args) {
ZoaExp.N(ZoaThreadLocal.G_Ins().G_CInf() + " 1001 1 16 5699964"); 
		 List<String> little = new ArrayList<>();
		 little.add("t1");
		 little.add("t2");
		 little.add("t3");
		 PhoneTypeB1Handler ph = new PhoneTypeB1Handler();
		 ph.fetchSendDtoList(little);
	 }
 }