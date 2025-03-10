package lesson_db;

import java.sql.*;

public class DataBase {
    private final String host = "localhost";
    private final String port = "5433";
    private final String dbName = "zakaz";
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
                    " (id INT PRIMARY KEY, id_zakaz INTEGER, name_zakaz VARCHAR(25), ghena_zakaz INTEGER);";
            Statement statement = getDBConnection().createStatement();
            statement.executeUpdate(sql);
            System.out.println("Таблица создалась");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addTable(String tableName, int id, int id_zakaz, String name_zakaz, int  ghena_zakaz) throws SQLException {
        String sql = "INSERT INTO " + tableName + " (id, id_zakaz, name_zakaz, ghena_zakaz) VALUES (?, ?, ?, ?)";
        PreparedStatement prStm = getDBConnection().prepareStatement(sql);
        prStm.setInt(1, id);
        prStm.setInt(2, id_zakaz);
        prStm.setString(3, name_zakaz);
        prStm.setInt(4,  ghena_zakaz);


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

    public void selectTableAndCount(String tableName, int ghena_zakaz) throws SQLException {
        Statement statement = getDBConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from " + tableName);
        ResultSet resultSet1 = statement.executeQuery("SELECT DISTINCT"+ ghena_zakaz +", country FROM"+ tableName);
        
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String password = resultSet.getString(3);
            System.out.printf("%d. %s. %s. \n", id, name, password);
        }
    }

}