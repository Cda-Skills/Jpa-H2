package org.springboot.JpaH2.enums;

import java.util.HashSet;
import java.util.Set;

import org.springboot.JpaH2.model.Role;

public enum UserRoleType implements Role{
	
	VUE, EDIT, REPORTER;

    private final Set<Role> children = new HashSet<>();

    static {
        REPORTER.children.add(VUE);
        EDIT.children.add(VUE);
    }

	
	@Override
	public boolean includes(Role role) {
		// TODO Auto-generated method stub
		return this.equals(role) || children.stream().anyMatch(r -> r.includes(role));
	}

}
