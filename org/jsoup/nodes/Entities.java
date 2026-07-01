package org.jsoup.nodes;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Pattern;
import org.jsoup.parser.Parser;

public class Entities
{
  private static final Map<String, Character> base;
  private static final Map<Character, String> baseByVal;
  private static final Map<String, Character> full;
  private static final Map<Character, String> fullByVal;
  private static final Pattern strictUnescapePattern;
  private static final Pattern unescapePattern = Pattern.compile("&(#(x|X)?([0-9a-fA-F]+)|[a-zA-Z]+\\d*);?");
  private static final Object[][] xhtmlArray;
  private static final Map<Character, String> xhtmlByVal;
  
  static
  {
    strictUnescapePattern = Pattern.compile("&(#(x|X)?([0-9a-fA-F]+)|[a-zA-Z]+\\d*);");
    Object localObject1 = { "lt", Integer.valueOf(60) };
    xhtmlArray = new Object[][] { { "quot", Integer.valueOf(34) }, { "amp", Integer.valueOf(38) }, { "apos", Integer.valueOf(39) }, localObject1, { "gt", Integer.valueOf(62) } };
    xhtmlByVal = new HashMap();
    localObject1 = loadEntities("entities-base.properties");
    base = (Map)localObject1;
    baseByVal = toCharacterKey((Map)localObject1);
    localObject1 = loadEntities("entities-full.properties");
    full = (Map)localObject1;
    fullByVal = toCharacterKey((Map)localObject1);
    localObject1 = xhtmlArray;
    int j = localObject1.length;
    int i = 0;
    while (i < j)
    {
      Object localObject2 = localObject1[i];
      char c = (char)((Integer)localObject2[1]).intValue();
      xhtmlByVal.put(Character.valueOf(c), (String)localObject2[0]);
      i += 1;
    }
  }
  
  static String escape(String paramString, CharsetEncoder paramCharsetEncoder, Entities.EscapeMode paramEscapeMode)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString.length() * 2);
    paramEscapeMode = paramEscapeMode.getMap();
    int i = 0;
    if (i < paramString.length())
    {
      Character localCharacter = Character.valueOf(paramString.charAt(i));
      if (paramEscapeMode.containsKey(localCharacter)) {
        localStringBuilder.append('&').append((String)paramEscapeMode.get(localCharacter)).append(';');
      }
      for (;;)
      {
        i += 1;
        break;
        if (paramCharsetEncoder.canEncode(localCharacter.charValue())) {
          localStringBuilder.append(localCharacter.charValue());
        } else {
          localStringBuilder.append("&#").append(localCharacter.charValue()).append(';');
        }
      }
    }
    return localStringBuilder.toString();
  }
  
  static String escape(String paramString, Document.OutputSettings paramOutputSettings)
  {
    return escape(paramString, paramOutputSettings.encoder(), paramOutputSettings.escapeMode());
  }
  
  public static Character getCharacterByName(String paramString)
  {
    return (Character)full.get(paramString);
  }
  
  public static boolean isBaseNamedEntity(String paramString)
  {
    return base.containsKey(paramString);
  }
  
  public static boolean isNamedEntity(String paramString)
  {
    return full.containsKey(paramString);
  }
  
  private static Map<String, Character> loadEntities(String paramString)
  {
    Object localObject = new Properties();
    HashMap localHashMap = new HashMap();
    try
    {
      InputStream localInputStream = Entities.class.getResourceAsStream(paramString);
      ((Properties)localObject).load(localInputStream);
      localInputStream.close();
      paramString = ((Properties)localObject).entrySet().iterator();
      while (paramString.hasNext())
      {
        localObject = (Map.Entry)paramString.next();
        char c = (char)Integer.parseInt((String)((Map.Entry)localObject).getValue(), 16);
        localHashMap.put((String)((Map.Entry)localObject).getKey(), Character.valueOf(c));
      }
      return localIOException;
    }
    catch (IOException localIOException)
    {
      throw new MissingResourceException("Error loading entities resource: " + localIOException.getMessage(), "Entities", paramString);
    }
  }
  
  private static Map<Character, String> toCharacterKey(Map<String, Character> paramMap)
  {
    HashMap localHashMap = new HashMap();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Object localObject = (Map.Entry)paramMap.next();
      Character localCharacter = (Character)((Map.Entry)localObject).getValue();
      localObject = (String)((Map.Entry)localObject).getKey();
      if (localHashMap.containsKey(localCharacter))
      {
        if (((String)localObject).toLowerCase().equals(localObject)) {
          localHashMap.put(localCharacter, localObject);
        }
      }
      else {
        localHashMap.put(localCharacter, localObject);
      }
    }
    return localHashMap;
  }
  
  static String unescape(String paramString)
  {
    return unescape(paramString, false);
  }
  
  static String unescape(String paramString, boolean paramBoolean)
  {
    return Parser.unescapeEntities(paramString, paramBoolean);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\nodes\Entities.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */