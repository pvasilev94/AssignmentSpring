package ie.cit.assignment.dao;

import ie.cit.assignment.domain.Tax;
import ie.cit.assignment.rowmapper.TaxRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaxDaoImp implements TaxDao {

    private JdbcTemplate template;

    @Autowired
    public TaxDaoImp(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<Tax> findAll() {
        String query = "SELECT * FROM tax";
        return template.query(query, new TaxRowMapper());
    }

    @Override
    public void update(Tax tax) {
        String query = "UPDATE tax SET taxRangeStart = ?, taxRangeFinish = ?, taxRate = ? WHERE taxID = ?";
        template.update(query, tax.getTaxRangeStart(), tax.getTaxRangeFinish(), tax.getTaxRate(), tax.getTaxID());
    }
}
