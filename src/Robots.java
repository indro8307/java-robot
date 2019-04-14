//package com.robots.example;

import java.util.logging.Level;


public class Robots {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		   GetPropertiesValue properties = new GetPropertiesValue();
		   properties.GetPropValue();
		   
	       RobotLogger.log(Level.INFO, "Initialized properties");    		
	    		
	       if(GetPropertiesValue.saveAsText) {
	    	   RobotsSavingAsText obj = new RobotsSavingAsText();
	    	   obj.saveAsText();
	       }
	       else
	       {
	    	   RobotsSavingInHtml obj = new RobotsSavingInHtml();
	    	   obj.saveAsHtml();
	       }
	}

}
