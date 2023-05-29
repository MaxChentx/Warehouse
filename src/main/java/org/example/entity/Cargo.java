package org.example.entity;

import lombok.*;

/**
 * WarehouseManagement
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/5/23 14:24
 * @Description 货物
 * @since JDK17
 */

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cargo {
    /**
     * 货名
     */
    String nameOfCargo;
    /**
     * 型号
     */
    String model;
    /**
     * 货号
     */
    String itemNumber;
    /**
     * 单位
     */
    String unit;
    /**
     * 库存数量
     */
    double numberOfInventory;
    /**
     * 平均价格
     */
    double averagePrice;
    /**
     * 库存数量
     */
    double totalInventory;


}