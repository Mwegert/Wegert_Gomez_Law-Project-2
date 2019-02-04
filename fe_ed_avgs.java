// ORM class for table 'fe_ed_avgs'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Feb 04 12:11:19 PST 2019
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

public class fe_ed_avgs extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("indicator", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        indicator = (String)value;
      }
    });
    setters.put("indicator_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        indicator_code = (String)value;
      }
    });
    setters.put("percent", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        percent = (java.math.BigDecimal)value;
      }
    });
  }
  public fe_ed_avgs() {
    init0();
  }
  private String indicator;
  public String get_indicator() {
    return indicator;
  }
  public void set_indicator(String indicator) {
    this.indicator = indicator;
  }
  public fe_ed_avgs with_indicator(String indicator) {
    this.indicator = indicator;
    return this;
  }
  private String indicator_code;
  public String get_indicator_code() {
    return indicator_code;
  }
  public void set_indicator_code(String indicator_code) {
    this.indicator_code = indicator_code;
  }
  public fe_ed_avgs with_indicator_code(String indicator_code) {
    this.indicator_code = indicator_code;
    return this;
  }
  private java.math.BigDecimal percent;
  public java.math.BigDecimal get_percent() {
    return percent;
  }
  public void set_percent(java.math.BigDecimal percent) {
    this.percent = percent;
  }
  public fe_ed_avgs with_percent(java.math.BigDecimal percent) {
    this.percent = percent;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof fe_ed_avgs)) {
      return false;
    }
    fe_ed_avgs that = (fe_ed_avgs) o;
    boolean equal = true;
    equal = equal && (this.indicator == null ? that.indicator == null : this.indicator.equals(that.indicator));
    equal = equal && (this.indicator_code == null ? that.indicator_code == null : this.indicator_code.equals(that.indicator_code));
    equal = equal && (this.percent == null ? that.percent == null : this.percent.equals(that.percent));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof fe_ed_avgs)) {
      return false;
    }
    fe_ed_avgs that = (fe_ed_avgs) o;
    boolean equal = true;
    equal = equal && (this.indicator == null ? that.indicator == null : this.indicator.equals(that.indicator));
    equal = equal && (this.indicator_code == null ? that.indicator_code == null : this.indicator_code.equals(that.indicator_code));
    equal = equal && (this.percent == null ? that.percent == null : this.percent.equals(that.percent));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.indicator = JdbcWritableBridge.readString(1, __dbResults);
    this.indicator_code = JdbcWritableBridge.readString(2, __dbResults);
    this.percent = JdbcWritableBridge.readBigDecimal(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.indicator = JdbcWritableBridge.readString(1, __dbResults);
    this.indicator_code = JdbcWritableBridge.readString(2, __dbResults);
    this.percent = JdbcWritableBridge.readBigDecimal(3, __dbResults);
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
    JdbcWritableBridge.writeString(indicator, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(indicator_code, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(percent, 3 + __off, 3, __dbStmt);
    return 3;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(indicator, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(indicator_code, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(percent, 3 + __off, 3, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.indicator = null;
    } else {
    this.indicator = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.indicator_code = null;
    } else {
    this.indicator_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.percent = null;
    } else {
    this.percent = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.indicator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, indicator);
    }
    if (null == this.indicator_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, indicator_code);
    }
    if (null == this.percent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.percent, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.indicator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, indicator);
    }
    if (null == this.indicator_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, indicator_code);
    }
    if (null == this.percent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.percent, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(indicator==null?"null":indicator, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(indicator_code==null?"null":indicator_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(percent==null?"null":percent.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(indicator==null?"null":indicator, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(indicator_code==null?"null":indicator_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(percent==null?"null":percent.toPlainString(), delimiters));
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
    if (__cur_str.equals("null")) { this.indicator = null; } else {
      this.indicator = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.indicator_code = null; } else {
      this.indicator_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.percent = null; } else {
      this.percent = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.indicator = null; } else {
      this.indicator = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.indicator_code = null; } else {
      this.indicator_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("\\N") || __cur_str.length() == 0) { this.percent = null; } else {
      this.percent = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    fe_ed_avgs o = (fe_ed_avgs) super.clone();
    return o;
  }

  public void clone0(fe_ed_avgs o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("indicator", this.indicator);
    __sqoop$field_map.put("indicator_code", this.indicator_code);
    __sqoop$field_map.put("percent", this.percent);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("indicator", this.indicator);
    __sqoop$field_map.put("indicator_code", this.indicator_code);
    __sqoop$field_map.put("percent", this.percent);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
