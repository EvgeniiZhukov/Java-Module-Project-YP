import java.util.Scanner;

public class Calculator {
    String nameOfTheDish, dots;
    float priceOfTheDish, totalPriceOfDishes;
    int priceOfItemInt;
    StringBuilder totalListOfItems = new StringBuilder("Добавленные товары:");
    Scanner scanner = new Scanner(System.in);

    public float enterListOfItems(){

        System.out.println("\n==============================================================================================================================================");
        System.out.println("Введите названия блюд и их стоимость. Стоимость блюд должна вводиться в формате рубли,копейки. \n\n Для завершения ввода неаберите \"Завершить\"");
        System.out.println("==============================================================================================================================================");

        while(true){
            System.out.println("\nВведите наименование блюда или команду \"Завершить\" для завершения ввода:");
            nameOfTheDish = scanner.nextLine();
            if (nameOfTheDish.equalsIgnoreCase("завершить")){
                break;
            }
            totalListOfItems.append("\n" + nameOfTheDish);
            System.out.println("\nВведите стоимость блюда:");
            while(true)
            {
                if(scanner.hasNextFloat())
                {
                    priceOfTheDish = Float.parseFloat(scanner.nextLine().replace(',','.'));
                    if(priceOfTheDish>=0){
                        totalPriceOfDishes += priceOfTheDish;
                        priceOfItemInt = (int) priceOfTheDish;
                        dots = ".".repeat(50 - nameOfTheDish.length());
                        totalListOfItems.append(dots + "." + priceOfItemInt + " руб " + (int) ((priceOfTheDish * 100 - priceOfItemInt * 100)) + " коп");
                        System.out.println("\nБлюдо успешно добавлено!");
                        break;
                    }
                    else{
                        System.out.println("\nСтоимость блюда должнабыть больше или равна 0 попробуйте снова!");
                    }

                }
                else
                {
                    if(scanner.nextLine().equalsIgnoreCase("завершить")){
                        System.out.println("\nДля завершения ввода добавьте цену последнего товара и введите \"Завершить\"!");
                    }
                    System.out.println("Стоимость блюда должнабыть числом в формате рубли,копейки попробуйте снова!");
                }
            }
        }
        System.out.println(totalListOfItems);
        return totalPriceOfDishes;
    }

    public void calculationForEachGuest (int guestAmount ,float totalAmount)
    {
        float amountForeachGuest;
        String templateOfOutPut = "Каждый гость должен заплатить: %.2f";
        amountForeachGuest = totalAmount / guestAmount;
        if (11<=(int)amountForeachGuest % 100 && (int)amountForeachGuest % 100<=14){
            System.out.println(String.format(templateOfOutPut, amountForeachGuest) + " рублей");
        }
        else{
                switch ((int)amountForeachGuest % 10){
                default:{
                    System.out.println(String.format(templateOfOutPut, amountForeachGuest) + " рублей");
                    break;
                }
                case (1) : {
                    System.out.println(String.format(templateOfOutPut, amountForeachGuest) + " рубль");
                    break;
                }
                case (2) :
                case (3) :
                case (4) : {
                    System.out.println(String.format(templateOfOutPut, amountForeachGuest) + " рубля");
                    break;
                }
            }
        }
    }
}
