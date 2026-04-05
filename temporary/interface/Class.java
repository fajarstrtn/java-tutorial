
public class Class {

    public static void main(String[] args) {
        var teacher = new Teacher();
        teacher.plan();
        teacher.teach();
        teacher.assess();
        teacher.monitor();
        teacher.collaborate();
    }

}

interface TeacherActivity {

    void teach();

    void assess();

    void monitor();

    void collaborate();

    private void adopt() {
        System.out.println("Teacher adopts a new curriculum standard.");
    }

    private static void propose() {
        System.out.println("Teacher proposes list of new subjects in the new curriculum standard.");
    }

    default void plan() {
        adopt();
        propose();
    }

}

class Teacher implements TeacherActivity {

    @Override
    public void teach() {
        System.out.println("Teacher teaches students in the class.");
    }

    @Override
    public void assess() {
        System.out.println("Teacher assesses students in every semester.");
    }

    @Override
    public void monitor() {
        System.out.println("Teacher monitors students\' progress.");
    }

    @Override
    public void collaborate() {
        System.out.println("Teacher collaborates with students and lecturers.");
    }

}
