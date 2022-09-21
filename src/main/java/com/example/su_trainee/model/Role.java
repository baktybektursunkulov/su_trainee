package com.example.su_trainee.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "s_roles")
public class Role {
//	private String role;
//	@JsonIgnore
//	private Boolean is_deleted;
//
//	public String getRole() {
//		return role;
//	}
//
//	public void setRole(String role) {
//		this.role = role;
//	}
//
//	public Boolean getIs_deleted() {
//		return is_deleted;
//	}
//
//	public void setIs_deleted(Boolean is_deleted) {
//		this.is_deleted = is_deleted;
//	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer row_id;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ERole name;
	
	public Role() {}

	public Role(ERole name) {
		this.name = name;
	}

	public Integer getRow_id() {
		return row_id;
	}

	public void setRow_id(Integer row_id) {
		this.row_id = row_id;
	}
	public ERole getName() {
		return name;
	}

	public void setName(ERole name) {
		this.name = name;
	}
	
}
