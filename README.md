# java-robot
Java application to open URLs from a csv file and copy its contents in text or html format

This java based application makes use of the Robot class to perform the following:

1. Parse a CSV file with which contains a list of URLs.
2. Open the URLs in the default web browser.
3. Based on value of 'saveAsText' option provided in config.properties file it will either:

      i) Trigger Ctrl+S to save the webpage in Html format.
      
     ii) Trigger Ctrl+F4 to close the web browser tab. 
     
                           OR
                           
      i) Trigger Ctrl+A to select the contents of the webpage.
      
     ii) Trigger Ctrl+C to copy the contents of the webpage
     
    iii) Trigger Ctrl+F4 to close the web browser tab in which the webpage was opened
    
     iv) Open notepad.exe
     
      v) Trigger Ctrl+V to paste the contents in the notepad
      
     vi) Trigger Ctrl+S to save the notepad with names as 1.txt, 2.txt, 3.txt and so on
     
    vii) Trigger Alt+F4 to close the notepad
    
   viii) Clear the contents of the clipboard and fill it wth the string "EMPTY" 

Description of config.properties attributes:
============================================

inputFile=test1.csv               Name of the CSV file which contain a list of URLs

logFile=log.txt                   Name of the file were logs will be stored

ThreadSleepBrwoserOpen=1000       Time delay after opening a web browser

ThreadSleepKeyEvent=500           Time delay after a key event

ThreadSleepCtrlA=2000             Time delay after Ctrl+A functionality

ThreadSleepCtrlS=500              Time delay after Ctrl+S functionality

ThreadSleepCtrlC=500              Time delay after Ctrl+C functionality

ThreadSleepCtrlV=500              Time delay after Ctrl+V functionality

ThreadSleepCtrlF4=1000            Time delay after Ctrl+F4 functionality

ThreadSleepAltF4=1000             Time delay after Altl+F4 functionality

saveAsText=true                   If set as 'true', contents will be saved as text format, else 
                                  the file will be saved in html format
                                  
                                  
How to modify attributes in config.parameter:
=============================================

Untar the contents of jar file and and modify the 'config.properties' file with the desired values.
After that update the jar file with the new file with the below command:

           jar uf robot.jar config.properties
           
           
           





