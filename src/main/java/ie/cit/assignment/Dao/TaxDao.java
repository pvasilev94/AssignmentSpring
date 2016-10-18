package ie.cit.assignment.dao;

import ie.cit.assignment.domain.Tax;

import java.util.List;


public interface TaxDao {
    List<Tax> findAll();

    void update(Tax tax);
}
