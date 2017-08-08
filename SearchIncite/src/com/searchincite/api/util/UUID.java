package com.searchincite.api.util;



import org.apache.axis.components.uuid.UUIDGen;



public class UUID {

	

	public static String generateUUID() {

		UUIDGen gen = org.apache.axis.components.uuid.UUIDGenFactory.getUUIDGen();

		return gen.nextUUID().toUpperCase();

	}
	

}

