package Modulo5;

//ProfesorInformatica
@Component
public abstract class ProfesorInformatica implements Profesor {
	public ProfesorInformatica() {
		System.out.println("Contructor por defecto");
		}
	
	public ProfesorInformatica(ExperienciaServicio experienciaServicio) {
		System.out.println("Teclear un codigo");
		this.experienciaServicio = experienciaServicio;
		}

	@Override
	public String getClase() {
	return "Teclear un codigo";
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