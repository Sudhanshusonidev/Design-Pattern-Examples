public class DecoratorMain {
    public static void main(String[] args){
        BasePizza pizza=new Peparoni(new ExtraCheese(new Peparoni(new MargaritaPizza())));
        System.out.println("Total bill for customer is: "+pizza.totalBill());
    }
}
