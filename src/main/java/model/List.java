package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Sebastian Thümmel on 12.07.2016.
 */
@Entity
public class List {
    private int listId;

    @Id
    @Column(name = "listId")
    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        List list = (List) o;

        if (listId != list.listId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return listId;
    }
}
