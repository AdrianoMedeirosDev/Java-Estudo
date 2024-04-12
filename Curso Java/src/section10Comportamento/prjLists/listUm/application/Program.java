package section10Comportamento.prjLists.listUm.application;


import section10Comportamento.prjLists.listUm.entities.Employee;

import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        //Consumindo entrada
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + ":\n");
            System.out.print("Id: \n");
            int id = sc.nextInt();

            //limpar buffer
            sc.nextLine();

            System.out.print("Name: \n");
            String name = sc.nextLine();

            System.out.print("Salary: \n");
            double salary = sc.nextDouble();

            //limpar buffer
            sc.nextLine();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int searchId = sc.nextInt();

        //limpar buffer
        sc.nextLine();

        //Verificar id
        boolean found = false;

        for (Employee emp : list) {
            if (emp.getId() == searchId) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();

            for (Employee emp : list) {
                if (emp.getId() == searchId) {
                    emp.increaseSalary(percentage);
                }
            }
        } else {
            System.out.println("This id does not exist!");
        }

        System.out.println("List of employees: ");
        for (Employee emp : list) {
            System.out.println(emp);
        }
    }
}
