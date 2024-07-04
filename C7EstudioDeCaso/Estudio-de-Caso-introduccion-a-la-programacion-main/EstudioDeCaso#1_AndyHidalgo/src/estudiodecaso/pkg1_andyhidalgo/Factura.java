/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiodecaso.pkg1_andyhidalgo;

/**
 *
 * @author Aulas Heredia
 */
public class Factura {
    //Declaramos los atributos de la clase
    private String nombreCliente;
    private int cedulaCliente;
    private int codigo;
    private String monto;
    private String mes;
    private String nombreMes;
    private String producElectricos;
    private String producAutomotrices;
    private String producContruccion;

    //Creamos un metodo para cambiar la variable de integer a String
    public String mesNombre(int mes){
    switch (mes) {
        case 1 -> {
            nombreMes = "Enero";
        }
        case 2 -> {
            nombreMes = "Febrero";
        }
        case 3 -> {
            nombreMes = "Marzo";
        }
        case 4 -> {
            nombreMes = "Abril";
        }
        case 5 -> {
            nombreMes = "Mayo";
        }
        case 6 -> {
            nombreMes = "Junio";
        }
        case 7 -> {
            nombreMes = "Julio";
        }
        case 8 -> {
            nombreMes = "Agosto";
        }
        case 9 -> {
            nombreMes = "Setiembre";
        }
        case 10 -> {
            nombreMes = "Octubre";
        }
        case 11 -> {
            nombreMes = "Noviembre";
        }
        case 12 -> {
            nombreMes = "Diciembre";
        }
        default ->
            throw new AssertionError();
    }
        return nombreMes;
    
}
    //Inicializamos los valores
    public Factura() {
        this.nombreCliente = "Alejandra";
        this.cedulaCliente = 124124124;
        this.codigo = 46543;
        this.monto = "400000";
        this.mes = "4";
        this.producElectricos = "3";
        this.producAutomotrices = "0";
        this.producContruccion = "4";
    }
    
    //Declaramos los setters y getters de nuestra clase

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getNombreMes() {
        return nombreMes;
    }

    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }

    public String getProducElectricos() {
        return producElectricos;
    }

    public void setProducElectricos(String producElectricos) {
        this.producElectricos = producElectricos;
    }

    public String getProducAutomotrices() {
        return producAutomotrices;
    }

    public void setProducAutomotrices(String producAutomotrices) {
        this.producAutomotrices = producAutomotrices;
    }

    public String getProducContruccion() {
        return producContruccion;
    }

    public void setProducContruccion(String producContruccion) {
        this.producContruccion = producContruccion;
    }

   
}