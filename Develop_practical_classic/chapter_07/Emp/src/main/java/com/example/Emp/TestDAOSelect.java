package com.example.Emp;

import java.util.Iterator;
import java.util.List;

public class TestDAOSelect {
    public static void main(String[] args) throws Exception {
        List<Emp> all = DAOFactory.getIEmpDAOInstance().findAll("");
        for (Emp emp : all) {
            System.out.println(emp.getEmpno() + " " + emp.getEname());
        }
    }
}
