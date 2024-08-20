public class Lobo extends Canido {
    public Lobo() {
        super("Aullido", "Carnívora", "Bosque", "Canis lupus");
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
