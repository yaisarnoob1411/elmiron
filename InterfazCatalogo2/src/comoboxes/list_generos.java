
package comoboxes;

import java.util.ArrayList;


public class list_generos {
    ArrayList<Categoria>list;
    
    public list_generos(){
        list=new ArrayList();
    }
    public void agregar_generos(Categoria c){
        list.add(c);
    }
    
}
