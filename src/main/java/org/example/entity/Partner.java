package org.example.entity;

import lombok.*;

/**
 * WarehouseManagement
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/5/23 14:51
 * @Description 合作方
 * @since JDK17
 */

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Partner {
    /**
     * ID
     */
    int id;
    /**
     * 合作方公司编号
     */
    String companyNumber;
    /**
     * 合作方公司名称
     */
    String companyName;
    /**
     * 描述
     */
    String description;
    /**
     * 地址
     */
    String address;




}