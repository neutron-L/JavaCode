package com.example.Emp;

import jdk.nashorn.internal.runtime.ECMAException;

import java.util.List;

public interface IEmpDAO {
    /*
    * 数据的增加操作
    * @param emp 要增加的对象
    * @return 是否增加成功的标志
    * @throws Exception 有异常交给被调用者处理
    * */
    boolean doCreate(Emp emp) throws Exception;


    /*
     * 查询所有数据
     * @param keyWord 查询关键字
     * @return 返回全部的查询结果
     * @throws Exception 有异常交给被调用者处理
     */

    List<Emp> findAll(String keyWord) throws Exception;

    /*
    * 根据雇员编号查询雇员信息
    * @param empno 雇员编号
    * @return 雇员的vo对象
    * @throws　Eｘｃｅｐｔｉｏｎ　
    * */
    Emp findById(int empno) throws Exception;
}
