public class Main {
    public static void main(String[] args) {
        CameraDAO dao = new CameraDAO();

        // Criar
        CameraInteligente c1 = new CameraInteligente(1, "Câmera Entrada", true);
        dao.criar(c1);

        // Buscar
        CameraInteligente buscada = dao.buscar(1);
        System.out.println("Buscada: " + buscada);

        // Atualizar
        buscada.setNome("Câmera Entrada Principal");
        buscada.setLigada(false);
        dao.atualizar(buscada);

        // Listar
        System.out.println("Todas as câmeras:");
        for (CameraInteligente cam : dao.listarTodas()) {
            System.out.println(cam);
        }

        // Deletar
        dao.deletar(1);
        System.out.println("Deletado. Lista atual:");
        for (CameraInteligente cam : dao.listarTodas()) {
            System.out.println(cam);
        }
    }
}
