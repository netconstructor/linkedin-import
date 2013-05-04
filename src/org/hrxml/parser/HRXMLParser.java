package org.hrxml.parser;

import java.io.File;
import java.io.InputStream;

import org.hrxml.model.main.ConnectionInfo;
import org.hrxml.model.main.PersonProfile;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class HRXMLParser {
	public static PersonProfile parsePersonInformation(File inputFile) throws Exception {
		Serializer serializer = new Persister();

		PersonProfile person = serializer.read(PersonProfile.class, inputFile);

		return person;
	}

	public static PersonProfile parsePersonInformation(InputStream inputStream) throws Exception {
		Serializer serializer = new Persister();

		PersonProfile person = serializer.read(PersonProfile.class, inputStream);

		return person;
	}

	public static PersonProfile parsePersonInformation(String input) throws Exception {
		Serializer serializer = new Persister();

		PersonProfile person = serializer.read(PersonProfile.class, input);

		return person;
	}

	public static ConnectionInfo parseConnectionsInformation(File inputFile) throws Exception {
		Serializer serializer = new Persister();

		ConnectionInfo connectionInfo = serializer.read(ConnectionInfo.class, inputFile);

		return connectionInfo;
	}

	public static ConnectionInfo parseConnectionsInformation(InputStream inputStream) throws Exception {
		Serializer serializer = new Persister();

		ConnectionInfo connectionInfo = serializer.read(ConnectionInfo.class, inputStream);

		return connectionInfo;
	}

	public static ConnectionInfo parseConnectionsInformation(String input) throws Exception {
		Serializer serializer = new Persister();

		ConnectionInfo connectionInfo = serializer.read(ConnectionInfo.class, input);

		return connectionInfo;
	}
}
