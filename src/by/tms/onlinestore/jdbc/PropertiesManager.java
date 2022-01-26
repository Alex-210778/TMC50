package by.tms.onlinestore.jdbc;

import java.io.IOException;
import java.util.Properties;

public final class PropertiesManager {

    private static final String CONFIG_FILE_NAME = "db.properties";
    private static final String DRIVER_SQL_NAME = "org.postgresql.Driver";

    private static final Properties prop = new Properties();

    static {
        try {
            prop.load(PropertiesManager.class.getClassLoader().getResourceAsStream(CONFIG_FILE_NAME));
            Class.forName(DRIVER_SQL_NAME);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public PropertiesManager() {
    }

    public static String getPropertyByKey(String key) {
        return prop.getProperty(key);
    }
}
