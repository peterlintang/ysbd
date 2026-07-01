package com.taobao.munion.model;

import org.json.JSONObject;

public class d
{
  public static String a = "isSync";
  public static String b = "itemId";
  public static String c = "id";
  public static String d = "title";
  public static String e = "category";
  public static int f = 1;
  public static int g = 0;
  public static String h = "imageUrl";
  public static String i = "price";
  public static String j = "url";
  public static int k = 1;
  public static int l = 0;
  private String m;
  private String n;
  private String o;
  private int p;
  private String q;
  private String r;
  private String s;
  private int t;
  private int u;
  private boolean v;
  private String w;
  
  public static d a(JSONObject paramJSONObject)
  {
    if (paramJSONObject != null)
    {
      try
      {
        d locald = new d();
        localException1.printStackTrace();
      }
      catch (Exception localException1)
      {
        try
        {
          locald.f(paramJSONObject.optString(d));
          locald.b(paramJSONObject.optString(c));
          locald.a(paramJSONObject.optString(b));
          locald.c(paramJSONObject.optInt(a));
          locald.e(paramJSONObject.optString(e));
          locald.d(paramJSONObject.optString(h));
          locald.g(String.format("%.2f", new Object[] { Double.valueOf(paramJSONObject.optDouble(i)) }));
          locald.c(paramJSONObject.optString(j));
          return locald;
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            paramJSONObject = localException1;
            Object localObject = localException2;
          }
        }
        localException1 = localException1;
        paramJSONObject = null;
      }
      return paramJSONObject;
    }
    return null;
  }
  
  /* Error */
  public static java.util.ArrayList<d> a(org.json.JSONArray paramJSONArray)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +69 -> 70
    //   4: aload_0
    //   5: invokevirtual 136	org/json/JSONArray:length	()I
    //   8: ifle +62 -> 70
    //   11: new 138	java/util/ArrayList
    //   14: dup
    //   15: invokespecial 139	java/util/ArrayList:<init>	()V
    //   18: astore_2
    //   19: iconst_0
    //   20: istore_1
    //   21: aload_2
    //   22: astore_3
    //   23: iload_1
    //   24: aload_0
    //   25: invokevirtual 136	org/json/JSONArray:length	()I
    //   28: if_icmpge +32 -> 60
    //   31: aload_2
    //   32: aload_0
    //   33: iload_1
    //   34: invokevirtual 143	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   37: invokestatic 145	com/taobao/munion/model/d:a	(Lorg/json/JSONObject;)Lcom/taobao/munion/model/d;
    //   40: invokevirtual 149	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   43: pop
    //   44: iload_1
    //   45: iconst_1
    //   46: iadd
    //   47: istore_1
    //   48: goto -27 -> 21
    //   51: astore_2
    //   52: aconst_null
    //   53: astore_0
    //   54: aload_2
    //   55: invokevirtual 129	java/lang/Exception:printStackTrace	()V
    //   58: aload_0
    //   59: astore_3
    //   60: aload_3
    //   61: areturn
    //   62: astore_3
    //   63: aload_2
    //   64: astore_0
    //   65: aload_3
    //   66: astore_2
    //   67: goto -13 -> 54
    //   70: aconst_null
    //   71: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	paramJSONArray	org.json.JSONArray
    //   20	28	1	i1	int
    //   18	14	2	localArrayList	java.util.ArrayList
    //   51	13	2	localException1	Exception
    //   66	1	2	localObject1	Object
    //   22	39	3	localObject2	Object
    //   62	4	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   4	19	51	java/lang/Exception
    //   23	44	62	java/lang/Exception
  }
  
  public String a()
  {
    return this.n;
  }
  
  public void a(int paramInt)
  {
    this.p = paramInt;
  }
  
  public void a(String paramString)
  {
    this.n = paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    this.v = paramBoolean;
  }
  
  public String b()
  {
    return this.m;
  }
  
  public void b(int paramInt)
  {
    this.t = paramInt;
  }
  
  public void b(String paramString)
  {
    this.m = paramString;
  }
  
  public String c()
  {
    return this.w;
  }
  
  public void c(int paramInt)
  {
    this.u = paramInt;
  }
  
  public void c(String paramString)
  {
    this.w = paramString;
  }
  
  public String d()
  {
    return this.q;
  }
  
  public void d(String paramString)
  {
    this.q = paramString;
  }
  
  public String e()
  {
    return this.o;
  }
  
  public void e(String paramString)
  {
    this.o = paramString;
  }
  
  public int f()
  {
    return this.p;
  }
  
  public void f(String paramString)
  {
    this.r = paramString;
  }
  
  public String g()
  {
    return this.r;
  }
  
  public void g(String paramString)
  {
    this.s = paramString;
  }
  
  public String h()
  {
    return this.s;
  }
  
  public int i()
  {
    return this.t;
  }
  
  public boolean j()
  {
    return this.v;
  }
  
  public int k()
  {
    return this.u;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */