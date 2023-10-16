import java.util.Objects;

public class ChainedList {
    private Student head;
    private Student tail;

    public  class Student {
        private String name;
        private int ID;
        private String email;
        private Student next;

        public Student(String name,int ID,String email){
            this.name = name;
            this.email = email;
            this.ID = ID;
            this.next = null;
        }
    }

    public ChainedList(){
        this.head = null;
        this.tail = null;
    }

    public void addToFront(Student student){
        if(head == null){
            head = student;
            tail = student;
            System.out.println("Student added to the front of the list !");
            return;
        }
        student.next = head;
        head = student;
        System.out.println("Student added to the front of the list !");
    }

    public void addToBack(Student student){
        if (tail == null){
            head = student;
            tail = student;
            System.out.println("Student added to the back of the list !");
            return;
        }
        student.next = tail.next;
        tail.next = student;
        tail = student;
        System.out.println("Student added to the back of the list !");
    }

    public void remove(int studentID){
        Student student = head;

        if (student == null){
            System.out.println("List is empty !");
            return;
        }

        if(student.ID== studentID){
            head = student.next;
            System.out.println("Student n° "+ studentID + " deleted !");
            return;
        }

        while (student.next != null && student.next.ID != studentID){
            student = student.next;
        }

        if(student.next != null){
            student.next = student.next.next;
            System.out.println("Student n° "+ studentID + " deleted !");
            return;
        }
        else {
            System.out.println("Can't find the Student via this ID : " + studentID);
            return;
        }
    }

    public void find(String name){
        Student currentStudent = head;
        while (currentStudent != null && !currentStudent.name.equals(name)){
            currentStudent = currentStudent.next;
        }

        if(currentStudent != null){
            System.out.println("Student : " + currentStudent.name);
            System.out.println("Id : n° " + currentStudent.ID);
            System.out.println("email : " + currentStudent.email);
            return;
        }
        System.out.println("Student not found !");
    }

    public void modifyEmail(String name, String email){
        Student currentStudent = head;
        while (currentStudent != null && !currentStudent.name.equals(name)){
            currentStudent = currentStudent.next;
        }
        if(currentStudent != null) {
            currentStudent.email = email;
            System.out.println("Email updated !");
            return;
        }
        System.out.println("Student not found !");
    }

    public void printStudent(){
        Student currentStudent = head;
        if(currentStudent == null){
            System.out.println("List is empty !");
            return;
        }
        while (currentStudent != null ){

            System.out.println(" Student n° " + currentStudent.ID + " Name  " + currentStudent.name + " Email " + currentStudent.email  );
            currentStudent = currentStudent.next;
        }
    }

}

