package principal.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



	@Entity
	@Table(name = "usuario")
	public class Usuario {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private Integer id;
		
		@Column(name= "nombre")
		private String nombre;
		
		
		@Column(name = "usuario")
		private String usuario;
		
		@Column(name = "contraseña")
		private String contraseña;
		
		
		@Column(name = "admin")
		private boolean admin;


		public Usuario() {
		}

		public Usuario(Integer id, String nombre, String usuario, String contraseña, boolean admin) {
			this.id = id;
			this.nombre = nombre;
			this.usuario = usuario;
			this.contraseña = contraseña;
			this.admin = admin;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public String getContraseña() {
			return contraseña;
		}

		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}

		public boolean isAdmin() {
			return admin;
		}

		public void setAdmin(boolean admin) {
			this.admin = admin;
		}

		@Override
		public String toString() {
			return "Usuario [id=" + id + ", nombre=" + nombre + ", usuario=" + usuario + ", contraseña=" + contraseña
					+ ", admin=" + admin + "]";
		}
		
		
		
		
		
		
		
}

