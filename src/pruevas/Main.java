/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruevas;

import java.io.File;

/**
 *
 * @author Edison
 */
public class Main {
    public static void main(String[]args){
        File ruta = new File("C:\\Users\\Edison\\Documents");
        File[]archivos = ruta.listFiles();
        System.out.println("Directorios");
        for (File archivo : archivos) {
            if(archivo.isDirectory()){
              System.out.println(archivo.getName());  
            }           
        }
        System.out.println("");
        System.out.println("Archivos");
        for (File archivo : archivos) {
            if(archivo.isFile()&&!archivo.isHidden()){
              System.out.println(archivo.getName());  
            }           
        }
        System.out.println("");
        System.out.println("Ocultos");
        for (File archivo : archivos) {
            if(archivo.isHidden()){
              System.out.println(archivo.getName());  
            }           
        }
    }
}
