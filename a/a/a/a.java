package a.a.a;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

final class a
{
  private Properties a = null;
  
  private a()
  {
    try
    {
      this.a = new Properties();
      this.a.load(d.a("/pinyindb/unicode_to_hanyu_pinyin.txt"));
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      localFileNotFoundException.printStackTrace();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
  
  a(byte paramByte)
  {
    this();
  }
  
  final String[] a(char paramChar)
  {
    String[] arrayOfString = null;
    String str = Integer.toHexString(paramChar).toUpperCase();
    str = this.a.getProperty(str);
    if ((str != null) && (!str.equals("(none0)")) && (str.startsWith("(")) && (str.endsWith(")")))
    {
      paramChar = '\001';
      if (paramChar == 0) {
        break label91;
      }
    }
    for (;;)
    {
      if (str != null) {
        arrayOfString = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")")).split(",");
      }
      return arrayOfString;
      paramChar = '\000';
      break;
      label91:
      str = null;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */