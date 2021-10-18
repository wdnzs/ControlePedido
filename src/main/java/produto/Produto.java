package produto;

/**
 *
 * @author Wilson Diniz Silva
 * <p>Classe responsável pelo entrada e saída de dados relacionados ao produto</p>
 */
public class Produto {
    
    String descricao;
    String categoria;
    double valorUnitario;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }
    
} // Fim da classe Produto
