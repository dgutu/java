package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;

public class DOUserDisplayFields
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    public String employee, dept, role, token, user, opID;

    public static final int FIELD_EMPLOYEE = 1;
    public static final int FIELD_DEPT = 2;
    public static final int FIELD_ROLE = 3;
    public static final int FIELD_FUNCTION = 4;
    public static final int FIELD_USER = 5;
    public static final int FIELD_OPERATOR = 6;

    public DOUserDisplayFields ()
    {
        this ("Employee", "Department", "Role", "Function/Field", "User", "Operator");
    }

    public DOUserDisplayFields (String employee, String dept, String role, String token, String user, String opID)
    {
        this.employee = employee;
        this.dept = dept;
        this.role = role;
        this.token = token;
        this.user = user;
        this.opID = opID;
    }
}
