/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo_s.Producto;

/**
 *
 * @author ale05
 */
public class DProducto {

    private ArrayList<Producto> listProducto = new ArrayList<>();

    public DProducto() {
    }

    public DProducto(ArrayList<Producto> listProducto) {
        this.listProducto = listProducto;
    }

    public ArrayList<Producto> getListProducto() {
        return listProducto;
    }

    public void setListProducto(ArrayList<Producto> listProducto) {
        this.listProducto = listProducto;
    }

    public int agregarProducto(int ID,
            String nom, double precio, double exist) {
        int a = 0;
        Producto produc = new Producto(ID, nom, precio, exist);
        listProducto.add(produc);
        a = 1;
        return a;
    }

    /**
     * Devuelve una tabla con los registros almacenados en el listado de
     * productos
     *
     * @return
     */
    public DefaultTableModel getListProduc() {
        DefaultTableModel dtm = new DefaultTableModel();
        String titulo[] = {"ID", "NOMBRE", "PRECIO",
            "EXISTENCIA"};
        //Asigna los encabezados a mi tabla
        dtm.setColumnIdentifiers(titulo);

        //Estoy usando for each
        for (Producto produc : listProducto) {
            String reg[] = new String[4];
            reg[0] = "" + produc.getID();
            reg[1] = produc.getNombre();
            reg[2] = "" + produc.getPrecio();
            reg[3] = "" + produc.getExistencia();

            dtm.addRow(reg);
        }
        return dtm;
    }
}
