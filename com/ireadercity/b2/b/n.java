package com.ireadercity.b2.b;

import com.ireadercity.b2.a;
import com.ireadercity.b2.bean.b;
import com.youloft.natize.PDF;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class n
{
  private static n c;
  private static int d = 1000;
  public final int a = 3;
  private ConcurrentLinkedQueue<WeakHashMap<String, PDF>> b = new ConcurrentLinkedQueue();
  
  static
  {
    System.loadLibrary("ylpdf");
  }
  
  /* Error */
  private android.graphics.Bitmap a(PDF paramPDF, int paramInt1, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 40	java/lang/StringBuilder
    //   5: dup
    //   6: ldc 42
    //   8: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   11: aload_1
    //   12: getfield 50	com/youloft/natize/PDF:mFileName	Ljava/lang/String;
    //   15: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   18: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   21: pop
    //   22: aload_1
    //   23: ifnull +14 -> 37
    //   26: aload_1
    //   27: invokevirtual 62	com/youloft/natize/PDF:isValid	()Z
    //   30: istore 5
    //   32: iload 5
    //   34: ifne +11 -> 45
    //   37: aconst_null
    //   38: astore 6
    //   40: aload_0
    //   41: monitorexit
    //   42: aload 6
    //   44: areturn
    //   45: aload_1
    //   46: iconst_0
    //   47: iload_2
    //   48: iconst_0
    //   49: iconst_0
    //   50: iconst_0
    //   51: iconst_0
    //   52: iconst_0
    //   53: new 64	com/youloft/natize/PDF$Size
    //   56: dup
    //   57: iload_3
    //   58: iload 4
    //   60: invokespecial 67	com/youloft/natize/PDF$Size:<init>	(II)V
    //   63: invokevirtual 71	com/youloft/natize/PDF:renderPage	(IIIIIZZLcom/youloft/natize/PDF$Size;)[I
    //   66: astore 6
    //   68: getstatic 76	com/ireadercity/b2/a:U	I
    //   71: bipush 8
    //   73: if_icmplt +44 -> 117
    //   76: aload 6
    //   78: iload_3
    //   79: iload 4
    //   81: getstatic 82	android/graphics/Bitmap$Config:RGB_565	Landroid/graphics/Bitmap$Config;
    //   84: invokestatic 88	android/graphics/Bitmap:createBitmap	([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   87: astore 6
    //   89: new 40	java/lang/StringBuilder
    //   92: dup
    //   93: ldc 90
    //   95: invokespecial 44	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   98: aload_1
    //   99: getfield 50	com/youloft/natize/PDF:mFileName	Ljava/lang/String;
    //   102: invokevirtual 54	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   108: pop
    //   109: goto -69 -> 40
    //   112: astore_1
    //   113: aload_0
    //   114: monitorexit
    //   115: aload_1
    //   116: athrow
    //   117: aload 6
    //   119: iload_3
    //   120: iload 4
    //   122: getstatic 82	android/graphics/Bitmap$Config:RGB_565	Landroid/graphics/Bitmap$Config;
    //   125: invokestatic 88	android/graphics/Bitmap:createBitmap	([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   128: astore 6
    //   130: goto -41 -> 89
    //   133: astore 6
    //   135: aload 6
    //   137: invokevirtual 93	java/lang/OutOfMemoryError:printStackTrace	()V
    //   140: aconst_null
    //   141: astore 6
    //   143: invokestatic 95	com/ireadercity/b2/a:d	()V
    //   146: goto -57 -> 89
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	this	n
    //   0	149	1	paramPDF	PDF
    //   0	149	2	paramInt1	int
    //   0	149	3	paramInt2	int
    //   0	149	4	paramInt3	int
    //   30	3	5	bool	boolean
    //   38	91	6	localObject1	Object
    //   133	3	6	localOutOfMemoryError	OutOfMemoryError
    //   141	1	6	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	22	112	finally
    //   26	32	112	finally
    //   45	68	112	finally
    //   68	89	112	finally
    //   89	109	112	finally
    //   117	130	112	finally
    //   135	140	112	finally
    //   143	146	112	finally
    //   68	89	133	java/lang/OutOfMemoryError
    //   117	130	133	java/lang/OutOfMemoryError
  }
  
  public static n a()
  {
    try
    {
      if (c == null) {
        c = new n();
      }
      n localn = c;
      return localn;
    }
    finally {}
  }
  
  private PDF b(String paramString)
  {
    for (;;)
    {
      Object localObject;
      try
      {
        localObject = this.b.iterator();
        if (!((Iterator)localObject).hasNext()) {
          break label128;
        }
        WeakHashMap localWeakHashMap = (WeakHashMap)((Iterator)localObject).next();
        if ((localWeakHashMap == null) || (localWeakHashMap.get(paramString) == null)) {
          continue;
        }
        localObject = (PDF)localWeakHashMap.get(paramString);
        if (localObject != null) {
          return (PDF)localObject;
        }
        try
        {
          paramString = new PDF(new File(paramString), 1);
          if (!paramString.isValid()) {
            localObject = null;
          }
        }
        catch (FileNotFoundException paramString)
        {
          paramString.printStackTrace();
          paramString = (String)localObject;
          continue;
        }
        localObject = paramString;
      }
      finally {}
      if (paramString != null)
      {
        this.b.add(new WeakHashMap());
        localObject = paramString;
        continue;
        label128:
        localObject = null;
      }
    }
  }
  
  public final int a(b paramb)
  {
    paramb = new File(a.n + "/" + paramb.j());
    if (!paramb.isDirectory()) {
      return 0;
    }
    return paramb.list(new o(this)).length;
  }
  
  /* Error */
  public final android.graphics.Bitmap a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial 160	com/ireadercity/b2/b/n:b	(Ljava/lang/String;)Lcom/youloft/natize/PDF;
    //   7: astore_1
    //   8: aload_1
    //   9: ifnonnull +9 -> 18
    //   12: aconst_null
    //   13: astore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_1
    //   17: areturn
    //   18: new 64	com/youloft/natize/PDF$Size
    //   21: dup
    //   22: invokespecial 161	com/youloft/natize/PDF$Size:<init>	()V
    //   25: astore 5
    //   27: aload_1
    //   28: iconst_0
    //   29: aload 5
    //   31: invokevirtual 165	com/youloft/natize/PDF:getPageSize	(ILcom/youloft/natize/PDF$Size;)I
    //   34: pop
    //   35: ldc -90
    //   37: aload 5
    //   39: getfield 169	com/youloft/natize/PDF$Size:height	I
    //   42: aload 5
    //   44: getfield 172	com/youloft/natize/PDF$Size:width	I
    //   47: imul
    //   48: i2f
    //   49: fdiv
    //   50: fstore_3
    //   51: fload_3
    //   52: f2d
    //   53: ldc2_w 173
    //   56: dcmpl
    //   57: ifle +60 -> 117
    //   60: ldc -81
    //   62: fstore_2
    //   63: getstatic 24	com/ireadercity/b2/b/n:d	I
    //   66: i2f
    //   67: fload_2
    //   68: fmul
    //   69: f2i
    //   70: istore 4
    //   72: new 40	java/lang/StringBuilder
    //   75: dup
    //   76: invokespecial 135	java/lang/StringBuilder:<init>	()V
    //   79: iload 4
    //   81: invokevirtual 178	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   84: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: pop
    //   88: aload_0
    //   89: aload_1
    //   90: iload 4
    //   92: aload 5
    //   94: getfield 172	com/youloft/natize/PDF$Size:width	I
    //   97: i2f
    //   98: fload_2
    //   99: fmul
    //   100: f2i
    //   101: fload_2
    //   102: aload 5
    //   104: getfield 169	com/youloft/natize/PDF$Size:height	I
    //   107: i2f
    //   108: fmul
    //   109: f2i
    //   110: invokespecial 180	com/ireadercity/b2/b/n:a	(Lcom/youloft/natize/PDF;III)Landroid/graphics/Bitmap;
    //   113: astore_1
    //   114: goto -100 -> 14
    //   117: fload_3
    //   118: fstore_2
    //   119: fload_3
    //   120: f2d
    //   121: ldc2_w 181
    //   124: dcmpg
    //   125: ifge -62 -> 63
    //   128: ldc -73
    //   130: fstore_2
    //   131: goto -68 -> 63
    //   134: astore_1
    //   135: aload_0
    //   136: monitorexit
    //   137: aload_1
    //   138: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	this	n
    //   0	139	1	paramString	String
    //   62	69	2	f1	float
    //   50	70	3	f2	float
    //   70	21	4	i	int
    //   25	78	5	localSize	com.youloft.natize.PDF.Size
    // Exception table:
    //   from	to	target	type
    //   2	8	134	finally
    //   18	51	134	finally
    //   63	114	134	finally
  }
  
  public final List<String> b(b paramb)
  {
    paramb = a.n + "/" + paramb.j();
    Object localObject1 = new File(paramb);
    Object localObject2 = new p(this);
    if (((File)localObject1).isDirectory())
    {
      new ArrayList();
      ArrayList localArrayList = new ArrayList();
      localObject1 = Arrays.asList(((File)localObject1).list((FilenameFilter)localObject2)).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        localArrayList.add(paramb + "/" + (String)localObject2);
      }
      Collections.sort(localArrayList);
      return localArrayList;
    }
    return null;
  }
  
  public final void b()
  {
    if (this.b != null)
    {
      Iterator localIterator1 = this.b.iterator();
      while (localIterator1.hasNext())
      {
        WeakHashMap localWeakHashMap = (WeakHashMap)localIterator1.next();
        Iterator localIterator2 = localWeakHashMap.keySet().iterator();
        while (localIterator2.hasNext()) {
          ((PDF)localWeakHashMap.get((String)localIterator2.next())).finalize();
        }
      }
      this.b.clear();
    }
    a.d();
  }
  
  protected final void finalize()
  {
    if (this.b != null) {
      this.b.clear();
    }
    a.d();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */