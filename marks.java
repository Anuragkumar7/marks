import java.util.Scanner;
class marks{
	public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Total marks");
	  int score = sc.nextInt();
	  if(score >= 90){
             System.out.println("Excellent");
	  }
	  else if(score >=60 && score < 90){
             System.out.println("Good");
                 }
	  else {
             System.out.println("Average");
 }
	}
}


