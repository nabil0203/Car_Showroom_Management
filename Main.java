import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarShowroom showroom = new CarShowroom();
        Scanner scanner = new Scanner(System.in);
        String choice;
        boolean running = true;

        while (running) {
            System.out.println("\n--------------WELCOME TO CAR SHOWROOM MANAGEMENT SYSTEM--------------\n");
            System.out.println("~~~~~~~~~~ MAIN MENU ~~~~~~~~~~");
            System.out.println("1. Add Electric Car");
            System.out.println("2. Add Luxury Car");
            System.out.println("3. Display Cars");
            System.out.println("4. Update Car");
            System.out.println("5. Delete Car");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter ID: ");
                    String electricId = scanner.nextLine();
                    System.out.print("Enter Model: ");
                    String electricModel = scanner.nextLine();
                    System.out.print("Enter Year: ");
                    String electricYear = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double electricPrice = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter Battery Capacity (kWh): ");
                    String batteryCapacity = scanner.nextLine();
                    ElectricCar electricCar = new ElectricCar(electricId, electricModel, electricYear, electricPrice,
                            batteryCapacity);
                    showroom.addCar(electricCar);
                    System.out.println("CAR ADDED SUCCESSFULLY!!!");
                    break;

                case "2":
                    System.out.print("Enter ID: ");
                    String luxuryId = scanner.nextLine();
                    System.out.print("Enter Model: ");
                    String luxuryModel = scanner.nextLine();
                    System.out.print("Enter Year: ");
                    String luxuryYear = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double luxuryPrice = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter Interior Material: ");
                    String interiorMaterial = scanner.nextLine();
                    LuxuryCar luxuryCar = new LuxuryCar(luxuryId, luxuryModel, luxuryYear, luxuryPrice,
                            interiorMaterial);
                    showroom.addCar(luxuryCar);
                    System.out.println("CAR ADDED SUCCESSFULLY!!!");
                    break;

                case "3":
                    if (showroom.getCars().isEmpty()) {
                        System.out.println("----NO CARS AVAILABLE AT THIS MOMENT----");
                    } else {
                        System.out.println("Cars in the showroom:");
                        for (Car car : showroom.getCars()) {
                            System.out.println(car);
                        }
                    }
                    break;

                case "4":
                    System.out.print("Enter ID of the car to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter new Model: ");
                    String newModel = scanner.nextLine();
                    System.out.print("Enter new Year: ");
                    String newYear = scanner.nextLine();
                    System.out.print("Enter new Price: ");
                    double newPrice = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter new Battery Capacity (kWh): ");
                    String newBatteryCapacity = scanner.nextLine();
                    ElectricCar updatedCar = new ElectricCar(updateId, newModel, newYear, newPrice, newBatteryCapacity);
                    showroom.updateCar(updateId, updatedCar);
                    System.out.println("CAR UPDATED SUCCESSFULLY!!!");
                    break;

                case "5":
                    System.out.print("Enter ID of the car to delete: ");
                    String deleteId = scanner.nextLine();
                    showroom.deleteCar(deleteId);
                    System.out.println("CAR DELETED SUCCESSFULLY!!!");
                    break;

                case "0":
                    System.out.println("\nThanks for visiting us!!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            
            if (running) {
                System.out.println("\nWhat would you like to do next?");
                System.out.println("1. Main Menu");
                System.out.println("0. Exit");
                System.out.print("Choose an option: ");
                String nextChoice = scanner.nextLine();
                if (nextChoice.equals("0")) {
                    System.out.println("\nThanks for visiting us!!");
                    running = false; // Exit the loop
                }
                // If "1", the loop will continue
            }
        }

        scanner.close();
    }
}
