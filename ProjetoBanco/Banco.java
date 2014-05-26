import java.util.*;

public class Banco{
    private String nome;
    private int numero;
    private List<Agencia> agencias = new ArrayList<Agencia>();
    
    
    public void cadastrarAgencia(Agencia agencia){
        agencias.add(agencia);
    }
    
    public Agencia pesquisarAgenciaPorNumero(int numero){
        for(Agencia agencia : agencias){
            if (agencia.getNumero() == numero){
                return agencia;
            }
        }
        throw new RuntimeException("Agencia não encontrada: " + numero);
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    
}
