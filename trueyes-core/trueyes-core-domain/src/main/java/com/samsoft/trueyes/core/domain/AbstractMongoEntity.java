package com.samsoft.trueyes.core.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

/**
 * @author kumar
 *
 */
public abstract class AbstractMongoEntity implements Serializable, IdAware<String> {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2953822450802291806L;

	@Id
	protected String id;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.samsoft.trueyes.core.domain.IdAware#getId()
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	@Override
	public void setId(String id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AbstractMongoEntity [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractMongoEntity other = (AbstractMongoEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
