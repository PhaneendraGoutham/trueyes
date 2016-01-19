/**
 * 
 */
package com.samsoft.trueyes.core.domain;

import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

/**
 * @author kumar
 *
 */
public abstract class AuditableMongoEntity extends VersionAwareMongoEntity {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -67203638183725497L;

	@Version
	protected long version;

	@CreatedDate
	protected DateTime dateCreated;

	@LastModifiedDate
	protected DateTime lastUpdated;

	/**
	 * @return the version
	 */
	protected long getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	protected void setVersion(long version) {
		this.version = version;
	}

	/**
	 * @return the dateCreated
	 */
	protected DateTime getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated
	 *            the dateCreated to set
	 */
	protected void setDateCreated(DateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return the lastUpdated
	 */
	protected DateTime getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * @param lastUpdated
	 *            the lastUpdated to set
	 */
	protected void setLastUpdated(DateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}
