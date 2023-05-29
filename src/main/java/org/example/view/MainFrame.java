package org.example.view;

import org.example.mapper.MapMenu;
import org.example.mapper.MenuItemFunction;
import org.example.utils.DBUtil;

import javax.swing.*;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Warehouse
 * 主界面
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/5/29 18:32
 * @since JDK17
 */

public class MainFrame extends JFrame {
    final JMenuBar jMenuBar = new JMenuBar();

    /**
     * Create the frame.
     */
    public MainFrame() throws Exception {
        // 图书管理系统主界面
        setTitle("图书管理系统主界面");

        setBounds(100, 100, 800, 400);
        init();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setExtendedState(Frame.MAXIMIZED_BOTH);

    }



    /**
     * 初始化界面的菜单栏
     * @throws Exception how do I know
     */
    private void init() throws Exception {
        // 初始化菜单栏，有四个主菜单项
        JMenu[] menu = new JMenu[4];

        DBUtil database = new DBUtil();
        Connection connection = database.getConnection();

        String sql = "SELECT * FROM menu";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String title = resultSet.getString("title");
                String code = resultSet.getString("itemNumber").trim();

                int length = code.length() / 2 - 1;
                if (resultSet.getInt("isMenu") == 1){
                    menu[length] = new JMenu(title);
                    if (length == 0){
                        jMenuBar.add(menu[length]);
                    }else {
                        menu[length - 1].add(menu[length]);
                    }
                } else {
                    String className = resultSet.getString("classname");
                    MapMenu item = new MapMenu(title, className);
                    menu[length - 1].add(item);
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            database.closeConnection(connection);
            connection.close();
        }
        setJMenuBar(jMenuBar);
    }


}
