package Observer;

public interface IFollowerManager {
    public void addFollower(IObserver observer);
    public void removeFollower(IObserver observer);

    public void notifyFollowers();
}