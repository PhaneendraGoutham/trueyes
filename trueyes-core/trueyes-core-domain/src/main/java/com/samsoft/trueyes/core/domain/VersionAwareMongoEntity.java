/**
 * 
 */
package com.samsoft.trueyes.core.domain;

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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VersionAwareMongoEntity [version=");
		builder.append(version);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

}
