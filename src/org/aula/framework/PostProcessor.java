package org.aula.framework;

import java.io.IOException;

public interface PostProcessor {

	byte[] postProcess(byte[] bytes) throws IOException;
	
}
