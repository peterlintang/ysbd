package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.common.Log;
import com.umeng.common.b;
import com.umeng.common.b.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONArray;
import org.json.JSONObject;

class a
  implements Thread.UncaughtExceptionHandler
{
  private static final String c = "com_umeng__crash.cache";
  private Thread.UncaughtExceptionHandler a;
  private Context b;
  
  private void a(Throwable paramThrowable)
  {
    if (paramThrowable == null)
    {
      Log.e("MobclickAgent", "Exception is null in handleException");
      return;
    }
    a(this.b, paramThrowable);
  }
  
  public void a(Context paramContext)
  {
    if (Thread.getDefaultUncaughtExceptionHandler() == this)
    {
      Log.a("MobclickAgent", "can't call onError more than once!");
      return;
    }
    this.b = paramContext;
    this.a = Thread.getDefaultUncaughtExceptionHandler();
    Thread.setDefaultUncaughtExceptionHandler(this);
  }
  
  void a(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (TextUtils.isEmpty(paramString))) {
      return;
    }
    try
    {
      Object localObject2 = g.a();
      Object localObject1 = localObject2.split(" ")[0];
      String str = localObject2.split(" ")[1];
      localObject2 = new JSONObject();
      ((JSONObject)localObject2).put("date", localObject1);
      ((JSONObject)localObject2).put("time", str);
      ((JSONObject)localObject2).put("context", paramString);
      ((JSONObject)localObject2).put("type", "error");
      ((JSONObject)localObject2).put("version", b.d(paramContext));
      localObject1 = b(paramContext);
      paramString = (String)localObject1;
      if (localObject1 == null) {
        paramString = new JSONArray();
      }
      paramString.put(localObject2);
      paramContext = paramContext.openFileOutput("com_umeng__crash.cache", 0);
      paramContext.write(paramString.toString().getBytes());
      paramContext.flush();
      paramContext.close();
      return;
    }
    catch (Exception paramContext)
    {
      Log.b("MobclickAgent", "an error occured while writing report file...", paramContext);
      paramContext.printStackTrace();
    }
  }
  
  void a(Context paramContext, Throwable paramThrowable)
  {
    if ((paramContext == null) || (paramThrowable == null)) {
      return;
    }
    StringWriter localStringWriter = new StringWriter();
    PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
    paramThrowable.printStackTrace(localPrintWriter);
    for (paramThrowable = paramThrowable.getCause(); paramThrowable != null; paramThrowable = paramThrowable.getCause()) {
      paramThrowable.printStackTrace(localPrintWriter);
    }
    paramThrowable = localStringWriter.toString();
    localPrintWriter.close();
    a(paramContext, paramThrowable);
  }
  
  JSONArray b(Context paramContext)
  {
    Object localObject = null;
    if (paramContext == null) {}
    File localFile;
    StringBuffer localStringBuffer;
    for (;;)
    {
      return null;
      localFile = new File(paramContext.getFilesDir(), "com_umeng__crash.cache");
      try
      {
        if (localFile.exists())
        {
          paramContext = paramContext.openFileInput("com_umeng__crash.cache");
          localStringBuffer = new StringBuffer();
          byte[] arrayOfByte = new byte['Ѐ'];
          for (;;)
          {
            int i = paramContext.read(arrayOfByte);
            if (i == -1) {
              break;
            }
            localStringBuffer.append(new String(arrayOfByte, 0, i));
          }
          try
          {
            localFile.delete();
            return paramContext;
          }
          catch (Exception localException)
          {
            localException.printStackTrace();
            return paramContext;
          }
        }
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
        paramContext = (Context)localObject;
      }
    }
    paramContext.close();
    if (localStringBuffer.length() != 0) {}
    for (paramContext = new JSONArray(localStringBuffer.toString());; paramContext = null) {
      break;
    }
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    a(paramThrowable);
    if (this.a != null) {
      this.a.uncaughtException(paramThread, paramThrowable);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\analytics\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */