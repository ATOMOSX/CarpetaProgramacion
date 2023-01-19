package juand.poo.interfaces.repositorio.exception.poo.interfaces.modelo;

import java.util.Objects;

public class BaseEntity {

    protected Integer id;
    private static int ultimoId;

    public BaseEntity() {
        this.id = ++ultimoId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity baseEntity = (BaseEntity) o;
        return Objects.equals(id, baseEntity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
