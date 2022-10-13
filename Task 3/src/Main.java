import java.util.ArrayList;

public class Main { // Dette er Klassen
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        ArrayList<String> canTeach = new ArrayList<>();
        canTeach.add("Computer Science");
        canTeach.add("Java 1.0");

        persons.add(new Teacher("Yolo", new ArrayList<>()));
        persons.add(new Teacher("Ana", canTeach));

        ArrayList<String> passedCourses = new ArrayList<>();
        passedCourses.add("Dansk");
        passedCourses.add("code1;

        persons.add(new Student("Marina", passedCourses)));
        persons.add(new Student("René", passedCourses));
        persons.add(new Student("Karl", new ArrayList<>()));

        for (Person p : persons) {
            if (!p.addCourse("Java 1.0")) {
                if (p instanceof Student) {
                    System.out.println(p.getName() + " har allerede bestået dette kursus.");
                } else {
                    System.out.println(p.getName() + " kan ikke undervise i dette fag");
                }
            }
        }
    }
}
