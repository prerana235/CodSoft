package progam;
import java.util.*;


public class WordCounter {
	public static void main(String args[] ){
		String sen;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		sen = sc.nextLine().trim();
		if (sen.isEmpty()) {
              System.out.println("no words");
		}
		else{
			String[] words = sen.split("\\s+");
			int wordcount = words.length;
			System.out.println("Total words is " +wordcount);
		}
		sc.close();
	}
}

