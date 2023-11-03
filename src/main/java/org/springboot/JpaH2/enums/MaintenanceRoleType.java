package org.springboot.JpaH2.enums;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springboot.JpaH2.model.Role;

public enum MaintenanceRoleType implements Role {
	ADMIN, MODERATEUR;
	
	private final Set<Role> children = new HashSet<>();

    static {
        ADMIN.children.add(MODERATEUR);
        MODERATEUR.children.addAll(List.of(UserRoleType.EDIT, UserRoleType.REPORTER));
    }

    @Override
    public boolean includes(Role role) {
        return this.equals(role) || children.stream().anyMatch(r -> r.includes(role));
    }
}
