import java.util.ArrayList;

public class Teacher extends Person {

    ArrayList<String> canTeach;
    ArrayList<String> currentCourses;


    public Teacher(String name, ArrayList<String> objects) {
        super(name);
        this.canTeach = new ArrayList<>();
        this.currentCourses = new ArrayList<>();
    }

    @Override
    public boolean addCourse(String course) {
        if (!canTeach.contains(course)) {
            return false;
        }
        currentCourses.add(course);
        return true;
    }
}
