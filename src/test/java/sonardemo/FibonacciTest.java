package sonardemo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {

    private Fibonacci sut = new Fibonacci();

    @Test
    public void shouldReturn1ForCount1() {
        assertThat(sut.getFib(1)).containsExactly(1);
    }

    @Test
    public void shouldReturn11ForCount2() {
        assertThat(sut.getFib(2)).containsExactly(1, 1);
    }

    @Test
    public void shouldReturn112ForCount3() {
        assertThat(sut.getFib(3)).containsExactly(1, 1, 2);
    }

    @Test
    public void shouldReturn11235813ForCount7() {
        assertThat(sut.getFib(7)).containsExactly(1, 1, 2, 3, 5, 8, 13);
    }
}