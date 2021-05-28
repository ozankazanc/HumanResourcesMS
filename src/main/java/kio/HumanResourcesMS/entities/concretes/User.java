package kio.HumanResourcesMS.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Inheritance;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

	@Id
    @GeneratedValue
	@Column(name = "user_id")
	private int userId;
	@Column(name = "mail")
	private String mail;
	@Column(name = "password")
	private String password;

}
