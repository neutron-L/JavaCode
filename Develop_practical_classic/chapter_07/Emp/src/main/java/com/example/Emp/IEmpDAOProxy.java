package com.example.Emp;

import java.util.List;

public class IEmpDAOProxy implements IEmpDAO {

    private DatabaseConnection dbc = null;
    private IEmpDAO dao = null;

    public IEmpDAOProxy() throws Exception {
        dbc = DatabaseConnectionFactory.getDatabaseConnection();
        dao = new EmpDAOImpl(dbc.getConnection());
    }

    @Override
    public boolean doCreate(Emp emp) throws Exception {
        boolean flag = false;
        try {
            if (dao.findById(emp.getEmpno()) == null) {
                System.out.println(flag);

                flag = dao.doCreate(emp);
            }

        } catch (Exception e) {
            throw e;
        } finally {
            dbc.close();
        }

        return flag;
    }

    @Override
    public List<Emp> findAll(String keyWord) throws Exception {
        List<Emp> all = null;

        try {
            all = dao.findAll(keyWord);
        } catch (Exception e) {
            throw e;
        } finally {
            dbc.close();
        }

        return all;
    }

    @Override
    public Emp findById(int empno) throws Exception {
        Emp emp = null;

        try {
            emp = dao.findById(empno);
        } catch (Exception e) {
            throw e;
        } finally {
            dbc.close();
        }


        return emp;
    }
}
