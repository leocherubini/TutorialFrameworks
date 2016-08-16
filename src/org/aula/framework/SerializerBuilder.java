package org.aula.framework;

public class SerializerBuilder {

	private Serializer serializer;
	
	public void createXMLSerializer() {
		serializer = new FileSerializer(new NullPostProcessor(), new XMLFormatter());
	}
	
	public void createPropertiesSerializer() {
		serializer = new FileSerializer(new NullPostProcessor(), new PropertiesFormatter());
	}
}
