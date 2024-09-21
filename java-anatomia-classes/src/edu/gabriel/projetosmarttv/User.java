package edu.gabriel.projetosmarttv;

public class User {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();
        
        smartTv.powerOn();
        System.out.println("A TV está ligada?" + smartTv.power);
        smartTv.increaseVolume();
        System.out.println("O volume da TV está em: " + smartTv.volume);
        smartTv.changeChanel(30);
        System.out.println("O canal da TV está em: " + smartTv.chanel);
        smartTv.powerOff();
        System.out.println("A TV está ligada?" + smartTv.power);
    }
}
