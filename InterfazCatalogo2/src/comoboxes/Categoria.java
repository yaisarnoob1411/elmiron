
package comoboxes;


public class Categoria {
    private int cat;
    private String genero;

    public Categoria(int cat, String genero) {
        this.cat = cat;
        this.genero = genero;
    }

    public int getCat() {
        return cat;
    }

    public void setCat(int cat) {
        this.cat = cat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
