package btstaticmethod;

public class TestStaticMethod {
    public static void main(String[] args) {

        Student s1 = new Student(1,"Nam");
        Student s2 = new Student(2,"Hoàng");
        Student s3 = new Student(3,"Tuấn");
        Student.change();
        s1.display();
        s2.display();
        s3.display();

    }
}
