package kio.HumanResourcesMS.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "curriculum_vitaes")
@AllArgsConstructor
@NoArgsConstructor
public class CurriculumVitae{
	
	@Id
    @GeneratedValue
    @Column(name = "id")
	private int id;
	
	@JsonIgnore
	@Column(name="created_date",columnDefinition = "Date default CURRENT_DATE")
	private LocalDate createdDate=LocalDate.now();
	
//
//	@Column(name="active")
//	private boolean active;
//	
	@ManyToOne
	@JoinColumn(name="jobseeker_id")
	private Jobseeker jobseeker;
	
	@OneToOne(mappedBy="curriculumVitae", fetch=FetchType.LAZY)
	@JsonIgnore
	private Image image;
	
	@JsonIgnore
	@OneToMany(mappedBy="curriculumVitae")
	private List<JobExperience> jobExperience;
	
	@JsonIgnore
	@OneToMany(mappedBy="curriculumVitae")
	private List<Ability> ability;
	
	@JsonIgnore
	@OneToMany(mappedBy="curriculumVitae")
	private List<EducationInformation> educationInformation;
	
	@JsonIgnore
	@OneToMany(mappedBy="curriculumVitae")
	private List<LanguageInformation> languageInformation;
	
	@JsonIgnore
	@OneToMany(mappedBy="curriculumVitae")
	private List<ContactInformation> contactInformation;
	
	@JsonIgnore
	@OneToMany(mappedBy="curriculumVitae")
	private List<CoverLetter> coverLetter;
	
	
}
