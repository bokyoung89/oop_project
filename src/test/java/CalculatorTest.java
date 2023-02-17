import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    @DisplayName("덧셈 연산을 수행한다.")
    @Test
    void additionTest() {
        int result = Calculator.Calculate(1,"+",2);

        assertThat(result).isEqualTo(3);
    }

    @DisplayName("뺼셈 연산을 수행한다.")
    @Test
    void minusTest() {
        int result = Calculator.Calculate(1,"-",2);

        assertThat(result).isEqualTo(-1);
    }

    @DisplayName("곱셈 연산을 수행한다.")
    @Test
    void multipleTest() {
        int result = Calculator.Calculate(2,"*",2);

        assertThat(result).isEqualTo(4);
    }

    @DisplayName("나눗셈 연산을 수행한다.")
    @Test
    void divideTest() {
        int result = Calculator.Calculate(6,"/",2);

        assertThat(result).isEqualTo(3);
    }
}
