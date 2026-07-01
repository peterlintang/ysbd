package com.taobao.munion.ewall.actorframework;

import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.w3c.dom.NodeList;

public class Utils
{
  protected static final int CHAR_BUFFER_LENGTH = 1024;
  public static final String CR = "\r";
  public static final int DAY_MILLIS = 86400000;
  public static final String FF = "\f";
  public static final String FORM_URLENCODED_CONTENT_TYPE = "application/x-www-form-urlencoded";
  public static final int HOUR_MILLIS = 3600000;
  public static final String HTTP_CONNECTIONS_LOG_FILE = "connections.log";
  public static final String LF = "\n";
  public static final String MIME_WILDCARD_SUFFIX = "/*";
  public static final int MINUTE_MILLIS = 60000;
  public static final String MTP_DEBUG_PROPERTY = "com.ibm.haac.mtp.debug";
  public static final int SECOND_MILLIS = 1000;
  public static final String SPACE = " ";
  public static final String TAB = "\t";
  public static final String US_IBM_COM = "us.ibm.com";
  public static final String UTF8_ENCODING_NAME = "UTF-8";
  public static final String _OUT_QUALIFIER = "_out.";
  public static DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(3, 2);
  public static boolean useShortClassName = true;
  
  public static boolean areAllNotEmpty(String... paramVarArgs)
  {
    int j = paramVarArgs.length;
    int i = 0;
    boolean bool2 = true;
    if (i < j)
    {
      if (!isEmpty(paramVarArgs[i])) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        bool2 &= bool1;
        i += 1;
        break;
      }
    }
    return bool2;
  }
  
  public static boolean areAllNull(Object[] paramArrayOfObject)
  {
    boolean bool = true;
    if (paramArrayOfObject != null)
    {
      int j = paramArrayOfObject.length;
      int i = 0;
      bool = true;
      if (i < j)
      {
        Object localObject = paramArrayOfObject[i];
        if ((localObject == null) || ("null".equals(localObject))) {}
        for (bool = true;; bool = false)
        {
          i += 1;
          break;
        }
      }
    }
    return bool;
  }
  
  public static boolean areAnyNotEmpty(String... paramVarArgs)
  {
    int j = paramVarArgs.length;
    int i = 0;
    boolean bool2 = false;
    if (i < j)
    {
      if (!isEmpty(paramVarArgs[i])) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        bool2 |= bool1;
        i += 1;
        break;
      }
    }
    return bool2;
  }
  
  public static String camelCaseName(String paramString)
  {
    if (isEmpty(paramString)) {
      return "";
    }
    return Character.toLowerCase(paramString.charAt(0)) + paramString.substring(1);
  }
  
  public static String capitalizeFirst(String paramString)
  {
    String str = paramString;
    if (!isEmpty(paramString)) {
      str = Character.toUpperCase(paramString.charAt(0)) + paramString.substring(1);
    }
    return str;
  }
  
  public static String defValue(String paramString1, String paramString2)
  {
    if (isEmpty(paramString1)) {
      return paramString2;
    }
    return paramString1;
  }
  
  public static String fixNull(String paramString)
  {
    if (paramString != null) {
      return paramString;
    }
    return "Unknown";
  }
  
  public static String formatString(String paramString)
  {
    if (!isEmpty(paramString)) {
      return paramString;
    }
    return "";
  }
  
  public static boolean isEmpty(Appendable paramAppendable)
  {
    Object localObject;
    Class localClass;
    if (paramAppendable != null)
    {
      localObject = null;
      localClass = paramAppendable.getClass();
    }
    for (;;)
    {
      try
      {
        Method localMethod1 = localClass.getMethod("size", new Class[0]);
        localObject = localMethod1;
      }
      catch (NoSuchMethodException localNoSuchMethodException1)
      {
        try
        {
          i = ((Integer)((Method)localObject).invoke(paramAppendable, new Object[0])).intValue();
          if ((paramAppendable != null) && (i != 0)) {
            break label98;
          }
          return true;
          localNoSuchMethodException1 = localNoSuchMethodException1;
          try
          {
            Method localMethod2 = localClass.getMethod("length", new Class[0]);
            localObject = localMethod2;
          }
          catch (NoSuchMethodException localNoSuchMethodException2) {}
        }
        catch (Exception localException)
        {
          try
          {
            Method localMethod3 = localClass.getMethod("getLength", new Class[0]);
            localObject = localMethod3;
          }
          catch (NoSuchMethodException localNoSuchMethodException3) {}
          localException = localException;
        }
      }
      if (localObject != null) {}
      int i = -1;
      continue;
      label98:
      return false;
    }
  }
  
  public static boolean isEmpty(CharSequence paramCharSequence)
  {
    return (paramCharSequence == null) || (paramCharSequence.length() == 0);
  }
  
  public static boolean isEmpty(Collection<?> paramCollection)
  {
    return (paramCollection == null) || (paramCollection.size() == 0);
  }
  
  public static boolean isEmpty(Map<?, ?> paramMap)
  {
    return (paramMap == null) || (paramMap.size() == 0);
  }
  
  public static boolean isEmpty(NodeList paramNodeList)
  {
    return (paramNodeList == null) || (paramNodeList.getLength() == 0);
  }
  
  public static boolean isEmpty(byte[] paramArrayOfByte)
  {
    return (paramArrayOfByte == null) || (paramArrayOfByte.length == 0);
  }
  
  public static boolean isEmpty(Object[] paramArrayOfObject)
  {
    return (paramArrayOfObject == null) || (paramArrayOfObject.length == 0);
  }
  
  public static boolean isEmptyOrNull(String paramString)
  {
    return (isEmpty(paramString)) || (paramString.trim().equalsIgnoreCase("null"));
  }
  
  private static boolean isJson(String paramString, char paramChar1, char paramChar2)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramString != null)
    {
      paramString = paramString.trim();
      bool1 = bool2;
      if (paramString.length() >= 2)
      {
        bool1 = bool2;
        if (paramString.charAt(0) == paramChar2)
        {
          bool1 = bool2;
          if (paramString.charAt(paramString.length() - 1) == paramChar2) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public static boolean isJsonArray(String paramString)
  {
    return isJson(paramString, '[', ']');
  }
  
  public static boolean isJsonObject(String paramString)
  {
    return isJson(paramString, '{', '}');
  }
  
  public static boolean isNull(Object paramObject)
  {
    return paramObject == null;
  }
  
  public static void printf(String paramString, Object... paramVarArgs)
  {
    synchronized (System.out)
    {
      System.out.printf(paramString, paramVarArgs);
      return;
    }
  }
  
  public static String removeMultipleSpaces(String paramString)
  {
    return removeMultipleSpaces(paramString, ' ');
  }
  
  public static String removeMultipleSpaces(String paramString, char paramChar)
  {
    String str = paramString;
    if (!isEmpty(paramString)) {
      str = paramString.replaceAll("\\s\\s+", " ");
    }
    return str;
  }
  
  public static String safeFormat(String paramString, Object... paramVarArgs)
  {
    return String.format(paramString, paramVarArgs);
  }
  
  public static String safeTrim(String paramString)
  {
    String str = paramString;
    if (paramString != null) {
      str = paramString.trim();
    }
    return str;
  }
  
  public static void sleep(long paramLong)
  {
    if (paramLong >= 0L) {}
    try
    {
      Thread.sleep(paramLong);
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
  
  public static String[] splitAndTrim(String paramString)
  {
    return splitAndTrim(paramString, ",|;");
  }
  
  public static String[] splitAndTrim(String paramString1, String paramString2)
  {
    String[] arrayOfString = null;
    if (paramString1 != null)
    {
      arrayOfString = paramString1.split(paramString2);
      int i = 0;
      while (i < arrayOfString.length)
      {
        arrayOfString[i] = arrayOfString[i].trim();
        i += 1;
      }
    }
    if (arrayOfString != null) {
      return arrayOfString;
    }
    return new String[0];
  }
  
  public static String stripAfter(String paramString, char paramChar)
  {
    String str = paramString;
    if (!isEmpty(paramString))
    {
      paramChar = paramString.indexOf(paramChar);
      str = paramString;
      if (paramChar > 0) {
        str = paramString.substring(0, paramChar);
      }
    }
    return str;
  }
  
  public static String stripAfterSemicolon(String paramString)
  {
    return stripAfter(paramString, ';');
  }
  
  public static String toList(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject != null) {
      return Arrays.asList(paramArrayOfObject).toString();
    }
    return null;
  }
  
  public static String trimDoctype(String paramString)
  {
    String str = paramString;
    if (!isEmpty(paramString))
    {
      int i = paramString.toLowerCase().indexOf("<html");
      str = paramString;
      if (i > 0) {
        str = paramString.substring(i);
      }
    }
    return str;
  }
  
  public static String truncate(Object paramObject)
  {
    if (paramObject != null) {
      return truncate(paramObject.toString(), 100);
    }
    return "null";
  }
  
  public static String truncate(String paramString, int paramInt)
  {
    String str = paramString;
    if (!isEmpty(paramString))
    {
      paramString = removeMultipleSpaces(paramString);
      str = paramString;
      if (paramString.length() > paramInt)
      {
        paramInt /= 2;
        str = paramString.substring(0, paramInt) + " ... " + paramString.substring(paramString.length() - paramInt);
      }
    }
    return str;
  }
  
  public static String truncateText(String paramString)
  {
    return truncateText(paramString, 60);
  }
  
  public static String truncateText(String paramString, int paramInt)
  {
    String str = paramString;
    if (!isEmpty(paramString)) {
      str = truncate(paramString, paramInt).replace('\r', '~').replace('\n', '~');
    }
    return str;
  }
  
  public int compareToOther(Object paramObject)
  {
    int i;
    if (paramObject != null) {
      if (this == paramObject) {
        i = 0;
      }
    }
    for (;;)
    {
      int j = i;
      if (paramObject != null)
      {
        j = i;
        if ((this instanceof Comparable))
        {
          j = i;
          if ((paramObject instanceof Comparable))
          {
            j = i;
            if (getClass().isAssignableFrom(paramObject.getClass())) {
              j = testCompareTo((Comparable)this, (Comparable)paramObject);
            }
          }
        }
      }
      return j;
      i = 1;
      continue;
      i = -1;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject != null) {}
    for (boolean bool2 = true;; bool2 = false)
    {
      boolean bool1 = bool2;
      if (bool2) {
        bool1 = getClass().isAssignableFrom(paramObject.getClass());
      }
      bool2 = bool1;
      if (bool1) {
        bool2 = testEquals(paramObject);
      }
      return bool2;
    }
  }
  
  protected String formatToString(Map<String, Object> paramMap, Object paramObject)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject1;
    if (useShortClassName)
    {
      localObject1 = paramObject.getClass().getSimpleName();
      Object localObject2 = localObject1;
      if (isEmpty((CharSequence)localObject1)) {
        localObject2 = paramObject.getClass().getName();
      }
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append('[');
      if (isEmpty(paramMap)) {
        break label194;
      }
      localObject1 = paramMap.keySet().iterator();
      label77:
      if (!((Iterator)localObject1).hasNext()) {
        break label194;
      }
      localObject2 = (String)((Iterator)localObject1).next();
      if (localStringBuilder.charAt(localStringBuilder.length() - 1) != '[') {
        localStringBuilder.append(',');
      }
      paramObject = paramMap.get(localObject2);
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append('=');
      if ((paramObject == null) || (!paramObject.getClass().isArray())) {
        break label232;
      }
      paramObject = Arrays.deepToString(new Object[] { paramObject });
    }
    label194:
    label232:
    for (;;)
    {
      localStringBuilder.append(paramObject);
      break label77;
      localObject1 = paramObject.getClass().getName();
      break;
      localStringBuilder.append(']');
      localStringBuilder.append('@');
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)).toUpperCase());
      return localStringBuilder.toString();
    }
  }
  
  protected void getFieldValue(Class<? extends Annotation> paramClass, Map<String, Object> paramMap, Field paramField, Object paramObject)
  {
    Annotation localAnnotation = paramField.getAnnotation(paramClass);
    if (localAnnotation != null) {
      try
      {
        boolean bool = paramField.isAccessible();
        try
        {
          paramField.setAccessible(true);
          Object localObject = paramField.get(paramObject);
          paramClass = null;
          paramObject = localAnnotation.annotationType().getMethod("value", new Class[0]);
          if (paramObject != null) {
            paramClass = (String)((Method)paramObject).invoke(localAnnotation, new Object[0]);
          }
          paramObject = paramClass;
          if (isEmpty(paramClass)) {
            paramObject = paramField.getName();
          }
          paramMap.put(paramObject, localObject);
          return;
        }
        finally
        {
          paramField.setAccessible(bool);
        }
        return;
      }
      catch (Exception paramClass)
      {
        paramClass.printStackTrace();
      }
    }
  }
  
  protected void getFieldValues(Class<? extends Annotation> paramClass, Class<? extends Object> paramClass1, Field[] paramArrayOfField, Map<String, Object> paramMap, Object paramObject)
  {
    int j = paramArrayOfField.length;
    int i = 0;
    while (i < j)
    {
      paramClass1 = paramArrayOfField[i];
      if (!Modifier.isStatic(paramClass1.getModifiers())) {
        getFieldValue(paramClass, paramMap, paramClass1, paramObject);
      }
      i += 1;
    }
  }
  
  protected Map<String, Object> getMineAndParentFields(Class<? extends Annotation> paramClass, Object paramObject)
  {
    TreeMap localTreeMap = new TreeMap();
    for (Class localClass = paramObject.getClass(); localClass != null; localClass = localClass.getSuperclass()) {
      getFieldValues(paramClass, localClass, localClass.getDeclaredFields(), localTreeMap, paramObject);
    }
    return localTreeMap;
  }
  
  public int hashCode()
  {
    Map localMap = getMineAndParentFields(Utils.ForEquals.class, this);
    int j;
    if (!isEmpty(localMap))
    {
      Iterator localIterator = localMap.keySet().iterator();
      int i = 31;
      j = i;
      if (!localIterator.hasNext()) {
        break label83;
      }
      Object localObject = localMap.get((String)localIterator.next());
      if (localObject == null) {
        break label85;
      }
      i = localObject.hashCode() ^ i;
    }
    label83:
    label85:
    for (;;)
    {
      break;
      j = super.hashCode();
      return j;
    }
  }
  
  protected int testCompareTo(Comparable paramComparable1, Comparable paramComparable2)
  {
    Map localMap1 = getMineAndParentFields(Utils.ForCompareTo.class, paramComparable1);
    Map localMap2 = getMineAndParentFields(Utils.ForCompareTo.class, paramComparable2);
    int i;
    Object localObject;
    if ((!isEmpty(localMap1)) && (localMap2.size() >= localMap1.size()))
    {
      paramComparable1 = localMap1.keySet().iterator();
      i = 0;
      if (!paramComparable1.hasNext()) {
        break label202;
      }
      localObject = (String)paramComparable1.next();
      paramComparable2 = localMap1.get(localObject);
      localObject = localMap2.get(localObject);
      if (paramComparable2 != null) {
        if (localObject != null) {
          if (((paramComparable2 instanceof Comparable)) && ((localObject instanceof Comparable))) {
            i = ((Comparable)paramComparable2).compareTo((Comparable)localObject);
          }
        }
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        return i;
        throw new IllegalArgumentException(safeFormat("both arguments must be Comparables: (%s vs. %s)", new Object[] { paramComparable2.getClass(), localObject.getClass() }));
        i = 1;
        continue;
        if (localObject != null)
        {
          i = -1;
          continue;
          return paramComparable1.compareTo(paramComparable2);
          label202:
          return i;
        }
      }
      else
      {
        break;
      }
    }
  }
  
  protected boolean testEquals(Object paramObject)
  {
    Map localMap1 = getMineAndParentFields(Utils.ForEquals.class, this);
    Map localMap2 = getMineAndParentFields(Utils.ForEquals.class, paramObject);
    boolean bool;
    Object localObject2;
    if ((!isEmpty(localMap1)) && (localMap2.size() >= localMap1.size()))
    {
      paramObject = localMap1.keySet().iterator();
      bool = true;
      if (!((Iterator)paramObject).hasNext()) {
        return bool;
      }
      localObject2 = (String)((Iterator)paramObject).next();
      Object localObject1 = localMap1.get(localObject2);
      localObject2 = localMap2.get(localObject2);
      if (localObject1 != null) {
        if (localObject2 != null) {
          bool = localObject1.equals(localObject2) & bool;
        }
      }
    }
    for (;;)
    {
      if (!bool)
      {
        return bool;
        bool = false;
        continue;
        if (localObject2 != null)
        {
          bool = false;
          continue;
          return super.equals(paramObject);
        }
      }
      else
      {
        break;
      }
    }
    return bool;
  }
  
  public String toString()
  {
    return toString(this);
  }
  
  public String toString(Object paramObject)
  {
    return formatToString(getMineAndParentFields(Utils.ForToString.class, paramObject), paramObject);
  }
  
  public String trimQuotes(String paramString)
  {
    String str = paramString;
    if (!isEmpty(paramString)) {
      if ((!paramString.startsWith("\"")) || (!paramString.endsWith("\"")))
      {
        str = paramString;
        if (paramString.startsWith("'"))
        {
          str = paramString;
          if (!paramString.endsWith("'")) {}
        }
      }
      else
      {
        str = paramString.substring(1, paramString.length() - 1);
      }
    }
    return str;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\actorframework\Utils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */