package org.example.view;

import javax.swing.*;
import java.awt.*;

/**
 * Warehouse
 * 入库界面
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/5/30 8:40
 * @since JDK17
 */

public class InboundFrame extends JInternalFrame {

    public InboundFrame() {
        getContentPane().setBackground(Color.RED);
        setIconifiable(true);
        setClosable(true);
        setTitle("关于Java");
        setBounds(100, 100, 450, 300);

        JLabel lblNewLabel = new JLabel("");

        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(98)
                                .addComponent(lblNewLabel)
                                .addContainerGap(126, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(48)
                                .addComponent(lblNewLabel)
                                .addContainerGap(149, Short.MAX_VALUE))
        );
        getContentPane().setLayout(groupLayout);
    }

}
