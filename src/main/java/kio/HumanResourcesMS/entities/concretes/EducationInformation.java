package kio.HumanResourcesMS.entities.concretes;

import java.time.LocalDate;

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
@Table(name = "education_informations")
@AllArgsConstructor
@NoArgsConstructor
public class EducationInformation {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotBlank
	@NotNull
	@Column(name = "school_name")
	private String schoolName;
	
	@NotBlank
	@NotNull
	@Column(name = "start_date")
	private LocalDate startDate;
	
	
	@Column(name = "end_date")
	private LocalDate endDate;
	
	@ManyToOne	
	@JsonIgnore
	@JoinColumn(name="cvid")
	private CurriculumVitae curriculumVitae;
}
