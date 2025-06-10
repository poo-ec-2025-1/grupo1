import java.util.*;

public class CameraService {
    private Map<Integer, CameraInteligente> cameras = new HashMap<>();

    public void adicionar(CameraInteligente camera) {
        cameras.put(camera.getId(), camera);
    }

    public CameraInteligente buscar(int id) {
        return cameras.get(id);
    }

    public void atualizar(int id, String novoLocal) {
        if (cameras.containsKey(id)) {
            cameras.get(id).setLocal(novoLocal);
        }
    }

    public void deletar(int id) {
        cameras.remove(id);
    }

    public void listarTodas() {
        for (CameraInteligente cam : cameras.values()) {
            System.out.println(cam);
        }
    }
}
