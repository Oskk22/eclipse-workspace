package Modulo5;

//ProfesorOrientacion
@Component
public abstract class ProfesorOrientacion implements Profesor {
	public ProfesorOrientacion() {
		System.out.println("Contructor por defecto");
		}
	
	public ProfesorOrientacion(ExperienciaServicio experienciaServicio) {
		System.out.println("Aconsejar sobre los ejercicios");
		this.experienciaServicio = experienciaServicio;
		}

	@Override
	public String getClase() {
	return "Aconsejar sobre los ejercicios";
}
	@PostConstruct
	public void init() {
		System.out.println("Inicialización Informatica");
		}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destrucción Informatica");
		}
	
	@Override
	public int getExperiencia() {
		return experienciaServicio.getExperiencia();
	}
	private ExperienciaServicio experienciaServicio;
}