package org.hrxml.model.util;

import java.io.Serializable;
import java.util.List;

import org.hrxml.model.urls.URLResource;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class MemberURLResourceInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Attribute
	private int total;

	@ElementList(entry = "member-url", inline = true, required = false)
	private List<URLResource> memberURLs;

	public MemberURLResourceInfo() {
		super();
	}

	public MemberURLResourceInfo(int total, List<URLResource> memberURLs) {
		super();
		this.total = total;
		this.memberURLs = memberURLs;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<URLResource> getMemberURLs() {
		return memberURLs;
	}

	public void setMemberURLs(List<URLResource> memberURLs) {
		this.memberURLs = memberURLs;
	}
}
