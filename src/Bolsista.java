public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("bolsa renovada");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("mensalidade de " + this.getNome() + " paga");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolsista{" + this.getNome()+
                "bolsa=" + bolsa +
                '}';
    }
}
