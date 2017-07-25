package com.everis.alicante.courses.becajava.garage.utils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileUtils {
			    
	    public static void showFileContent(String path) throws IOException {
	     	     
	        String line;	     
	        File file= new File("src/main/resources/"+path);
	        FileReader reader=new FileReader(file);
	        BufferedReader  buffer= new BufferedReader(reader);
	        	        
	        try {
				while((line=buffer.readLine())!=null){
				    System.out.println(line);
				}
			} catch (IOException e) {
					throw e;
			}
	        finally {
				buffer.close();
			}
	        	     
	    }

	    public static List<String> loadData(String path) throws IOException{
	    	
	    	String line;
	    	List data=new ArrayList<String>();
		    File file= new File("src/main/resources/"+path);
		    FileReader reader=new FileReader(file);
		    BufferedReader  buffer= new BufferedReader(reader);
	    	
		    try {
				while((line=buffer.readLine())!=null){				  
					data.add(line);					
				}
			} catch (IOException e) {
					throw e;
			}
	        finally {
				buffer.close();
			}
		    
	    	return data;
	    }
	    
	    public static void saveFile(List<String> data,String path)  throws IOException{	  			    	
	    	
	    	  File file= new File("src/main/resources/"+path);		    	
	          FileWriter fstream = new FileWriter(file); 
	          BufferedWriter out = new BufferedWriter(fstream);
	          for (String string : data) {
	        	  out.write(string);
		          out.newLine();
	          }        	        
	          out.close();
	    	
	    }
	    
	    public static void main(String[] args) throws IOException {	    		    	    	
	    	
	     //   showFileContent("CarList.txt");
	        
	     //   List<String> list=new ArrayList<String>();
	     //   list=loadData("CarList.txt");
	        
	     //   System.out.println(list);
	        
	            
	        
	    }
	   
	}
	


