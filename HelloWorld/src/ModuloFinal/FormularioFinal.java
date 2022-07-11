package ModuloFinal;

import java.util.Map;

	public class FormularioFinal {
		
		@GetMapping("/mostrarFormulario3")
		
		public String mostrarFormulario(@RequestHeader("accept-language") String acceptLanguage) {
			System.out.println("El valor de la cabecera accept-language es " + acceptLanguage);
				return "Formulario";
		}
		
		@GetMapping("/mostrarFormulario2")
		public String mostrarFormulario(@RequestHeader Map<String, String> cabeceras) {cabeceras.forEach((clave, valor) -> {
			System.out.println(clave + "" + valor);
				return "Formulario";
		}
			
		@GetMapping("/mostrarFormulario")
		public String mostrarFormulario() {
			return "Formulario";
		}
		
		@PostMapping("/procesarFormulario")
		public String procesarFormulario(HttpServletRequest request, Model model) {
			String nombre = request.getParameter("nombre");
		}
			String mensaje = (nombre == null) ? "undefined" : nombre.toUpperCase(); {
				System.out.println("El valor enviado por el usuario es " + mensaje);
				model.addAttribute("mensaje", mensaje);	
					return "HolaMundo";
		}
			
		@PostMapping
			public String muestraPagina() {
				return "HolaMundo";
			}
	}
}
