package com.example;
public class Palindrome
{

// Function that returns true if the word is found
	static boolean isWordPresent(String sentence, String word)
	{
	// To break the sentence in words
		String []s = sentence.split(" ");

	// To temporarily store each individual word
			for ( String temp :s)
		{

		// Comparing the current word
		// with the word to be searched
			if (temp.compareTo(word) == 0)
			{
				System.out.println(word);
				return true;
			}
		}
				return false;
	}
		
}
