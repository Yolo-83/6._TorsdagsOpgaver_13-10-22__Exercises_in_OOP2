public abstract class Person {

    // Dette er feltet "linje 4"
    private final String name;

    // Konstruktør (Linje 7-9)
    public Person(String name){
        this.name = name;
    }

    // Dette er en Gettet
    public String getName() {
        return name;
    }

    // Dette er en Boolean add___(String ___)
    public abstract boolean addCourse(String course);

}
