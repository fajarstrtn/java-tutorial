
public class Hospital {

    public static void main(String[] args) {

        var doctor = new Doctor();
        doctor.check();
        doctor.operate();

    }

}

interface HealthCheck {

    void check();

}

interface Surgeon {

    void operate();

}

class Person {
}

class Doctor extends Person implements HealthCheck, Surgeon {

    @Override
    public void check() {
        System.out.println("The doctor is checking patient's health.");
    }

    @Override
    public void operate() {
        System.out.println("The doctor performed surgery on the patient.");
    }

}
