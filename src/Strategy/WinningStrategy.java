package Strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;

    /*
        boolean: 원시타입으로 true, false 값을 가진다
            ㄴ null 체크가 불필요한 경우 자료형을 사용한다: Unboxing을 해줄 필요가 없기 때문에 시간 단축

        Boolean: 참조타입으로 true, false, null 값을 가진다
            ㄴ null 체크를 필요로 할 때 (또는 제너릭을 사용해야한다면) 참조형을 사용한다
            ㄴ 여기서 참조형은 자료형을 객체로 감싼 것을 말한다
               예시) 자료형: int, 참조형: Integer
            ㄴ 제너릭: 특정(Specific)을 미리 지정해주는 것이 아닌 필요에 의해 지정될 수 있도록 하는 일반(Generic) 타입
                ㄴ 즉, 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것을 말한다
     */
    private boolean won; // default value = false
    // 또는 (Boolean 형의 필드는 false로 초기화 ❗❕ null이라는 얘기도 있다)
    // private Boolean won;

    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }

        return prevHand;
    }

    public void study(boolean win) {
        won = win;
    }
}