package kio.HumanResourcesMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import kio.HumanResourcesMS.entities.concretes.*;


public interface ContactInformationDao  extends JpaRepository<ContactInformation,Integer> {

	List<ContactInformation> getByCurriculumVitae_Id(int cvid);
}
