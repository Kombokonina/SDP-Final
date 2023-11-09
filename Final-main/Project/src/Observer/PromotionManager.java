package Observer;

import java.util.ArrayList;
import java.util.List;

public class PromotionManager {
    private List<String> promotions = new ArrayList<>();

    public void publishEvent(String promotion) {
        this.promotions.add(promotion);
    }

    public List<String> getPromotions() {
        return promotions;
    }
}

