/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven_cell;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author ACER
 */
public class TableActionCellRender2 extends DefaultTableCellRenderer{
     @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        PannelAction2 action = new PannelAction2();
        if (isSelected == false && row % 2 == 0)
        {
            action.setBackground(Color.WHITE);
        }
        else
        {
            action.setBackground(com.getBackground());
        }
        return action;
    }
}
