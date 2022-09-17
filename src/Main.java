public class Main {

    public static void main(String[] args) {
        int costPerMile = 20 * 1; // рублей за 1 милю
        int airfare = 6000; // стоимость авиабилета
        int milesFromTicket = airfare / costPerMile; // сколько миль вышло за стоимость билета
        System.out.println(milesFromTicket);
    }
}
