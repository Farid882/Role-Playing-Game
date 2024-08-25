import java.util.function.Predicate;

public class Merchant implements Seller {
    @Override
    public String seller(Goods goods) {
        String res = "";
        if (goods == Goods.POTION) {
            return "potion";
        }
        return null;
    }

    public enum Goods {
        POTION
    }
}
