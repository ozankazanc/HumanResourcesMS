package kio.HumanResourcesMS.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "jobseekers")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Jobseeker extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "jobseeker_id")
	private int jobseekerId;
	//@OneToOne
	@Column(name = "user_id")
	private int userId;
	@Column(name = "nationality_number")
	private String nationalityNumber;
	@Column(name = "birthday")
	private Date birthday;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
}
