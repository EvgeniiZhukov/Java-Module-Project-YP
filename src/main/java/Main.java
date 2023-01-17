
// dev branch for Y.Practicum
public class Main {

    public static void main(String[] args) {
        Guests guests = new Guests();
        float totalAmountOfMoney, paymentForEachGuest;
        int amountOfGuests;
        String finalResultPattern = "\n\nИтого каждый гость должен заплатить: %.2f";
        amountOfGuests = guests.enterAmountOfGuests();
        Calculator calc = new Calculator();
        totalAmountOfMoney = calc.enterListOfItems();
        System.out.println("Общая стоимость блюд = " + (int) totalAmountOfMoney + " руб " + (int) ((totalAmountOfMoney * 100 - (int)totalAmountOfMoney * 100)) + " коп");
        calc.calculationForEachGuest(amountOfGuests,totalAmountOfMoney);
    }
}
