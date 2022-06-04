package az.topaz.ticketservice.repository;

import java.util.List;

public interface CrudRepository<T> {

    T create(T record);

    T findById(Long id);

    List<T> findAll();

    T update(Long id, T record);
}
