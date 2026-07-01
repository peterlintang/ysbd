package com.taobao.munion.p4p.statistics.model;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class c
{
  private static final String F = c.class.getName();
  private static int G = 0;
  public double A;
  public double B;
  public boolean C;
  public String D;
  public String E;
  private byte[] H;
  private Context I;
  private e J;
  public String a;
  public int b;
  public int c;
  public String d;
  public String e;
  public String f;
  public String g;
  public byte h;
  public String i;
  public int j;
  public int k;
  public int l;
  public int m;
  public int n;
  public int o;
  public boolean p;
  public byte q;
  public boolean r;
  public long s;
  public int t;
  public int u;
  public int v;
  public int w;
  public int x;
  public int y;
  public String z;
  
  private c() {}
  
  private c(Context paramContext, Bundle paramBundle)
  {
    this.I = paramContext;
    paramContext = com.taobao.munion.p4p.statistics.a.a().b();
    if (paramContext != null)
    {
      this.t = paramContext.d;
      this.u = paramContext.e;
      this.A = paramContext.g;
      this.B = paramContext.h;
    }
    d();
  }
  
  public static int a(InputStream paramInputStream)
  {
    int i1 = paramInputStream.read() << 8 & 0xFF00 | 0x0 | paramInputStream.read() & 0xFF;
    if (i1 != 65535) {
      return i1;
    }
    return -1;
  }
  
  public static c a(Context paramContext, Bundle paramBundle)
  {
    return new c(paramContext, paramBundle);
  }
  
  public static c a(String paramString)
  {
    return a(paramString.getBytes());
  }
  
  private static c a(byte[] paramArrayOfByte)
  {
    boolean bool2 = true;
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 7))
    {
      byte[] arrayOfByte1 = Base64.decode(paramArrayOfByte, 0);
      byte[] arrayOfByte2 = new byte[4];
      byte[] arrayOfByte3 = new byte[arrayOfByte1.length - 7];
      paramArrayOfByte = new c();
      ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(arrayOfByte1);
      paramArrayOfByte.a = a((byte)localByteArrayInputStream.read(), (byte)localByteArrayInputStream.read());
      paramArrayOfByte.H = a((byte)localByteArrayInputStream.read(), (byte)localByteArrayInputStream.read(), (byte)localByteArrayInputStream.read(), (byte)localByteArrayInputStream.read());
      paramArrayOfByte.b = localByteArrayInputStream.read();
      System.arraycopy(arrayOfByte1, 7, arrayOfByte3, 0, arrayOfByte3.length);
      a(com.umeng.newxp.common.a.b.a.a(arrayOfByte3), arrayOfByte2, 0);
      if ((paramArrayOfByte.H != null) && (com.umeng.common.ufp.b.a(paramArrayOfByte.H, arrayOfByte2)))
      {
        paramArrayOfByte.d = c(localByteArrayInputStream);
        paramArrayOfByte.c = a(localByteArrayInputStream);
        paramArrayOfByte.e = a(localByteArrayInputStream, 17);
        paramArrayOfByte.f = c(localByteArrayInputStream);
        paramArrayOfByte.g = c(localByteArrayInputStream);
        paramArrayOfByte.h = ((byte)localByteArrayInputStream.read());
        paramArrayOfByte.i = c(localByteArrayInputStream);
        paramArrayOfByte.j = a(localByteArrayInputStream);
        paramArrayOfByte.k = a(localByteArrayInputStream);
        paramArrayOfByte.l = localByteArrayInputStream.read();
        paramArrayOfByte.m = localByteArrayInputStream.read();
        paramArrayOfByte.n = localByteArrayInputStream.read();
        paramArrayOfByte.o = localByteArrayInputStream.read();
        paramArrayOfByte.s = b(localByteArrayInputStream);
        if ((byte)localByteArrayInputStream.read() == 1)
        {
          bool1 = true;
          paramArrayOfByte.p = bool1;
          paramArrayOfByte.q = ((byte)localByteArrayInputStream.read());
          if ((byte)localByteArrayInputStream.read() != 1) {
            break label540;
          }
        }
        label540:
        for (boolean bool1 = bool2;; bool1 = false)
        {
          paramArrayOfByte.r = bool1;
          paramArrayOfByte.t = a(localByteArrayInputStream);
          paramArrayOfByte.u = a(localByteArrayInputStream);
          paramArrayOfByte.J.a = a(localByteArrayInputStream);
          paramArrayOfByte.J.e = a(localByteArrayInputStream);
          paramArrayOfByte.J.f = a(localByteArrayInputStream);
          paramArrayOfByte.J.c = a(localByteArrayInputStream);
          paramArrayOfByte.J.d = a(localByteArrayInputStream);
          paramArrayOfByte.J.g = a(localByteArrayInputStream);
          paramArrayOfByte.J.h = a(localByteArrayInputStream);
          paramArrayOfByte.J.i = a(localByteArrayInputStream);
          paramArrayOfByte.v = ((byte)localByteArrayInputStream.read());
          paramArrayOfByte.w = a(localByteArrayInputStream);
          paramArrayOfByte.x = a(localByteArrayInputStream);
          paramArrayOfByte.y = a(localByteArrayInputStream);
          paramArrayOfByte.z = c(localByteArrayInputStream);
          paramArrayOfByte.A = d(localByteArrayInputStream);
          paramArrayOfByte.B = d(localByteArrayInputStream);
          paramArrayOfByte.C = false;
          paramArrayOfByte.D = c(localByteArrayInputStream);
          paramArrayOfByte.E = c(localByteArrayInputStream);
          try
          {
            localByteArrayInputStream.close();
            return paramArrayOfByte;
          }
          catch (IOException localIOException)
          {
            localIOException = localIOException;
            localIOException.printStackTrace();
            return paramArrayOfByte;
          }
          finally {}
          bool1 = false;
          break;
        }
      }
      else
      {
        throw new SecurityException();
      }
    }
    throw new NullPointerException();
  }
  
  private static String a(byte paramByte1, byte paramByte2)
  {
    return new Integer(paramByte1).toString() + "." + new Integer(paramByte2).toString();
  }
  
  public static String a(InputStream paramInputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    paramInputStream.read(arrayOfByte);
    if (arrayOfByte[0] != -1) {
      return new String(arrayOfByte);
    }
    return null;
  }
  
  private static void a(byte paramByte, byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > paramInt)) {
      paramArrayOfByte[paramInt] = paramByte;
    }
  }
  
  public static void a(OutputStream paramOutputStream, double paramDouble, int paramInt)
  {
    paramInt = -1;
    int i1;
    if (paramDouble != 0.0D)
    {
      paramInt = (int)Math.floor(Math.abs(paramDouble));
      i1 = (int)Math.floor(com.umeng.common.ufp.b.a(Math.abs(paramDouble)) * 60.0D);
      if (paramDouble <= 0.0D) {
        break label69;
      }
      paramInt += 180;
    }
    for (;;)
    {
      paramInt = paramInt << 6 & 0x7FC0 | i1 & 0x3F | 0x0;
      a(paramOutputStream, paramInt);
      return;
      label69:
      paramInt = 180 - paramInt;
    }
  }
  
  public static void a(OutputStream paramOutputStream, int paramInt)
  {
    paramOutputStream.write((byte)(paramInt >> 8));
    paramOutputStream.write((byte)(paramInt >> 0));
  }
  
  public static void a(OutputStream paramOutputStream, String paramString)
  {
    if (paramString != null)
    {
      if (paramString.trim().length() > 0)
      {
        paramOutputStream.write(paramString.getBytes());
        return;
      }
      paramOutputStream.write((byte)paramString.trim().length());
      return;
    }
    paramOutputStream.write(c.b.b());
  }
  
  private static void a(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramString != null) && (paramString.trim().length() > 0) && (paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      paramString = paramString.split("\\.");
      paramArrayOfByte[paramInt] = Integer.valueOf(paramString[0]).byteValue();
      paramArrayOfByte[(paramInt + 1)] = Integer.valueOf(paramString[1]).byteValue();
    }
  }
  
  private static void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    if ((paramArrayOfByte1 != null) && (paramArrayOfByte1.length >= paramInt + 4) && (paramArrayOfByte2 != null) && (paramArrayOfByte2.length >= 16))
    {
      int i1 = paramInt + 1;
      paramArrayOfByte2[paramInt] = paramArrayOfByte1[0];
      paramInt = i1 + 1;
      paramArrayOfByte2[i1] = paramArrayOfByte1[5];
      paramArrayOfByte2[paramInt] = paramArrayOfByte1[10];
      paramArrayOfByte2[(paramInt + 1)] = paramArrayOfByte1[15];
    }
  }
  
  private static byte[] a(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4)
  {
    return new byte[] { paramByte1, paramByte2, paramByte3, paramByte4 };
  }
  
  public static int b(InputStream paramInputStream)
  {
    int i1 = paramInputStream.read() << 24 & 0xFF000000 | 0x0 | paramInputStream.read() << 16 & 0xFF0000 | paramInputStream.read() << 8 & 0xFF00 | paramInputStream.read() & 0xFF;
    if (i1 != -1) {
      return i1;
    }
    return -1;
  }
  
  private String b()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("emulator:" + localStringBuilder);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("osVersion:" + this.c);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("MAC:" + this.e);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("IMSI:" + this.f);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("deviceId:" + this.g);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("deviceType:" + this.h);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("manufacturer:" + this.i);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("appWidth:" + this.j);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("appHight:" + this.k);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("screenDensity:" + this.l);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("screenBright:" + this.m);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("netType:" + this.n);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("netProtocol:" + this.o);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("appRunTime:" + G);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("isConvered:-1");
    localStringBuilder.append("\r\n");
    localStringBuilder.append("adOpenness:" + this.q);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("inVisio:-1");
    localStringBuilder.append("\r\n");
    localStringBuilder.append("adWidth:" + this.t);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("adHeight:" + this.u);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("touchNum:" + this.J.a);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("touchDownX:" + this.J.e);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("touchDownY:" + this.J.f);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("touchUpX:" + this.J.c);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("touchUpY:" + this.J.d);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("touchMoveX:" + this.J.a());
    localStringBuilder.append("\r\n");
    localStringBuilder.append("touchMoveY:" + this.J.b());
    localStringBuilder.append("\r\n");
    localStringBuilder.append("touchTime:" + this.J.i);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("availPower:" + this.v);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("totalMemory:" + this.w);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("availMemory:" + this.x);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("netTraffic:" + this.y);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("packName:" + this.z);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("longitude:" + this.A);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("latitude:" + this.B);
    localStringBuilder.append("\r\n");
    localStringBuilder.append("isRoot:-1");
    localStringBuilder.append("\r\n");
    return localStringBuilder.toString();
  }
  
  public static void b(OutputStream paramOutputStream, int paramInt)
  {
    paramOutputStream.write((byte)(paramInt >> 24));
    paramOutputStream.write((byte)(paramInt >> 16));
    paramOutputStream.write((byte)(paramInt >> 8));
    paramOutputStream.write((byte)(paramInt >> 0));
  }
  
  public static void b(OutputStream paramOutputStream, String paramString)
  {
    if (paramString != null)
    {
      if (paramString.trim().length() > 0)
      {
        paramOutputStream.write((byte)paramString.length());
        paramOutputStream.write(paramString.getBytes());
        return;
      }
      paramOutputStream.write((byte)paramString.trim().length());
      return;
    }
    paramOutputStream.write(c.b.c());
  }
  
  public static String c(InputStream paramInputStream)
  {
    byte[] arrayOfByte = null;
    int i1 = (byte)paramInputStream.read();
    if (i1 > 0)
    {
      arrayOfByte = new byte[i1];
      paramInputStream.read(arrayOfByte);
      paramInputStream = new String(arrayOfByte);
    }
    do
    {
      return paramInputStream;
      paramInputStream = arrayOfByte;
    } while (i1 != 0);
    return "";
  }
  
  private byte[] c()
  {
    int i2 = 1;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    b(localByteArrayOutputStream, this.d);
    a(localByteArrayOutputStream, this.c);
    a(localByteArrayOutputStream, this.e);
    b(localByteArrayOutputStream, this.f);
    b(localByteArrayOutputStream, this.g);
    localByteArrayOutputStream.write(this.h);
    b(localByteArrayOutputStream, this.i);
    a(localByteArrayOutputStream, this.j);
    a(localByteArrayOutputStream, this.k);
    localByteArrayOutputStream.write((byte)this.l);
    localByteArrayOutputStream.write((byte)this.m);
    localByteArrayOutputStream.write((byte)this.n);
    localByteArrayOutputStream.write((byte)this.o);
    b(localByteArrayOutputStream, G);
    int i1;
    if (this.p) {
      i1 = 1;
    }
    for (;;)
    {
      localByteArrayOutputStream.write(i1);
      localByteArrayOutputStream.write(this.q);
      label173:
      byte[] arrayOfByte1;
      if (this.r)
      {
        i1 = i2;
        localByteArrayOutputStream.write(i1);
        a(localByteArrayOutputStream, this.t);
        a(localByteArrayOutputStream, this.u);
        a(localByteArrayOutputStream, this.J.a);
        a(localByteArrayOutputStream, this.J.e);
        a(localByteArrayOutputStream, this.J.f);
        a(localByteArrayOutputStream, this.J.c);
        a(localByteArrayOutputStream, this.J.d);
        a(localByteArrayOutputStream, this.J.a());
        a(localByteArrayOutputStream, this.J.b());
        a(localByteArrayOutputStream, (int)this.J.i);
        localByteArrayOutputStream.write((byte)this.v);
        a(localByteArrayOutputStream, this.w);
        a(localByteArrayOutputStream, this.x);
        a(localByteArrayOutputStream, this.y);
        b(localByteArrayOutputStream, this.z);
        a(localByteArrayOutputStream, this.A, 180);
        a(localByteArrayOutputStream, this.B, 180);
        localByteArrayOutputStream.write(c.b.a());
        b(localByteArrayOutputStream, this.D);
        b(localByteArrayOutputStream, this.E);
        byte[] arrayOfByte2 = localByteArrayOutputStream.toByteArray();
        arrayOfByte1 = new byte[arrayOfByte2.length + 7];
        this.H = com.umeng.newxp.common.a.b.a.a(arrayOfByte2);
        a(this.a, arrayOfByte1, 0);
        a(this.H, arrayOfByte1, 2);
        a((byte)this.b, arrayOfByte1, 6);
        System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 7, arrayOfByte2.length);
      }
      try
      {
        localByteArrayOutputStream.close();
        return Base64.encode(arrayOfByte1, 0);
        i1 = 0;
        continue;
        i1 = 0;
        break label173;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          localIOException = localIOException;
          localIOException.printStackTrace();
        }
      }
      finally {}
    }
  }
  
  public static double d(InputStream paramInputStream)
  {
    double d1 = 0.0D;
    int i1 = a(paramInputStream);
    double d2;
    if (i1 != -1)
    {
      d1 = i1 & 0x3F;
      d2 = ((i1 & 0x7FC0) >> 6) - 180.0D;
      if (d2 < 0.0D) {
        d1 = -(Math.abs(d2) + Math.abs(d1) / 60.0D);
      }
    }
    else
    {
      return d1;
    }
    return Math.abs(d2) + Math.abs(d1) / 60.0D;
  }
  
  private void d()
  {
    this.a = "1.2";
    if (G == 0) {
      G = com.umeng.common.ufp.b.d();
    }
    this.b = 1;
    this.c = com.umeng.common.ufp.b.c();
    this.d = com.umeng.common.ufp.b.b();
    this.e = com.umeng.common.ufp.b.D(this.I);
    this.f = com.umeng.common.ufp.b.a(this.I);
    this.g = com.umeng.common.ufp.b.q(this.I);
    this.h = 0;
    this.i = com.umeng.common.ufp.b.e();
    this.j = com.umeng.common.ufp.b.b(this.I);
    this.k = com.umeng.common.ufp.b.c(this.I);
    this.p = false;
    this.r = false;
    this.q = -1;
    this.v = -1;
    this.l = com.umeng.common.ufp.b.d(this.I);
    this.m = com.umeng.common.ufp.b.e(this.I);
    this.n = com.umeng.common.ufp.b.f(this.I);
    this.o = com.umeng.common.ufp.b.g(this.I);
    this.w = com.umeng.common.ufp.b.h(this.I);
    this.x = com.umeng.common.ufp.b.i(this.I);
    this.y = -1;
    this.z = com.umeng.common.ufp.b.H(this.I);
    this.C = false;
    this.D = com.umeng.common.ufp.b.a();
    this.E = "";
  }
  
  public String a()
  {
    this.J = ((b)com.taobao.munion.p4p.statistics.a.a().b(0)).a();
    return com.umeng.common.ufp.b.a(new String(c()));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\p4p\statistics\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */