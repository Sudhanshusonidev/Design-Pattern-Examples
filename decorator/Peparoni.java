public class Peparoni extends ExtraCheese{
    public Peparoni(BasePizza pizza) {
        super(pizza);
    }
    @Override
    public int totalBill(){
        return basePizza.totalBill()+30;
    }
}
