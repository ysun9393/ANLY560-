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
