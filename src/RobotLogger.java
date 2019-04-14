//package com.robots.example;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class RobotLogger {
	static Logger logger;
	FileHandler fh;
	Formatter plainText;
	
	private RobotLogger() throws SecurityException, IOException {
		logger= Logger.getLogger(Robots.class.getName());
		fh = new FileHandler(GetPropertiesValue.logFile,true);
		plainText = new SimpleFormatter();
        fh.setFormatter(plainText);
	    logger.addHandler(fh);
	    logger.info("Logger Name: "+logger.getName());
	    logger.log(Level.WARNING, "Constructing RobotLogger");
	}
	
	private static Logger getLogger(){
	    if(logger == null){
	        try {
	            new RobotLogger();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    return logger;
	}
	
	public static void log(Level level, String msg){
	    getLogger().log(level, msg);
	    System.out.println(msg);
	}

}
