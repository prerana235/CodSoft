package progam;

import java.util.*;
public class RandomNo {
	static int range, rno, guess,a,score,round;
		
	public void play() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range: ");
		range = sc.nextInt();
		Random r = new Random();
		rno = r.nextInt(range);
		System.out.println(rno);
		System.out.println("Guess the random number from 0 to " + range);
		guess = sc.nextInt();
	     a=4;
	     score=0;
	     round=0;
		while(a>0) {
			
			if(guess == rno) {
				System.out.println("Congradulations your guess is right");
				break;
			}
			else if(guess<rno) {
				System.out.println("Your guess is too low, keep guessing:");
			}
			else {
				System.out.println("Your guess is too high, keep guessing:");
			}
			
			guess = sc.nextInt();
			a = a-1;
			
		
		}
	
		if(a==4) {
			System.out.println("Your score is 50");
		}
		if(a==3) {
			System.out.println("Your score is 40");
		}
		if(a==2) {
			System.out.println("Your score is 30");
		}
		if(a==1) {
			System.out.println("Your score is 20");
		}
		if(a==0) {
			System.out.println("You are out of attempts, the right answer is "+ rno);
		}
		sc.close();
	
		
	}

	public static void main(String[] args) {
		RandomNo ro = new RandomNo();
		ro.play();
		
	}

}
