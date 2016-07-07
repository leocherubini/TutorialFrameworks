package org.aula.framework;

public class Main {

	public static void main(String[] args) {
		Product p = new Product("notebook", "HP", 1999.99, "2348203894032948");
		
		FileSerializer cxs = new FileSerializer(new Compressor(), new PropertiesFormatter());
		cxs.generateFile("product.zip", p);
	}
	
}
