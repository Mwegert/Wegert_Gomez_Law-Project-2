// ORM class for table 'fe_tlf'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jan 31 15:54:07 PST 2019
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class fe_tlf extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("country", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        country = (String)value;
      }
    });
    setters.put("beg_year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        beg_year = (Integer)value;
      }
    });
    setters.put("beg_val", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        beg_val = (java.math.BigDecimal)value;
      }
    });
    setters.put("end_year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        end_year = (Integer)value;
      }
    });
    setters.put("end_val", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        end_val = (java.math.BigDecimal)value;
      }
    });
    setters.put("avg_change", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        avg_change = (java.math.BigDecimal)value;
      }
    });
  }
  public fe_tlf() {
    init0();
  }
  private String country;
  public String get_country() {
    return country;
  }
  public void set_country(String country) {
    this.country = country;
  }
  public fe_tlf with_country(String country) {
    this.country = country;
    return this;
  }
  private Integer beg_year;
  public Integer get_beg_year() {
    return beg_year;
  }
  public void set_beg_year(Integer beg_year) {
    this.beg_year = beg_year;
  }
  public fe_tlf with_beg_year(Integer beg_year) {
    this.beg_year = beg_year;
    return this;
  }
  private java.math.BigDecimal beg_val;
  public java.math.BigDecimal get_beg_val() {
    return beg_val;
  }
  public void set_beg_val(java.math.BigDecimal beg_val) {
    this.beg_val = beg_val;
  }
  public fe_tlf with_beg_val(java.math.BigDecimal beg_val) {
    this.beg_val = beg_val;
    return this;
  }
  private Integer end_year;
  public Integer get_end_year() {
    return end_year;
  }
  public void set_end_year(Integer end_year) {
    this.end_year = end_year;
  }
  public fe_tlf with_end_year(Integer end_year) {
    this.end_year = end_year;
    return this;
  }
  private java.math.BigDecimal end_val;
  public java.math.BigDecimal get_end_val() {
    return end_val;
  }
  public void set_end_val(java.math.BigDecimal end_val) {
    this.end_val = end_val;
  }
  public fe_tlf with_end_val(java.math.BigDecimal end_val) {
    this.end_val = end_val;
    return this;
  }
  private java.math.BigDecimal avg_change;
  public java.math.BigDecimal get_avg_change() {
    return avg_change;
  }
  public void set_avg_change(java.math.BigDecimal avg_change) {
    this.avg_change = avg_change;
  }
  public fe_tlf with_avg_change(java.math.BigDecimal avg_change) {
    this.avg_change = avg_change;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof fe_tlf)) {
      return false;
    }
    fe_tlf that = (fe_tlf) o;
    boolean equal = true;
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.beg_year == null ? that.beg_year == null : this.beg_year.equals(that.beg_year));
    equal = equal && (this.beg_val == null ? that.beg_val == null : this.beg_val.equals(that.beg_val));
    equal = equal && (this.end_year == null ? that.end_year == null : this.end_year.equals(that.end_year));
    equal = equal && (this.end_val == null ? that.end_val == null : this.end_val.equals(that.end_val));
    equal = equal && (this.avg_change == null ? that.avg_change == null : this.avg_change.equals(that.avg_change));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof fe_tlf)) {
      return false;
    }
    fe_tlf that = (fe_tlf) o;
    boolean equal = true;
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.beg_year == null ? that.beg_year == null : this.beg_year.equals(that.beg_year));
    equal = equal && (this.beg_val == null ? that.beg_val == null : this.beg_val.equals(that.beg_val));
    equal = equal && (this.end_year == null ? that.end_year == null : this.end_year.equals(that.end_year));
    equal = equal && (this.end_val == null ? that.end_val == null : this.end_val.equals(that.end_val));
    equal = equal && (this.avg_change == null ? that.avg_change == null : this.avg_change.equals(that.avg_change));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.country = JdbcWritableBridge.readString(1, __dbResults);
    this.beg_year = JdbcWritableBridge.readInteger(2, __dbResults);
    this.beg_val = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.end_year = JdbcWritableBridge.readInteger(4, __dbResults);
    this.end_val = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.avg_change = JdbcWritableBridge.readBigDecimal(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.country = JdbcWritableBridge.readString(1, __dbResults);
    this.beg_year = JdbcWritableBridge.readInteger(2, __dbResults);
    this.beg_val = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.end_year = JdbcWritableBridge.readInteger(4, __dbResults);
    this.end_val = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.avg_change = JdbcWritableBridge.readBigDecimal(6, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(country, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(beg_year, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(beg_val, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(end_year, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(end_val, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(avg_change, 6 + __off, 3, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(country, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(beg_year, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(beg_val, 3 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeInteger(end_year, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(end_val, 5 + __off, 3, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(avg_change, 6 + __off, 3, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.country = null;
    } else {
    this.country = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.beg_year = null;
    } else {
    this.beg_year = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.beg_val = null;
    } else {
    this.beg_val = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.end_year = null;
    } else {
    this.end_year = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.end_val = null;
    } else {
    this.end_val = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.avg_change = null;
    } else {
    this.avg_change = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country);
    }
    if (null == this.beg_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.beg_year);
    }
    if (null == this.beg_val) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.beg_val, __dataOut);
    }
    if (null == this.end_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.end_year);
    }
    if (null == this.end_val) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.end_val, __dataOut);
    }
    if (null == this.avg_change) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.avg_change, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country);
    }
    if (null == this.beg_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.beg_year);
    }
    if (null == this.beg_val) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.beg_val, __dataOut);
    }
    if (null == this.end_year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.end_year);
    }
    if (null == this.end_val) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.end_val, __dataOut);
    }
    if (null == this.avg_change) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.avg_change, __dataOut);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(beg_year==null?"null":"" + beg_year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(beg_val==null?"null":beg_val.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_year==null?"null":"" + end_year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_val==null?"null":end_val.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(avg_change==null?"null":avg_change.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(beg_year==null?"null":"" + beg_year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(beg_val==null?"null":beg_val.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_year==null?"null":"" + end_year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_val==null?"null":end_val.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(avg_change==null?"null":avg_change.toPlainString(), delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.country = null; } else {
      this.country = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.beg_year = null; } else {
      this.beg_year = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.beg_val = null; } else {
      this.beg_val = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_year = null; } else {
      this.end_year = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_val = null; } else {
      this.end_val = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.avg_change = null; } else {
      this.avg_change = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.country = null; } else {
      this.country = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.beg_year = null; } else {
      this.beg_year = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.beg_val = null; } else {
      this.beg_val = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_year = null; } else {
      this.end_year = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_val = null; } else {
      this.end_val = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.avg_change = null; } else {
      this.avg_change = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    fe_tlf o = (fe_tlf) super.clone();
    return o;
  }

  public void clone0(fe_tlf o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("beg_year", this.beg_year);
    __sqoop$field_map.put("beg_val", this.beg_val);
    __sqoop$field_map.put("end_year", this.end_year);
    __sqoop$field_map.put("end_val", this.end_val);
    __sqoop$field_map.put("avg_change", this.avg_change);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("beg_year", this.beg_year);
    __sqoop$field_map.put("beg_val", this.beg_val);
    __sqoop$field_map.put("end_year", this.end_year);
    __sqoop$field_map.put("end_val", this.end_val);
    __sqoop$field_map.put("avg_change", this.avg_change);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
