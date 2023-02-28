package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Task2:
készitsünk egy psql adatbázist ami a következő adatokat tartalmazza:

company:
stock_symbol(id),name,sector
F,Ford Motor Company,Car
GOOG,Alphabet Inc,IT
TSLA,Tesla Inc,Car
MSFT,Microsoft,IT

worker:
name,company,salary
Bud Spencer,F,5000
Albert Einstein,GOOG,5400
Harry Potter,TSLA,6000
Terence Hill,F,4500
Ada Lovelace,MSFT,5700
Charles Babbage,MSFT,4800

Task3:
készits egy metodust ami vissza adja az összes dolgozó nevét aki egy adott cégnél dolgozik.
*/
public class database {
    private static final String dbUrl = "jdbc:postgresql://localhost:5432/test_db";
    private static final String dbUser = "postgres";
    private static final String dbPassword = "784512";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set company name:");
        String company = scanner.next();
        System.out.println(getWorkerNameCompany(company));

    }


    public static List<String> getWorkerNameCompany(String company){
        List<String> workersName =  new ArrayList<>();

        final String sql = "select name from worker where company = ?;";

        try(Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)){
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,company);

            ResultSet rs = st.executeQuery();
            while (rs.next()){
                workersName.add(rs.getString(1));
            }

            return workersName;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  workersName;
    }
}
