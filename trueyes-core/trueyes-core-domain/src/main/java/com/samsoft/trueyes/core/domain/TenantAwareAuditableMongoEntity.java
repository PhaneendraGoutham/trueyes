/**
 * 
 */
package com.samsoft.trueyes.core.domain;

/**
 * @author sambhav.jain
 *
 */
public class TenantAwareAuditableMongoEntity extends AuditableMongoEntity implements TenantAware {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2013084448167187063L;
	
	
	protected String tenant;

	/**
	 * @param tenant
	 *            the tenant to set
	 */
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.samsoft.trueyes.core.domain.TenantAware#getTenant()
	 */
	@Override
	public String getTenant() {
		return tenant;
	}

}
