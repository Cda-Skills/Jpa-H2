package org.springboot.JpaH2.model;

import java.util.Set;

import org.springboot.JpaH2.enums.MaintenanceRoleType;

public interface Role {
	
	boolean includes(Role role);
	
	static Set<Role> roots() {
        return Set.of(MaintenanceRoleType.ADMIN);
    }
}
