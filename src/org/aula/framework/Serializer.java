package org.aula.framework;

public interface Serializer {

	void generateFile(String filename, Object obj);

	public void setPostProcessor(PostProcessor pp);

	public PostProcessor getPostProcessor();

}