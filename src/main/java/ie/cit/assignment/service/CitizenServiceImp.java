package ie.cit.assignment.service;

import ie.cit.assignment.dao.CitizenDao;
import ie.cit.assignment.dao.TaxDao;
import ie.cit.assignment.domain.Citizen;
import ie.cit.assignment.domain.Tax;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        List<Citizen> citizenList = citizenDao.findAll();
        List<Tax> taxList = taxDao.findAll();
        return salaryAfterTax(citizenList, taxList);
    }

    public void printTaxes() {
        List<Tax> taxList = taxDao.findAll();
        for (Tax tax : taxList) {
            System.out.println(tax.toString());
        }
    }
    @Override
    public void add(Citizen citizen) {
        citizenDao.add(citizen);

    }


    @Override
    public void update(Tax tax) {
        taxDao.update(tax);
    }

    private List<Citizen> salaryAfterTax(List<Citizen> citizenList, List<Tax> taxList) {
        List<Tax> taxingList = taxList;
        List<Citizen> citizenListAfterTax = new ArrayList<>();
        citizenListAfterTax = citizenList;
        for (Citizen citizen : citizenListAfterTax) {
            long salary = citizen.getSalary();
            long remainingSalary = salary;
            long allTax = 0;
            long taxes = 0;
            for (Tax tax : taxingList) {
                if (salary >= tax.getTaxRangeFinish()) {// the band rate for solidarity charge will be set to 0 so that it always applies itself.
                    if (tax.getTaxRate() > 0) {
                        taxes = (tax.getTaxRangeFinish() - tax.getTaxRangeStart()) * tax.getTaxRate() / 100;
                        if (taxes < 0) {
                            taxes = taxes * -1;
                        }
                        allTax = allTax + taxes;
                    }
                }
                if (salary < tax.getTaxRangeFinish()) {
                    if (salary > tax.getTaxRangeStart()) {
                        if (tax.getTaxRate() > 0) {
                            /**
                             * taxRangeFinish for C,D set at 10000000 so it always get applied based on taxRangeStart
                             * */
                            taxes = (salary - tax.getTaxRangeStart()) * tax.getTaxRate() / 100L;
                            allTax = allTax + taxes;
                        }
                    }
                }
            }
            citizen.setTakeHomePay(remainingSalary - allTax);
        }
        return citizenListAfterTax;
    }
}
