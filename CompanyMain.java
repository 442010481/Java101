package Comapny_;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyMain {

    static ArrayList<ArrayList<Order>> orderList = new ArrayList<>();
    // create an object of Scanner
    static Scanner scanner = new Scanner(System.in);
    static Company company = new Company();
    static Customer customer = null;
    // take input from the user

    static int id, input, weight;
    static double price;
    static String name, address, dateOfBirth, mobilePhone, email, title, model,status;

    public static void showMenu() {
        // Selection screen
        System.out.println("\nPlease select an option:");
        System.out.println("1. Add a customer");
        System.out.println("2. Add a NEW order to a customer");
        System.out.println("3. Print all customers information");
        System.out.println("4. Print all orders information");
        System.out.println("5. Display specific customer information");
        System.out.println("6. Display specific order information");
        System.out.println("7. Print a specific customer's bill");
        System.out.println("8. Exit the program");
    }

    public static void addCustomer() {
        try {
            System.out.print("Enter Customer Id:");
            id = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, Please try again use input number");
            scanner.nextLine(); //clear the buffer
            System.out.print("Enter Customer Id:");
            id = scanner.nextInt();
        }
        scanner.nextLine(); //clear the buffer
        System.out.print("Enter Customer Name:");
        name = scanner.nextLine();
        System.out.print("Enter Customer address:");
        address = scanner.nextLine();
        System.out.print("Enter Customer date Of Birth:");
        dateOfBirth = scanner.nextLine();
        System.out.print("Enter Customer mobile Phone:");
        mobilePhone = scanner.nextLine();
        System.out.print("Enter Customer E-mail:");
        email = scanner.nextLine();
        customer = new Customer(id, name, address, dateOfBirth, mobilePhone, email);
        company.addCustomer(customer);
        System.out.println("New customer added sucessfully");
        showMenu();
    }

    public static void addOrder() {
        System.out.print("Enter Order Id:");
        id = scanner.nextInt();
        scanner.nextLine(); //clear the buffer
        System.out.print("Enter order Title:");
        title = scanner.nextLine();
        System.out.print("Enter order Model:");
        model = scanner.nextLine();
        System.out.print("Enter order Weight:");
        weight = scanner.nextInt();
        System.out.print("Enter order Price:");
        price = scanner.nextDouble();
                scanner.nextLine(); //clear the buffer
        System.out.print("Enter Order Status:");
        status = scanner.nextLine();
        Order order = new Order(id, title, model, weight, price, status);
        company.addOrder(order);
        System.out.println("New Order added sucessfully");
        showMenu();
    }

    static void displayCustomers() {
        System.out.println("ID\tName\t\tAddress\t\tDate of Birth\tMobile Phone Number\tEmail");
        company.customerList.forEach((Customer customer) -> {
            System.out.println(
                    customer.id + "\t"
                    + customer.name + "\t"
                    + customer.address + "\t"
                    + customer.dateOfBirth + "\t"
                    + customer.mobilePhone + "\t\t"
                    + customer.email
            );
        });
        showMenu();
    }

    static void displayOrders() {
        System.out.println("ID\tTitle\tModel\tWeight\tPrice\tStatus");
            company.orderList.forEach((order) -> {
                System.out.println(
                        order.id + "\t"
                        + order.title + "\t"
                        + order.model + "\t"
                        + order.weight + "\t"
                        + order.price + "\t"
                        + order.status
                );
            });
        showMenu();
    }

    public static void main(String[] args) {

        showMenu();
        // Initial fixed collection of customers
        company.customerList.add(new Customer(1, "John Doe", "123 Main St", "01/01/2022", "055-555-5555", "johndoe@email.com"));
        company.customerList.add(new Customer(2, "Jane Doe", "456 Main St", "02/02/2022", "055-555-5556", "janedoe@email.com"));
        company.customerList.add(new Customer(3, "Jim Smith", "789 Main St", "03/03/2022", "055-555-5557", "jimsmith@email.com"));
        orderList.add(new ArrayList<>());
        orderList.add(new ArrayList<>());
        orderList.add(new ArrayList<>());

        while (true) {
            input = scanner.nextInt();
            
            switch (input) {
                case 1:
                    System.out.println("Mohammad Alhartoumi ID:442010481 \nNawaf Alharbi, ID:442002491");  
                    addCustomer();
                    break;
                case 2:
                    System.out.println("Mohammad Alhartoumi ID:442010481 \nNawaf Alharbi, ID:442002491");  
                    addOrder();
                    break;
                case 3:
                    System.out.println("Mohammad Alhartoumi ID:442010481 \nNawaf Alharbi, ID:442002491");  
                    displayCustomers();
                    break;
                case 4:
                    System.out.println("Mohammad Alhartoumi ID:442010481 \nNawaf Alharbi, ID:442002491");  
                    displayOrders();
                    break;
                case 5: {
                    System.out.println("Mohammad Alhartoumi ID:442010481 \nNawaf Alharbi, ID:442002491");  
                    System.out.println("Enter Customer id");
                    int inderx = scanner.nextInt();
                    for (int i = 0; i <= company.customerList.size()-1; i++) {
                        if (company.customerList.get(i).id == inderx) {
                            company.customerList.get(i).getInfoCustomer();
                            break;
                        }
                    }
                }
                showMenu();
                break;
                case 6: {
                    System.out.println("Mohammad Alhartoumi ID:442010481 \nNawaf Alharbi, ID:442002491");  
                    System.out.println("Enter Order id");
                    int inderx = scanner.nextInt();
                    for (int i = 0; i <= company.orderList.size()-1; i++) {
                        if (company.orderList.get(i).id == inderx) {
                            company.orderList.get(i).getInfoOrder();
                            break;
                        }
                    }
                
                showMenu();
                break;
                }
                case 7:{
                    System.out.println("Mohammad Alhartoumi ID:442010481 \nNawaf Alharbi, ID:442002491");  
                    company.getTotalPrice();
                    showMenu();
                    break;
                }
                case 8:
                    System.out.println("Mohammad Alhartoumi ID:442010481 \nNawaf Alharbi, ID:442002491");  
                    System.out.println("Thank you for using our system!");
                    System.exit(0);
                    break;
                default: {
                    System.out.println("Wrong selection try againe select number from Menu!!!");
                    showMenu();
                }
            }
        }
    }
}
