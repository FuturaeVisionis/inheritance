package inheritance.Three;

/**
 * Created by ronald on 03/10/16.
 */
public class College {
    public static void main(String[] args) {

        PhDStudent phDStudent = new PhDStudent() {
            @Override
            public void myfaculty() {
                System.out.println("I am attending the medical faculty.");
            }

            @Override
            public int studentNumber(int a) {
                System.out.println("My student's number is :" + a);
                return a;

            }

            @Override
            public void name() {

            }

            @Override
            public void surname() {

            }
        };
        phDStudent.myfaculty();
        phDStudent.studentNumber(999);
    }
}
