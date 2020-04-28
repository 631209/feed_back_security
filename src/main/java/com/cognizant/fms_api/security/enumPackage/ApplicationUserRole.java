package com.cognizant.fms_api.security.enumPackage;


import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static com.cognizant.fms_api.security.enumPackage.ApplicationUserPermission.*;


public enum ApplicationUserRole {

    POC(Sets.newHashSet(POC_READ,POC_POST)),
    PMO(Sets.newHashSet(PMO_READ, PMO_POST)),
    ADMIN(Sets.newHashSet(ADMIN_READ,ADMIN_POST,ADMIN_DELETE));

    private final Set<ApplicationUserPermission> permission;

    ApplicationUserRole(Set<ApplicationUserPermission> permission) {
        this.permission = permission;
    }

    public Set<ApplicationUserPermission> getPermission() {
        return permission;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
        Set<SimpleGrantedAuthority> grantedAuthorities = getPermission().stream()
                .map(p -> new SimpleGrantedAuthority(p.getPermission()))
                .collect(Collectors.toSet());

        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return grantedAuthorities;
    }
}
