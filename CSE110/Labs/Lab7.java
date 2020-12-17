package src;
/*-------------------------------------------------------------
// AUTHOR: Teaching Assistant in CSE110
// FILENAME: AutoGrader.java
// SPECIFICATION: This is your test driver for Lab7. Please do
// NOT touch anything in this file.
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab7 {
	//main method
    public static void main(String[] args) {
    	//Get the inputs from user
        Scanner scan = new Scanner(System.in);
        
        String fName, lName, asuID;
        double grade;
        String pName, pDesc, pFname;
        

        //Ask the input for student info
        System.out.println("The student's first name?");
        fName = scan.nextLine();
        
        System.out.println("The student's last name?");
        lName = scan.nextLine();
        
        System.out.println("The student's ASU ID?");
        asuID = scan.nextLine();
        
        
        //Ask the inputs for Program info
        System.out.println("Program name?");
        pName = scan.nextLine();
        
        System.out.println("Program desc?");
        pDesc = scan.nextLine();
        
        System.out.println("Program filename?");
        pFname = scan.nextLine();
        
        System.out.println("Program grade?");
        grade = scan.nextDouble(); 
        System.out.println(""); 
        scan.close();
        

        // Create a Student object "student1"
        Student std1 = new Student(fName, lName, asuID);
        System.out.println("Making Student Record");
        //Display student object
        System.out.println("...[" + std1.toString() + "]");
        		
        		
        // Use the setGrade setter to set student1's grade
        std1.setGrade(grade);

        // Create a Program object "program1" by "student1"
        Program prg1 = new Program(pName, pDesc, pFname, std1);
        //Display program object
        System.out.println("Making a program record\n...[" + prg1.toString() + "]");
        
        
        // Invoke makeReport to show the report of student1
        makeReport(prg1);
    }



    private static void makeReport(Program program) {
    	
        println("\n========== Program Submission Detail ==========");
        pprint("Student", program.getAuthor().getFullName());
        pprint("ASU ID", program.getAuthor().getasuID());
        pprint("Grade", "" + program.getAuthor().grade());
        println("");
        pprint("Program", program.getProgramName());
        pprint("Filename", program.getFileName());
        pprint("Description", program.getDescription());
        pprint("Datetime", program.getCreatedDate());
    }

    private static void pprint(String key, String value) {
        println(String.format("%-12s: %-10s", key, value));
    }

    private static void println(String s) {
        System.out.println(s);
    }
}
