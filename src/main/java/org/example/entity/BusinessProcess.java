package org.example.entity;

import lombok.*;

import java.util.Date;

/**
 * WarehouseManagement
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/5/23 15:12
 * @Description 业务处理基类
 * @since JDK17
 */

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BusinessProcess {
    /**
     * ID
     */
    private int id;
    /**
     * 票据单号
     */
    private String ticketNumber;
    /**
     * 业务类型
     */
    private String businessType;
    /**
     * 仓库号
     */
    private String warehouseNumber;
    /**
     * 货号
     */
    private String itemNumber;
    /**
     * 交易数量
     */
    private double transactionNumber;
    /**
     * 单位
     */
    private String unit;
    /**
     * 平均价格
     */
    private double averagePrice;
    /**
     * 交易数量
     */
    private double totalPrice;
    /**
     * 事物交接部门编号（对方）
     */
    private String departmentNumber;
    /**
     * 事物交接部门负责人（对方）
     */
    private String departmentName;
    /**
     * 交易日期
     */
    private Date transactionDate;
    /**
     * 业务是否已完成
     */
    private boolean done;
    /**
     * 仓库经理员工号
     */
    private String warehouseManagerNumber;
    /**
     * 确认日期
     */
    private Date checkDate;

//    public static void main(String[] args) {
//        BusinessProcess businessProcess = new BusinessProcessBuilder().
//                id(1).ticketNumber("1").
//                businessType("A").
//                warehouseNumber("001").
//                itemNumber("01").
//                departmentNumber("1").
//                departmentName("总经理").
//                itemNumber("A").
//                transactionNumber(123).
//                unit("/").
//                averagePrice(0).
//                totalPrice(2).
//                build();
//
//        System.out.println(businessProcess.toString());
//    }

}