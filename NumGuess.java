import java.util.*;    
class NumGuss{
	public static void main(String[] args){
		Random objr=new Random();        //default class in util package
		int numgenerated=objr.nextInt(100);
		int score=100,chance=5;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<chance;i++){
			System.out.println("Enter your Guessingnumber is : ");
			int num=sc.nextInt();
			if(numgenerated==num){
				System.out.println("Wow!Good guess.Your number is Matching with Generated number .");
				System.out.println("Your guessing score is "+score+"%.");
				break;
			}
			else{
				score=score-20;
				if(num<numgenerated){
					System.out.println("Your Guessingnumber is less than Generated Number! TRY AGAIN");
				}
				else{
					System.out.println("Your Guessingnumber is More than Generated Number! TRY AGAIN");
				}
			}
		}
	}
}