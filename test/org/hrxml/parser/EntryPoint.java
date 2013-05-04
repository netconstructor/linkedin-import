package org.hrxml.parser;

import java.io.File;

import org.hrxml.model.main.ConnectionInfo;
import org.hrxml.model.main.PersonProfile;

public class EntryPoint {
	public static void main(String[] args) throws Exception {
		File personSource = new File("/Users/sriniup/Documents/Shweta/code/linkedin-import/test/org/hrxml/parser/linkedin-response-person.xml");
		PersonProfile person = HRXMLParser.parsePersonInformation(personSource);
		System.out.println(person.getEmailAddress());
		System.out.println(person);

		File connectionsSource = new File("/Users/sriniup/Documents/Shweta/code/linkedin-import/test/org/hrxml/parser/linkedin-response-contact.xml");
		ConnectionInfo connectionInfo = HRXMLParser.parseConnectionsInformation(connectionsSource);
		System.out.println(connectionInfo);
	}
}
