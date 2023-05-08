package encapsulation;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Bob", 12);
        System.out.println(student.getAge());

        student.setAge(18);
        System.out.println(student.getAge());

        BankAccount bankAccount = new BankAccount(100);
    }
}
