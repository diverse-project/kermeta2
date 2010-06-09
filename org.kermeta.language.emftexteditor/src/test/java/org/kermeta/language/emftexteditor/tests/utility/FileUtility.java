package org.kermeta.language.emftexteditor.tests.utility;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileUtility {
	
	public static void compareFiles(String file1,String file2) throws Exception {
		//System.out.println("compare =>\n"+file1+"\n"+file2+"\n");
		System.out.println("File utility path => " + file1 );
		FileInputStream fileOutput = new FileInputStream(file1);
		InputStreamReader fileOutputReader = new InputStreamReader(fileOutput, "UTF-8");
		BufferedReader fileOutputBufferedReader =  new BufferedReader(fileOutputReader);
		
		FileInputStream fileTrace = new FileInputStream(file2);
		InputStreamReader fileTraceReader = new InputStreamReader(fileTrace, "UTF-8");
		BufferedReader fileTraceBufferedReader =  new BufferedReader(fileTraceReader);
		
		int pass = 0;
		String traceLine = "";
		String ouputLine = "";
		
		while (( traceLine = fileTraceBufferedReader.readLine()) != null){
			ouputLine = fileOutputBufferedReader.readLine();
			//System.out.println("traceLine/ouputLine "+pass+" =>" +traceLine+"\n"+ouputLine+"\n");
			if ((traceLine != null)){
				if(ouputLine != null){
					if(!traceLine.trim().equals(ouputLine.trim())){
						throw new Exception("Error comparing files:\n"+file1+"\nand:\n"+file2+"\nCaused by: \nContent Not Equals at "+pass+" "+traceLine+" | "+ouputLine);
					} else {
						
					}
				} else {
					throw new Exception("Error comparing files:\n"+file1+"\nand:\n"+file2+"\nCaused by: \nContent Not Equals,at "+pass+" trace: "+traceLine+" | found:"+ouputLine);
				}
			}
			pass = pass+1;
		}
		if ((traceLine == null)&&(pass==0)){
			throw new Exception("File empty "+pass+" "+traceLine+" | "+ouputLine);
		}
		
		fileTraceBufferedReader.close();
		fileTraceReader.close();
		fileTrace.close();
		
		fileOutputBufferedReader.close();
		fileOutputReader.close();
		fileOutput.close();
	}

}
