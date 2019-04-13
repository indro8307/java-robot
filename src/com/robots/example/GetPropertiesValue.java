package com.robots.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertiesValue {

	String result = "";
	InputStream inputStream;
	public static String inputFile;
	public static String logFile;
	public static int   ThreadSleepBrwoserOpen;
	public static int   ThreadSleepKeyEvent;
	public static int	ThreadSleepCtrlA;
	public static int	ThreadSleepCtrlS;
	public static int	ThreadSleepCtrlC;
	public static int	ThreadSleepCtrlV;
	public static int   ThreadSleepCtrlF4;
	public static int	ThreadSleepAltF4;
	public static Boolean saveAsText;
		
	public void GetPropValue() throws IOException {
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
			// get the property value and print it out
			inputFile = prop.getProperty("inputFile");
			logFile = prop.getProperty("logFile");
			ThreadSleepBrwoserOpen = Integer.parseInt(prop.getProperty("ThreadSleepBrwoserOpen"));
			ThreadSleepKeyEvent = Integer.parseInt(prop.getProperty("ThreadSleepKeyEvent"));
			ThreadSleepCtrlA = Integer.parseInt(prop.getProperty("ThreadSleepCtrlA"));
			ThreadSleepCtrlS = Integer.parseInt(prop.getProperty("ThreadSleepCtrlS"));
			ThreadSleepCtrlC = Integer.parseInt(prop.getProperty("ThreadSleepCtrlC"));
			ThreadSleepCtrlV = Integer.parseInt(prop.getProperty("ThreadSleepCtrlV"));
			ThreadSleepCtrlF4 = Integer.parseInt(prop.getProperty("ThreadSleepCtrlF4"));
			ThreadSleepAltF4 = Integer.parseInt(prop.getProperty("ThreadSleepAltF4"));
			saveAsText = Boolean.parseBoolean(prop.getProperty("saveAsText"));
			
			result = "inputFile = " + inputFile
					  + ", " + "\nlogFile = " + logFile
					  + ", " + "\nThreadSleepBrwoserOpen = " + ThreadSleepBrwoserOpen
					  + ", " + "\nThreadSleepKeyEvent = " + ThreadSleepKeyEvent
					  + ", " + "\nThreadSleepCtrlA = " + ThreadSleepCtrlA
					  + ", " + "\nThreadSleepCtrlS = " + ThreadSleepCtrlS
					  + ", " + "\nThreadSleepCtrlC = " + ThreadSleepCtrlC
					  + ", " + "\nThreadSleepCtrlV = " + ThreadSleepCtrlV
					  + ", " + "\nThreadSleepCtrlF4 = " + ThreadSleepCtrlF4
					  + ", " + "\nThreadSleepAltF4 = " + ThreadSleepAltF4
					  + ", " + "\nsaveAsText = " + saveAsText;
			
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
	}
}
