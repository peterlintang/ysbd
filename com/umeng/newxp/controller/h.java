package com.umeng.newxp.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.umeng.common.ufp.Log;
import java.util.Map;

public class h
{
  private static final String a = "EXCHANGE_UPLOAD_CACHE";
  private static final String b = "upload_page_";
  private static final String c = "last_update";
  private static final String d = "UMUpload";
  private String e;
  private Context f;
  
  public h(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new RuntimeException("can`t save the data appkey is empty..");
    }
    this.f = paramContext;
    this.e = paramString;
  }
  
  private int a(SharedPreferences paramSharedPreferences)
  {
    paramSharedPreferences = paramSharedPreferences.getAll();
    int i = 0;
    String str = e();
    while (paramSharedPreferences.containsKey(str + i)) {
      i += 1;
    }
    Log.c("UMUpload", "max page index is" + (i - 1));
    return i - 1;
  }
  
  private String e()
  {
    return this.e + "_upload_page_";
  }
  
  public long a()
  {
    return this.f.getSharedPreferences("EXCHANGE_UPLOAD_CACHE", 0).getLong(this.e + "_last_update", 0L);
  }
  
  public void a(String paramString)
  {
    try
    {
      Object localObject = this.f.getSharedPreferences("EXCHANGE_UPLOAD_CACHE", 0);
      int i = a((SharedPreferences)localObject);
      String str = e() + (i + 1);
      localObject = ((SharedPreferences)localObject).edit();
      ((SharedPreferences.Editor)localObject).putString(str, paramString);
      ((SharedPreferences.Editor)localObject).commit();
      Log.c("UMUpload", "add a buffer data " + paramString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public boolean b()
  {
    boolean bool = false;
    if (a(this.f.getSharedPreferences("EXCHANGE_UPLOAD_CACHE", 0)) >= 0) {
      bool = true;
    }
    return bool;
  }
  
  /* Error */
  public String c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 40	com/umeng/newxp/controller/h:f	Landroid/content/Context;
    //   6: ldc 8
    //   8: iconst_0
    //   9: invokevirtual 89	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   12: astore_3
    //   13: aload_0
    //   14: aload_3
    //   15: invokespecial 97	com/umeng/newxp/controller/h:a	(Landroid/content/SharedPreferences;)I
    //   18: istore_1
    //   19: iload_1
    //   20: iflt +100 -> 120
    //   23: aload_3
    //   24: new 55	java/lang/StringBuilder
    //   27: dup
    //   28: invokespecial 56	java/lang/StringBuilder:<init>	()V
    //   31: aload_0
    //   32: invokespecial 53	com/umeng/newxp/controller/h:e	()Ljava/lang/String;
    //   35: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: iload_1
    //   39: invokevirtual 63	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   42: invokevirtual 66	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   45: ldc 115
    //   47: invokeinterface 119 3 0
    //   52: astore_2
    //   53: aload_3
    //   54: invokeinterface 101 1 0
    //   59: astore_3
    //   60: aload_3
    //   61: new 55	java/lang/StringBuilder
    //   64: dup
    //   65: invokespecial 56	java/lang/StringBuilder:<init>	()V
    //   68: aload_0
    //   69: invokespecial 53	com/umeng/newxp/controller/h:e	()Ljava/lang/String;
    //   72: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: iload_1
    //   76: invokevirtual 63	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   79: invokevirtual 66	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: invokeinterface 123 2 0
    //   87: pop
    //   88: aload_3
    //   89: invokeinterface 111 1 0
    //   94: pop
    //   95: ldc 17
    //   97: new 55	java/lang/StringBuilder
    //   100: dup
    //   101: ldc 125
    //   103: invokespecial 75	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   106: aload_2
    //   107: invokevirtual 60	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: invokevirtual 66	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   113: invokestatic 80	com/umeng/common/ufp/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   116: aload_0
    //   117: monitorexit
    //   118: aload_2
    //   119: areturn
    //   120: aconst_null
    //   121: astore_2
    //   122: goto -6 -> 116
    //   125: astore_2
    //   126: aload_0
    //   127: monitorexit
    //   128: aload_2
    //   129: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	h
    //   18	58	1	i	int
    //   52	70	2	str	String
    //   125	4	2	localObject1	Object
    //   12	77	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	19	125	finally
    //   23	116	125	finally
  }
  
  public void d()
  {
    try
    {
      SharedPreferences.Editor localEditor = this.f.getSharedPreferences("EXCHANGE_UPLOAD_CACHE", 0).edit();
      localEditor.putLong(this.e + "_last_update", System.currentTimeMillis());
      localEditor.commit();
      Log.c("UMUpload", "update last upload time.");
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */