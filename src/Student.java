import java.util.ArrayList;
import java.util.Collections;

public class Student {

    private static ArrayList<String> studentNames = new ArrayList();

    public static void main(String args[]){

        addStudents(studentNames);
        displayStudents(studentNames);
        Collections.sort(studentNames);
        displayStudents(studentNames);

    }//end of main

    public static void addStudents(ArrayList<String> studentNames){

        studentNames.add("Mark");
        studentNames.add("Andrew");
        studentNames.add("Rachel");

    }//End of addStudents

    public static void displayStudents(ArrayList<String> studentNames){

        for(String student: studentNames){

            System.out.println("Name: " + student);

        }

    }//end of displayStudents

    }



}//end of class
