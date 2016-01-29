/**
 * 
 */
package com.samsoft.trueyes.crm.domain;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.samsoft.trueyes.core.domain.AuditableMongoEntity;

/**
 * @author sambhav.jain
 *
 */
@Document
public class EyePrescription extends AuditableMongoEntity {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2960370131822567472L;

	public static final class EyeSight implements Serializable {

		/**
		 * serialVersionUID
		 */
		private static final long serialVersionUID = -727383863743170694L;

		public float sph;
		public float cyl;
		public short axis;
		public float add;

		public EyeSight() {
		}

		/**
		 * @param sph
		 * @param cyl
		 * @param axis
		 */
		public EyeSight(float sph, float cyl, short axis) {
			super();
			this.sph = sph;
			this.cyl = cyl;
			this.axis = axis;
		}

		/**
		 * @param sph
		 */
		public EyeSight(float sph) {
			super();
			this.sph = sph;
		}

		/**
		 * @param sph
		 * @param cyl
		 * @param axis
		 * @param add
		 */
		public EyeSight(float sph, float cyl, short axis, float add) {
			super();
			this.sph = sph;
			this.cyl = cyl;
			this.axis = axis;
			this.add = add;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "EyeSight [sph=" + sph + ", cyl=" + cyl + ", axis=" + axis + ", add=" + add + "]";
		}
	}

	@NotNull
	@Valid
	protected EyeSight left;

	@NotNull
	@Valid
	protected EyeSight right;

	@DBRef(lazy = true)
	@NotNull
	@JsonIgnore
	protected Customer customer;

	/**
	 * @return the left
	 */
	public EyeSight getLeft() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(EyeSight left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public EyeSight getRight() {
		return right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(EyeSight right) {
		this.right = right;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EyePrescription [left=" + left + ", right=" + right + ", customer=" + customer + ", dateCreated="
				+ dateCreated + ", lastUpdated=" + lastUpdated + ", version=" + version + ", id=" + id + "]";
	}

}
