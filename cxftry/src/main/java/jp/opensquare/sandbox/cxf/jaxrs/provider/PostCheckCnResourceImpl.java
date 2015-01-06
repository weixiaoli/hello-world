package jp.opensquare.sandbox.cxf.jaxrs.provider;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(
		endpointInterface="jp.opensquare.sandbox.cxf.jaxrs.provider.PostCheckCnResource",
		serviceName="PostCheckCnService",
		portName="PostCheckCnPort")
@SOAPBinding(
		style=Style.DOCUMENT,
		use=Use.LITERAL,		
		parameterStyle=ParameterStyle.BARE)
public class PostCheckCnResourceImpl implements PostCheckCnResource {
	
	@Override
	@WebMethod
	public CnInfo postCheckCn(CnInfo cnInfo) {
		System.out.println("cn:" + cnInfo.getCn());
		String strResult = "PostCheckCnNG.";
		if (checkStrCodeO(cnInfo.getCn()))
			strResult = "PostCheckCnOK.";		
		cnInfo.setCnCheckResult(strResult);
		
		return cnInfo;
	}
	
}
