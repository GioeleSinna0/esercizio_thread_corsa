package com.example;

import java.util.Random;

public class Corridore extends Thread{
    private String nome;

    public Corridore(String nome){
        this.nome = nome;
    }

    @Override
    public void run(){
        for(int i = 1;i <= 5;i++){
            System.out.println("Corridore " + this.nome + " ha fatto il passo " + i); 
            try{
                int nRandom = new Random().nextInt((800 - 200) + 1) + 200;
                Thread.sleep(nRandom);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }   
        }
        System.out.println("il corridore " + this.nome + " e' arrivato al traguardo");
    }
}
