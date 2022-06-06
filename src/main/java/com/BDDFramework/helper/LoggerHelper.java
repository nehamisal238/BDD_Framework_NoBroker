package com.BDDFramework.helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.beust.jcommander.Strings;

public class LoggerHelper {
	
	private static boolean root=false;
	
	public static Logger getLogger(Class cls){
		if(root){
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("log4j.properties");
		root = true;
		return Logger.getLogger(cls);
	}

	public static void main(Strings args) {
		Logger log=getLogger(LoggerHelper.class);
		log.info("Test Is Done");
		log.info("Test Is Done");
		log.info("Test Is Done");
		
	}
}
