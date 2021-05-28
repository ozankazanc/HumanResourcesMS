package kio.HumanResourcesMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kio.HumanResourcesMS.entities.concretes.Jobseeker;

public interface JobSeekerDao extends JpaRepository<Jobseeker,Integer> {
	
	Jobseeker findByNationalityNumber(String nationalityNumber);
}

