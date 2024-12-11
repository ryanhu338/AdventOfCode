package days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> leftList = new ArrayList<Integer>();
		ArrayList<Integer> rightList = new ArrayList<Integer>();

		try {
		Scanner scanner = new Scanner(new File("input.txt"));
		
		
			while(scanner.hasNext()) {
			
				//call nextInt 2x each iteration
				//add to respective lists
			
				leftList.add(scanner.nextInt());
				rightList.add(scanner.nextInt());

			}
			
			int sum = 0;
			
			/*while(leftList.size()>0) {
				
				
				//look for the smallest element in the left
				int smallestLeft = leftList.get(0);
				int smallestIndex = 0;
				for(int i = 0; i < leftList.size();++i) {
					if(leftList.get(i)< smallestLeft) {
						smallestLeft = leftList.get(i);
						smallestIndex = i;
					}
				}
				
				//remove the smallest from the list
				leftList.remove(smallestIndex);
				//continue with right list
				
				
				int smallestRight = rightList.get(0);
				smallestIndex = 0;
				for(int i = 0; i < rightList.size();++i) {
					if(rightList.get(i)< smallestRight) {
						smallestRight = rightList.get(i);
						smallestIndex = i;
					}
				}
				//remove it forem the list
				rightList.remove(smallestIndex);
				//System.out.println(smallestLeft + " : " + smallestRight + " : " + Math.abs(smallestRight-smallestLeft));
				//sum+=Math.abs(smallestRight-smallestLeft);
				
			}
			*/
			
			
			//System.out.println("Sum: " +sum);
			//look for smallest in right
			//find the difference
			//remove the smallest elements each time
			//repeat
			
			
			//Part 2
			int simlarityScore = 0;
			int cnt;

			for(int i = 0;i < leftList.size(); ++i) {
				cnt = 0;
				for(int j = 0; j < rightList.size(); ++j) {
					
					if(Math.abs(leftList.get(i)) == Math.abs(rightList.get(j))) {
						cnt++;
					}
				}
				System.out.println(cnt + ":" + leftList.get(i));
				simlarityScore+=(cnt*leftList.get(i));
				System.out.println("Score for this number:" + cnt*leftList.get(i));
			}
			
			System.out.println("simlarityScore:" + simlarityScore);
			
			
			
			
			

		}catch(FileNotFoundException e) {
				e.printStackTrace();
	
		}

	}
	
	
}

