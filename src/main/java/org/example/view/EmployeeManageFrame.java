package org.example.view;

import javax.swing.*;
import java.awt.*;

/**
 * Warehouse
 * 用户管理界面
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/5/29 19:45
 * @since JDK17
 */

public class EmployeeManageFrame extends JInternalFrame {

    public EmployeeManageFrame() {
        // 图书管理系统主界面
        setTitle("图书管理系统主界面");

        setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//        this.setExtendedState(Frame.MAXIMIZED_BOTH);
    }


//    public EmployeeManageFrame() {
//        getContentPane().setBackground(Color.RED);
//        setIconifiable(true);
//        setClosable(true);
//        setTitle("关于Java");
//        setBounds(100, 100, 450, 300);
//
//        JLabel lblNewLabel = new JLabel("");
//
//        GroupLayout groupLayout = new GroupLayout(getContentPane());
//        groupLayout.setHorizontalGroup(
//                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                        .addGroup(groupLayout.createSequentialGroup()
//                                .addGap(98)
//                                .addComponent(lblNewLabel)
//                                .addContainerGap(126, Short.MAX_VALUE))
//        );
//        groupLayout.setVerticalGroup(
//                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                        .addGroup(groupLayout.createSequentialGroup()
//                                .addGap(48)
//                                .addComponent(lblNewLabel)
//                                .addContainerGap(149, Short.MAX_VALUE))
//        );
//        getContentPane().setLayout(groupLayout);
//    }
}
