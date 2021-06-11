package kio.HumanResourcesMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import kio.HumanResourcesMS.entities.concretes.*;


public interface EducationInformationDao  extends JpaRepository<EducationInformation,Integer> {

	List<EducationInformation> getByCurriculumVitae_Id(int cvid);
}
