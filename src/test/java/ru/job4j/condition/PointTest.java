package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when2and10to4and8then8dot94() {
        double expected = 8.95;
        Point a = new Point(2, 4);
        Point b = new Point(10, 8);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus32toMinus25then3dot17() {
        double expected = 3.17;
        Point a = new Point(-3, 2);
        Point b = new Point(-2, 5);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when2and10to4and8to2and2then8dot95() {
        double expected = 8.95;
        Point a = new Point(2, 4, 2);
        Point b = new Point(10, 8, 2);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}