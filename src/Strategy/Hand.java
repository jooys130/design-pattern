package Strategy;

public class Hand {
    public static final int HANDVALUE_GUU = 0; // 주먹
    public static final int HANDVALUE_CHO = 1; // 가위
    public static final int HANDVALUE_PAA = 2; // 보
    public static final Hand[] hand = { // 가위바위보의 손을 표시하는 3개의 인스턴스
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA)
    };
    private static final String[] name = { // 가위바위보의 손의 문자열 표현
            "주먹", "가위", "보"
    };
    private int handvalue; // 가위바위보의 손의 값

    private Hand(int handvalue) {
        this.handvalue = handvalue;
    }

    public static Hand getHand(int handvalue) { // 값으로 인스턴스를 얻는다: Singleton 패턴 사용
        return hand[handvalue];
    }

    public boolean isStrongerThan(Hand h) { // this가 h를 이길 경우 true
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) { // this가 h를 질 경우 true
        return fight(h) == -1;
    }

    private int fight(Hand h) { // 무승부는 0, this의 승이면 1, h의 승이면 -1
        if (this == h) {
            return 0;
        } else {
            /*
                this가 h를 이기는 경우
                    | this    | h      |
                    | 주먹(0)  | 가위(1) |
                    | 가위(1)  | 보(2)  |
                    | 보(2)   | 주먹(0) |
                -> this가 h를 이기려면 h의 값이 this의 값에서 1을 더한 것이면 된다
             */
            return (this.handvalue + 1) % 3 == h.handvalue ? 1 : -1;
        }
    }

    public String toString() {
        return name[handvalue];
    }
}

