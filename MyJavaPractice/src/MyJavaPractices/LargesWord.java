package MyJavaPractices;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LargesWord {

	public static void main(String[] args) {
		//Define variables, data structure, and file
		
		String fileName = "C:\\Training\\FilesPractices\\AlgeriaWiki.txt";
		String word = findLargestWord(fileName);
		System.out.println(word);
		
		
		
	}
	private static String findLargestWord(String fileName){

		//data structure


		//Read the file
		File file = new File(fileName);

		//create the file reader
		//FileReader fr = new FileReader(file);
		BufferedReader br;
		String largestWord = null;
		try {
			br = new BufferedReader(new FileReader(file));
			//we have just one line no need to use while
			String text = br.readLine();
			//System.out.println(text);
			
			//Place the file into a data structure
			//split text and put it in array words
            String[] words = text.split(" ");
            
			//or compare each word to the largest word
            //assume the first word is the largest and compare it with the rest
             largestWord = words[0];
            //iterate through the array words
            for (String word : words){
            	if(word.length() > largestWord.length()){
            		largestWord = word;
            	}
            	//System.out.println(word);
            }
            //System.out.print(largestWord);

            

			//close the file

		} catch (FileNotFoundException e) {
			System.out.println("ERROR File not found");
		} catch (IOException e) {
			System.out.println("ERROR could not read file");

			}
		
      		return largestWord;



	}
	
	

}
