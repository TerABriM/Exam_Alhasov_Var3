package lesson_db;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();
        Scanner sc = new Scanner(System.in);

        //db.createTable("Dostavka1");
        //int q = sc.nextInt();
        //for (int i = 2; i <= q ; i++)
        //db.addTable("Dostavka1",1,129341,"Aviasels",1000);

        db.selectTable("Dostavka1");

    }

}

