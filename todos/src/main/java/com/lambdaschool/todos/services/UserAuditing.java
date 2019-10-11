package com.lambdaschool.todos.services;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserAuditing implements AuditorAware<String>
{

    // decide whether to use the user's name or a default name
    @Override
    public Optional<String> getCurrentAuditor()
    {
        String uname;
        Authentication authentication = SecurityContextHolder.getContext()
                                                             .getAuthentication();
        if (authentication != null)
        {
            uname = authentication.getName();
        } else
        {
            // only should happen when using seed data
            uname = "SYSTEM";
        }
        return Optional.of(uname);
    }

}