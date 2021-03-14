package com.example.Emp;

import java.util.Date;

public class TestDAOInsert {
    public static void main(String[] args) throws Exception {
        Emp emp = null;

        emp = new Emp();
        emp.setEmpno(101);
        emp.setEname("jia");
        emp.setJob("zero hour work");
        emp.setHiredate(new Date());
        emp.setSal(500);
        DAOFactory.getIEmpDAOInstance().doCreate(emp);
    }
}
