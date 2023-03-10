package com.spring.professional.exam.tutorial.module06.question06.security;

public interface SecurityRoles {
    String SUPER_ADMIN = "SUPER_ADMIN";

    String ALL_VIEWS = "ALL_VIEWS";
    String ALL_CREATES = "ALL_CREATES";
    String ALL_DELETES = "ALL_DELETES";

    String CUSTOMERS_ADMIN = "CUSTOMERS_ADMIN";
    String CUSTOMERS_PAG_VIEW = "CUSTOMERS_PAG_VIEW";
    String CUSTOMER_VIEW = "CUSTOMER_VIEW";
    String CUSTOMER_CREATE = "CUSTOMER_CREATE";
    String CUSTOMER_DELETE = "CUSTOMER_DELETE";

    String DEPARTMENTS_ADMIN = "DEPARTMENTS_ADMIN";
    String DEPARTMENTS_PAG_VIEW = "DEPARTMENTS_PAG_VIEW";
    String DEPARTMENT_VIEW = "DEPARTMENT_VIEW";
    String DEPARTMENT_CREATE = "DEPARTMENT_CREATE";
    String DEPARTMENT_DELETE = "DEPARTMENT_DELETE";

    String EMPLOYEES_ADMIN = "EMPLOYEES_ADMIN";
    String EMPLOYEES_PAG_VIEW = "EMPLOYEES_PAG_VIEW";
    String EMPLOYEE_VIEW = "EMPLOYEE_VIEW";
    String EMPLOYEE_CREATE = "EMPLOYEE_CREATE";
    String EMPLOYEE_DELETE = "EMPLOYEE_DELETE";
}
