package kio.HumanResourcesMS.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import kio.HumanResourcesMS.entities.concretes.*;


public interface LanguageInformationDao  extends JpaRepository<LanguageInformation,Integer> {

	List<LanguageInformation> getByCurriculumVitae_Id(int cvid);
}
