package kio.HumanResourcesMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kio.HumanResourcesMS.entities.concretes.Jobseeker;
import kio.HumanResourcesMS.entities.concretes.User;

public interface JobSeekerDao extends JpaRepository<Jobseeker,Integer> {
	
	User getByNationalityNumber(String nationalityNumber);
	Jobseeker getByUserId(int id);
}

