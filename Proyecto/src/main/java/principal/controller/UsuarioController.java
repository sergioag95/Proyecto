package principal.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import principal.modelo.Usuario;
import principal.persistencia.UsuarioDAO;

@RequestMapping("/usuarios")
@Controller
public class UsuarioController{
	
	
	UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	
	
	@GetMapping(value= {"","/"})
	String homeusuarios(Model model) {
		
		
		
		//Salir a buscar a la BBDD
		
		ArrayList<Usuario> misUsuarios = usuarioDAO.listarUsuariosJPA();
		model.addAttribute("listaUsuarios", misUsuarios);
		model.addAttribute("usuarioaEditar", new Usuario());
		model.addAttribute("usuarioNuevo", new Usuario());
		
		return "usuarios";
	}
	
	
	@PostMapping("/edit/{id}")
	public String editarUsuario(@PathVariable Integer id, @ModelAttribute("usuarioaEditar") Usuario UsuarioEditado, BindingResult bidingresult) {
		
		Usuario usuarioaEditar = usuarioDAO.bucarPorIdJPA(id);
		
		usuarioaEditar.setNombre(UsuarioEditado.getNombre());
		
		usuarioaEditar.setUsuario(UsuarioEditado.getUsuario());
		
		usuarioaEditar.setAdmin(UsuarioEditado.isAdmin());

		
		usuarioDAO.modificarUsuarioJPA(usuarioaEditar);
		
		
		return "redirect:/usuarios";
	}
	
	@PostMapping("/add")
	public String addUsuario(@ModelAttribute("usuarioNuevo") Usuario UsuarioNew, BindingResult bidingresult) {
		
		usuarioDAO.modificarUsuarioJPA(UsuarioNew);
		
		return "redirect:/usuarios";
	}
	
	
	@GetMapping(value= {"/{id}"})
	String idUsuario(Model model, @PathVariable Integer id) {
		
		//model.addAttribute("UsuarioAMostrar", usuarioDAO.bucarPorIdJPA(id));
		Usuario usuarioaMostrar = usuarioDAO.bucarPorIdJPA(id);
		model.addAttribute("usuarioaMostrar", usuarioaMostrar);
		
		return "usuario";
	}
	
	@GetMapping(value= {"/delete/{id}"})
	String deleteUsuario(Model model, @PathVariable Integer id) {
		
		Usuario aeliminar = usuarioDAO.bucarPorIdJPA(id);
		usuarioDAO.eliminarUsuarioJPA(aeliminar);
		return "redirect:/usuarios";
		
	}
}