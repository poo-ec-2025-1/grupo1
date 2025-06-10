public class Main {
    public static void main(String[] args) {
        CameraDAO dao = new CameraDAO();

        CameraInteligente c1 = new CameraInteligente(1, "Câmera Entrada", true);
        dao.criar(c1);

        CameraInteligente buscada = dao.buscar();
        System.out.println("Buscada: " + buscada);

        buscada.setNome("Câmera Entrada Principal");
        buscada.setLigada(false);
        dao.atualizar(buscada);

        System.out.println("Todas as câmeras:");
        for (CameraInteligente cam : dao.listarTodas()) {
            System.out.println(cam);
        }

        dao.deletar(1);
        System.out.println("Câmera com ID 1 deletada.");
    }
}
