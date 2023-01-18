package org.example.Cook;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CookingTest {

    @DisplayName("메뉴에 해당하는 음식을 만든다.")
    @Test
    void makeCookTest() {
        Cooking cooking = new Cooking();
        MenuItem menuItem = new MenuItem("돈까스", 5000);

        Cook cook = cooking.makeCook(menuItem);

        //객체들끼리 isEqualTo로 비교할 때는 equls() and hashCode() 오버라이드가 필요하다. Cook.java에 추가함.
        assertThat(cook).isEqualTo(new Cook("돈까스", 5000));
    }
}
