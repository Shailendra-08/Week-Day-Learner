

public class Teacher extends Person {

    private double salary;
    private List<Course> teachingCourses;

    public Teacher(int id, String name, int age, double salary) {
        super(name, id, age);
        this.salary = salary;
        this.teachingCourses = new ArrayList<>();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void assignCourse(Course course) {
        teachingCourses.add(course);
    }

    public List<Course> getTeachingCourses() {
        return teachingCourses;
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: " + salary);
        System.out.println("Courses Teaching: " + (teachingCourses.isEmpty() ? 
                            "No courses assigned" : teachingCourses.size()));
        System.out.println("-----------------------------");
    }
}
