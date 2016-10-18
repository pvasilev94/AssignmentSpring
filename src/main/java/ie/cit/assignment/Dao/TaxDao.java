package ie.cit.assignment.Dao;

import ie.cit.assignment.domain.Tax;

import java.util.List;


public interface TaxDao {
    List<Tax> findAll();

    void update(Tax tax);
}
