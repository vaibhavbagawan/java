public class Course {
    static int maxCapacity = 500;
    String courseName;
    int enrolledStudent;

    String[] enrolledStudents;

    {
        maxCapacity--;
    }

    Course(String courseName){
        this.courseName=courseName;
        this.enrolledStudent=0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity (int maxCapacity){
        Course.maxCapacity=maxCapacity;

    }

    void enrollStudent(String studentName){
        enrolledStudents[enrolledStudent]=studentName;
        enrolledStudent++;
    }

    void unenrollStudent(String StudentName){
        System.out.println("Student removed");
        enrolledStudent--;
    }

}
