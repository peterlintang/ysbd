package com.umeng.socialize.media;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Environment;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UMImage
  extends BaseMediaObject
{
  public static final Parcelable.Creator<UMImage> CREATOR = new a();
  private static final String d = UMImage.class.getName();
  private static final long e = 104857600L;
  private static final long f = 10485760L;
  private static final String g = "/download/umsocial/";
  private UMImage.a h;
  private File i;
  private String j = "";
  private byte[] k;
  
  public UMImage(Context paramContext, int paramInt)
  {
    super("");
    try
    {
      this.j = paramContext.getCacheDir().getCanonicalPath();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          a(Bitmap.createBitmap(((BitmapDrawable)paramContext.getResources().getDrawable(paramInt)).getBitmap()));
          return;
        }
        catch (Exception paramContext)
        {
          String str = d;
          new StringBuilder("Sorry cannot setImage..[").append(paramContext.toString()).append("]").toString();
        }
        localException = localException;
        localException.printStackTrace();
      }
    }
  }
  
  public UMImage(Context paramContext, Bitmap paramBitmap)
  {
    super("");
    try
    {
      this.j = paramContext.getCacheDir().getCanonicalPath();
      a(paramBitmap);
      return;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
      }
    }
  }
  
  public UMImage(Context paramContext, File paramFile)
  {
    super("");
    try
    {
      this.j = paramContext.getCacheDir().getCanonicalPath();
      if ((paramFile == null) || (!paramFile.exists())) {
        paramContext = d;
      }
      this.h = UMImage.a.a;
      this.i = paramFile;
      return;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
      }
    }
  }
  
  public UMImage(Context paramContext, String paramString)
  {
    super(paramString);
    try
    {
      this.j = paramContext.getCacheDir().getCanonicalPath();
      return;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public UMImage(Context paramContext, byte[] paramArrayOfByte)
  {
    super("");
    try
    {
      this.j = paramContext.getCacheDir().getCanonicalPath();
      this.k = paramArrayOfByte;
      new Thread(new b(this, paramArrayOfByte)).start();
      return;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
      }
    }
  }
  
  protected UMImage(Parcel paramParcel)
  {
    super(paramParcel);
    String str = paramParcel.readString();
    UMImage.a[] arrayOfa;
    int n;
    int m;
    if (!TextUtils.isEmpty(str))
    {
      arrayOfa = UMImage.a.values();
      n = arrayOfa.length;
      m = 0;
    }
    for (;;)
    {
      if (m >= n)
      {
        this.i = new File(paramParcel.readString());
        this.j = paramParcel.readString();
        m = paramParcel.readInt();
        if (m > 0)
        {
          this.k = new byte[m];
          paramParcel.readByteArray(this.k);
        }
        return;
      }
      UMImage.a locala = arrayOfa[m];
      if (locala.toString().equals(str)) {
        this.h = locala;
      }
      m += 1;
    }
  }
  
  private File a(String paramString)
  {
    paramString = new File(getCache(), paramString);
    if (paramString.exists()) {
      paramString.delete();
    }
    paramString.createNewFile();
    return paramString;
  }
  
  private void a(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return;
    }
    Bitmap localBitmap = Bitmap.createBitmap(paramBitmap);
    this.k = b(localBitmap);
    new Thread(new c(this, paramBitmap, localBitmap)).start();
  }
  
  private static byte[] a(File paramFile)
  {
    if ((paramFile == null) || (!paramFile.exists())) {
      paramFile = null;
    }
    byte[] arrayOfByte;
    String str;
    do
    {
      return paramFile;
      arrayOfByte = b(paramFile);
      if ((arrayOfByte == null) || (arrayOfByte.length <= 0)) {
        break;
      }
      str = com.umeng.socialize.common.a.a(arrayOfByte);
      paramFile = arrayOfByte;
    } while (com.umeng.socialize.common.a.m[1].equals(str));
    return a(arrayOfByte);
    return null;
  }
  
  /* Error */
  private static byte[] a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: iconst_0
    //   4: aload_0
    //   5: arraylength
    //   6: invokestatic 231	android/graphics/BitmapFactory:decodeByteArray	([BII)Landroid/graphics/Bitmap;
    //   9: astore_0
    //   10: new 233	java/io/ByteArrayOutputStream
    //   13: dup
    //   14: invokespecial 234	java/io/ByteArrayOutputStream:<init>	()V
    //   17: astore_2
    //   18: aload_0
    //   19: getstatic 240	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   22: bipush 100
    //   24: aload_2
    //   25: invokevirtual 244	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   28: pop
    //   29: aload_2
    //   30: invokevirtual 247	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   33: astore_1
    //   34: aload_0
    //   35: ifnull +7 -> 42
    //   38: aload_0
    //   39: invokevirtual 250	android/graphics/Bitmap:recycle	()V
    //   42: aload_2
    //   43: invokevirtual 253	java/io/ByteArrayOutputStream:close	()V
    //   46: aload_1
    //   47: astore_0
    //   48: aload_0
    //   49: areturn
    //   50: astore_0
    //   51: aconst_null
    //   52: astore_1
    //   53: aconst_null
    //   54: astore_0
    //   55: aload_0
    //   56: ifnull +7 -> 63
    //   59: aload_0
    //   60: invokevirtual 250	android/graphics/Bitmap:recycle	()V
    //   63: aload_3
    //   64: astore_0
    //   65: aload_1
    //   66: ifnull -18 -> 48
    //   69: aload_1
    //   70: invokevirtual 253	java/io/ByteArrayOutputStream:close	()V
    //   73: aconst_null
    //   74: areturn
    //   75: astore_0
    //   76: aconst_null
    //   77: areturn
    //   78: astore_1
    //   79: aconst_null
    //   80: astore_0
    //   81: aconst_null
    //   82: astore_2
    //   83: aload_0
    //   84: ifnull +7 -> 91
    //   87: aload_0
    //   88: invokevirtual 250	android/graphics/Bitmap:recycle	()V
    //   91: aload_2
    //   92: ifnull +7 -> 99
    //   95: aload_2
    //   96: invokevirtual 253	java/io/ByteArrayOutputStream:close	()V
    //   99: aload_1
    //   100: athrow
    //   101: astore_0
    //   102: aload_1
    //   103: areturn
    //   104: astore_0
    //   105: goto -6 -> 99
    //   108: astore_1
    //   109: aconst_null
    //   110: astore_2
    //   111: goto -28 -> 83
    //   114: astore_1
    //   115: goto -32 -> 83
    //   118: astore_1
    //   119: aconst_null
    //   120: astore_1
    //   121: goto -66 -> 55
    //   124: astore_1
    //   125: aload_2
    //   126: astore_1
    //   127: goto -72 -> 55
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	paramArrayOfByte	byte[]
    //   33	37	1	arrayOfByte1	byte[]
    //   78	25	1	arrayOfByte2	byte[]
    //   108	1	1	localObject1	Object
    //   114	1	1	localObject2	Object
    //   118	1	1	localException1	Exception
    //   120	1	1	localObject3	Object
    //   124	1	1	localException2	Exception
    //   126	1	1	localByteArrayOutputStream1	java.io.ByteArrayOutputStream
    //   17	109	2	localByteArrayOutputStream2	java.io.ByteArrayOutputStream
    //   1	63	3	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   2	10	50	java/lang/Exception
    //   69	73	75	java/io/IOException
    //   2	10	78	finally
    //   42	46	101	java/io/IOException
    //   95	99	104	java/io/IOException
    //   10	18	108	finally
    //   18	34	114	finally
    //   10	18	118	java/lang/Exception
    //   18	34	124	java/lang/Exception
  }
  
  /* Error */
  private static File b(byte[] paramArrayOfByte, File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 255	java/io/BufferedOutputStream
    //   5: dup
    //   6: new 257	java/io/FileOutputStream
    //   9: dup
    //   10: aload_1
    //   11: invokespecial 260	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   14: invokespecial 263	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   17: astore_3
    //   18: aload_3
    //   19: astore_2
    //   20: aload_3
    //   21: aload_0
    //   22: invokevirtual 266	java/io/BufferedOutputStream:write	([B)V
    //   25: aload_3
    //   26: invokevirtual 267	java/io/BufferedOutputStream:close	()V
    //   29: aload_1
    //   30: areturn
    //   31: astore 4
    //   33: aconst_null
    //   34: astore_0
    //   35: aload_0
    //   36: astore_2
    //   37: aload 4
    //   39: invokevirtual 94	java/lang/Exception:printStackTrace	()V
    //   42: aload_0
    //   43: ifnull -14 -> 29
    //   46: aload_0
    //   47: invokevirtual 267	java/io/BufferedOutputStream:close	()V
    //   50: aload_1
    //   51: areturn
    //   52: astore_0
    //   53: aload_1
    //   54: areturn
    //   55: astore_0
    //   56: aload_2
    //   57: astore_1
    //   58: aload_1
    //   59: ifnull +7 -> 66
    //   62: aload_1
    //   63: invokevirtual 267	java/io/BufferedOutputStream:close	()V
    //   66: aload_0
    //   67: athrow
    //   68: astore_1
    //   69: goto -3 -> 66
    //   72: astore_0
    //   73: aload_1
    //   74: areturn
    //   75: astore_0
    //   76: aload_2
    //   77: astore_1
    //   78: goto -20 -> 58
    //   81: astore 4
    //   83: aload_3
    //   84: astore_0
    //   85: goto -50 -> 35
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	paramArrayOfByte	byte[]
    //   0	88	1	paramFile	File
    //   1	76	2	localObject	Object
    //   17	67	3	localBufferedOutputStream	java.io.BufferedOutputStream
    //   31	7	4	localException1	Exception
    //   81	1	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   2	18	31	java/lang/Exception
    //   46	50	52	java/io/IOException
    //   2	18	55	finally
    //   62	66	68	java/io/IOException
    //   25	29	72	java/io/IOException
    //   20	25	75	finally
    //   37	42	75	finally
    //   20	25	81	java/lang/Exception
  }
  
  private byte[] b()
  {
    Object localObject2 = null;
    if (isUrlMedia()) {}
    do
    {
      do
      {
        do
        {
          do
          {
            try
            {
              byte[] arrayOfByte = com.umeng.socialize.c.b.b.a(toUrl());
              return arrayOfByte;
            }
            catch (Exception localException)
            {
              localObject1 = d;
              return null;
            }
            if (this.k != null)
            {
              localObject1 = d;
              return this.k;
            }
            localObject1 = localObject2;
          } while (this.h == null);
          localObject1 = localObject2;
        } while (this.h != UMImage.a.a);
        localObject1 = localObject2;
      } while (this.i == null);
      Object localObject1 = localObject2;
    } while (!(this.i instanceof File));
    return a(this.i);
  }
  
  /* Error */
  private static byte[] b(Bitmap paramBitmap)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: new 233	java/io/ByteArrayOutputStream
    //   9: dup
    //   10: invokespecial 234	java/io/ByteArrayOutputStream:<init>	()V
    //   13: astore_2
    //   14: aload_2
    //   15: astore_1
    //   16: aload_0
    //   17: getstatic 283	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   20: bipush 100
    //   22: aload_2
    //   23: invokevirtual 244	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   26: pop
    //   27: aload_2
    //   28: astore_1
    //   29: aload_2
    //   30: invokevirtual 247	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   33: astore_0
    //   34: aload_2
    //   35: invokevirtual 253	java/io/ByteArrayOutputStream:close	()V
    //   38: aload_0
    //   39: areturn
    //   40: astore_1
    //   41: aload_0
    //   42: areturn
    //   43: astore_3
    //   44: aconst_null
    //   45: astore_0
    //   46: aload_0
    //   47: astore_1
    //   48: getstatic 36	com/umeng/socialize/media/UMImage:d	Ljava/lang/String;
    //   51: astore_2
    //   52: aload_0
    //   53: astore_1
    //   54: aload_3
    //   55: invokevirtual 102	java/lang/Exception:toString	()Ljava/lang/String;
    //   58: pop
    //   59: aload_0
    //   60: ifnull -56 -> 4
    //   63: aload_0
    //   64: invokevirtual 253	java/io/ByteArrayOutputStream:close	()V
    //   67: aconst_null
    //   68: areturn
    //   69: astore_0
    //   70: aconst_null
    //   71: areturn
    //   72: astore_0
    //   73: aconst_null
    //   74: astore_1
    //   75: aload_1
    //   76: ifnull +7 -> 83
    //   79: aload_1
    //   80: invokevirtual 253	java/io/ByteArrayOutputStream:close	()V
    //   83: aload_0
    //   84: athrow
    //   85: astore_1
    //   86: goto -3 -> 83
    //   89: astore_0
    //   90: goto -15 -> 75
    //   93: astore_3
    //   94: aload_2
    //   95: astore_0
    //   96: goto -50 -> 46
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	paramBitmap	Bitmap
    //   15	14	1	localObject1	Object
    //   40	1	1	localIOException1	IOException
    //   47	33	1	localBitmap	Bitmap
    //   85	1	1	localIOException2	IOException
    //   13	82	2	localObject2	Object
    //   43	12	3	localException1	Exception
    //   93	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   34	38	40	java/io/IOException
    //   6	14	43	java/lang/Exception
    //   63	67	69	java/io/IOException
    //   6	14	72	finally
    //   79	83	85	java/io/IOException
    //   16	27	89	finally
    //   29	34	89	finally
    //   48	52	89	finally
    //   54	59	89	finally
    //   16	27	93	java/lang/Exception
    //   29	34	93	java/lang/Exception
  }
  
  /* Error */
  private static byte[] b(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: new 285	java/io/FileInputStream
    //   6: dup
    //   7: aload_0
    //   8: invokespecial 286	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   11: astore_2
    //   12: new 233	java/io/ByteArrayOutputStream
    //   15: dup
    //   16: invokespecial 234	java/io/ByteArrayOutputStream:<init>	()V
    //   19: astore_0
    //   20: aload_0
    //   21: astore 4
    //   23: aload_2
    //   24: astore_3
    //   25: sipush 4096
    //   28: newarray <illegal type>
    //   30: astore 6
    //   32: aload_0
    //   33: astore 4
    //   35: aload_2
    //   36: astore_3
    //   37: aload_2
    //   38: aload 6
    //   40: invokevirtual 292	java/io/InputStream:read	([B)I
    //   43: istore_1
    //   44: iload_1
    //   45: iconst_m1
    //   46: if_icmpne +27 -> 73
    //   49: aload_0
    //   50: astore 4
    //   52: aload_2
    //   53: astore_3
    //   54: aload_0
    //   55: invokevirtual 247	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   58: astore 6
    //   60: aload 6
    //   62: astore_3
    //   63: aload_2
    //   64: invokevirtual 293	java/io/InputStream:close	()V
    //   67: aload_0
    //   68: invokevirtual 253	java/io/ByteArrayOutputStream:close	()V
    //   71: aload_3
    //   72: areturn
    //   73: aload_0
    //   74: astore 4
    //   76: aload_2
    //   77: astore_3
    //   78: aload_0
    //   79: aload 6
    //   81: iconst_0
    //   82: iload_1
    //   83: invokevirtual 296	java/io/ByteArrayOutputStream:write	([BII)V
    //   86: goto -54 -> 32
    //   89: astore_3
    //   90: aload_0
    //   91: astore 4
    //   93: aload_2
    //   94: astore_3
    //   95: getstatic 36	com/umeng/socialize/media/UMImage:d	Ljava/lang/String;
    //   98: astore 6
    //   100: aload_2
    //   101: ifnull +7 -> 108
    //   104: aload_2
    //   105: invokevirtual 293	java/io/InputStream:close	()V
    //   108: aload 5
    //   110: astore_3
    //   111: aload_0
    //   112: ifnull -41 -> 71
    //   115: aload_0
    //   116: invokevirtual 253	java/io/ByteArrayOutputStream:close	()V
    //   119: aconst_null
    //   120: areturn
    //   121: astore_0
    //   122: aconst_null
    //   123: areturn
    //   124: astore_0
    //   125: aconst_null
    //   126: astore_2
    //   127: aconst_null
    //   128: astore 4
    //   130: aload_2
    //   131: ifnull +7 -> 138
    //   134: aload_2
    //   135: invokevirtual 293	java/io/InputStream:close	()V
    //   138: aload 4
    //   140: ifnull +8 -> 148
    //   143: aload 4
    //   145: invokevirtual 253	java/io/ByteArrayOutputStream:close	()V
    //   148: aload_0
    //   149: athrow
    //   150: astore_0
    //   151: aload_3
    //   152: areturn
    //   153: astore_2
    //   154: goto -6 -> 148
    //   157: astore_0
    //   158: aconst_null
    //   159: astore 4
    //   161: goto -31 -> 130
    //   164: astore_0
    //   165: aload_3
    //   166: astore_2
    //   167: goto -37 -> 130
    //   170: astore_0
    //   171: aconst_null
    //   172: astore_0
    //   173: aconst_null
    //   174: astore_2
    //   175: goto -85 -> 90
    //   178: astore_0
    //   179: aconst_null
    //   180: astore_0
    //   181: goto -91 -> 90
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	184	0	paramFile	File
    //   43	40	1	m	int
    //   11	124	2	localFileInputStream	java.io.FileInputStream
    //   153	1	2	localIOException	IOException
    //   166	9	2	localObject1	Object
    //   24	54	3	localObject2	Object
    //   89	1	3	localException	Exception
    //   94	72	3	localObject3	Object
    //   21	139	4	localFile	File
    //   1	108	5	localObject4	Object
    //   30	69	6	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   25	32	89	java/lang/Exception
    //   37	44	89	java/lang/Exception
    //   54	60	89	java/lang/Exception
    //   78	86	89	java/lang/Exception
    //   104	108	121	java/io/IOException
    //   115	119	121	java/io/IOException
    //   3	12	124	finally
    //   63	71	150	java/io/IOException
    //   134	138	153	java/io/IOException
    //   143	148	153	java/io/IOException
    //   12	20	157	finally
    //   25	32	164	finally
    //   37	44	164	finally
    //   54	60	164	finally
    //   78	86	164	finally
    //   95	100	164	finally
    //   3	12	170	java/lang/Exception
    //   12	20	178	java/lang/Exception
  }
  
  public File getCache()
  {
    if (com.umeng.socom.b.b()) {}
    for (Object localObject = Environment.getExternalStorageDirectory().getCanonicalPath();; localObject = this.j)
    {
      localObject = new File(localObject + "/download/umsocial/");
      if (!((File)localObject).exists()) {
        ((File)localObject).mkdirs();
      }
      return (File)localObject;
      if (TextUtils.isEmpty(this.j)) {
        break;
      }
    }
    throw new IOException("dirpath is unknow");
  }
  
  public String getImageCachePath()
  {
    if ((this.i != null) && ((this.i instanceof File))) {
      return this.i.getAbsolutePath();
    }
    return null;
  }
  
  public UMediaObject.MediaType getMediaType()
  {
    return UMediaObject.MediaType.IMAGE;
  }
  
  public void toByte(UMediaObject.a parama)
  {
    if (parama == null) {
      return;
    }
    parama.a();
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      new d(this, parama).execute(new Void[0]);
      return;
    }
    parama.a(b());
  }
  
  public byte[] toByte()
  {
    return b();
  }
  
  public final Map<String, Object> toUrlExtraParams()
  {
    HashMap localHashMap = new HashMap();
    if (isUrlMedia())
    {
      localHashMap.put(com.umeng.socialize.c.b.c.y, this.a);
      localHashMap.put(com.umeng.socialize.c.b.c.z, getMediaType());
    }
    return localHashMap;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.h.toString());
    paramParcel.writeString(this.i.getAbsolutePath());
    paramParcel.writeString(this.j);
    if (this.k == null) {}
    for (paramInt = 0;; paramInt = this.k.length)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeByteArray(this.k);
      return;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\media\UMImage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */