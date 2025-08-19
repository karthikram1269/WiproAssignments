package assignments;
class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}

class StudentRepository {
    public void saveToDatabase(Student student) {
        System.out.println("Saving " + student.name + " to DB...");
    }
}

public class SRPExample {
    public static void main(String[] args) {
        Student s = new Student("Karthik");
        StudentRepository repo = new StudentRepository();
        repo.saveToDatabase(s);
    }
}
