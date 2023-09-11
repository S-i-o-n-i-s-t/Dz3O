import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        Freelancer freelancer = new Freelancer();
        List<Employee> employees = freelancer.getFreelanc(5);
        for (Employee employee: employees){
            System.out.println(employee);
        }
        Collections.sort(employees, new EmployeeNameComparator());
        System.out.println();
        for (Employee employee: employees){
            Iterator<Freelancer> iterator = (Iterator<Freelancer>) employee;
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
            System.out.println("__________________");
        }




//        List<Employee> employees = Worker.getEmployees(15);
//
//        for (Employee employee: employees) {
//            System.out.println(employee);
//        }
//
//        Collections.sort(employees, new EmployeeNameComparator());
//        System.out.println();
//
//        for (Employee employee: employees) {
//            System.out.println(employee);
//        }

    }

}
