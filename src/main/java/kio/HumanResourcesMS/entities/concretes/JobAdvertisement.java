package kio.HumanResourcesMS.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_advertisements")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "requirements")
	private String requirements;

	@Column(name = "open_positions")
	private int openPositions;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name = "start_date")
	private LocalDate startDate;

	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name = "end_date")
	private LocalDate endDate;

	@Column(name = "active")
	private boolean active;
	
	@Column(name = "salary")
	private int salary;
	
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;
		
	@ManyToOne()
	@JoinColumn(name = "job_id")
	private Job jobs;
	
	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City city;


	
}
