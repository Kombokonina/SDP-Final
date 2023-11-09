package Observer;

import java.util.ArrayList;
import java.util.List;

public class CafeNotificator implements IFollowerManager {
    private List<IObserver> followers = new ArrayList<>();
    private PromotionManager promotionManager;

    public CafeNotificator(PromotionManager promotionManager) {
        this.promotionManager = promotionManager;
    }

    @Override
    public void addFollower(IObserver follower) {
        this.followers.add(follower);
    }

    @Override
    public void removeFollower(IObserver follower) {
        this.followers.remove(follower);
    }

    @Override
    public void notifyFollowers() {
        List<String> promotions = promotionManager.getPromotions();
        for (IObserver observer : followers) {
            observer.handle(promotions);
        }
    }
}

