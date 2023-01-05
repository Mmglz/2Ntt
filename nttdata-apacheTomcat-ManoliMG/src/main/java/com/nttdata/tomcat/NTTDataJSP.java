package com.nttdata.tomcat;

/**
 * Primer JSP
 * @author manoli
 *
 */
public class NTTDataJSP {

	/**
	 * Constructor por defecto.
	 */
	private NTTDataJSP() {
		
	}
	
	/**
	 * Saludo mediante JSP
	 * @param msg
	 * @return String
	 */
	public static String helloNTTDataDual(final String msg) {
		return "¡Bienvenid@ a la FP Dual " + msg;
	}
}
