import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Hello and welcome!");
        System.out.println();
        List<employee> employeeList=new ArrayList<employee>();
        employeeList.add(new employee(101,"Nobalraj","IT"));
        employeeList.add(new employee(102,"Abith","Non-IT"));
        employeeList.add(new employee(103,"Vishnu","Admin"));
        employeeList.add(new employee(104,"Moni","IT"));
        System.out.println("+------+-----------------+------------+");
        System.out.printf("| %-4s | %-15s | %-10s |\n","ID","Name","Department");
        System.out.println("+------+-----------------+------------+");

        for (employee emp :employeeList){
            System.out.printf("| %-4s | %-15s | %-10s |\n",emp.id,emp.name,emp.department);
        }
        System.out.println("+------+-----------------+------------+");
        boolean running=true;
        while (running){
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add New Employee");
            System.out.println("2. Filter by Name and Department");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Add NEw Employee");

                    break;
                case 2:
                    System.out.println("Search Employe And Department ");
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    running=false;
                    break;

            }


        }


    }




}