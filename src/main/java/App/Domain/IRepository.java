package App.Domain;

import java.util.List;

public interface IRepository<Item> {
    public Item create(Item item);

    public int update(Item item);

    public boolean delete(int id);

    public Item get(int id) throws Exception;

    public Item getString(String name) throws Exception;

    public List<Item> get();
}
