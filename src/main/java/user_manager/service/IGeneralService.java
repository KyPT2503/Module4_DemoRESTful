package user_manager.service;

import java.util.List;

public interface IGeneralService<E> {
    List<E> findAll();

    E findById(Long id);

    boolean remove(Long id);

    E add(E e);

    E update(Long id, E e);
}
