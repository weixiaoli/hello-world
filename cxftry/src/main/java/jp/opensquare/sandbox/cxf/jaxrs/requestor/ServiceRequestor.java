package jp.opensquare.sandbox.cxf.jaxrs.requestor;

import jp.opensquare.sandbox.cxf.jaxrs.provider.CnInfo;
import jp.opensquare.sandbox.cxf.jaxrs.provider.PostCheckCnResource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceRequestor {
	public static void main(String[] args) {
		//Rest
		System.out.println("--- PostCheckCn Test   ---");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("requestor-beans.xml");
		PostCheckCnResource postCheckCnResource = (PostCheckCnResource) context.getBean("postCheckCnResource");
		CnInfo cnInfo = postCheckCnResource.postCheckCn(new CnInfo("yahoo.jp"));
		System.out.println(cnInfo.toString());
		
		//Soap
		System.out.println("--- PostCheckCn Test Soap  ---");
		ClassPathXmlApplicationContext context_ws = new ClassPathXmlApplicationContext("requestor-beans-ws.xml");
		PostCheckCnResource postCheckCnResource_ws = (PostCheckCnResource) context_ws.getBean("postCheckCn");
		CnInfo cnInfo_ws = postCheckCnResource_ws.postCheckCn(new CnInfo("yahoo.jp"));
		System.out.println(cnInfo_ws.toString());
		
		System.exit(0);
	}
}
