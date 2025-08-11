public class Student{
    String name;
    int age;

    public Student(String name, int age){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {

        return "Student" + "{Name: '" + name + "\'," + " Age: '" + age + "\'}";
    }

    public static void main(String[] args) {
        Student one = new Student("vaibhav", 19);
        System.out.println(one);
    }
}