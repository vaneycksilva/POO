package questao06;

public class CinemaFacade {

	Amplificador amplificador;
	Tela tela;
	DVDPlayer dvdPlayer;
	Pipoqueira pipoqueira;
	LuzAmbiente luzAmbiente;
	Projetor projetor;
	
	
	public CinemaFacade(LigaveisDesligaveisIF amplificador, Tela tela, LigaveisDesligaveisIF dvdPlayer, LigaveisDesligaveisIF pipoqueira, LigaveisDesligaveisIF luzAmbiente,
			LigaveisDesligaveisIF projetor) {
		
		this.amplificador = (Amplificador) amplificador;
		this.tela = tela;
		this.dvdPlayer = (DVDPlayer) dvdPlayer;
		this.pipoqueira = (Pipoqueira) pipoqueira;
		this.luzAmbiente = (LuzAmbiente) luzAmbiente;
		this.projetor = (Projetor) projetor;
		
	}
	
	
	public void assistirFilme(){
				
		System.out.println("Tudo OK para assistir um filme..\n");
		
		pipoqueira.on();
		pipoqueira.fazerPipoca();
					
		luzAmbiente.on();
		luzAmbiente.luminosidadeBaixa();
					
		tela.descer();
					
		projetor.on();
		projetor.modoWideScreen();
		
		amplificador.on();
		amplificador.somStereo();
		amplificador.setVolume(25);
					
		dvdPlayer.on();
		dvdPlayer.play("Titanic");
		
		System.out.println("========================");
		System.out.println(" vou ver o filme ......");
		System.out.println("========================\n\n\n");
				
		
	}
	
	
	public void pararFilme(){
		
		pipoqueira.off();
		
		luzAmbiente.luminosidadeAlta();
		luzAmbiente.off();
		
		tela.subir();
		
		projetor.modoNormal();
		projetor.off();
		
		amplificador.somNormal();
		amplificador.setVolume(12);
		amplificador.off();
		
		dvdPlayer.pause();
		dvdPlayer.eject();
		dvdPlayer.off();
		
		System.out.println("\n\n========================");
		System.out.println(" fim do filme ......(y)");
		System.out.println("========================");
		
	}
	
	
	
}
