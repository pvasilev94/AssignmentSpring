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
        String query = "insert into citizen (name, salary) values (?, ?)";
        template.update(query, citizen.getName(), citizen.getSalary());
        System.out.println("Citizen has been added");
    }

    @Override
    public List<Citizen> findAll() {
        String query = "SELECT * FROM citizen";
        return template.query(query, new CitizenRowMapper());
    }
}
