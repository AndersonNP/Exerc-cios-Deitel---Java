package capitulo10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PayrollSystemTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        PieceWorker pieceWorker = new PieceWorker("Mary", "Lima", "000-00-0000", format.parse("24/03/2000"), 10, 100);
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111",format.parse("27/01/1995"), 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222",format.parse("27/01/1995"), 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333",format.parse("27/12/1995"), 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444",format.parse("27/12/1995"), 50000, .04, 300);

        System.out.println("Employees processed individually: ");

        System.out.printf("%n%s%n%s: $%,.2f%n%n", pieceWorker, "earned", pieceWorker.earnings());

        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());

        System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());

        System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());

        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[5];

        employees[0] = pieceWorker;
        employees[1] = salariedEmployee;
        employees[2] = hourlyEmployee;
        employees[3] = commissionEmployee;
        employees[4] = basePlusCommissionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");

        for (Employee currentEmployee : employees){
            System.out.println(currentEmployee);

            if (currentEmployee instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
            }

            Calendar today = Calendar.getInstance();
            Calendar birthDay = Calendar.getInstance();
            birthDay.setTime(currentEmployee.getBirthDate());

            if(today.get(Calendar.MONTH) == birthDay.get(Calendar.MONTH)){
                currentEmployee.setAditional(100.0);
                System.out.println("happy birthday!!!");
            }

            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }

        for(int j = 0; j < employees.length; j++){
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getSimpleName());
        }
    }
}
