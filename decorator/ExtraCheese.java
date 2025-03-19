public class ExtraCheese extends Toppings {

    BasePizza basePizza;
    public ExtraCheese (BasePizza pizza){
        this.basePizza=pizza;
    }
    @Override
    public int totalBill() {
        return basePizza.totalBill()+40;
    }
}
