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

    /**
     * 菜单栏
     */
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
        // 初始化菜单栏，有四个主菜单项，其实下面的数字取决于菜单级，这里改成2也行
        JMenu[] menu = new JMenu[4];

        // 数据库连接
        DBUtil database = new DBUtil();
        Connection connection = database.getConnection();

        // 搜索全部菜单表信息
        String sql = "SELECT * FROM menu";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            // 表格全部信息保存到resultSet
            ResultSet resultSet = preparedStatement.executeQuery();

            // 遍历 逐行读取title、itemNumber
            while (resultSet.next()) {
                // 菜单中文名
                String title = resultSet.getString("title");
                // 菜单项编号，去空格
                String itemNumber = resultSet.getString("itemNumber").trim();
                // 编号长度减半
                int length = itemNumber.length() / 2 - 1;

                // 如果是主菜单项
                if (resultSet.getInt("isMenu") == 1){
                    // 把menu添加到菜单栏
                    menu[length] = new JMenu(title);
                    /*
                     * 此处的添加菜单项似乎有些重复了
                     * 当 resultSet.getInt("isMenu") == 1 时，其实已经可以确定这是个主菜单项
                     * 所以此时可以直接把 menu[length] 添加到菜单栏
                     */
                    if (length == 0){
                        jMenuBar.add(menu[length]);
                    }else {
                        menu[length - 1].add(menu[length]);
                    }
                } else {    // 此分支表示当前为子菜单项
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
