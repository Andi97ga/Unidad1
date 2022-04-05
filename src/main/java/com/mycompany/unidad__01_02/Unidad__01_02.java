/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.unidad__01_02;

/**
 *
 * @author PC-18
 */
public class Unidad__01_02 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        var auto1 = new Auto();
        auto1.color="rojo";
        auto1.marca="Hyundai";
        auto1.year=2020;
        auto1.placa="AGH8001";
        auto1.precio= 20999d;
        
        System.out.println(auto1.color+ " / "+
                           auto1.marca+ " / "+
                           auto1.year+ " / "+
                           auto1.placa+ " / "+
                           auto1.precio+ " / ");
        var esTaxi = false;
        esTaxi=auto1.esTaxi();
        if(esTaxi==true){
        System.out.println( "El auto de placa " + auto1.placa + " es un taxi.");
        }else{
              System.out.println( "El auto de placa " + auto1.placa + " No es un taxi.");
        }
          System.out.println( "El auto con presio " + auto1.precio + " debe pagar la tasa solidario de " 
                                + auto1.calcularTasaSolidaria());
        /////////////////////////////////////////
        var auto2 = new Auto();
        auto2.color="amarillo";
        auto2.marca="Chevrolet";
        auto2.year=2021;
        auto2.placa="ABF8087";
        auto2.precio= 22808d;
        
        System.out.println(auto2.color+ " / "+
                           auto2.marca+ " / "+
                           auto2.year+ " / "+
                           auto2.placa+ " / "+
                           auto2.precio+ " / ");
 
        esTaxi=auto2.esTaxi();
        if(esTaxi==true){
            System.out.println( "El auto de placa " + auto2.placa + " es un taxi.");
        }else{
            System.out.println( "El auto de placa " + auto2.placa + " No es un taxi.");
         } 
          System.out.println( "El auto con presio " + auto2.precio + " debe pagar la tasa solidario de " 
                                + auto1.calcularTasaSolidaria());
        
        ////////////////////////////////////////
        var gato1 = new Gato();
        gato1.nombre= "Zeus";
        gato1.raza= "Singapura";
        gato1.peso= 8.8f;
        gato1.edad= 5;
        
        System.out.println(gato1.nombre+ " / "+
                           gato1.raza+ " / "+
                           gato1.peso+ "kg"+"/"+
                           gato1.edad+ "años" + " / ");
        
        
    }
}
