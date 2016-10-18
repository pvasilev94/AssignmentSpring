package ie.cit.assignment.rowmapper;

import ie.cit.assignment.domain.Tax;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TaxRowMapper implements RowMapper<Tax> {

    @Override
    public Tax mapRow(ResultSet rs, int rowNum) throws SQLException {
        Tax tax = new Tax();

        tax.setTAX_A(rs.getString("A"));
        tax.setTAX_B(rs.getString("B"));
        tax.setTAX_C(rs.getString("C"));
        tax.setTAX_D(rs.getString("D"));

        return tax;
    }
}
