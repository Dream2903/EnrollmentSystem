public class EnrollmentSystem {
    Student[] students;
    Course[] courses;

    public EnrollmentSystem() {
        students = new Student[10];
        courses = new Course[2];
    }


    public void enroll(Student student, Course course) {
        course.enroll(student);
    }

    public void remove(Student student, Course course) {

        course.remove(student);
    }

    public void showParticipants(Course course) {
        for (Student student : course.getParticipants()) {
            System.out.println(student.getName());
        }
    }

    public void getCourses() {
        System.out.println("void for a getter?");
    }

    public void getStudents() {
        System.out.println("void for a getter?");
    }


    // (method) adds a new course
    public void addCourse(Course addCrs) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = addCrs;
                return;
            }
        }
    }

    // (method) removes a course
    public void removeCourse(Course removeCrs) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == removeCrs) {
                courses[i] = null;
            }
        }
    }


    // (method) adds a new student
    public void addStudent (Student addStudent) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = addStudent;
                return;
            }
        }
    }

    // (method) removes a student
    public void removeStd (Student removeStd) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == removeStd) {
                students[i] = null;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
