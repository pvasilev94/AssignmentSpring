package ie.cit.assignment.dao;

import ie.cit.assignment.domain.Citizen;
import ie.cit.assignment.rowmapper.CitizenRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CitizenDaoImp implements CitizenDao {

    private JdbcTemplate template;

    @Autowired
    public CitizenDaoImp(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void add(Citizen citizen) {
        //TODO to be coded
        //TODO add databases for citizen
    }

    @Override
    public List<Citizen> findAll() {
        String query = "SELECT * FROM citizen";
        return template.query(query, new CitizenRowMapper());
    }
}
