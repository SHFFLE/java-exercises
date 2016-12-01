package students;

import java.util.Comparator;

class Student {
    String firstName;
    String lastName;
    int score;

    Student(String firstName, String lastName, int score){
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }
}

class lastNameComparator implements Comparator<Student>{
    @Override
    public int compare(Student a, Student b){
        int toReturn = 0;
        for (int i = 0; i < a.lastName.length(); i++) {
            if (a.lastName.charAt(i) > b.lastName.charAt(i)) {
                toReturn = 1;
                break;
            } else if (a.lastName.charAt(i) < b.lastName.charAt(i)) {
                toReturn = -1;
                break;
            }
        }
        return toReturn;
    }
}

class scoreComparator implements Comparator<Student>{
    @Override
    public int compare(Student a, Student b){
        int toReturn;
        if(a.score > b.score){
                toReturn = 1;
            } else if(a.score < b.score){
                toReturn = -1;
            } else {
                toReturn = 0;
            }
            return toReturn;
        }
    }
