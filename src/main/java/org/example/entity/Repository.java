package org.example.entity;

import lombok.*;

/**
 * WarehouseManagement
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/5/23 14:27
 * @Description 仓库
 * @since JDK17
 */

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Repository {
    /**
     * ID
     */
    int id;
    /**
     * 仓库号
     */
    String warehouseNumber;
    /**
     * 仓库经理，负责人
     */
    String warehouseManagerNumber;
    /**
     * 仓库名称
     */
    String warehouseName;
    /**
     * 地址
     */
    String address;
    /**
     * 描述
     */
    String description;



}