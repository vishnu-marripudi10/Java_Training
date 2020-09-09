package student;

import java.util.Scanner;
public class Alphabet_Freq {
	public void show()
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter any word: ");
	        String s = sc.next();
	        s=s.toLowerCase(); //converting the string into lowercase
	        int l=s.length(); //finding the length of the string
	        char alph[] = new char[26]; //array for storing alphabets from 'a' to 'z' 
	        int freq[] = new int[26]; //array for storing frequency of all alphabets
	        char c = 'a' ;
	        for(int i=0; i<26; i++)
	        {
	            alph[i]=c; //storing all alphabets from 'a' till 'z' in alph[] array
	            freq[i]=0; //intializing the count of every alphabet with '0'
	            c++;
	        }
	 
	        System.out.println("Alphabet\tFrequency");
	        
	        char ch;
	      
	        for(int i=0; i<26; i++)
	        {
	            for(int j=0; j<l; j++)
	            {
	                ch = s.charAt(j); //extracting characters of the string one by one
	                if(ch == alph[i]) //first checking the whole string for 'a', then 'b' and so on
	                    freq[i]++; //increasing count of those aplhabets which are present in the string
	            }
	        }
	 
	        for(int i=0; i<26; i++)
	        {
	            if(freq[i]!=0) //printing only those alphabets whose count is not '0'
	                System.out.println("   "+alph[i]+"\t\t    "+freq[i]);
	        }
	    }

	    

}
