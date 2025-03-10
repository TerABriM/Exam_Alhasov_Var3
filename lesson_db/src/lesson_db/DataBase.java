package lesson_db;

import java.sql.*;

public class DataBase {
    private final String host = "localhost";
    private final String port = "5433";
    private final String dbName = "airaflot";
    private final String login = "postgres";
    private final String password = "";

    private Connection dbCon; // подключение к бд

    private Connection getDBConnection()  {
        String str = "jdbc:postgresql://" + host + ":"
                + port + "/" + dbName;
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Соединение установлено");
        } catch (ClassNotFoundException e) {
            System.out.println("Соединение не установлено");
        }
        try {
            dbCon = DriverManager.getConnection(str, login, password);
        } catch (SQLException e) {
            System.out.println("Неверный путь (логин и пароль)");
        }
        return dbCon;
    }

 public void isConnection() throws SQLException, ClassNotFoundException {
    dbCon = getDBConnection();
    System.out.println(dbCon.isValid(1000));
   }

    public void createTable(String tableName)  {

        try {
            String sql = "CREATE TABLE IF NOT EXISTS " + tableName +
                    " (id INT PRIMARY KEY, idpilot INTEGER, namepilot VARCHAR(25));";
            Statement statement = getDBConnection().createStatement();
            statement.executeUpdate(sql);
            System.out.println("Таблица создалась");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addTable(String tableName, int id, int idAviaCorp, String nameAviaCorp) throws SQLException {
        String sql = "INSERT INTO " + tableName + " (id, idAviaCorp, nameAviaCorp) VALUES (?, ?, ?)";
        PreparedStatement prStm = getDBConnection().prepareStatement(sql);
        prStm.setInt(1, id);
        prStm.setInt(2, idAviaCorp);
        prStm.setString(3, nameAviaCorp);

        prStm.executeUpdate();

    }

    public void selectTable(String tableName) throws SQLException {
        Statement statement = getDBConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from " + tableName);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String password = resultSet.getString(3);
            System.out.printf("%d. %s. %s. \n", id, name, password);
        }
    }


}