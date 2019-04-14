//package com.robots.example;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;

public class RobotsSavingInHtml {
	
	public void saveAsHtml() throws Exception, URISyntaxException, InterruptedException, AWTException{
        String csvFile = GetPropertiesValue.inputFile;
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        int count=1;

        br = new BufferedReader(new FileReader(csvFile));
        RobotLogger.log(Level.INFO, "Enter: saveAsHtml ");
        while ((line = br.readLine()) != null) {
            String number = String.valueOf(count);
            char[] digits1 = number.toCharArray();
            
            // use comma as separator
            String[] url = line.split(cvsSplitBy);
            System.out.println(url[0]);
            
            RobotLogger.log(Level.INFO, "parsed url: "+url[0]);
            
            Desktop d = Desktop.getDesktop();
    		d.browse(new URI(url[0]));
    		Thread.sleep(GetPropertiesValue.ThreadSleepBrwoserOpen);	
            // Create an instance of Robot class 
            Robot robot = new Robot(); 
            // Press keys using robot. A gap of 
            // of 500 mili seconds is added after 
            // every key press
            robot.mouseMove(0, 200);
            Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
            
            robot.keyPress(KeyEvent.VK_CONTROL);
            Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
            robot.keyPress(KeyEvent.VK_S);
            Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
            robot.keyRelease(KeyEvent.VK_S);
            Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
            robot.keyRelease(KeyEvent.VK_CONTROL);      
            
            Thread.sleep(GetPropertiesValue.ThreadSleepCtrlS);
            
            System.out.println(digits1.length);
            int index=0;
            while(index < digits1.length){
            	switch(digits1[index]){
            	case '1':
            		robot.keyPress(KeyEvent.VK_1);
            		break;
            	case '2':
            		robot.keyPress(KeyEvent.VK_2);
            		break;
            	case '3':
            		robot.keyPress(KeyEvent.VK_3);
            		break;
            	case '4':
            		robot.keyPress(KeyEvent.VK_4);
            		break;
            	case '5':
            		robot.keyPress(KeyEvent.VK_5);
            		break;
            	case '6':
            		robot.keyPress(KeyEvent.VK_6);
            		break;
            	case '7':
            		robot.keyPress(KeyEvent.VK_7);
            		break;
            	case '8':
            		robot.keyPress(KeyEvent.VK_8);
            		break;
            	case '9':
            		robot.keyPress(KeyEvent.VK_9);
            		break;
            	case '0':
            		robot.keyPress(KeyEvent.VK_0);
            		break;
            	default:
            			break;
            	}
            	index++;
            	Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
            }
            count++;
            //Thread.sleep(1000);
            Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
            
            
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);  
            // close browser tab
            robot.keyPress(KeyEvent.VK_CONTROL);
            Thread.sleep(500);
            robot.keyPress(KeyEvent.VK_F4);
            Thread.sleep(500);
            robot.keyRelease(KeyEvent.VK_F4);
            Thread.sleep(500);
            robot.keyRelease(KeyEvent.VK_CONTROL);  
            Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent); 
            
            /*Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
		            stringSelection, null);*/          
                   
        }
        br.close();

	}

}
