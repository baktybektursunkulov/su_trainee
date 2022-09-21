package com.example.su_trainee.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "s_user",
		uniqueConstraints = {
				@UniqueConstraint(columnNames = "username"),
				@UniqueConstraint(columnNames = "email")
		})
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long row_id;
	private String username;
	private String email;
	private String password;
	@OneToMany(orphanRemoval = true)
//	@JoinTable(name = "user_roles",
//				joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
//				inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
   private Set<Role> roles = new java.util.LinkedHashSet<>();

	public User() {
	}

	public User(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return row_id;
	}

	public void setId(Long row_id) {
		this.row_id = row_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
