public class CameraInteligente {
    private int id;
    private String nome;
    private boolean ligada;

    public CameraInteligente(int id, String nome, boolean ligada) {
        this.id = id;
        this.nome = nome;
        this.ligada = ligada;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    @Override
    public String toString() {
        return "CameraInteligente [id=" + id + ", nome=" + nome + ", ligada=" + ligada + "]";
    }
}
