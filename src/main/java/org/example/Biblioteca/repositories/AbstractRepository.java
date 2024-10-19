package org.example.Biblioteca.repositories;

import lombok.RequiredArgsConstructor;
import org.example.Biblioteca.configs.EntityManagerPostgres;
import java.lang.reflect.ParameterizedType;
import java.util.List;

@RequiredArgsConstructor
public abstract class AbstractRepository<T> {

    protected final EntityManagerPostgres<T> entityManagerPostgres;

    private final Class<T> tClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    public void create(T entity) {
        entityManagerPostgres.save(entity);
        System.out.println("Entidad creada");
    }

    public List<T> findAll() {
        return entityManagerPostgres.listAll(
                "SELECT d FROM " + tClass.getSimpleName() + " d",
                tClass);
    }

    public T findById(Object id) {
        return entityManagerPostgres.findEntityById(id, tClass);
    }

    // Cerrar el EntityManagerFactory cuando haya terminado.
    public void close() {
        if (entityManagerPostgres.getEntityManager() != null) {
            entityManagerPostgres.getEntityManager().close();
        }
    }
}