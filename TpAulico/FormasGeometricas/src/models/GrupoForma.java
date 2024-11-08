package models;

// GrupoForma.java
import java.util.ArrayList;
import java.util.List;

public class GrupoForma implements FormaGeometrica {
    private List<FormaGeometrica> formas = new ArrayList<>();

    public void agregar(FormaGeometrica forma) {
        formas.add(forma);
    }

    public void remover(FormaGeometrica forma) {
        formas.remove(forma);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando grupo de formas:");
        
        for (FormaGeometrica forma : formas) {
            forma.dibujar();
        }
    }
}
