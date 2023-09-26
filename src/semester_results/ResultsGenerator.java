package semester_results;



	import java.util.Scanner;

	public class ResultsGenerator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter your roll number: ");
	        String rollNumber = scanner.nextLine();
	        System.out.print("Enter current semester: ");
	        int semester = scanner.nextInt();

	        
	        double totalScore = 0;
	        int unitCount = 0;

	        
	        for (int i = 1; i <= 4; i++) {
	            scanner.nextLine(); 
	            
	            System.out.print("Enter unit code for Unit " + i + ": ");
	            String unitCode = scanner.nextLine();
	            System.out.print("Enter score for Unit " + i + ": ");
	            double score = scanner.nextDouble();

	            
	            totalScore += score;
	            unitCount++;
	        }
	        
	        
	        double average = totalScore / unitCount;
	        
	       
	        System.out.println("\t\t\tDepartment of Computer Science");
	        System.out.println("\t\t\t\tEnd of Semester Results");
	        System.out.println("------------------------------------------------------------------------------");
	        System.out.println("Name: " +name+ "\t |Roll_No: " +rollNumber+ "\t\t |Semester: " +semester);
	        
	        System.out.println("_______________________________________________________________________________");
	        System.out.println("|Unit Code \t\t |Unit Name: \t\t\t Score");
	        System.out.println("------------------------------------------------------------------------------");
	        
			System.out.println("|CCS 2101 \t\t |Database \t\t\t|70");
			System.out.println("\n|CCS 2101 \t\t |Systems \t\t\t|68");
			System.out.println("\n|CCS 2101 \t\t |Algorithms \t\t\t|74");
			System.out.println("\n|CCS 2101 \t\t |Statistics \t\t\t|69");
			System.out.println("------------------------------------------------------------------------------");
	        
	        System.out.println("|Total\t\t\t\t\t\t\t" + totalScore);
	        System.out.println("------------------------------------------------------------------------------");
	        System.out.println("Average\t\t\t\t\t\t\t" + average);
	        System.out.println("------------------------------------------------------------------------------");
	        
	       
	        String overallGrade;
	        if (average >= 70) {
	            overallGrade = "A";
	        } else if (average >= 60) {
	            overallGrade = "B";
	        } else if (average >= 50) {
	            overallGrade = "C";
	        } else if (average >= 40) {
	            overallGrade = "D";
	        } else {
	            overallGrade = "F";
	        }
	        System.out.println("Overall\t\t\t\t\t\t\t " + overallGrade);
	        System.out.println("------------------------------------------------------------------------------");
	        System.out.println("\t\t\t\t\tRecommendation \t|");
	        System.out.println("------------------------------------------------------------------------------");
	        System.out.println("Grading criteria \t\t\t Overall grade (A-D) \t Recommend Pass");
	        System.out.println("70-100 \t\t A");
	        System.out.println("60-70 \t\t B");
	        System.out.println("50-60 \t\t C");
	        System.out.println("40-50 \t\t D");
	        System.out.println("Below 40 \t A");
	        System.out.println("------------------------------------------------------------------------------");
	        scanner.close();
	    }
	}

