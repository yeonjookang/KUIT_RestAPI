
import java.util.ArrayList;
import java.util.Arrays;import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * 동작 파라미터화
         * 초록 사과만 필터링해보자
         **/

        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED)
        );
    }

    //v1 초록색 사과 필터링
    public static List<Apple> fileterGreenApple(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory){
            if(apple.getColor() == Color.GREEN){
                result.add(apple);
            }
        }
        return result;
    }
}