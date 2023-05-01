public class Main {

    public static void main(String[] args) {
        System.out.println("Привет мир!!!");

        goToTheMarket();
    }

    public static void goToTheMarket(){
        System.out.println("Купить картошки");
        System.out.println("Купить яйца");
        System.out.println("Купить свеклы");
        buyApple();
    }

    public static void buyApple(){
        System.out.println("Купи ещё и яблок");
        goToTheMarket();
    }
}