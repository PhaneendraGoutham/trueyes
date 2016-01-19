/**
 * 
 */
package com.samsoft.trueyes.core.domain;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Version;

/**
 * @author kumar
 *
 */
public abstract class VersionAwareMongoEntity extends AbstractMongoEntity {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7337210911285362222L;

	@Version
	protected long version;

	@CreatedDate
	protected Date dateCreated;

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
	protected Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated
	 *            the dateCreated to set
	 */
	protected void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VersionAwareMongoEntity [version=");
		builder.append(version);
		builder.append(", dateCreated=");
		builder.append(dateCreated);
		builder.append("]");
		return builder.toString();
	}

}
