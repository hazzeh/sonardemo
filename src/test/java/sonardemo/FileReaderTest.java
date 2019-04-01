package sonardemo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FileReaderTest {

    @Test
    public void readInputfile() throws Exception {
        FileReader sut = new FileReader();
        assertThat(sut.readInputfile()).isEqualTo("This is an input file!;Line 2");

    }
}