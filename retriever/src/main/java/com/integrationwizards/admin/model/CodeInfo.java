package com.integrationwizards.admin.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="CodeInfo")
@IdClass(CodeInfoPK.class)
public class CodeInfo {
	@Id
	private String codeClass;
	@Id
	private String codeKey;
	
	private String codeValue;
	private String description;
	
	public String getCodeClass() {
		return codeClass;
	}
	public void setCodeClass(String codeClass) {
		this.codeClass = codeClass;
	}
	public String getCodeKey() {
		return codeKey;
	}
	public void setCodeKey(String codeKey) {
		this.codeKey = codeKey;
	}
	public String getCodeValue() {
		return codeValue;
	}
	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}

class CodeInfoPK implements Serializable {
	protected String codeClass;
	protected String codeKey;
	
	public CodeInfoPK() {}
	
	public CodeInfoPK(String codeClass, String codeKey) {
		this.codeClass = codeClass;
		this.codeKey = codeKey;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeClass == null) ? 0 : codeClass.hashCode());
		result = prime * result + ((codeKey == null) ? 0 : codeKey.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodeInfoPK other = (CodeInfoPK) obj;
		if (codeClass == null) {
			if (other.codeClass != null)
				return false;
		} else if (!codeClass.equals(other.codeClass))
			return false;
		if (codeKey == null) {
			if (other.codeKey != null)
				return false;
		} else if (!codeKey.equals(other.codeKey))
			return false;
		return true;
	}
	
	
}