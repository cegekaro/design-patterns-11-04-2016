package ro.cegeka.designpatterns.singleton;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class FileReader {

    /**
     * The instance of the FileReader that we are going to use.
     */
    private static FileReader reader;

    /**
     * Private constructor to disable using new from outside
     * the context of this class.
     */
    private FileReader() {
    }

    /**
     * Get the singleton instance of the file reader.
     *
     * @return FileReader
     */
    public static FileReader getInstance() {
        if (null == reader) {
            reader = new FileReader();
        }

        return reader;
    }

    /**
     * Read data from a file.
     *
     * @param path     The filepath to read.
     * @param encoding The encoding to be used when reading.
     * @return The content of the file.
     * @throws IOException
     */
    public String readFile(String path, Charset encoding)
            throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}
