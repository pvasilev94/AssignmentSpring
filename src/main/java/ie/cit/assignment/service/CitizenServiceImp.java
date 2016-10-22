package ie.cit.assignment.service;

import ie.cit.assignment.dao.CitizenDao;
import ie.cit.assignment.dao.TaxDao;
import ie.cit.assignment.domain.Citizen;
import ie.cit.assignment.domain.Tax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenServiceImp implements CitizenService {

    CitizenDao citizenDao;
    TaxDao taxDao;

    @Autowired
    public CitizenServiceImp(CitizenDao citizenDao, TaxDao taxDao) {
        this.citizenDao = citizenDao;
        this.taxDao = taxDao;
    }

    @Override
    public List<Citizen> findAllCitizen() {
        return citizenDao.findAll();
    }

    @Override
    public void add(Citizen citizen) {
        citizenDao.add(citizen);
    }

    @Override
    public List<Tax> findAllTaxes() {
        return taxDao.findAll();
    }

    @Override
    public void update(Tax tax) {
        taxDao.update(tax);
    }

    private double salaryAfterTax(List<Citizen> citizenList) {
        double homePay;
        homePay = 0;
        return homePay;
    }
}
