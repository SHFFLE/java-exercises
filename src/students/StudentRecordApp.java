package students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import utilities.OOValidator;


public class StudentRecordApp{
    static private List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        do {
            studentList.add(getInputs());
        } while (OOValidator.continueDoing("Add another student?"));
        sortStudentList();
        readStudentList();
        sortStudentList();
        readStudentList();
    }
    private static Student getInputs(){
        String firstName = OOValidator.getString("Enter student's First Name: ");
        String lastName = OOValidator.getString("Enter student's Last Name: ");
        int grade = OOValidator.getIntWithinRange("Enter student's grade: ", 0, 100);
        Student newStudent = new Student(firstName, lastName, grade);
        return newStudent;
    }
    private static void readStudentList(){
        for (int i = 0; i < studentList.size(); i++) {
            System.err.println("students.Student " + (i+1));
            OOValidator.sleep(10);
            System.out.println("First Name: " + studentList.get(i).firstName);
            OOValidator.sleep(10);
            System.out.println("Last Name: " + studentList.get(i).lastName);
            OOValidator.sleep(10);
            System.out.println("Grade: " + studentList.get(i).score);
            OOValidator.sleep(10);
        }
    }
    private static List<Student> sortStudentList(){
        List<Student> students = studentList;
        if(OOValidator.continueDoing("Sort by Last Name?")){
            Collections.sort(students, new lastNameComparator());
        } else {
            Collections.sort(students, new scoreComparator());
        }
        return students;
    }

}
