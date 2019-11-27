package locadora;

public class ListaGames {
    private Game lista[];
    private int count;

    public ListaGames(int capMax) {
        lista = new Game[capMax];
        this.count = 0;
    }
    
    public boolean find(int cod){
    for(int i=0; i<count; i++){
        if(cod == lista[i].getCod())
            return true;
        }
    return false;
    }
    
    public void add(Game g)throws Exception {
        if(count >= lista.length) throw new Exception ("Lista lotada");
        if(find(g.getCod())) throw new Exception ("O código já existe");
        lista[count] = g;
        count++;
        
    }

    public Game[] getLista() {
        return lista;
    }

    public void setLista(Game[] lista) {
        this.lista = lista;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void printAll() {
        for(int i=0; i<count; i++)
            lista[i].print();
    }
    
}
