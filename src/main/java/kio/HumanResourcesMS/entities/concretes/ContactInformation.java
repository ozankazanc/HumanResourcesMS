package kio.HumanResourcesMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "contact_informations")
@AllArgsConstructor
@NoArgsConstructor
public class ContactInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "github_address")
	private String githubAdress;
	
	@Column(name = "linkedin_address")
	private String linkedinAddress;
	
	@ManyToOne	
	@JsonIgnore
	@JoinColumn(name="cvid")
	private CurriculumVitae curriculumVitae;
}
