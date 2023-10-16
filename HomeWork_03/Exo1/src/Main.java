public class Main {
    public static void main(String[] args) {

        ChainedList liste = new ChainedList();

        ChainedList.Student student1 = liste.new Student("Alice", 1, "alice@example.com");
        ChainedList.Student student2 = liste.new Student("Bob", 2, "bob@example.com");
        ChainedList.Student student3 = liste.new Student("Charlie", 3, "charlie@example.com");

        liste.addToFront(student1);
        liste.addToBack(student2);
        liste.addToBack(student3);

        System.out.println("Liste chaînée des étudiants :");
        liste.printStudents();
    }
}