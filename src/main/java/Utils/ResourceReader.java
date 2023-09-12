package Utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ResourceReader {

    private final Properties properties = new Properties();

    public String getPropertyByName(String propertyName) throws IOException {

        try (InputStream resourceFiles = getClass().getClassLoader().getResourceAsStream("credential.properties")) {
            properties.load(resourceFiles);
        }
        return properties.getProperty(propertyName);
    }
}
