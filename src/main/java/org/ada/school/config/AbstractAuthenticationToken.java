package org.ada.school.config;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public abstract class AbstractAuthenticationToken {
    public boolean isAuthenticated(){
        return false;
    }
    public Object getCredentials(){
        return null;
    }

    public Object getPrincipal(){
        return null;
    }

    public Collection<GrantedAuthority> getAuthorities(){
        return null;
    }


}
