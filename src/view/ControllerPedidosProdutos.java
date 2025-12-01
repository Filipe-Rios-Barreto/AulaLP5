/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.PedidosProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerPedidosProdutos extends AbstractTableModel {

    private List lstPedProd;

    public void setList(List lstPedidos) {
        this.lstPedProd = lstPedidos;
    }

    public PedidosProdutos getBean(int rowIndex) {
        return (PedidosProdutos) lstPedProd.get(rowIndex);
    }

    public void addBean(PedidosProdutos pedidosProdutos) {
        this.lstPedProd.add(pedidosProdutos);
    }

    public void removeBean(int rowIndex) {
        this.lstPedProd.remove(rowIndex);
    }
    
    @Override
    public int getRowCount() {
        return lstPedProd.size();

    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PedidosProdutos pedidosProdutos = (PedidosProdutos) lstPedProd.get(rowIndex);
        if (columnIndex == 0) {
            return pedidosProdutos.getProdutos().getIdprodutos();
        } else if (columnIndex == 1) {
            return pedidosProdutos.getProdutos().getNome();
        } else if (columnIndex == 2) {
            return pedidosProdutos.getQuantidade();
        } else if (columnIndex == 3) {
            return pedidosProdutos.getValorUnitario();
        } else if (columnIndex == 4) {
            return pedidosProdutos.getQuantidade() * pedidosProdutos.getValorUnitario();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Produto";
        } else if (columnIndex == 2) {
            return "Quantidade";
        } else if (columnIndex == 3) {
            return "Valor Unitário";
        } else if (columnIndex == 4) {
            return "Total";
        }
        return "";
    }

}
