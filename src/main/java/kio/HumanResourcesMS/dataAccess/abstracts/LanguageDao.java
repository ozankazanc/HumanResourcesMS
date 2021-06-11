package kio.HumanResourcesMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kio.HumanResourcesMS.entities.concretes.*;


public interface LanguageDao extends JpaRepository<Language,Integer> {

}
