package com.demo_mvc_w7.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

    public ID getId()
    {
        return id;
    }

    public void setId(ID id)
    {
        this.id = id;
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AbstractEntity<?> other = (AbstractEntity<?>) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "id=" + id;
    }
}
