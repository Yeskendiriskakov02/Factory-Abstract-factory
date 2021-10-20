public class ChineseFoodFactory extends AbstractFoodFactory {

   @Override
   public AbstractFoodFactory placeOrder(String itemName, int quantity) {
      return new ChineseFood(itemName,quantity);
   }
}
