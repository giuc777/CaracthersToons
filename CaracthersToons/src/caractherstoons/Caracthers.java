/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caractherstoons;

/**
 *
 * @author Gadiel Us
 */
public class Caracthers {
    private String nombre, ataque, defensa, imagen, tituloAtaqueEspecial, AtaqueEspecial;
    private int red;
    private int green;
    private int blue ;
    
    public Caracthers(String nombre, String  ataque, String  defensa, String  imagen, String  tituloAtaqueEspecial,String AtaqueEspecial, int red, int green, int blue){
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.imagen = imagen ;
        this.tituloAtaqueEspecial = tituloAtaqueEspecial;
        this.AtaqueEspecial = AtaqueEspecial;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    
    public String getName(){
        return nombre;
    }
    public String getAtaque(){
        return ataque;
    }
    public String getDefensa(){
        return defensa;
    }
    public String getImagen(){
        return imagen;
    }
    public String getTituloAtaqueEspecial(){
        return tituloAtaqueEspecial;
    }
    public String getAtaqueEspecial(){
        return AtaqueEspecial;
    }
    public int getRed(){
        return red;
    }
    public int getGreen(){
        return green;
    }
    public int getBlue(){
        return blue;
    }
    
}


