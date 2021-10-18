package capitulo7;

public class GradeBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] gradesArray = {87, 68,11, 94, 100, 83, 78, 85, 91, 76, 87,30,101,101,105};
		
		GradeBooks myGradeBook = new GradeBooks("CS101 Introduction to Java Programming", gradesArray);
		
		System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
		
		myGradeBook.processGrades();*/
		
		int[][] gradesArray = {	{87,96,70},
								{68,87,90},
								{94,100,90},
								{100,81,82},
								{83,65,85},
								{78,87,65},
								{85,75,83},
								{91,94,100},
								{76,72,84},
								{87,93,73}};
		
		GradeBook2 myGradeBook = new GradeBook2("CS101 Introduction to Java Programming", gradesArray);
		
		System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
		
		myGradeBook.processGrades();
	

	}

}
