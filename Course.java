import java.util.ArrayList;

public class Course {

    String courseName;
    String professorName;
    int year;
    ArrayList<Student> students;  //Lista de students

    
    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.students = new ArrayList<>();
    }// Constructor

    
    public void enroll(Student student) {
        students.add(student);
    }// Inscripción

    // Desinscripción
    public void unEnroll(Student student) {
        
        if (students.contains(student)) {
            students.remove(student);
        }//if
    }// Verifica antes de eliminar

    
    public int countStudents() {
        return students.size();
    }// Contar cuantos estudiantes hay

    // Buscar la mejor nota de todos los estudiantes
    public int bestGrade() {
        int best = 0;

        for (Student s : students) {
            if (s.grade > best) {
                best = s.grade;
            }
        }

        return best;
    }//Mejor nota
}