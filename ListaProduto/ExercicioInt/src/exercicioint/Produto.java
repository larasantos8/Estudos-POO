package exercicioint;

import sorter.SorteableItem;


public class Produto implements SorteableItem{
    private int cod;
    private String descricao;

    public Produto(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }
    
    @Override
    public int getInt() {
        return 0;
    }

    @Override
    public void printItem() {
        System.out.println("Código: " + cod + "\n" + "Descrição: " + descricao + "\n" );
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
