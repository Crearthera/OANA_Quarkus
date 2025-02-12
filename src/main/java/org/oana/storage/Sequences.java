/*
 * This file is generated by jOOQ.
 */
package org.oana.storage;


import org.jooq.Sequence;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * Convenience access to all sequences in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Sequences {

    /**
     * The sequence <code>public.exercise_difficulties_id_seq</code>
     */
    public static final Sequence<Long> EXERCISE_DIFFICULTIES_ID_SEQ = Internal.createSequence("exercise_difficulties_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.tags_id_seq</code>
     */
    public static final Sequence<Long> TAGS_ID_SEQ = Internal.createSequence("tags_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.user_advancements_sequence_number_seq</code>
     */
    public static final Sequence<Long> USER_ADVANCEMENTS_SEQUENCE_NUMBER_SEQ = Internal.createSequence("user_advancements_sequence_number_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>public.user_type_id_seq</code>
     */
    public static final Sequence<Long> USER_TYPE_ID_SEQ = Internal.createSequence("user_type_id_seq", Public.PUBLIC, SQLDataType.BIGINT.nullable(false), null, null, null, null, false, null);
}
