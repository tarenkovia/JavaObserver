import java.util.Scanner;

public class Main {

    public static void RegistrationNewCitizen(CityInAmerica city){
        int age = 0;
        Scanner in = new Scanner(System.in);
        var cur = in.nextLine();

        try {
            age = Integer.valueOf(cur);
        }
        catch (NumberFormatException ce){
            ce.getMessage();
            Citizen third = new Citizen("Ivan", city, 30);
            System.out.println(third.getAge());
        }
        if(age != 0){
            Citizen fouth = new Citizen("Ivan", city, age);
            System.out.println(fouth.getAge());
        }
    }

    public static void main(String[] args) {
        System.out.println("Где-то из громофона на улицу - ");
        System.out.println("'Правительство подписало новый указ, согласну которому...'");
        System.out.println();
        var city = new CityInAmerica();

        Citizen first = new Citizen("Уинстон",  city, 30);
        Citizen second = new Citizen("Джулия",city, 29);
        RegistrationNewCitizen(city);


        city.setNews("'Сегодня Океания наш враг, Евразия наш союзник!'");

        System.out.println();
        System.out.println("Прошла долгая неделя прибывания Уинстона в сумрачном городе...");
        System.out.println();
        System.out.println("Уинстон включает экран, с него доносится очередной военный указ...");
        //System.out.println("'Сегодня Евразия наш враг, Океания наш союзник!'");
        System.out.println();

        city.setNews("'Сегодня Евразия наш враг, Океания наш союзник!'");
    }
}