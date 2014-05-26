
/**
 * Escreva a descrição da classe Poupanca aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Poupanca extends ContaAbstrata{
    
    private double rendimento; //Especifico de poupanca. 
    

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }
   
}
