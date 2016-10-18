package ie.cit.assignment.rowmapper;

import ie.cit.assignment.domain.Citizen;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class CitizenRowMapper implements RowMapper<Citizen> {

    @Override
    public Citizen mapRow(ResultSet rs, int rowNum) throws SQLException {
        Citizen citizen = new Citizen();

        citizen.setName(rs.getString("name"));
        citizen.setSalary(rs.getDouble("salary"));

        return citizen;
    }
}
