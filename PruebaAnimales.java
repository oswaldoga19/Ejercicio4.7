public class PruebaAnimales {
    public static void main(String[] args) {
        Animal[] animales = {
            new Perro(),
            new Lobo(),
            new Leon(),
            new Gato()
        };

        for (Animal animal : animales) {
            System.out.println("Nombre Científico: " + animal.getNombreCientifico());
            System.out.println("Sonido: " + animal.getSonido());
            System.out.println("Alimentos: " + animal.getAlimentos());
            System.out.println("Hábitat: " + animal.getHabitat());
            System.out.println();
        }
    }
}

