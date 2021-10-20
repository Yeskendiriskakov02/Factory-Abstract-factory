public class ItalianFoodFactory extends AbstractFoodFactory {

    @Override
    public AbstractFoodFactory placeOrder(String itemName, int quantity) {
        return new ItalianFood(itemName,quantity);
    }
}
