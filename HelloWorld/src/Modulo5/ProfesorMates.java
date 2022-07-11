package Modulo5;

//ProfesorMates
@Component
public abstract class ProfesorMates implements Profesor {
	public ProfesorMates() {
		System.out.println("Contructor por defecto");
		}
	
	public ProfesorMates(ExperienciaServicio experienciaServicio) {
		System.out.println("Resolver derivadas");
		this.experienciaServicio = experienciaServicio;
		}

	@Override
	public String getClase() {
	return "Resolver derivadas";
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