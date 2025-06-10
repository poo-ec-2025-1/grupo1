public class Main {
    public static void main(String[] args) {
        CameraService servico = new CameraService();

        servico.adicionar(new CameraInteligente(1, "Entrada principal"));
        servico.adicionar(new CameraInteligente(2, "Garagem"));

        servico.listarTodas();

        System.out.println("\nAtualizando localização...");
        servico.atualizar(1, "Recepção");
        servico.listarTodas();

        System.out.println("\nRemovendo câmera 2...");
        servico.deletar(2);
        servico.listarTodas();
    }
}
