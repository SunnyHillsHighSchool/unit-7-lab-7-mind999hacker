//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Shahmir A

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Words
{
	private ArrayList<String> words = new ArrayList<>();
	private Character[] vowels = {'a','e','i','o','u'};

	public Words(String[] wordList)
	{
		for(int i = 0; i<words.size();i++)
		{
			words.remove(i);
		}
		Collections.addAll(words, wordList); 
		/*for(String i:wordList)
		{
			System.out.println(i); 
			
			//words.add(i);
		}*/
	}

	public int countWordsWithXChars(int size)
	{
		int count=0;
		for(int i = 0;i<words.size();i++)
		{
			if(words.get(i).length() == size)
			{
				count++;
			}
		}
		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int vowelsCount = 0;
		int i = 0;
		while(i<words.size())
		{
			if(words.get(i).length() == size)
			{
				for(int x = 0;x<words.get(i).length();x++)
				{
					for(Character c:vowels)
					{
						if(words.get(i).charAt(x) == c)
						{
							vowelsCount++;
						}
					}
				}
				words.remove(i);
				i=0;
			}
			else{i++;}
		}
		return vowelsCount;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
		int vowelsCount = 0;
		for(String i:words)
		{
			for(int x = 0;x<i.length();x++)
			{
				for(Character c:vowels)
				{
					if(i.charAt(x) == c)
					{
						vowelsCount++;
					}
				}
			}
			if(vowelsCount==numVowels)
			{
				count++;
			}
			vowelsCount=0;
		}
		return count;
	}
	
	//add in a toString
	public String toString()
	{
		return ""+words;
	}
}