package assignments;
interface Database {
    void connect();
}

class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to MySQL DB");
    }
}

class OracleDatabase implements Database {
    public void connect() {
        System.out.println("Connected to Oracle DB");
    }
}

class Application {
    private Database db;

    public Application(Database db) {
        this.db = db;
    }

    public void start() {
        db.connect();
    }
}

public class DIPExample {
    public static void main(String[] args) {
        Database mysql = new MySQLDatabase();
        Database oracle = new OracleDatabase();

        Application app1 = new Application(mysql);
        app1.start();

        Application app2 = new Application(oracle);
        app2.start();
    }
}
