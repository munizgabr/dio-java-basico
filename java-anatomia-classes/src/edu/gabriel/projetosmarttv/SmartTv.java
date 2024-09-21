package edu.gabriel.projetosmarttv;

public class SmartTv {
    boolean power = false;
    int chanel = 1;
    int volume = 25;

    //Método para ligar tv
    public void powerOn(){
        power = true;
    }

    //Método para desligar tv
    public void powerOff(){
        power = false;
    }

    //Método para aumentar volume da tv
    public void increaseVolume(){
        if(volume < 100){
            volume++;
        }
    }

    //Método para diminuir volume da tv
    public void decreaseVolume(){
        if(volume > 0){
            volume--;
        }
    }

    public void increaseChanel(){
        chanel++;
    }
    public void decreaseChanel(){
        chanel--;
    }
    public void changeChanel(int chanel){
        this.chanel = chanel;
    }
}
