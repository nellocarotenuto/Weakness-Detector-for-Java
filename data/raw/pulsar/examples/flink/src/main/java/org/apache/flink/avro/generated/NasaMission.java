/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.flink.avro.generated;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class NasaMission extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3345467763476430361L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NasaMission\",\"namespace\":\"org.apache.flink.avro.generated\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"start_year\",\"type\":[\"int\",\"null\"]},{\"name\":\"end_year\",\"type\":[\"int\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<NasaMission> ENCODER =
      new BinaryMessageEncoder<NasaMission>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<NasaMission> DECODER =
      new BinaryMessageDecoder<NasaMission>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<NasaMission> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<NasaMission> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<NasaMission>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this NasaMission to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a NasaMission from a ByteBuffer. */
  public static NasaMission fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.Integer start_year;
  @Deprecated public java.lang.Integer end_year;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public NasaMission() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param name The new value for name
   * @param start_year The new value for start_year
   * @param end_year The new value for end_year
   */
  public NasaMission(java.lang.Integer id, java.lang.CharSequence name, java.lang.Integer start_year, java.lang.Integer end_year) {
    this.id = id;
    this.name = name;
    this.start_year = start_year;
    this.end_year = end_year;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return start_year;
    case 3: return end_year;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: start_year = (java.lang.Integer)value$; break;
    case 3: end_year = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Integer value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'start_year' field.
   * @return The value of the 'start_year' field.
   */
  public java.lang.Integer getStartYear() {
    return start_year;
  }

  /**
   * Sets the value of the 'start_year' field.
   * @param value the value to set.
   */
  public void setStartYear(java.lang.Integer value) {
    this.start_year = value;
  }

  /**
   * Gets the value of the 'end_year' field.
   * @return The value of the 'end_year' field.
   */
  public java.lang.Integer getEndYear() {
    return end_year;
  }

  /**
   * Sets the value of the 'end_year' field.
   * @param value the value to set.
   */
  public void setEndYear(java.lang.Integer value) {
    this.end_year = value;
  }

  /**
   * Creates a new NasaMission RecordBuilder.
   * @return A new NasaMission RecordBuilder
   */
  public static org.apache.flink.avro.generated.NasaMission.Builder newBuilder() {
    return new org.apache.flink.avro.generated.NasaMission.Builder();
  }

  /**
   * Creates a new NasaMission RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new NasaMission RecordBuilder
   */
  public static org.apache.flink.avro.generated.NasaMission.Builder newBuilder(org.apache.flink.avro.generated.NasaMission.Builder other) {
    return new org.apache.flink.avro.generated.NasaMission.Builder(other);
  }

  /**
   * Creates a new NasaMission RecordBuilder by copying an existing NasaMission instance.
   * @param other The existing instance to copy.
   * @return A new NasaMission RecordBuilder
   */
  public static org.apache.flink.avro.generated.NasaMission.Builder newBuilder(org.apache.flink.avro.generated.NasaMission other) {
    return new org.apache.flink.avro.generated.NasaMission.Builder(other);
  }

  /**
   * RecordBuilder for NasaMission instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NasaMission>
    implements org.apache.avro.data.RecordBuilder<NasaMission> {

    private int id;
    private java.lang.CharSequence name;
    private java.lang.Integer start_year;
    private java.lang.Integer end_year;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.flink.avro.generated.NasaMission.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.start_year)) {
        this.start_year = data().deepCopy(fields()[2].schema(), other.start_year);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.end_year)) {
        this.end_year = data().deepCopy(fields()[3].schema(), other.end_year);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing NasaMission instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.flink.avro.generated.NasaMission other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.start_year)) {
        this.start_year = data().deepCopy(fields()[2].schema(), other.start_year);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.end_year)) {
        this.end_year = data().deepCopy(fields()[3].schema(), other.end_year);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Integer getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public org.apache.flink.avro.generated.NasaMission.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public org.apache.flink.avro.generated.NasaMission.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public org.apache.flink.avro.generated.NasaMission.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public org.apache.flink.avro.generated.NasaMission.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'start_year' field.
      * @return The value.
      */
    public java.lang.Integer getStartYear() {
      return start_year;
    }

    /**
      * Sets the value of the 'start_year' field.
      * @param value The value of 'start_year'.
      * @return This builder.
      */
    public org.apache.flink.avro.generated.NasaMission.Builder setStartYear(java.lang.Integer value) {
      validate(fields()[2], value);
      this.start_year = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'start_year' field has been set.
      * @return True if the 'start_year' field has been set, false otherwise.
      */
    public boolean hasStartYear() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'start_year' field.
      * @return This builder.
      */
    public org.apache.flink.avro.generated.NasaMission.Builder clearStartYear() {
      start_year = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'end_year' field.
      * @return The value.
      */
    public java.lang.Integer getEndYear() {
      return end_year;
    }

    /**
      * Sets the value of the 'end_year' field.
      * @param value The value of 'end_year'.
      * @return This builder.
      */
    public org.apache.flink.avro.generated.NasaMission.Builder setEndYear(java.lang.Integer value) {
      validate(fields()[3], value);
      this.end_year = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'end_year' field has been set.
      * @return True if the 'end_year' field has been set, false otherwise.
      */
    public boolean hasEndYear() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'end_year' field.
      * @return This builder.
      */
    public org.apache.flink.avro.generated.NasaMission.Builder clearEndYear() {
      end_year = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public NasaMission build() {
      try {
        NasaMission record = new NasaMission();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.start_year = fieldSetFlags()[2] ? this.start_year : (java.lang.Integer) defaultValue(fields()[2]);
        record.end_year = fieldSetFlags()[3] ? this.end_year : (java.lang.Integer) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<NasaMission>
    WRITER$ = (org.apache.avro.io.DatumWriter<NasaMission>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<NasaMission>
    READER$ = (org.apache.avro.io.DatumReader<NasaMission>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
