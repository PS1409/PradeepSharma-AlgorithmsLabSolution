package com.greatlearning.service;

public class CurrencyNotesCount {
    public void notesCountImplementation(int [] notes, int amount)
    {
    	try {   	
    		    int[] notesDetail = new int[notes.length];
		    	int remain_amt = amount;		    	
		    	for(int i = 0; i< notes.length; i++)
		    	{
		    		if(remain_amt > 0)
		    		{
			    		if(notes[i] > remain_amt)
			    		{
			    			notesDetail[i] = 0;
			    			continue;
			    		}
			    		else
			    		{
			    			notesDetail[i]= (remain_amt/notes[i]);
			    			//System.out.println(notes[i] + " : "+ (remain_amt/notes[i]));
			    			remain_amt = remain_amt % notes[i]; 
			    		}
		    	    }
		    	}
		    	if(remain_amt > 0)
		    	{
		    		System.out.println("Payment approach is not possible.");
		    	}
		    	else
		    	{
		    		System.out.println("Your payment approach in order to give min no of notes will be");
		    		for (int i = 0; i< notes.length; i++)
		            {
		    			if(notesDetail[i] > 0)
		                System.out.println(notes[i] + " : " + notesDetail[i]);
		            }
		    	}
        } 
    	 catch(ArithmeticException ex) {
    		 System.out.println(ex.getMessage());
    	 }
    }
}
