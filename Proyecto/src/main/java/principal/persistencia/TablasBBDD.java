package principal.persistencia;

import principal.modelo.Jugador;
import principal.modelo.Equipo;
import principal.modelo.Partido;
import principal.modelo.Usuario;

public class TablasBBDD {

	public void crearTablas() {
		
		JugadorDAO jugadorDAO = new JugadorDAO();
		EquipoDAO equipoDAO = new EquipoDAO();
		PartidoDAO partidoDAO = new PartidoDAO();
		UsuarioDAO usuariosDAO = new UsuarioDAO();
		
		Usuario u1 = new Usuario();

		u1.setNombre("Sergio");
		u1.setUsuario("sergioag95");
		u1.setAdmin(true);
		
		usuariosDAO.insertarUsuarioJPA(u1);
		
		Equipo e1= new Equipo ("Golden State Warriors");
		Equipo e2= new Equipo ("Cleveland Cavaliers");
		// Creamos Jugadores

		Jugador j1 = new Jugador();
		
		j1.setNombre("Sergio");
		

		
		// Creamos Equipos
		

		
		j1.setEquipo(e1);
		
		
		

		
		

		
		Partido p1 = new Partido ();
		
		p1.setLocal(e1);
		p1.setVisitante(e2);
		p1.setLocal_res(125);
		p1.setVisitante_res(123);		
		
		equipoDAO.insertarEquipoJPA(e1);
		equipoDAO.insertarEquipoJPA(e2);
		
		jugadorDAO.insertarJugadorJPA(j1);
		
		partidoDAO.insertarPartidoJPA(p1);

		



		
		
		
					
					
					
					
					
					
					
					
				}
	}
	

