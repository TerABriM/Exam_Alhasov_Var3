package lesson_db;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();
        Scanner sc = new Scanner(System.in);
        db.createTable("Corper");
        int q = sc.nextInt();

      //  for (int i = 0; i <= q ; i++)

            db.addTable("Corper",q,129341,"Aviasels");



        db.selectTable("Corp");

    }

}