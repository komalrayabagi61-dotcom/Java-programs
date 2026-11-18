class Student {
    String USN, Name, Branch;
    long Phone;

    Student(String usn, String name, String branch, long phone) {
        USN = usn;
        Name = name;
        Branch = branch;
        Phone = phone;
    }

    void display() {
        System.out.println("USN: " + USN);
        System.out.println("Name: " + Name);
        System.out.println("Branch: " + Branch);
        System.out.println("Phone: " + Phone);
    }

    public static void main(String[] args) {
        Student s1 = new Student("1DS25CS001", "Komal", "DS", 9876543210L);
        Student s2 = new Student("1DS25CS002", "Anu", "CSE", 9876543211L);

        System.out.println("Student 1");
        s1.display();

        System.out.println("\nStudent 2");
        s2.display();
    }
}
