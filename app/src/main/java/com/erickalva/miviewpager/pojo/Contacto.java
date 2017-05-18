package com.erickalva.miviewpager.pojo;

/**
 * Created by Erick Alva on 01/03/2017.
 */

public class Contacto {

    private int     imgFoto;
    private String  nombre, telefono,mail;

    public Contacto(int imgFoto,String nombre,String telefono,String mail){

        this.imgFoto    =imgFoto;
        this.nombre     =nombre;
        this.telefono   =telefono;
        this.mail       =mail;
    }

    public int getImgFoto() {
        return imgFoto;
    }

    public void setImgFoto(int imgFoto) {
        this.imgFoto = imgFoto;
    }
    //primero va el get (devuelve datos)
    //El get devuelve datos ya registrados en el objeto creado y lo consulta regresandolo con el return

    public String getNombre(){
        return nombre;
    }
    //segundo va el set (obtiene y guarda variables)
    //El set obtiene el valor que se desea cambiar del objeto y lo trata por el argumento y lo guarda en el objeto

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono=telefono;
    }

    public String getMail(){
        return mail;
    }

    public void setMail(String mail){
        this.mail=mail;
    }


}


