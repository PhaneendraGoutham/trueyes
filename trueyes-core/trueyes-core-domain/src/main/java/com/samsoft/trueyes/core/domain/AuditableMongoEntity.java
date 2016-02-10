/**
 * 
 */
package com.samsoft.trueyes.core.domain;

import java.time.LocalDate;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 * @author kumar
 *
 */
public abstract class AuditableMongoEntity extends VersionAwareMongoEntity {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -67203638183725497L;

	@CreatedDate
	@Indexed(direction = IndexDirection.DESCENDING, background = true)
	protected LocalDate dateCreated;

	@LastModifiedDate
	protected LocalDate lastUpdated;

	/**
	 * @return the version
	 */
	public long getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(long version) {
		this.version = version;
	}

	/**
	 * @return the dateCreated
	 */
	public LocalDate getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated
	 *            the dateCreated to set
	 */
	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return the lastUpdated
	 */
	public LocalDate getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * @param lastUpdated
	 *            the lastUpdated to set
	 */
	public void setLastUpdated(LocalDate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}
