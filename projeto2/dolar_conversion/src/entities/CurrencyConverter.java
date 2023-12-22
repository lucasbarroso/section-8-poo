package entities;

public class CurrencyConverter { // fiz um pouco mais genérico do que foi pedido(pelo desafio).
    private String nome_moeda;
    private double iof;
    private double valor_relacionado; //valor relacionado ao dolar
    private double quantidade_dolar;
    

   
    public CurrencyConverter(String nome, double iof, double valor_relacionado, double quantidade_dolar ) { 
        this.nome_moeda = nome;
        this.iof = iof;
        this.valor_relacionado = valor_relacionado;
        this.quantidade_dolar = quantidade_dolar;
        
    }

    public void calculaValor(){
        double valor_total = (quantidade_dolar*valor_relacionado)+(quantidade_dolar*valor_relacionado*iof/100);
        System.out.println("Valor a ser pago em "+getNome_moeda()+": "+valor_total); 
    }

    public String getNome_moeda() {
        return nome_moeda;
    }
    public void setNome_moeda(String nome) {
        this.nome_moeda = nome;
    }
    public double getValor_relacionado() {
        return valor_relacionado;
    }
    public void setValor_relacionado(double valor_relacionado) {
        this.valor_relacionado = valor_relacionado;
    }
    public double getIof() {
        return iof;
    }
    public void setIof(double iof) {
        this.iof = iof;
    }
    public double getQuantidade_dolar() {
        return quantidade_dolar;
    }
    public void setQuantidade_dolar(double quantidade_dolar) {
        this.quantidade_dolar = quantidade_dolar;
    }
    
    
    
}

    