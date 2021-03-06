package org.aula.framework;

import java.io.IOException;

public class Crypto implements PostProcessor {

	private int delay;
	
	public Crypto(int delay) {
		this.delay = delay;
	}

	@Override
	public byte[] postProcess(byte[] bytes) {
		byte[] newBytes = new byte[bytes.length];
		for(int i = 0; i < bytes.length; i++) {
			newBytes[i] = (byte) ((bytes[i]+delay) % Byte.MAX_VALUE);
		}
		
		return newBytes;
	}

}
