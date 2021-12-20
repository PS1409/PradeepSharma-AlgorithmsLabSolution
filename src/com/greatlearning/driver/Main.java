package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.MergeSortImplementation;


import com.greatlearning.service.CurrencyNotesCount;

public class Main {
    private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		CurrencyNotesCount notesCount = new CurrencyNotesCount();
		

		System.out.println("enter the size of currency denominations");
		
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(notes,0,notes.length-1);
		
		for (int i = 0; i < size; i++) {
			System.out.println(notes[i]);
		}
		
		notesCount.notesCountImplementation(notes, amount);
	}

}
