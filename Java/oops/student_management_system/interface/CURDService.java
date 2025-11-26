import java.util.List;
public interface CRUDService<T> {
    void add(T obj);
    T getById(int id);
    List<T> getAll();
    void update(int id, T updatedObj);
    void delete(int id);
}