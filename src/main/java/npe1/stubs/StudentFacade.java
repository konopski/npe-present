package npe1.stubs;

public class StudentFacade {
    public static Student getStudentByUsername(String username) {
        if(System.currentTimeMillis() % 5 == 0 ) {
            return new Student();
        }
        return null;
    }
}
