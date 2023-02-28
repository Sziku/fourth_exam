package hu.nive.ujratervezes.airport;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AirportAdministrator {

    private final String dbUrl;
    private final String dbUser;
    private final String dbPassword;

    public AirportAdministrator(String dbUrl, String dbUser, String dbPassword) {
        this.dbUrl = dbUrl;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
    }

    public List<String> getUniquePlanes(){
        List<String> landedPlaneList =  new ArrayList<>();

        final String sql = "select aircraft_type from airplanes_landed group by aircraft_type order by aircraft_type desc;";

        try(Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword)){
            PreparedStatement st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            while (rs.next()){
                landedPlaneList.add(rs.getString(1));
            }
            //Collections.reverse(landedPlaneList);
            return landedPlaneList;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  landedPlaneList;
    }
}
