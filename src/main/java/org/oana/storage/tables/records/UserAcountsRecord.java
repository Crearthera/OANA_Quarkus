/*
 * This file is generated by jOOQ.
 */
package org.oana.storage.tables.records;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.oana.storage.tables.UserAcounts;
import org.oana.storage.tables.interfaces.IUserAcounts;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
@Entity
@Table(
    name = "user_acounts",
    schema = "public"
)
public class UserAcountsRecord extends UpdatableRecordImpl<UserAcountsRecord> implements IUserAcounts {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.user_acounts.id</code>.
     */
    @Override
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.user_acounts.id</code>.
     */
    @Id
    @Column(name = "id", nullable = false)
    @Override
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.user_acounts.provider_id</code>.
     */
    @Override
    public void setProviderId(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.user_acounts.provider_id</code>.
     */
    @Column(name = "provider_id", nullable = false)
    @NotNull
    @Override
    public UUID getProviderId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>public.user_acounts.created_ad</code>.
     */
    @Override
    public void setCreatedAd(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.user_acounts.created_ad</code>.
     */
    @Column(name = "created_ad", precision = 6)
    @Override
    public LocalDateTime getCreatedAd() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.user_acounts.user_type_id</code>.
     */
    @Override
    public void setUserTypeId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.user_acounts.user_type_id</code>.
     */
    @Column(name = "user_type_id")
    @Override
    public Long getUserTypeId() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUserAcounts from) {
        setId(from.getId());
        setProviderId(from.getProviderId());
        setCreatedAd(from.getCreatedAd());
        setUserTypeId(from.getUserTypeId());
        resetChangedOnNotNull();
    }

    @Override
    public <E extends IUserAcounts> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserAcountsRecord
     */
    public UserAcountsRecord() {
        super(UserAcounts.USER_ACOUNTS);
    }

    /**
     * Create a detached, initialised UserAcountsRecord
     */
    public UserAcountsRecord(UUID id, UUID providerId, LocalDateTime createdAd, Long userTypeId) {
        super(UserAcounts.USER_ACOUNTS);

        setId(id);
        setProviderId(providerId);
        setCreatedAd(createdAd);
        setUserTypeId(userTypeId);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised UserAcountsRecord
     */
    public UserAcountsRecord(org.oana.storage.tables.pojos.UserAcounts value) {
        super(UserAcounts.USER_ACOUNTS);

        if (value != null) {
            setId(value.getId());
            setProviderId(value.getProviderId());
            setCreatedAd(value.getCreatedAd());
            setUserTypeId(value.getUserTypeId());
            resetChangedOnNotNull();
        }
    }
}
