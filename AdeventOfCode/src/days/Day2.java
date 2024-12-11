package days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Day2 {

	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<String>();

		try {
			Scanner scanner = new Scanner(new File("intput2.txt"));
			
			while(scanner.hasNext()) {
				list.add(scanner.nextLine());
			}
			
			
			int safecnt = 0;	
			
			
			for(int i = 0; i < list.size(); ++i) {
			 	String line = list.get(i);
			 	String empty = "";
			 	for(int k = 0; k < line.length(); ++k){
			 	//	if(!line.substring(k).equals(" ")) {
			 	//		empty+=line.substring(k);
			 //		}
			 		if(k%2==0) {
			 			empty +=line.substring(k,k+1);
			 		}
			 		
			 	}
				int digit = Integer.parseInt(empty);
				System.out.println(digit);
				int cnt = 0;
				while(digit>=1){
					digit = digit%10;
					cnt++;
					digit /=10;
				}
				//ou are taking he last value first??
				int[] arr = new int[cnt];
				boolean positive = false;
				boolean negative = false;
				System.out.println(cnt);
				if(arr[1]-arr[0]>0) {
				 positive = true;
				}
				else {
				negative = true;
				}
				
				if(positive) {
					for(int j = 0;j < cnt-1; ++j) {
						int difference = Math.abs(arr[j+1]-arr[j]);
						if(difference<0) {
							positive = false;
						}
						if(difference<1 || difference > 3) {
							positive=  false;
						}
					}
					
					if(positive) {
						safecnt++;
					}
				}	
				else if(negative) {
					for(int j = 0;j < cnt-1; ++j) {
						int difference = Math.abs(arr[j+1]-arr[j]);
						if(difference>0) {
							negative = false;
						}
						if(difference<1 || difference > 3) {
							negative=  false;
						}
					}
					if(negative) {
						safecnt++;
					}
				}
			}
				
				System.out.println("safecnt: " + safecnt);
		
		

		
		
		/*ArrayList<ArrayList<Integer> > aList =  new ArrayList<ArrayList<Integer>>(); 
		
			try {
				Scanner scanner = new Scanner(new File("input2.txt"));
					
				while(scanner.hasNext()) {
					ArrayList<Integer> currentRow = new ArrayList<Integer>();
					aList.add(currentRow);
					   
					for(int i = 0; i < currentRow.size()-1; ++i) {
						if(currentRow.get(i+1)==0) {
							System.out.println("here");
						}
					}
				}
	
				
				
			*/	
				
				
				
				
				
			}catch(FileNotFoundException e) {
				e.printStackTrace();
	
		}
	}

}
