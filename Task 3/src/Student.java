import java.util.ArrayList;

public class Student extends Person {

    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses;


    public Student(String name, ArrayList<Object> objects) {
        super(name);
        this.passedCourses = new ArrayList<>();
        this.currentCourses = new ArrayList<>();
    }


    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            return false;
        }
        currentCourses.add(course);
        return true;
    }

}
