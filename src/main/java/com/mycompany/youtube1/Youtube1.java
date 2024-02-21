
package com.mycompany.youtube1;

public class Youtube1 {

    public static void main(String[] args) {
        Usuario usuario = new Usuario ("Negro");
        Video video = new Video ("Aprendiendo Java",2400, "http;//negro.com");
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();
        
        Usuario usuario2=new Usuario ("Blanco");
        Comentario comment1=new Comentario("Asco de pagina", usuario2);
        System.out.println("El usuario" + usuario2.getNombre()+ "Publico el comentario"+comment1.getContenido());
    }
}