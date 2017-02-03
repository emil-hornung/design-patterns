package pl.hornunge.behavioral.visitor.file_visitor;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileVisitorExample {
    public static void main(String[] args) throws IOException, URISyntaxException {
        URL url = FileVisitorExample.class.getResource("/file_visitor");
        Path path = Paths.get(url.toURI()).toAbsolutePath();
        Files.walkFileTree(path, new PrintFileNameVisitor());
    }
}
