public class CameraInteligente {
    private int id;
    private String local;

    public CameraInteligente(int id, String local) {
        this.id = id;
        this.local = local;
    }

    public int getId() { return id; }
    public String getLocal() { return local; }

    public void setLocal(String local) { this.local = local; }

    @Override
    public String toString() {
        return "Camera #" + id + " instalada em: " + local;
    }
}
