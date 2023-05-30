package org.example.mapper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.util.logging.Logger;

/**
 * Warehouse
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/5/29 19:44
 * @since JDK17
 */

public class MapMenu extends JMenuItem implements ActionListener {
    String winClassName;

    public MapMenu(String text, String winClassName){
        super(text);
        addActionListener(this);
        this.winClassName = winClassName;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MenuItemFunction menuItemFunction;

        try {
            Class clazz = Class.forName("org.example.view." + winClassName);
//            menuItemFunction = (MenuItemFunction) clazz.newInstance();
//            menuItemFunction.execute(this);

//            JInternalFrame frame = (JInternalFrame) clazz.newInstance();
//            frame.setVisible(true);

            Class[] parameterTypes = {String.class};
            Constructor constructor = clazz.getConstructor();

            Object[] parameters = {"1"};
            Object o = constructor.newInstance(parameters);



        }catch (Exception e2) {
            Logger.getGlobal().info("窗口:(" + winClassName + ")没定义!");
            e2.printStackTrace();
        }
    }
}
