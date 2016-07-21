package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Sebastian Thümmel on 12.07.2016.
 */
@Entity
@Table(name = "list_entry", schema = "einkaufsliste", catalog = "")
public class ListEntry {
    private int entryId;

    @Id
    @Column(name = "entryId")
    public int getEntryId() {
        return entryId;
    }

    public void setEntryId(int entryId) {
        this.entryId = entryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListEntry listEntry = (ListEntry) o;

        if (entryId != listEntry.entryId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return entryId;
    }
}
