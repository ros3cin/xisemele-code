package net.sf.xisemele.impl;

import java.util.HashMap;
import java.util.Map;

import net.sf.xisemele.api.Formatter;
import org.apache.commons.collections4.map.HashedMap;
import org.eclipse.collections.impl.set.sorted.mutable.TreeSortedSet;
import org.eclipse.collections.impl.map.mutable.UnifiedMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Implementação de {@link FormatterProvider}.
 * 
 * @author Carlos Eduardo Coral.
 */
class FormatterProviderImpl implements FormatterProvider {

   /**
    * Serial version.
    */
   private static final long serialVersionUID = 1L;

   /**
    * Mapa contendo os tipos e as instâncias de {@link Formatter} correspondentes.
    */
   private Map<Class<?>, Formatter<?>> formatters = new HashedMap<Class<?>, Formatter<?>>();

   /**
    * {@inheritDoc}
    */
   @SuppressWarnings("unchecked")
   public <T> Formatter<T> getFormatter(Class<?> type) {
      return (Formatter<T>) formatters.get(type);
   }

   /**
    * {@inheritDoc}
    */
   public void setFormatter(Class<?> type, Formatter<?> formatter) {
      formatters.put(type, formatter);
   }
}
