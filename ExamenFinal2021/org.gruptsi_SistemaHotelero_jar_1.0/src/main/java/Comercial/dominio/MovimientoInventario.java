/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comercial.dominio;

/**
 *
 * @author Diana
 */
public class MovimientoInventario {
    
    String Pk_movimiento_inventario;
    String codigo_bodega;
    String codigo_unidad;
    String cantidad_existencia;

    public String getPk_movimiento_inventario() {
        return Pk_movimiento_inventario;
    }

    public void setPk_movimiento_inventario(String Pk_movimiento_inventario) {
        this.Pk_movimiento_inventario = Pk_movimiento_inventario;
    }

    public String getCodigo_bodega() {
        return codigo_bodega;
    }

    public void setCodigo_bodega(String codigo_bodega) {
        this.codigo_bodega = codigo_bodega;
    }

    public String getCodigo_unidad() {
        return codigo_unidad;
    }

    public void setCodigo_unidad(String codigo_unidad) {
        this.codigo_unidad = codigo_unidad;
    }

    public String getCantidad_existencia() {
        return cantidad_existencia;
    }

    public void setCantidad_existencia(String cantidad_existencia) {
        this.cantidad_existencia = cantidad_existencia;
    }

       
}
