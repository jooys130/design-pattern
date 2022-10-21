package Strategy;

public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() { // 승
        strategy.study(true);
        ++wincount;
        ++gamecount;
    }

    public void lose() { // 패
        strategy.study(false);
        ++losecount;
        ++gamecount;
    }

    public void even() { // 무승부
        ++gamecount;
    }

    public String toString() {
        return "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose" + "]";
    }
}