package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax2To5Then5() {
        int left = 5;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEqual2And2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To4To9Then9() {
        int left = 2;
        int right = 4;
        int middle = 9;
        int result = Max.max(left, right, middle);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax4To8To6Then8() {
        int left = 4;
        int right = 8;
        int middle = 6;
        int result = Max.max(left, right, middle);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To1To9To12Then12() {
        int left = 3;
        int right = 1;
        int middle = 9;
        int middle2 = 12;
        int result = Max.max(left, right, middle, middle2);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }
}