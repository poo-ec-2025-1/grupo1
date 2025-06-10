public class Main {
    public static void main(String[] args) {
        CameraDAO dao = new CameraDAO();

        CameraInteligente c1 = new CameraInteligente(1, "Câmera Entrada", true);
        dao.criar(c1);

        CameraInteligente buscada = dao.buscar();
        System.out.println("Buscada: " + buscada);

        // Atualizar
        buscada.setNome("Câmera Entrada Principal");
        buscada.setLigada(false);
        dao.atualizar(buscada);

        // Listar todas
        System.out.println("Todas as câmeras:");
        for (CameraInteligente cam : dao.listarTodas()) {
            System.out.println(cam);
        }

        // Deletar
        dao.deletar(1);
    }
}
