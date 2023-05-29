package org.example.dao;


import org.example.entity.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 用户Dao层
 *
 * @author MaxBrooks 15905898514@163.com
 * since jdk17
 * @version 2022/12/18 23:55
 */
public class EmployeeDao {

    /**
     * 登录验证
     * @param connection    数据库链接
     * @param employee  用户
     * @return  resultEmployee
     * @throws Exception    how do I know
     */
    public Employee login(Connection connection, Employee employee) throws Exception{
        Employee resultEmployee = null;
        String sql = "SELECT * FROM employeeInfoSheet where employeeNumber = ? and password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, employee.getEmployeeNumber());
        preparedStatement.setString(2, employee.getPassword());
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()){
            resultEmployee = new Employee();
            resultEmployee.setId(resultSet.getInt("id"));
            resultEmployee.setEmployeeNumber(resultSet.getString("employeeNumber"));
            resultEmployee.setPassword(resultSet.getString("password"));
        }
        return resultEmployee;
    }
}
