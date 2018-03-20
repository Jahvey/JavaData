package com.adonai.array;


import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class sortArray1 {
	
	private static Scanner sc;


	public static void main(String[] args) {
		sortArrayBySet();
		
		
	}

	private static void sortArrayBySet2() {
	

		
			sc=new Scanner(System.in);

			while(sc.hasNext()){  
	               
	            int n = sc.nextInt();  
	               
	            int[]arr = new int[n];  
	               
	            for(int i=0 ;i<n ;i++){  
	            arr[i]=sc.nextInt();
	            	
	            }  
	              
	            Arrays.sort(arr);
	            for (int i = 0; i < arr.length; i++) {
					if (i==0||arr[i]!=arr[i-1]) {
						System.out.println(arr[i]);
						
						
					}
				}
	            
	            
	           
			}
			
	
	}
	
	
	private static void sortArrayBySet1() {
		//相对路径要根据src的目录的路径来写
		 //File file = new File("src/source/sortArrayTest1"); 
		 
		   TreeSet<Integer> set=new TreeSet<Integer>();  
		try {
			sc=new Scanner(System.in);
			
			
			while(sc.hasNext()){  
	               
	            int n = sc.nextInt();  
	               
	            int[]arr = new int[n];  
	               
	            for(int i=0 ;i<n ;i++){  
	            
	            	set.add(sc.nextInt());
	            }  
	              
	            
	            for(Integer i:set){
		        	
		            System.out.println(i);
		        }
	           
			}
			
	
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	private static void sortArrayBySet() {
		//相对路径要根据src的目录的路径来写
		 //File file = new File("src/source/sortArrayTest1"); 
		 
		   TreeSet<Integer> set=new TreeSet<Integer>();  
		try {
			sc=new Scanner(System.in);
		
			int count=sc.nextInt();
	        int []arr=new int[count];
	        for(int i=0;i<count;++i){
	            
	           
	            set.add(sc.nextInt());
	            
	        }
	        
	        for(Integer i:set){
	        	
	            System.out.println(i);
	        }
	        
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
