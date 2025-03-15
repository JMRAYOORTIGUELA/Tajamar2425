package JuegoRuletaRusa;

import java.util.Iterator;

public class Juego {
    private Jugador[] jugadores;
    private Revolver r;
    private boolean finjuego;
    
    public Juego(int njugadores) {
    	this.finjuego=false;
    	jugadores=new Jugador[this.comprobarjugadores(njugadores)];
    	r=new Revolver();
    	crearJugadores();
    }
    private int comprobarjugadores(int n) {
    	if (n<1 || n>6) n=6;
    	return n;
    	
    }
    public void crearJugadores() {
    	for (int i = 0; i < jugadores.length; i++) 	jugadores[i]=new Jugador();
    }
    public void ronda() {
    	for (int i = 0; i < jugadores.length; i++) {
    		jugadores[i].disparar(r);
    		if (!jugadores[i].isVivo()){
    			this.finjuego=true;
    			return;
    		}
    	}
    }
    public boolean finjuego() {    	return this.finjuego;    }
}
