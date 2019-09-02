public class Instructors extends Employee{

    public Instructors(String name, String cpr, int hours) {
        setName(name);
        setCpr(cpr);
        setHours(hours);
        setSalary(199 * hours);
        setVacation(0);
    }

}



