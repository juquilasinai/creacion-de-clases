package com.mycompany.youtube1;

public class Usuario {
    public String  nombre;
    public Video videoSubido;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Video getVideosubido() {
        return videoSubido;
    }

    public void subirVideo (Video video) {
        this.videoSubido = video;
    }
    
    public void mostrarInfoUsuario() {
        System.out.println("Usuario: " + nombre);
        if (videoSubido != null) {
            System.out.println("Último video subido: " + videoSubido.getTitulo());
        } else {
                    System.out.println("Aún no ha subido ningún video.");
                    }
        }
    }