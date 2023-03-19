package com.example.oauth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Role implements GrantedAuthority {

    @Id
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
    List<User> users;

    @Override
    public String getAuthority() {
        return getName();
    }

    @Override
    public int hashCode() {
        int hash = getId().intValue() + (getName() != null ? getName().hashCode() : 0);
        hash = 31 * hash;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Role role = (Role) obj;
        return getId().equals((role.getId())) && getName().equals((role.getName()));
    }
}
