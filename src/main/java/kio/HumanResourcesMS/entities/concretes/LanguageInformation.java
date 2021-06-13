package kio.HumanResourcesMS.entities.concretes;

import java.util.List;

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
@Table(name = "language_informations")
@AllArgsConstructor
@NoArgsConstructor
public class LanguageInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;


	@Column(name = "language")
	private int language;

	@Column(name = "language_level")
	private int languageLevel;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "cvid")
	private CurriculumVitae curriculumVitae;

}
