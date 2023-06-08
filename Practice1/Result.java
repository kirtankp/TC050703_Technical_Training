import java.util.*;

public class Result {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter os marks:");
		int os = s.nextInt();
		System.out.println("enter java marks:");
		int java = s.nextInt();
		System.out.println("enter network marks:");
		int network = s.nextInt();
		System.out.println("enter cloud marks:");
		int cloud = s.nextInt();
		
		int total = os+java+network+cloud;
		System.out.println("total score : "+total);
		
		double avg = (double)total/4;
		System.out.println("average : "+avg);
		
		if(avg>90) {
			System.out.print("Grade A");
		}else if(avg>80 && avg<=90) {
			System.out.print("Grade B");
		}else if(avg>70 && avg<=80) {
			System.out.print("Grade C");
		}else {
			System.out.print("Fail");
		}
	}
}
