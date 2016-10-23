package ie.cit.assignment.rowmapper;

import ie.cit.assignment.domain.Tax;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TaxRowMapper implements RowMapper<Tax> {

    @Override
    public Tax mapRow(ResultSet rs, int rowNum) throws SQLException {
        Tax tax = new Tax();

        tax.setTaxID(rs.getString("taxID"));
        tax.setTaxCategory(rs.getInt("taxCategory"));
        tax.setTaxName(rs.getString("taxName"));
        tax.setTaxRangeStart(rs.getLong("taxRangeStart"));
        tax.setTaxRangeFinish(rs.getLong("taxRangeFinish"));
        tax.setTaxRate(rs.getLong("taxRate"));

        return tax;
    }
}
