package com.example.primer_spring.modelos;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="venta")
public class Venta {
    private String id;
    private String id_venta;
    private String id_comprador;
    private String id_vendedor;

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

    public String getId_comprador() {
        return id_comprador;
    }

    public void setId_comprador(String id_comprador) {
        this.id_comprador = id_comprador;
    }

    public String getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(String id_vendedor) {
        this.id_vendedor = id_vendedor;
    }
    
    
}
