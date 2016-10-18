package ie.cit.assignment.dao;

import ie.cit.assignment.domain.Tax;
import ie.cit.assignment.rowmapper.TaxRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Pavel on 18/10/2016.
 */
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
        //TODO to be coded
        //TODO add databases for tax
    }
}
