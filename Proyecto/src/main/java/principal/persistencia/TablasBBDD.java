package principal.persistencia;

import principal.modelo.Jugador;
import principal.modelo.Equipo;
import principal.modelo.Partido;

public class TablasBBDD {

	public void crearTablas() {
		
		JugadorDAO jugadorDAO = new JugadorDAO();
		EquipoDAO equipoDAO = new EquipoDAO();
		PartidoDAO partidoDAO = new PartidoDAO();
		UsuarioDAO usuariosDAO = new UsuarioDAO();
		

		Equipo e1= new Equipo ("Golden State Warriors");
		Equipo e2= new Equipo ("Cleveland Cavaliers");
		// Creamos Jugadores

		Jugador j1 = new Jugador("Stephen Curry", "PG");
		Jugador j2 = new Jugador("Klay Thompson", "SG");
		Jugador j3 = new Jugador("Andrew Wiggins", "SF");
		Jugador j4 = new Jugador("Draymond Green", "PF");
		Jugador j5 = new Jugador("Jordan Poole", "PG");

		Jugador j6 = new Jugador("Ricky Rubio", "PG");

		
		// Creamos Equipos
		

		
		j1.setEquipo(e1);
		j2.setEquipo(e1);
		j3.setEquipo(e1);
		j4.setEquipo(e1);
		j5.setEquipo(e1);
		j6.setEquipo(e2);
		
		

		
		

		
		Partido p1 = new Partido ();
		
		p1.setLocal(e1);
		p1.setVisitante(e2);
		p1.setLocal_res(125);
		p1.setVisitante_res(123);		
		
		equipoDAO.insertarEquipoJPA(e1);
		equipoDAO.insertarEquipoJPA(e2);
		
		jugadorDAO.insertarJugadorJPA(j1);
		jugadorDAO.insertarJugadorJPA(j2);
		jugadorDAO.insertarJugadorJPA(j3);
		jugadorDAO.insertarJugadorJPA(j4);
		jugadorDAO.insertarJugadorJPA(j5);
		jugadorDAO.insertarJugadorJPA(j6);
		partidoDAO.insertarPartidoJPA(p1);

		



		
		
		
					
					
					
					
					
					
					
					
				}
	}
	

