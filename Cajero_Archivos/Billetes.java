/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero_Archivos;

/**
 *
 * @author lunar
 */
public class Billetes {
    private int cantidad100;
    private int cantidad200;
    private int cantidad500;
    private int cantidad1000;

    public Billetes() {
        this.cantidad100 = 100;
        this.cantidad200 = 100;
        this.cantidad500 = 20;
        this.cantidad1000 = 10;
    }

    public int getCantidad(int denominacion) {
        switch (denominacion) {
            case 100:
                return cantidad100;
            case 200:
                return cantidad200;
            case 500:
                return cantidad500;
            case 1000:
                return cantidad1000;
            default:
                return 0;
        }
    }

    public void setCantidad(int denominacion, int cantidad) {
        switch (denominacion) {
            case 100:
                cantidad100 = cantidad;
                break;
            case 200:
                cantidad200 = cantidad;
                break;
            case 500:
                cantidad500 = cantidad;
                break;
            case 1000:
                cantidad1000 = cantidad;
                break;
        }
    }

}
