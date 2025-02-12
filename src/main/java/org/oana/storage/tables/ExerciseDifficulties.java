/*
 * This file is generated by jOOQ.
 */
package org.oana.storage.tables;


import java.time.OffsetDateTime;
import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.oana.storage.Keys;
import org.oana.storage.Public;
import org.oana.storage.tables.Exercises.ExercisesPath;
import org.oana.storage.tables.records.ExerciseDifficultiesRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ExerciseDifficulties extends TableImpl<ExerciseDifficultiesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.exercise_difficulties</code>
     */
    public static final ExerciseDifficulties EXERCISE_DIFFICULTIES = new ExerciseDifficulties();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExerciseDifficultiesRecord> getRecordType() {
        return ExerciseDifficultiesRecord.class;
    }

    /**
     * The column <code>public.exercise_difficulties.id</code>.
     */
    public final TableField<ExerciseDifficultiesRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.exercise_difficulties.created_at</code>.
     */
    public final TableField<ExerciseDifficultiesRecord, OffsetDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column <code>public.exercise_difficulties.name</code>.
     */
    public final TableField<ExerciseDifficultiesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR, this, "");

    private ExerciseDifficulties(Name alias, Table<ExerciseDifficultiesRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private ExerciseDifficulties(Name alias, Table<ExerciseDifficultiesRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.exercise_difficulties</code> table
     * reference
     */
    public ExerciseDifficulties(String alias) {
        this(DSL.name(alias), EXERCISE_DIFFICULTIES);
    }

    /**
     * Create an aliased <code>public.exercise_difficulties</code> table
     * reference
     */
    public ExerciseDifficulties(Name alias) {
        this(alias, EXERCISE_DIFFICULTIES);
    }

    /**
     * Create a <code>public.exercise_difficulties</code> table reference
     */
    public ExerciseDifficulties() {
        this(DSL.name("exercise_difficulties"), null);
    }

    public <O extends Record> ExerciseDifficulties(Table<O> path, ForeignKey<O, ExerciseDifficultiesRecord> childPath, InverseForeignKey<O, ExerciseDifficultiesRecord> parentPath) {
        super(path, childPath, parentPath, EXERCISE_DIFFICULTIES);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class ExerciseDifficultiesPath extends ExerciseDifficulties implements Path<ExerciseDifficultiesRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> ExerciseDifficultiesPath(Table<O> path, ForeignKey<O, ExerciseDifficultiesRecord> childPath, InverseForeignKey<O, ExerciseDifficultiesRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private ExerciseDifficultiesPath(Name alias, Table<ExerciseDifficultiesRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public ExerciseDifficultiesPath as(String alias) {
            return new ExerciseDifficultiesPath(DSL.name(alias), this);
        }

        @Override
        public ExerciseDifficultiesPath as(Name alias) {
            return new ExerciseDifficultiesPath(alias, this);
        }

        @Override
        public ExerciseDifficultiesPath as(Table<?> alias) {
            return new ExerciseDifficultiesPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<ExerciseDifficultiesRecord, Long> getIdentity() {
        return (Identity<ExerciseDifficultiesRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<ExerciseDifficultiesRecord> getPrimaryKey() {
        return Keys.EXERCISE_DIFFICULTIES_PKEY;
    }

    private transient ExercisesPath _exercises;

    /**
     * Get the implicit to-many join path to the <code>public.exercises</code>
     * table
     */
    public ExercisesPath exercises() {
        if (_exercises == null)
            _exercises = new ExercisesPath(this, null, Keys.EXERCISES__EXERCISES_DIFFICULTY_ID_FKEY.getInverseKey());

        return _exercises;
    }

    @Override
    public ExerciseDifficulties as(String alias) {
        return new ExerciseDifficulties(DSL.name(alias), this);
    }

    @Override
    public ExerciseDifficulties as(Name alias) {
        return new ExerciseDifficulties(alias, this);
    }

    @Override
    public ExerciseDifficulties as(Table<?> alias) {
        return new ExerciseDifficulties(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ExerciseDifficulties rename(String name) {
        return new ExerciseDifficulties(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExerciseDifficulties rename(Name name) {
        return new ExerciseDifficulties(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExerciseDifficulties rename(Table<?> name) {
        return new ExerciseDifficulties(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ExerciseDifficulties where(Condition condition) {
        return new ExerciseDifficulties(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ExerciseDifficulties where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ExerciseDifficulties where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ExerciseDifficulties where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ExerciseDifficulties where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ExerciseDifficulties where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ExerciseDifficulties where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public ExerciseDifficulties where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ExerciseDifficulties whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public ExerciseDifficulties whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
