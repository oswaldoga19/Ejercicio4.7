public class Gato extends Felino {
    public Gato() {
        super("Maullido", "Ratones", "Doméstico", "Felis silvestris catus");
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
