package project.vehicle.management.dto;
/**
 * 
 * @author Sana
 *
 */

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractCellEditor;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class RadioButton extends AbstractCellEditor implements TableCellRenderer, TableCellEditor, ActionListener {

    private JRadioButton radioButton;

    public RadioButton() {
        this.radioButton = new JRadioButton();
        radioButton.addActionListener(this);
        radioButton.setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        radioButton.setSelected(Boolean.TRUE.equals(value));
        return radioButton;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        radioButton.setSelected(Boolean.TRUE.equals(value));
        return radioButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        stopCellEditing();
    }

    @Override
    public Object getCellEditorValue() {
        return radioButton.isSelected();
    }

}