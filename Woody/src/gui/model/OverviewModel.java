package gui.model;

import data.Products;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author emil
 */
public class OverviewModel extends AbstractTableModel {
    
    private final String[] colNames = {"Name", "Preis"};

    @Override
    public int getRowCount() {
        return Products.getInstance().size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: Products.getInstance().get(rowIndex).getName();
            case 1: Products.getInstance().get(rowIndex).getPrice();
            default: throw new RuntimeException("Wrong column index");
        }
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }

}