package org.hrxml.model.language;

import java.io.Serializable;

import org.hrxml.model.util.Proficiency;
import org.simpleframework.xml.Element;

public class LanguageSet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Element(name = "id")
	private String linkedinId;

	@Element(required = false)
	private Language language;

	@Element(required = false)
	private Proficiency proficiency;

	public LanguageSet() {
		super();
	}

	public LanguageSet(String linkedinId, Language language, Proficiency proficiency) {
		super();
		this.linkedinId = linkedinId;
		this.language = language;
		this.proficiency = proficiency;
	}

	public String getLinkedinId() {
		return linkedinId;
	}

	public void setLinkedinId(String linkedinId) {
		this.linkedinId = linkedinId;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Proficiency getProficiency() {
		return proficiency;
	}

	public void setProficiency(Proficiency proficiency) {
		this.proficiency = proficiency;
	}
}
