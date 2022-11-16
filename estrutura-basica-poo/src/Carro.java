class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    Carro(String modelo, String cor, int capacidadeTanque){
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }

    Carro(){

    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return  capacidadeTanque;
    }

    double ValorTotalEncherTanque(double valorGasolina){
        double valor = capacidadeTanque * valorGasolina;
        return valor;
    }
}
