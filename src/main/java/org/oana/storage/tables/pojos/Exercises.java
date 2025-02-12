/*
 * This file is generated by jOOQ.
 */
package org.oana.storage.tables.pojos;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;

import org.oana.storage.tables.interfaces.IExercises;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
@Entity
@Table(
    name = "exercises",
    schema = "public"
)
public class Exercises implements IExercises {

    private static final long serialVersionUID = 1L;

    private UUID id;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private String description;
    private String[] objectives;
    private String materials;
    private Long duration;
    private Long difficultyId;
    private BigDecimal rate;
    private Boolean isPremium;
    private UUID therapistId;

    public Exercises() {}

    public Exercises(IExercises value) {
        this.id = value.getId();
        this.createdAt = value.getCreatedAt();
        this.updatedAt = value.getUpdatedAt();
        this.description = value.getDescription();
        this.objectives = value.getObjectives();
        this.materials = value.getMaterials();
        this.duration = value.getDuration();
        this.difficultyId = value.getDifficultyId();
        this.rate = value.getRate();
        this.isPremium = value.getIsPremium();
        this.therapistId = value.getTherapistId();
    }

    public Exercises(
        UUID id,
        OffsetDateTime createdAt,
        OffsetDateTime updatedAt,
        String description,
        String[] objectives,
        String materials,
        Long duration,
        Long difficultyId,
        BigDecimal rate,
        Boolean isPremium,
        UUID therapistId
    ) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.description = description;
        this.objectives = objectives;
        this.materials = materials;
        this.duration = duration;
        this.difficultyId = difficultyId;
        this.rate = rate;
        this.isPremium = isPremium;
        this.therapistId = therapistId;
    }

    /**
     * Getter for <code>public.exercises.id</code>.
     */
    @Id
    @Column(name = "id", nullable = false)
    @Override
    public UUID getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.exercises.id</code>.
     */
    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for <code>public.exercises.created_at</code>.
     */
    @Column(name = "created_at", nullable = false, precision = 6)
    @Override
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>public.exercises.created_at</code>.
     */
    @Override
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for <code>public.exercises.updated_at</code>.
     */
    @Column(name = "updated_at", nullable = false, precision = 6)
    @NotNull
    @Override
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>public.exercises.updated_at</code>.
     */
    @Override
    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for <code>public.exercises.description</code>.
     */
    @Column(name = "description", nullable = false)
    @NotNull
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>public.exercises.description</code>.
     */
    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for <code>public.exercises.objectives</code>.
     */
    @Column(name = "objectives", nullable = false)
    @NotNull
    @Override
    public String[] getObjectives() {
        return this.objectives;
    }

    /**
     * Setter for <code>public.exercises.objectives</code>.
     */
    @Override
    public void setObjectives(String[] objectives) {
        this.objectives = objectives;
    }

    /**
     * Getter for <code>public.exercises.materials</code>.
     */
    @Column(name = "materials")
    @Override
    public String getMaterials() {
        return this.materials;
    }

    /**
     * Setter for <code>public.exercises.materials</code>.
     */
    @Override
    public void setMaterials(String materials) {
        this.materials = materials;
    }

    /**
     * Getter for <code>public.exercises.duration</code>.
     */
    @Column(name = "duration")
    @Override
    public Long getDuration() {
        return this.duration;
    }

    /**
     * Setter for <code>public.exercises.duration</code>.
     */
    @Override
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * Getter for <code>public.exercises.difficulty_id</code>.
     */
    @Column(name = "difficulty_id")
    @Override
    public Long getDifficultyId() {
        return this.difficultyId;
    }

    /**
     * Setter for <code>public.exercises.difficulty_id</code>.
     */
    @Override
    public void setDifficultyId(Long difficultyId) {
        this.difficultyId = difficultyId;
    }

    /**
     * Getter for <code>public.exercises.rate</code>.
     */
    @Column(name = "rate")
    @Override
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Setter for <code>public.exercises.rate</code>.
     */
    @Override
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * Getter for <code>public.exercises.is_premium</code>.
     */
    @Column(name = "is_premium", nullable = false)
    @Override
    public Boolean getIsPremium() {
        return this.isPremium;
    }

    /**
     * Setter for <code>public.exercises.is_premium</code>.
     */
    @Override
    public void setIsPremium(Boolean isPremium) {
        this.isPremium = isPremium;
    }

    /**
     * Getter for <code>public.exercises.therapist_id</code>.
     */
    @Column(name = "therapist_id", nullable = false)
    @NotNull
    @Override
    public UUID getTherapistId() {
        return this.therapistId;
    }

    /**
     * Setter for <code>public.exercises.therapist_id</code>.
     */
    @Override
    public void setTherapistId(UUID therapistId) {
        this.therapistId = therapistId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Exercises other = (Exercises) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!this.createdAt.equals(other.createdAt))
            return false;
        if (this.updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        }
        else if (!this.updatedAt.equals(other.updatedAt))
            return false;
        if (this.description == null) {
            if (other.description != null)
                return false;
        }
        else if (!this.description.equals(other.description))
            return false;
        if (this.objectives == null) {
            if (other.objectives != null)
                return false;
        }
        else if (!Arrays.deepEquals(this.objectives, other.objectives))
            return false;
        if (this.materials == null) {
            if (other.materials != null)
                return false;
        }
        else if (!this.materials.equals(other.materials))
            return false;
        if (this.duration == null) {
            if (other.duration != null)
                return false;
        }
        else if (!this.duration.equals(other.duration))
            return false;
        if (this.difficultyId == null) {
            if (other.difficultyId != null)
                return false;
        }
        else if (!this.difficultyId.equals(other.difficultyId))
            return false;
        if (this.rate == null) {
            if (other.rate != null)
                return false;
        }
        else if (!this.rate.equals(other.rate))
            return false;
        if (this.isPremium == null) {
            if (other.isPremium != null)
                return false;
        }
        else if (!this.isPremium.equals(other.isPremium))
            return false;
        if (this.therapistId == null) {
            if (other.therapistId != null)
                return false;
        }
        else if (!this.therapistId.equals(other.therapistId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.objectives == null) ? 0 : Arrays.deepHashCode(this.objectives));
        result = prime * result + ((this.materials == null) ? 0 : this.materials.hashCode());
        result = prime * result + ((this.duration == null) ? 0 : this.duration.hashCode());
        result = prime * result + ((this.difficultyId == null) ? 0 : this.difficultyId.hashCode());
        result = prime * result + ((this.rate == null) ? 0 : this.rate.hashCode());
        result = prime * result + ((this.isPremium == null) ? 0 : this.isPremium.hashCode());
        result = prime * result + ((this.therapistId == null) ? 0 : this.therapistId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Exercises (");

        sb.append(id);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(description);
        sb.append(", ").append(Arrays.deepToString(objectives));
        sb.append(", ").append(materials);
        sb.append(", ").append(duration);
        sb.append(", ").append(difficultyId);
        sb.append(", ").append(rate);
        sb.append(", ").append(isPremium);
        sb.append(", ").append(therapistId);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IExercises from) {
        setId(from.getId());
        setCreatedAt(from.getCreatedAt());
        setUpdatedAt(from.getUpdatedAt());
        setDescription(from.getDescription());
        setObjectives(from.getObjectives());
        setMaterials(from.getMaterials());
        setDuration(from.getDuration());
        setDifficultyId(from.getDifficultyId());
        setRate(from.getRate());
        setIsPremium(from.getIsPremium());
        setTherapistId(from.getTherapistId());
    }

    @Override
    public <E extends IExercises> E into(E into) {
        into.from(this);
        return into;
    }
}
