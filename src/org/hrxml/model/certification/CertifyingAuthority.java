package org.hrxml.model.certification;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class CertifyingAuthority implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element
	private String name;

	public CertifyingAuthority() {
		super();
	}

	public CertifyingAuthority(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
