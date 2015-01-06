package jp.opensquare.sandbox.cxf.jaxrs.provider;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@WebService(targetNamespace="http://provider.jaxrs.cxf.sandbox.opensquare.jp/")
public interface PostCheckCnResource {
	
	@POST
	@Path("/postcheckcn")
	@Produces({"application/json", "application/xml"})
	@WebMethod
	CnInfo postCheckCn(CnInfo cnInfo);
	
}