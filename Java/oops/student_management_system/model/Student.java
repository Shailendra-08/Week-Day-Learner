public class Student extends Person {


    public String grades;
    private List<Course> courses= new ArrayList<>();
    // it is a list with generic type named(Course) which means it can store objects of type Course
    public Student(String name, int id, int age, String grades) {
        super(name, id, age);
        this.grades = grades;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: "+ getId + ", Student Name: " + getName() + ", Grades: " + grades + ");
        
    }



}