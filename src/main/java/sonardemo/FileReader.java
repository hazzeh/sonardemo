package sonardemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReader {

    public String readInputfile() throws IOException {
        Path path = getPath();
        BufferedReader reader = Files.newBufferedReader(path);
        reader.close();
        try (Stream<String> input = Files.lines(path)) {
            return input.collect(Collectors.joining(";"));
        }
    }

    private Path getPath() {
        String location = getClass().getClassLoader().getResource("input.txt").getPath();
        return Paths.get(location);
    }
}
