package org.aula.framework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public class FileSerializer {

	private PostProcessor pp;
	private DataFormatter df;
	
	public FileSerializer(PostProcessor pp, DataFormatter df) {
		this.pp = pp;
		this.df = df;
	}

	public void generateFile(String filename, PropertiesGetter propGetter) {
		byte[] bytes = this.df.formatData(propGetter.getPropertiesList());
		
		try {
			bytes = this.pp.postProcess(bytes);
			FileOutputStream fileout = new FileOutputStream(filename);
			fileout.write(bytes);
			fileout.close();
		} catch(Exception e) {
			throw new RuntimeException("Problemas writing the file", e);
		}
	}
}
