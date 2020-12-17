/*-------------------------------------------------------------
//AUTHOR: Jeffrey Harrison
//FILENAME: CSE110Lab10
//SPECIFICATION: reading from a txt file
//FOR: CSE 110 - Lab #10
//TIME SPENT: 60 mins
//-----------------------------------------------------------*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab10
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        /* Create an array of Student */
        final int NUM_STUDENTS = 10;
        
        // >>>>> YOUR CODE HERE <<<<<
        Student[] gradebook = new Student[NUM_STUDENTS];
        
        /* Read the input file and add new records into the Student array */

        // >>>>> YOUR CODE HERE <<<<<
        BufferedReader reader = new BufferedReader(new FileReader("lab10_student_data.txt"));
        
        //Read the file's info line by line
        for (int i = 0; i < NUM_STUDENTS; i++) {
        	
        	String line = reader.readLine();
        	
        	if(line != null) {
        		String[] field = line.split(",");
        		gradebook[i] = new Student(field[0], field[1], Double.parseDouble(field[2]));
        		
        		System.out.printf("Read #%-2d: %s\n", (i+1), gradebook[i].toString());
        	}
        }
        System.out.println();
        reader.close();
        
        /* Find out duplicate student records by .equals() */
        for (int i = 0; i < NUM_STUDENTS; i++)
        {
            for (int j = i + 1; j < NUM_STUDENTS; j++)
            {
                if (gradebook[i].equals(gradebook[j]))
                {
                    System.out.printf("\"%s\" and \"%s\": %s\n",
                            gradebook[i].getFullName(), gradebook[j].getFullName(), gradebook[i].getId());
                }
            }
        }
    }
}
