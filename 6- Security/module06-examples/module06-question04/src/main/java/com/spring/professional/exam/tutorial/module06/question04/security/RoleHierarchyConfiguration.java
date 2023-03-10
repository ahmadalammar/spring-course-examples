package com.spring.professional.exam.tutorial.module06.question04.security;

import com.spring.professional.exam.tutorial.module06.question04.security.utils.RolesHierarchyBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;

@Configuration
public class RoleHierarchyConfiguration {

    @Bean
    public RoleHierarchy roleHierarchy() {
        RoleHierarchyImpl roleHierarchy = new RoleHierarchyImpl();
        roleHierarchy.setHierarchy(
                new RolesHierarchyBuilder()
                        .append(SecurityRoles.SUPER_ADMIN, SecurityRoles.CUSTOMERS_PAG_VIEW)
                        .append(SecurityRoles.SUPER_ADMIN, SecurityRoles.EMPLOYEES_PAG_VIEW)
                        .append(SecurityRoles.SUPER_ADMIN, SecurityRoles.DEPARTMENTS_PAG_VIEW)
                        .build()
        );

        return roleHierarchy;
    }
}
