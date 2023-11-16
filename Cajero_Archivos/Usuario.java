/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package Cajero_Archivos;


/**
 *
 * @author lunar
 */
public class Usuario {
    private String nombre;
    private String nip;
    private int saldo;

    public Usuario(String nombre, String nip, int saldo) {
        this.nombre = nombre;
        this.nip = nip;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNip() {
        return nip;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}



