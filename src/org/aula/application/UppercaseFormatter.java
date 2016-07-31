package org.aula.application;

import java.lang.annotation.Annotation;

import org.aula.framework.ValueFormatter;

public class UppercaseFormatter implements ValueFormatter {

	@Override
	public Object formatValue(Object value) {
		return value.toString().toUpperCase();
	}

	@Override
	public void readAnnotation(Annotation an) {
		// TODO Auto-generated method stub

	}

}
