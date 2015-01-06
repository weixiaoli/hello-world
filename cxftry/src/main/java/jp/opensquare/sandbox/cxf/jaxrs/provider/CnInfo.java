package jp.opensquare.sandbox.cxf.jaxrs.provider;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CnInfo {
	private String cn;

	private String cnCheckResult;
	
	public CnInfo() {
		super();
	}
	
	public CnInfo(String cn) {
		super();
		this.cn = cn;
	}	
	
	/**
	 * @return the cnCheckResult
	 */
	public String getCnCheckResult() {
		return cnCheckResult;
	}

	/**
	 * @param cnCheckResult the cnCheckResult to set
	 */
	public void setCnCheckResult(String cnCheckResult) {
		this.cnCheckResult = cnCheckResult;
	}

	/**
	 * @return the cn
	 */
	public String getCn() {
		return cn;
	}

	/**
	 * @param cn the cn to set
	 */
	public void setCn(String cn) {
		this.cn = cn;
	}
	
	@Override
	public String toString() {
		return "CN: " + this.cn +" , Result:" + this.cnCheckResult;
	}	
	
}
