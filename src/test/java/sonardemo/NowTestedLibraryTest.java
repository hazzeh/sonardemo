package sonardemo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class NowTestedLibraryTest {

    @Test
    public void shouldReturnHeader() {
        NowTestedLibrary sut = new NowTestedLibrary();
        assertThat(sut.getHeader()).contains("Header");
    }

    @Test
    public void shouldReturnEmptyStringIfHeaderIsNotCalled() {
        NowTestedLibrary sut = new NowTestedLibrary();
        assertThat(sut.toString()).isBlank();
    }

    @Test
    public void shouldNotReturnEmptyStringIfHeaderIsCalled() {
        NowTestedLibrary sut = new NowTestedLibrary();
        sut.getHeader();
        assertThat(sut.toString()).isNotBlank();
    }
}