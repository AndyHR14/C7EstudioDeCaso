/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiodecaso.pkg1_andyhidalgo;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class EstudioDeCaso1_AndyHidalgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Estudio de Caso #1 Introduccion a la Programacion
        /*
        La clase main representa el sistema de control de facturas de la empresa
         */

        String cantFacturas;
        int cantFacturasNum;
        double comision = 0;
        String bonoExtra = "";
        int cedula;
        int codigo;
        int mes;
        double monto = 0;
        int producElectricos;
        int producAutomotrices;
        int producConstruccion;
        
        
        //Llamamos las variables de las distintas clases y las transformamos a su respectivo tipo para poder trabajarlas
        cantFacturas = JOptionPane.showInputDialog("Ingrese la cantidad de facturas realizadas en el mes: ");
        cantFacturasNum = Integer.parseInt(cantFacturas);
        Factura factura = new Factura();
        factura.setMes(JOptionPane.showInputDialog("Ingrese el mes en el que se realizaron las facturas: "));
        mes = Integer.parseInt(factura.getMes());
        AgenteVendedor agenteVendedor = new AgenteVendedor();
        agenteVendedor.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del agente: "));
        agenteVendedor.setCedula(JOptionPane.showInputDialog("La cedula del agente vendedor es: "));
        cedula = Integer.parseInt(agenteVendedor.getCedula());
        agenteVendedor.setCodigo(JOptionPane.showInputDialog("Ingrese el codigo del agente: "));
        codigo = Integer.parseInt(agenteVendedor.getCodigo());
        agenteVendedor.setVehiculo(JOptionPane.showInputDialog("El agente tiene vehiculo? Si/No; "));
        agenteVendedor.setSucursal(JOptionPane.showInputDialog("Ingrese la sucursal del agente: "));
        
        
        //Con la cantidad de facturas ejecutamos el comando for
        
        for (int i = 0; i < cantFacturasNum; i++) {
            factura.setMonto(JOptionPane.showInputDialog("Ingrese el monto obtenido con las ventas: "));
            monto = Double.parseDouble(factura.getMonto());
            factura.setProducElectricos(JOptionPane.showInputDialog("Ingrese la cantidad de productos electricos vendidos: "));
            producElectricos = Integer.parseInt(factura.getProducElectricos());
            factura.setProducAutomotrices(JOptionPane.showInputDialog("Ingrese la cantidad de productos automotrices vendidos: "));
            producAutomotrices = Integer.parseInt(factura.getProducAutomotrices());
            factura.setProducContruccion(JOptionPane.showInputDialog("Ingrese la cantidad de productos de construccion vendidos: "));
            producConstruccion = Integer.parseInt(factura.getProducContruccion());
            
            if (producAutomotrices > 1 && producConstruccion > 1 && producElectricos > 1) {
                agenteVendedor.puntos += 3;
                comision = (monto * 0.1);
                bonoExtra = "";
            } else {
                if (producElectricos >= 3) {
                    agenteVendedor.puntos += 1;
                    comision = (monto * 0.04);
                    bonoExtra = "No";
                } else if (producElectricos > 0) {
                    agenteVendedor.puntos += 1;
                    comision = (monto * 0.02);
                    bonoExtra = "No";
                }
                if (producAutomotrices > 4) {
                    agenteVendedor.puntos += 1;
                    comision = (monto * 0.04);
                    bonoExtra = "No";
                } else if (producAutomotrices > 0) {
                    agenteVendedor.puntos += 1;
                    comision = (monto * 0.02);
                    bonoExtra = "No";
                }
                if (producConstruccion > 0) {
                    agenteVendedor.puntos += 2;
                    comision = (monto * 0.08);
                    bonoExtra = "No";
                }
                if (monto > 50000) {
                    agenteVendedor.puntos += 1;
                    comision = (monto * 0.05);
                    bonoExtra = "No";
                }
                if (cantFacturasNum > 10 || monto > 300000) {
                    comision += 20000;
                    bonoExtra = "Si";

                }
            }
        }
        monto += comision;

        String nombreMes = factura.mesNombre(mes);
        System.out.println("El vendedor \"" + agenteVendedor.getNombre() + "\" codigo: " + agenteVendedor.getCodigo() + " en el mes de " + nombreMes);

        //Mostramos los datos recabados anteriormente
        System.out.println("Vendio un total de " + monto + " en facturas");
        System.out.println("Obtuvo un total en comisiones de: " + comision);
        System.out.println("El agente vendedor " + bonoExtra + " logro el objetivo del Bono Extra");
        System.out.println("Puntos obtenidos por el vendedor: " + agenteVendedor.puntos);
        System.out.println("El agente vendedor " + agenteVendedor.getVehiculo() + " cuenta con vehiculo propio");
        System.out.println("Sucursal " + agenteVendedor.getSucursal());
        
        }
    }

