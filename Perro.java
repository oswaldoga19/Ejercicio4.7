public class Perro extends Canido {
    public Perro() {
        super("Ladrido", "Carnívora", "Doméstico", "Canis lupus familiaris");
    }

    @Override
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    @Override
    public String getSonido() {
        return sonido;
    }

    @Override
    public String getAlimentos() {
        return alimentos;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }
}
