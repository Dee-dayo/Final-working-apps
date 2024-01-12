import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade {

	private static Scanner input = new Scanner(System.in);
	private static int noOfStudents;
	private static int noOfSubjects;
	private static int[][] studentScores;
	private static int[] totalScores;
	private static double[] averageScores;
	private static int[] positions;

	private static void mainApp() {
		System.out.println("How many students do you have?") ;
		noOfStudents = input.nextInt() ;

		System.out.println("How many subjects do they offer?") ;
		noOfSubjects = input.nextInt() ;
		studentScores = new int[noOfStudents] [noOfSubjects];

		System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nSaved Successfully");

	System.out.print("\n\n");	
	collectScores();
	System.out.print("\n\n");
	scoreTable() ;
	System.out.print("\n\n");
	subjectSummary() ;
	System.out.print("\n\n");
	classSummary();

//		System.out.println(Arrays.deepToString(studentScores));
//		System.out.println(Arrays.toString(averageScores));
	}

	public static void collectScores() {
		totalScores = new int[noOfStudents] ;
		averageScores = new double[noOfStudents] ;

		for (int student = 0; student < noOfStudents; student++) {
			int total = 0 ;
			
			for (int score = 0; score < noOfSubjects; score++) {
				System.out.println("Entering the score for student " + (student + 1)) ;
				System.out.println("Entering score for subject " + (score + 1)) ;
				int result = input.nextInt() ;
			
				while (result <0 || result > 100) {
					System.out.println("Score must be beteween 0 and 100");
					result = input.nextInt() ;
				} 
				studentScores[student][score] = result ;
				total += result;
				totalScores[student] = total;
				System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nSaved Successfully\n\n") ;
			}
		totalScores[student] = total;
		averageScores[student] = (double) total / noOfSubjects;
		}
	}

	public static void scoreTable() {
		System.out.println("==============================================================");
		System.out.printf("STUDENT\t\t");
		for (int subject = 1; subject <= noOfSubjects; subject ++) {
			System.out.printf("SUB%d\t", subject);
		}
		System.out.printf("TOT\tAVE\tPOS\n");
		System.out.println("==============================================================");

		positions = new int[noOfStudents];
		for (int index = 0; index < noOfStudents; index++) {
			positions[index] = 1;
            
			for (int position = 0; position < noOfStudents; position++) {
				if (totalScores[position] > totalScores[index]) {
                    			positions[index]++;
				}
			}
		}

		for (int student = 0; student < noOfStudents; student++) {
			System.out.printf("Student %d\t", (student + 1));

			for (int score = 0; score <= noOfSubjects - 1; score++) {
				System.out.printf("%d\t", studentScores[student][score]);
			}
		System.out.printf("%d\t%.2f\t%d\n", totalScores[student], averageScores[student], positions[student]);
 	       }
		System.out.println("==============================================================");
		System.out.println("==============================================================");
	}

	public static void subjectSummary() {
		System.out.println("SUBJECT SUMMARY");

		for (int subject = 0; subject < noOfSubjects; subject++) {
			int highestScore = studentScores[0][subject];
			int lowestScore = studentScores[0][subject];  
			int totalScore = 0;
			int noOfPass = 0;
			int noOfFail = 0;
			int highestScorer = 0;
			int lowestScorer = 0;

			System.out.printf("Subject %d%n", (subject + 1));

			for (int student = 0; student < noOfStudents; student++) {
				int score = studentScores[student][subject];
            			totalScore += score;

				if (score > highestScore) {
					highestScore = score;
					highestScorer = student;
				} else
				if (score < lowestScore) {
					lowestScore = score;
					lowestScorer = student;
				}

				if (score >= 50) {
                			noOfPass++;
				} else {
					noOfFail++;
				}
			}

		double averageScore = (double) totalScore / noOfStudents;

		System.out.printf("Highest scoring student is: student %d scoring %d%n", highestScorer + 1, highestScore);
		System.out.printf("Lowest scoring student is: student %d scoring %d%n", lowestScorer + 1, lowestScore);
		System.out.printf("Total score is: %d%n", totalScore);
		System.out.printf("Average score is: %.2f%n", averageScore);
		System.out.printf("Number of passes is: %d%n", noOfPass);
		System.out.printf("Number of fails is: %d%n%n%n", noOfFail);
		}
	}

	public static void classSummary() {
		int hardestSubject = 0;
		int easiestSubject = 0;
		int hardestSubjectFailures = noOfStudents + 1;
		int easiestSubjectPasses = 0;
    		int bestGraduatingStudent = 0;
    		int worstGraduatingStudent = 0;
    		int overallHighestScore = 0;
    		int overallLowestScore = 100;
    		int classTotalScore = 0;

    		for (int subject = 0; subject < noOfSubjects; subject++) {
        		int noOfFailures = 0;
        		int noOfPasses = 0;

        		for (int student = 0; student < noOfStudents; student++) {
            			int score = studentScores[student][subject];

            			if (score < 50) {
                			noOfFailures++;
            			} else {
                		noOfPasses++;
            			}
        		}

        		if (noOfFailures < hardestSubjectFailures) {
            			hardestSubject = subject + 1;
            			hardestSubjectFailures = noOfFailures;
        		}

        		if (noOfPasses > easiestSubjectPasses) {
            			easiestSubject = subject + 1;
            			easiestSubjectPasses = noOfPasses;
        		}
    		}

    		for (int student = 0; student < noOfStudents; student++) {
        		for (int subject = 0; subject < noOfSubjects; subject++) {
            			int score = studentScores[student][subject];

            			if (score > overallHighestScore) {
                			overallHighestScore = score;
                			bestGraduatingStudent = student + 1;
            			}

            			if (score < overallLowestScore) {
                			overallLowestScore = score;
                			worstGraduatingStudent = student + 1;
            			}
       		 	}

        	classTotalScore += totalScores[student];
   	 	}

    		double classAverageScore = (double) classTotalScore / noOfStudents;

    		System.out.printf("The hardest subject is subject %d with %d failures%n", hardestSubject, hardestSubjectFailures);
    		System.out.printf("The easiest subject is subject %d with %d passes%n", easiestSubject, easiestSubjectPasses);
    		System.out.printf("The overall highest score is scored by student %d in subject %d scoring %d%n", bestGraduatingStudent, 1, overallHighestScore);
    		System.out.printf("The overall lowest score is scored by student %d in subject %d scoring %d%n", worstGraduatingStudent, 2, overallLowestScore);
		System.out.println("=============================================================\n");
		System.out.println("CLASS SUMMARY\n=============================================================");
    		System.out.printf("The best graduating student is student %d with a total score of %d%n", bestGraduatingStudent, overallHighestScore);
		System.out.println("=============================================================\n");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    		System.out.printf("The worst graduating student is student %d with a total score of %d%n", worstGraduatingStudent, overallLowestScore);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
		System.out.println("=============================================================");
    		System.out.printf("Class total score is %d%n", classTotalScore);
    		System.out.printf("Class average score is %.2f%n", classAverageScore);
		System.out.println("=============================================================");
	}
	
	public static void main (String[] args) {
		mainApp() ;
	}
}