package com.mochiresearch.driveGroups.security;

import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;

import java.util.Objects;

public class SessionUtil {
    public static SecurityContext getSecurityContext() {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        if (Objects.isNull(securityContext)) {
            throw new InsufficientAuthenticationException("Security Context is null.");
        }
        return securityContext;
    }

    public static Authentication getAuthentication() {
        Authentication authentication = getSecurityContext().getAuthentication();
        if (Objects.isNull(authentication)) {
            throw new InsufficientAuthenticationException("Security Context -> Authentication is null.");
        }
        return authentication;
    }

    public static String getPrincipalUserId() {
        Object principal = getAuthentication().getPrincipal();
        if (principal instanceof Jwt) {
            return ((Jwt) principal).getClaim("user_id");
        }
        throw new UnsupportedOperationException("Unknown Principal type held in Security Context.");
    }

    public static boolean hasAuthority(String authority) {
        return getAuthentication().getAuthorities().stream()
                .anyMatch(a -> a.getAuthority().equals(authority));
    }
}
