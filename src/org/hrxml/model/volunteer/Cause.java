package org.hrxml.model.volunteer;

import java.io.Serializable;

import org.simpleframework.xml.Element;

public class Cause implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element
	private String name;

	public Cause() {
		super();
	}

	public Cause(String name) {
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
