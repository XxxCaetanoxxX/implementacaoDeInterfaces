/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Caetano
 */
public class controleRemoto implements controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public controleRemoto() {
        this.volume=50;
        this.ligado=false;
        this.tocando=false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? "+this.getLigado());
        System.out.println("Está tocando? "+this.getTocando());
        System.out.println("Volume: "+this.getVolume());
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVol() {
        if(this.getLigado()==true){
            this.setVolume(this.getVolume()+1);
        }
    }

    @Override
    public void menosVol() {
        if(this.getLigado()==true){
            this.setVolume(this.getVolume()-1);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado()==true && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado()==true && this.getVolume()==0){
            this.setVolume(20);
        }
    }

    @Override
    public void play() {
        if(this.getLigado()==true && this.getTocando()==true){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado()==true && this.getTocando()==true){
            this.setTocando(false);
        }
    }
}
