package com.example.primer_spring.modelos;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="venta")
public class DetalleVenta {
    private String id;
    private String id_venta;
    private String id_zapato;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_venta() {
        return id_venta;
    }

    public void setId_venta(String id_venta) {
        this.id_venta = id_venta;
    }

    public String getId_zapato() {
        return id_zapato;
    }

    public void setId_zapato(String id_zapato) {
        this.id_zapato = id_zapato;
    }  
    
}
