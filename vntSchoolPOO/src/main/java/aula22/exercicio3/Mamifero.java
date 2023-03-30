package aula22.exercicio3;

abstract class Mamifero extends Animal {

    protected String corDoPelo;

    @Override
    void locomover() {

    }

    @Override
    void alimentar() {

    }

    @Override
    void emitirSom() {
        System.out.println("Som de mamifero");

    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }


}
