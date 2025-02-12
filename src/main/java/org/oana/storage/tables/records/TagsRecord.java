/*
 * This file is generated by jOOQ.
 */
package org.oana.storage.tables.records;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.oana.storage.tables.Tags;
import org.oana.storage.tables.interfaces.ITags;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
@Entity
@Table(
    name = "tags",
    schema = "public"
)
public class TagsRecord extends UpdatableRecordImpl<TagsRecord> implements ITags {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.tags.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tags.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tags.created_at</code>.
     */
    @Override
    public void setCreatedAt(OffsetDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tags.created_at</code>.
     */
    @Column(name = "created_at", nullable = false, precision = 6)
    @Override
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(1);
    }

    /**
     * Setter for <code>public.tags.name</code>.
     */
    @Override
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.tags.name</code>.
     */
    @Column(name = "name", nullable = false)
    @NotNull
    @Override
    public String getName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ITags from) {
        setId(from.getId());
        setCreatedAt(from.getCreatedAt());
        setName(from.getName());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends ITags> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TagsRecord
     */
    public TagsRecord() {
        super(Tags.TAGS);
    }

    /**
     * Create a detached, initialised TagsRecord
     */
    public TagsRecord(Long id, OffsetDateTime createdAt, String name) {
        super(Tags.TAGS);

        setId(id);
        setCreatedAt(createdAt);
        setName(name);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised TagsRecord
     */
    public TagsRecord(org.oana.storage.tables.pojos.Tags value) {
        super(Tags.TAGS);

        if (value != null) {
            setId(value.getId());
            setCreatedAt(value.getCreatedAt());
            setName(value.getName());
            resetChangedOnNotNull();
        }
    }
}
