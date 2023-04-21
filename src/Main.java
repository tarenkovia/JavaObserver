public class Main {
    public static void main(String[] args) {
        System.out.println("Где-то из громофона на улицу - ");
        System.out.println("'Правительство подписало новый указ, согласну которому...'");
        System.out.println();
        var city = new CityInAmerica();

        new Citizen("Уинстон", city);
        new Citizen("Джулия", city);

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