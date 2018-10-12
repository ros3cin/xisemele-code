package net.sf.xisemele.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.xisemele.api.Value;
import net.sf.xisemele.api.ValueList;
import net.sf.xisemele.exception.FormatterNotConfiguredException;
import org.apache.commons.collections4.map.HashedMap;
import org.eclipse.collections.impl.set.sorted.mutable.TreeSortedSet;
import org.eclipse.collections.impl.map.mutable.UnifiedMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.collections4.list.TreeList;

/**
 * Implementação de {@link ValueList}.
 * 
 * @author Carlos Eduardo Coral.
 */
class ValueListImpl implements ValueList {

   /**
    * Serial version.
    */
   private static final long serialVersionUID = 1L;
   
   /**
    * Lista de {@link Value} que a instância de {@link ValueListImpl} abstrai.
    */
   private final List<Value> values;
   
   /**
    * Cria uma nova instância de {@link ValueListImpl}.
    * 
    * @param values
    *          lista de {@link Value} que será manipulada.
    */
   ValueListImpl(List<Value> values) {
      this.values = values;
   }
   
   /**
    * {@inheritDoc}
    */
   public List<Byte> asByte() {
      List<Byte> list = new TreeList<Byte>();
      for (Value value : values) {
         list.add(value.asByte());
      }
      return list;
   }
   
   /**
    * {@inheritDoc}
    */
   public List<Short> asShort() {
      List<Short> list = new TreeList<Short>();
      for (Value value : values) {
         list.add(value.asShort());
      }
      return list;
   }
   
   /**
    * {@inheritDoc}
    */
   public List<Integer> asInteger() {
      List<Integer> list = new TreeList<Integer>();
      for (Value value : values) {
         list.add(value.asInteger());
      }
      return list;
   }
   
   /**
    * {@inheritDoc}
    */
   public List<Long> asLong() {
      List<Long> list = new TreeList<Long>();
      for (Value value : values) {
         list.add(value.asLong());
      }
      return list;
   }
   
   /**
    * {@inheritDoc}
    */
   public List<Float> asFloat() {
      List<Float> list = new TreeList<Float>();
      for (Value value : values) {
         list.add(value.asFloat());
      }
      return list;
   }
   
   /**
    * {@inheritDoc}
    */
   public List<Double> asDouble() {
      List<Double> list = new TreeList<Double>();
      for (Value value : values) {
         list.add(value.asDouble());
      }
      return list;
   }
   
   /**
    * {@inheritDoc}
    */
   public List<BigInteger> asBigInteger() {
      List<BigInteger> list = new TreeList<BigInteger>();
      for (Value value : values) {
         list.add(value.asBigInteger());
      }
      return list;
   }
   
   /**
    * {@inheritDoc}
    */
   public List<BigDecimal> asBigDecimal() {
      List<BigDecimal> list = new TreeList<BigDecimal>();
      for (Value value : values) {
         list.add(value.asBigDecimal());
      }
      return list;
   }
   
   /**
    * {@inheritDoc}
    */
   public List<Boolean> asBoolean() {
      List<Boolean> list = new TreeList<Boolean>();
      for (Value value : values) {
         list.add(value.asBoolean());
      }
      return list;
   }
   
   /**
    * {@inheritDoc}
    */
   public List<String> asString() {
      List<String> list = new TreeList<String>();
      for (Value value : values) {
         list.add(value.asString());
      }
      return list;
   }
   
   /**
    * {@inheritDoc}
    */
   public List<Date> asDate() {
      List<Date> list = new TreeList<Date>();
      for (Value value : values) {
         list.add(value.asDate());
      }
      return list;
   }
   
   /**
    * {@inheritDoc}
    */
   public List<Date> asDate(String pattern) {
      List<Date> list = new TreeList<Date>();
      for (Value value : values) {
         list.add(value.asDate(pattern));
      }
      return list;
   }
   
   /**
    * {@inheritDoc}
    */
   public <T> List<T> asType(Class<T> type) throws FormatterNotConfiguredException {
      List<T> list = new TreeList<T>();
      for (Value value : values) {
         list.add(value.asType(type));
      }
      return list;
   }
}
