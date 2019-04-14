//package com.robots.example;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;

public class RobotsSavingAsText {
	
	public void saveAsText() throws HeadlessException, IOException, URISyntaxException, InterruptedException, AWTException {
	       StringSelection stringSelection = new StringSelection("EMPTY");
   		
	    	//String csvFile = "C:/Users/indranid/Downloads/java-test/test1.csv";
	        String csvFile = GetPropertiesValue.inputFile;
	        BufferedReader br = null;
	        String line = "";
	        String cvsSplitBy = ",";
	        int count=1;

         br = new BufferedReader(new FileReader(csvFile));
         RobotLogger.log(Level.INFO, "Enter: saveAsText");
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
             Thread.sleep(500);
             robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
             Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
             robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
             Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
             robot.keyPress(KeyEvent.VK_CONTROL);
             Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
             robot.keyPress(KeyEvent.VK_A);
             Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
             robot.keyRelease(KeyEvent.VK_A);
             Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
             robot.keyRelease(KeyEvent.VK_CONTROL);
             
             //robot.delay(1000);
             //Thread.sleep(5000);
             Thread.sleep(GetPropertiesValue.ThreadSleepCtrlA);
             
             robot.keyPress(KeyEvent.VK_CONTROL);
             Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
             robot.keyPress(KeyEvent.VK_C);
             Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
             robot.keyRelease(KeyEvent.VK_C);
             Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
             robot.keyRelease(KeyEvent.VK_CONTROL);
             
             //Thread.sleep(5000);
             Thread.sleep(GetPropertiesValue.ThreadSleepCtrlC);
             
             // close browser tab
             robot.keyPress(KeyEvent.VK_CONTROL);
             Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
             robot.keyPress(KeyEvent.VK_F4);
             Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
             robot.keyRelease(KeyEvent.VK_F4);
             Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
             robot.keyRelease(KeyEvent.VK_CONTROL);  
             
             //Thread.sleep(2000);
             Thread.sleep(GetPropertiesValue.ThreadSleepCtrlF4);
             
             String command = "notepad.exe"; 
             Thread.sleep(1000);
             
             Runtime run = Runtime.getRuntime(); 
             run.exec(command); 
             try { 
                 Thread.sleep(2000); 
             } 
             catch (InterruptedException e) 
             { 
                 // TODO Auto-generated catch block 
                 e.printStackTrace(); 
             } 
                             
             robot.keyPress(KeyEvent.VK_CONTROL);
             Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
             robot.keyPress(KeyEvent.VK_V);
             Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
             robot.keyRelease(KeyEvent.VK_V);
             Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
             robot.keyRelease(KeyEvent.VK_CONTROL);      
             
             //Thread.sleep(5000);
             Thread.sleep(GetPropertiesValue.ThreadSleepCtrlV);
                             
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
             Thread.sleep(1000); 
             
             robot.keyPress(KeyEvent.VK_ENTER);
             Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
             // close the txt file
             robot.keyPress(KeyEvent.VK_ALT);
             Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
             robot.keyPress(KeyEvent.VK_F4);
             Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
             robot.keyRelease(KeyEvent.VK_F4);
             Thread.sleep(GetPropertiesValue.ThreadSleepKeyEvent);
             robot.keyRelease(KeyEvent.VK_ALT);      
             
             //Thread.sleep(2000);
             Thread.sleep(GetPropertiesValue.ThreadSleepAltF4);
             
             // Clearing the system clipboard after copy
             RobotLogger.log(Level.INFO, "Clearing system clipboard");
             Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
 		            stringSelection, null);          
                    
         }
         br.close();

	}

}
