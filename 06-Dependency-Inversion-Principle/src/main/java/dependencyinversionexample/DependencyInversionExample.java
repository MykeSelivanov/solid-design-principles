package dependencyinversionexample;

interface DBConnectionInterface {
    public int connect();
}

class MySqlConnection implements DBConnectionInterface {
    public int connect() {
        // connection logic
        return 1;
    }
}

class PasswordReminder {
    private DBConnectionInterface dbConnection;

    public PasswordReminder(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection;
    }
}

public class DependencyInversionExample {
    public static void main(String[] args) {

    }
}
