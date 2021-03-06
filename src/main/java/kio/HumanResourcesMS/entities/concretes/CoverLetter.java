package kio.HumanResourcesMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "cover_letters")
@AllArgsConstructor
@NoArgsConstructor
public class CoverLetter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotBlank
	@NotNull
	@Column(name = "cover_letter")
	private String coverLetter;
	
	@ManyToOne	
	@JsonIgnore
	@JoinColumn(name="cvid")
	private CurriculumVitae curriculumVitae;
}
