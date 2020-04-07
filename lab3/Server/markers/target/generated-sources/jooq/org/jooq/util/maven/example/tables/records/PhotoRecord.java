/*
 * This file is generated by jOOQ.
*/
package org.jooq.util.maven.example.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.util.maven.example.tables.Photo;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PhotoRecord extends UpdatableRecordImpl<PhotoRecord> implements Record3<Long, Long, String> {

    private static final long serialVersionUID = -1486738342;

    /**
     * Setter for <code>public.photo.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.photo.id</code>.
     */
    @NotNull
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.photo.marker_id</code>.
     */
    public void setMarkerId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.photo.marker_id</code>.
     */
    @NotNull
    public Long getMarkerId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.photo.uri</code>.
     */
    public void setUri(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.photo.uri</code>.
     */
    @NotNull
    public String getUri() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Photo.PHOTO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Photo.PHOTO.MARKER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Photo.PHOTO.URI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getMarkerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getUri();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getMarkerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUri();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhotoRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhotoRecord value2(Long value) {
        setMarkerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhotoRecord value3(String value) {
        setUri(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhotoRecord values(Long value1, Long value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PhotoRecord
     */
    public PhotoRecord() {
        super(Photo.PHOTO);
    }

    /**
     * Create a detached, initialised PhotoRecord
     */
    public PhotoRecord(Long id, Long markerId, String uri) {
        super(Photo.PHOTO);

        set(0, id);
        set(1, markerId);
        set(2, uri);
    }
}