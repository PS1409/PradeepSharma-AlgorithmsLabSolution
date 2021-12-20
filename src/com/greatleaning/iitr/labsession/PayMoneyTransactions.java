
package com.greatleaning.iitr.labsession;
import java.util.Scanner;


public class PayMoneyTransactions {
	
	private static Scanner scanner =  new Scanner(System.in);

	public static void main(String[] args) {
	            // getting the transaction size
		        System.out.println("Enter the transaction size");
				int trans_size =  scanner.nextInt();
				
				// Getting the transaction values into an array
				int [] transactions = new int[trans_size];				
				System.out.println("Enter the values of array");
				for(int i = 0; i< trans_size; i++)
				{
					transactions[i] = scanner.nextInt();
				}
				
				// Getting the total no of targets
				System.out.println("Enter the total no of targets that need to be acheived");
				int no_of_targets =  scanner.nextInt();
				int target_value = 0;	
				
				//iterating through the each target to check whether achieved or not
				for(int j=1; j<=no_of_targets; j++ )
				{
					// holding the total of transactions while iterating
					int total_target = 0;  
					
					// flag used for checking whether target achieved or not
					boolean is_target_achieved = false;
					
					// getting the target value input
					System.out.println("Enter the value of target");
					target_value = scanner.nextInt();
					
					for(int i = 0; i < trans_size; i++)
					{
						total_target += transactions[i];
						if(total_target >= target_value)
						{
							System.out.println("Target achieved after "+(i +  1)+" transactions");
							is_target_achieved = true;
							break;
						}
					}
					if(!is_target_achieved)
					{
						System.out.println("Given target is not achieved");
					}
				}

	}

}
