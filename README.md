# ANLY560-
#Assignment 2
#Write a Java code that :

#Has 5 variables (grade1~grade5) as 5 grades of a student
#grade1= 91.14, grade2= 85.01, grade3= 72, grade4= 63, grade5= 81.14
#Find the average of the grades.
#Use switch and if to:
#If the final average grade is more than 90.00 and less than 100 it prints “A: Fantastic job!”
#If it is between 80 to 89.99, it prints: “B: Good!”
#If it is between 70 to 79.99, it prints “C: Please try more next time!”
#If it is 69.99 or less, it prints “F: Unfortunately you failed!”

public class HW2 {
	 public static void main(String[] args){
		 
		double grade1 = 91.14;
		double grade2= 85.01;
		double grade3= 72;
		double grade4= 63;
		double grade5= 81.14;
		double avg = (grade1 + grade2 + grade3 + grade4 + grade5) / 5.0;
		
		if (avg >= 90 && avg <= 100) {
			System.out.println("A: Fantastic job!");
		}
		if (avg >= 80 && avg < 90) {
			System.out.println("B: Good!");
		}
		if (avg >= 70 && avg < 80) {
			System.out.println("C: Please try more next time!");
		}
		if (avg < 70) {
			System.out.println("F: Unfortunately you failed!");
		 
	    System.out.println("HW2");
	  }//End of main
} }
