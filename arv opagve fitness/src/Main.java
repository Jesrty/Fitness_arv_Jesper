import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String [] args){

        //alle medarbejderne i en liste
        List<Employee> employees = new ArrayList<>();
        employees.add(new Administration("Jesper", "01121999-5453"));
        employees.add(new Administration("Claus", "11011999-2243"));
        employees.add(new Instructors("Anna", "21211998-1515", 5));
        employees.add(new Instructors("Brian", "31051997-1616", 25));

        //alle medlemmerne i en liste
        List<Member> members = new ArrayList<>();
        members.add(new Basic("Karl", "15111999-2020"));
        members.add(new Basic("Mona", "22022000-1919"));
        members.add(new Full("Karl", "01011988-3345"));
        members.add(new Full("Mads", "26081998-4462"));

        //printer medarbejderne super flot
        System.out.println("Fitness employees");
        System.out.println("Name:\t\tCpr:\t\t\t\tHours:\t\tSalary:\t\t\tVacation:");
        System.out.println("**************************************************************************");

        for (Employee e : employees){
            System.out.println(e);
        }

        System.out.println("==========================================================================\n\n");


        //printer medlemmerne super flot
        System.out.println("Fitness members");
        System.out.println("Name:\t\tCpr:\t\t\t\tType:\t\tFee:");
        System.out.println("**************************************************************************");

        for (Member m : members){
            System.out.println(m);
        }

        System.out.println("==========================================================================\n");

        //medlemmer og employees
        System.out.println("Fitness members & employees");
        System.out.println("Name:\t\tCpr:");
        System.out.println("**************************************************************************");

        for (Employee e : employees){
            System.out.println(e.toString("kan ikke bruge super her fra..."));
        }

        for (Member m : members){
            System.out.println(m.toString("kan ikke bruge super her fra..."));
        }

        System.out.println("==========================================================================\n");

    }

}
