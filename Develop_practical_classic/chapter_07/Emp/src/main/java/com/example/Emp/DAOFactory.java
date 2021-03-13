package com.example.Emp;

public class DAOFactory {
    public static IEmpDAO getIEmpDAOInstance() throws Exception {
        return new IEmpDAOProxy();
    }
}
