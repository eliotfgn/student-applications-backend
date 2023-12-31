package com.eliotfgn.studentapplicationbackend.dto;

import com.eliotfgn.studentapplicationbackend.models.user.Role;
import com.eliotfgn.studentapplicationbackend.models.user.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * DTO for {@link User}
 */
public class UserDto implements Serializable {
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @Email(message = "Email must be valid.")
    @NotBlank(message = "Email is required.")
    private final String email;
    private String firstname;
    private String lastname;
    private Role role;

    public UserDto(Long id, LocalDateTime createdAt, LocalDateTime updatedAt, String email, String firstname, String lastname, Role role) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Role getRole() {
        return role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto entity = (UserDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.createdAt, entity.createdAt) &&
                Objects.equals(this.updatedAt, entity.updatedAt) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.firstname, entity.firstname) &&
                Objects.equals(this.lastname, entity.lastname) &&
                Objects.equals(this.role, entity.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, updatedAt, email, firstname, lastname, role);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "createdAt = " + createdAt + ", " +
                "updatedAt = " + updatedAt + ", " +
                "email = " + email + ", " +
                "firstname = " + firstname + ", " +
                "lastname = " + lastname + ", " +
                "role = " + role + ")";
    }
}