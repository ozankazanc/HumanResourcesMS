package kio.HumanResourcesMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kio.HumanResourcesMS.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer> {

}
