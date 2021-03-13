package com.example.Emp;

import com.sun.prism.PresentableState;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpDAOImpl implements IEmpDAO {
    private Connection conn = null;
    private PreparedStatement pstmt = null;

    public EmpDAOImpl(Connection conn) {
        this.conn = conn;
    }


    @Override
    public boolean doCreate(Emp emp) throws Exception {
        boolean flag = false;
        String sql = "INSERT INTO emp(empno, ename, job, hiredate, sal) VALUES (?, ?, ?, ?, ?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, emp.getEmpno());
        pstmt.setString(2, emp.getEname());
        pstmt.setString(3, emp.getJob());
        pstmt.setDate(4, new java.sql.Date(emp.getHiredate().getTime()));
        pstmt.setFloat(5, emp.getSal());

        if (pstmt.executeUpdate() > 0) {
            flag = true;
        }
        assert pstmt != null;
        pstmt.close();

        return false;
    }

    @Override
    public List<Emp> findAll(String keyWord) throws Exception {
        List<Emp> all = new ArrayList<>();
        String sql = "SELECT empno, ename, job, hiredate, sal FROM emp WHERE ename LIKE ? OR job LIKE ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, "%" + keyWord + "%");
        pstmt.setString(2, "%" + keyWord + "%");
        ResultSet rst = pstmt.executeQuery();
        Emp emp = null;
        while (rst.next()) {
            emp = new Emp();
            emp.setEmpno(rst.getInt(1));
            emp.setEname(rst.getString(2));
            emp.setJob(rst.getString(3));
            emp.setHiredate(rst.getDate(4));
            emp.setSal(rst.getFloat(5));
            all.add(emp);
        }

        assert pstmt != null;
        pstmt.close();
        return all;
    }



    @Override
    public Emp findById(int empno) throws Exception {
        Emp emp = null;
        String sql = "SELECT empno, ename, job, hiredate, sal FROM emp WHERE empno = ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, empno);
        ResultSet rst = pstmt.executeQuery();
        if (rst.next()) {
            emp = new Emp();
            emp.setEmpno(rst.getInt(1));
            emp.setEname(rst.getString(2));
            emp.setJob(rst.getString(3));
            emp.setHiredate(rst.getDate(4));
            emp.setSal(rst.getFloat(5));
        }

        assert pstmt != null;
        pstmt.close();
        return emp;
    }
}
