package org.example.entity;

import lombok.*;

import java.util.Date;

/**
 * WarehouseManagement
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/5/23 14:25
 * @Description 员工
 * @since JDK17
 */

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    /**
     * 员工ID
     */
    int id;
    /**
     * 员工号
     */
    String employeeNumber;
    /**
     * 密码
     */
    String password;
    /**
     * 员工姓名
     */
    String name;
    /**
     * 职位
     */
    String position;
    /**
     * 是否在职
     */
    boolean inOffice;
    /**
     * 性别，T-男，F-女
     */
    boolean sex;
    /**
     * 年龄，0~100
     */
    int age;
    /**
     * 联系方式
     */
    String contact;
    /**
     * 薪资
     */
    double salary;
    /**
     * 入职日期
     */
    Date dateOfEntry;
    /**
     * 离职日期
     */
    Date dateOfDeparture;

    public Employee(String employeeNumber, String password) {
        this.employeeNumber = employeeNumber;
        this.password = password;
    }
}