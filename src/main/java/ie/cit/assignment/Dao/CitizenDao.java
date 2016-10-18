package ie.cit.assignment.Dao;

import ie.cit.assignment.domain.Citizen;

import java.util.List;

/**
 * Created by Pavel on 18/10/2016.
 */
public interface CitizenDao {
    List<Citizen> findAll();

    void add(Citizen citizen);

}
