package ie.cit.assignment.service;

import ie.cit.assignment.domain.Citizen;
import ie.cit.assignment.domain.Tax;

import java.util.List;

/**
 * Created by Pavel on 19/10/2016.
 */
public interface CitizenService {
    List<Citizen> findAllCitizen();

    void add(Citizen citizen);

    List<Tax> findAllTaxes();

    void update(Tax tax);

}
