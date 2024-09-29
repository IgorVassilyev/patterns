package kz.vassilyev.spring.singleton;

public class Database {
    private static Database instance;
    public String value;

    private Database(String value) {
        this.value = value;
        System.out.println("Init Database");
    }

    public static Database getInstance(String value) {
        if (instance == null) {
            instance = new Database(value);
        }
        return instance;
    }
}
