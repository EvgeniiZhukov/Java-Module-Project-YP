import java.util.Scanner;

public class Guests {
    public int enterAmountOfGuests(){
        int amountOfGuests = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("\nВведите количество гостей, на которых нужно разделить счёт:");
            if(scanner.hasNextInt()) {
                amountOfGuests = scanner.nextInt();
                if (amountOfGuests <= 1){
                    System.out.println("Ошибка! колличество гостей должно быть натуральным числом больше 1. Попробуйте снова.");
                    scanner.nextLine();
                }
            }
            else{
                scanner.nextLine();
                System.out.println("Ошибка! колличество гостей должно быть натуральным числом больше 1. Попробуйте снова.");
            }
        } while(amountOfGuests<=1);
        System.out.println("Количество гостей равно = " + amountOfGuests);
        return amountOfGuests;
    }
}
