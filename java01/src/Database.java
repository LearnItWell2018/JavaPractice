public interface Database {
    void connect();

    void disconnect();
}

class MySQLDatabase implements Database {

    public void connect() {
        System.out.println("Connecting to MySQLDatabase");
    }

    public void disconnect() {
        System.out.println("Disconnect MySQLDatabase");
    }
}

class App {
    private final Database database;


    public App(Database database) {
        this.database = database;
    }

    public void start() {
        database.connect();
    }

    public void stop() {
        database.disconnect();
    }


}
