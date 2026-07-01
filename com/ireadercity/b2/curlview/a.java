package com.ireadercity.b2.curlview;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;

public final class a
{
  private static final float[] a = { 0.0F, 0.0F, 0.0F, 0.5F };
  private static final float[] b = { 0.0F, 0.0F, 0.0F, 0.0F };
  private boolean c = false;
  private FloatBuffer d;
  private FloatBuffer e;
  private FloatBuffer f;
  private int g;
  private int h;
  private FloatBuffer i;
  private FloatBuffer j;
  private int k;
  private int l;
  private int m;
  private d[] n = new d[4];
  private int[] o;
  private Bitmap p;
  private RectF q = new RectF();
  private b<d> r;
  private b<d> s;
  private b<d> t;
  private b<d> u;
  private b<Double> v;
  private b<c> w;
  private b<c> x;
  private b<c> y;
  
  public a(int paramInt)
  {
    if (paramInt <= 0) {}
    for (int i1 = 1;; i1 = paramInt)
    {
      this.m = i1;
      this.v = new b(this, paramInt + 2);
      this.t = new b(this, 7);
      this.u = new b(this, 4);
      this.s = new b(this, 2);
      this.r = new b(this, 11);
      paramInt = 0;
      while (paramInt < 11)
      {
        this.r.a(new d(this));
        paramInt += 1;
      }
    }
    this.x = new b(this, (this.m + 2) * 2);
    this.y = new b(this, (this.m + 2) * 2);
    this.w = new b(this, (this.m + 2) * 2);
    paramInt = 0;
    while (paramInt < (this.m + 2) * 2)
    {
      this.w.a(new c(this, (byte)0));
      paramInt += 1;
    }
    paramInt = 0;
    while (paramInt < 4)
    {
      this.n[paramInt] = new d(this);
      paramInt += 1;
    }
    Object localObject = this.n[0];
    d locald1 = this.n[1];
    d locald2 = this.n[1];
    this.n[3].g = -1.0D;
    locald2.g = -1.0D;
    locald1.f = -1.0D;
    ((d)localObject).f = -1.0D;
    localObject = this.n[0];
    locald1 = this.n[2];
    locald2 = this.n[2];
    this.n[3].f = 1.0D;
    locald2.g = 1.0D;
    locald1.f = 1.0D;
    ((d)localObject).g = 1.0D;
    paramInt = this.m * 2 + 6;
    localObject = ByteBuffer.allocateDirect(paramInt * 3 * 4);
    ((ByteBuffer)localObject).order(ByteOrder.nativeOrder());
    this.d = ((ByteBuffer)localObject).asFloatBuffer();
    this.d.position(0);
    localObject = ByteBuffer.allocateDirect(paramInt * 2 * 4);
    ((ByteBuffer)localObject).order(ByteOrder.nativeOrder());
    this.e = ((ByteBuffer)localObject).asFloatBuffer();
    this.e.position(0);
    localObject = ByteBuffer.allocateDirect(paramInt * 4 * 4);
    ((ByteBuffer)localObject).order(ByteOrder.nativeOrder());
    this.f = ((ByteBuffer)localObject).asFloatBuffer();
    this.f.position(0);
    paramInt = (this.m + 2) * 2 * 2;
    localObject = ByteBuffer.allocateDirect(paramInt * 4 * 4);
    ((ByteBuffer)localObject).order(ByteOrder.nativeOrder());
    this.i = ((ByteBuffer)localObject).asFloatBuffer();
    this.i.position(0);
    localObject = ByteBuffer.allocateDirect(paramInt * 3 * 4);
    ((ByteBuffer)localObject).order(ByteOrder.nativeOrder());
    this.j = ((ByteBuffer)localObject).asFloatBuffer();
    this.j.position(0);
    this.l = 0;
    this.k = 0;
  }
  
  private static int a(int paramInt)
  {
    paramInt -= 1;
    paramInt |= paramInt >> 1;
    paramInt |= paramInt >> 2;
    paramInt |= paramInt >> 4;
    paramInt |= paramInt >> 8;
    paramInt |= paramInt >> 16;
    return (paramInt | paramInt >> 32) + 1;
  }
  
  private b<d> a(b<d> paramb, int[][] paramArrayOfInt, double paramDouble)
  {
    this.s.a();
    int i1 = 0;
    while (i1 < paramArrayOfInt.length)
    {
      d locald1 = (d)paramb.a(paramArrayOfInt[i1][0]);
      d locald2 = (d)paramb.a(paramArrayOfInt[i1][1]);
      if ((locald1.a > paramDouble) && (locald2.a < paramDouble))
      {
        double d1 = (paramDouble - locald2.a) / (locald1.a - locald2.a);
        d locald3 = (d)this.r.b();
        locald3.a(locald2);
        locald3.a = paramDouble;
        locald3.b += (locald1.b - locald2.b) * d1;
        locald3.d += (locald1.d - locald2.d) * d1;
        locald3.e += (locald1.e - locald2.e) * d1;
        locald3.f += (locald1.f - locald2.f) * d1;
        double d2 = locald3.g;
        locald3.g = ((locald1.g - locald2.g) * d1 + d2);
        this.s.a(locald3);
      }
      i1 += 1;
    }
    return this.s;
  }
  
  private void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    try
    {
      this.n[0].d = paramFloat1;
      this.n[0].e = paramFloat2;
      this.n[1].d = paramFloat1;
      this.n[1].e = paramFloat4;
      this.n[2].d = paramFloat3;
      this.n[2].e = paramFloat2;
      this.n[3].d = paramFloat3;
      this.n[3].e = paramFloat4;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void a(d paramd)
  {
    this.d.put((float)paramd.a);
    this.d.put((float)paramd.b);
    this.d.put((float)paramd.c);
    this.f.put((float)paramd.h);
    this.f.put((float)paramd.h);
    this.f.put((float)paramd.h);
    this.f.put((float)paramd.i);
    this.e.put((float)paramd.d);
    this.e.put((float)paramd.e);
  }
  
  public final void a()
  {
    int i1 = 0;
    try
    {
      this.d.position(0);
      this.f.position(0);
      this.e.position(0);
      while (i1 < 4)
      {
        a(this.n[i1]);
        i1 += 1;
      }
      this.g = 4;
      this.h = 0;
      this.d.position(0);
      this.f.position(0);
      this.e.position(0);
      this.l = 0;
      this.k = 0;
      return;
    }
    finally {}
  }
  
  /* Error */
  public final void a(Bitmap paramBitmap)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnonnull +6 -> 9
    //   6: aload_0
    //   7: monitorexit
    //   8: return
    //   9: aload_1
    //   10: invokevirtual 193	android/graphics/Bitmap:getWidth	()I
    //   13: istore 4
    //   15: aload_1
    //   16: invokevirtual 196	android/graphics/Bitmap:getHeight	()I
    //   19: istore 5
    //   21: iload 4
    //   23: invokestatic 198	com/ireadercity/b2/curlview/a:a	(I)I
    //   26: istore 6
    //   28: iload 5
    //   30: invokestatic 198	com/ireadercity/b2/curlview/a:a	(I)I
    //   33: istore 7
    //   35: new 200	java/lang/StringBuilder
    //   38: dup
    //   39: ldc -54
    //   41: invokespecial 205	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   44: aload_0
    //   45: getfield 207	com/ireadercity/b2/curlview/a:p	Landroid/graphics/Bitmap;
    //   48: invokevirtual 211	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   51: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: pop
    //   55: aload_0
    //   56: getfield 207	com/ireadercity/b2/curlview/a:p	Landroid/graphics/Bitmap;
    //   59: ifnull +28 -> 87
    //   62: aload_0
    //   63: getfield 207	com/ireadercity/b2/curlview/a:p	Landroid/graphics/Bitmap;
    //   66: invokevirtual 219	android/graphics/Bitmap:isRecycled	()Z
    //   69: ifne +18 -> 87
    //   72: aload_0
    //   73: getfield 207	com/ireadercity/b2/curlview/a:p	Landroid/graphics/Bitmap;
    //   76: invokevirtual 222	android/graphics/Bitmap:recycle	()V
    //   79: aload_0
    //   80: aconst_null
    //   81: putfield 207	com/ireadercity/b2/curlview/a:p	Landroid/graphics/Bitmap;
    //   84: invokestatic 226	com/ireadercity/b2/a:d	()V
    //   87: aload_0
    //   88: iload 6
    //   90: iload 7
    //   92: aload_1
    //   93: invokevirtual 230	android/graphics/Bitmap:getConfig	()Landroid/graphics/Bitmap$Config;
    //   96: invokestatic 234	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   99: putfield 207	com/ireadercity/b2/curlview/a:p	Landroid/graphics/Bitmap;
    //   102: aload_0
    //   103: getfield 207	com/ireadercity/b2/curlview/a:p	Landroid/graphics/Bitmap;
    //   106: ifnull +31 -> 137
    //   109: aload_0
    //   110: getfield 207	com/ireadercity/b2/curlview/a:p	Landroid/graphics/Bitmap;
    //   113: invokevirtual 219	android/graphics/Bitmap:isRecycled	()Z
    //   116: ifne +21 -> 137
    //   119: new 236	android/graphics/Canvas
    //   122: dup
    //   123: aload_0
    //   124: getfield 207	com/ireadercity/b2/curlview/a:p	Landroid/graphics/Bitmap;
    //   127: invokespecial 238	android/graphics/Canvas:<init>	(Landroid/graphics/Bitmap;)V
    //   130: aload_1
    //   131: fconst_0
    //   132: fconst_0
    //   133: aconst_null
    //   134: invokevirtual 242	android/graphics/Canvas:drawBitmap	(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    //   137: aload_1
    //   138: ifnull +17 -> 155
    //   141: aload_1
    //   142: invokevirtual 219	android/graphics/Bitmap:isRecycled	()Z
    //   145: ifne +10 -> 155
    //   148: aload_1
    //   149: invokevirtual 222	android/graphics/Bitmap:recycle	()V
    //   152: invokestatic 226	com/ireadercity/b2/a:d	()V
    //   155: new 200	java/lang/StringBuilder
    //   158: dup
    //   159: ldc -12
    //   161: invokespecial 205	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   164: invokestatic 250	android/os/Debug:getNativeHeapAllocatedSize	()J
    //   167: invokevirtual 253	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   170: ldc -1
    //   172: invokevirtual 258	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: invokestatic 261	android/os/Debug:getNativeHeapFreeSize	()J
    //   178: invokevirtual 253	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   181: invokevirtual 215	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   184: pop
    //   185: iload 4
    //   187: i2f
    //   188: iload 6
    //   190: i2f
    //   191: fdiv
    //   192: fstore_2
    //   193: iload 5
    //   195: i2f
    //   196: iload 7
    //   198: i2f
    //   199: fdiv
    //   200: fstore_3
    //   201: aload_0
    //   202: getfield 64	com/ireadercity/b2/curlview/a:q	Landroid/graphics/RectF;
    //   205: fconst_0
    //   206: fconst_0
    //   207: fload_2
    //   208: fload_3
    //   209: invokevirtual 264	android/graphics/RectF:set	(FFFF)V
    //   212: aload_0
    //   213: getfield 55	com/ireadercity/b2/curlview/a:c	Z
    //   216: ifeq +32 -> 248
    //   219: aload_0
    //   220: fload_2
    //   221: fconst_0
    //   222: fconst_0
    //   223: fload_3
    //   224: invokespecial 266	com/ireadercity/b2/curlview/a:a	(FFFF)V
    //   227: goto -221 -> 6
    //   230: astore_1
    //   231: aload_0
    //   232: monitorexit
    //   233: aload_1
    //   234: athrow
    //   235: astore 8
    //   237: aload 8
    //   239: invokevirtual 269	java/lang/OutOfMemoryError:printStackTrace	()V
    //   242: invokestatic 226	com/ireadercity/b2/a:d	()V
    //   245: goto -143 -> 102
    //   248: aload_0
    //   249: fconst_0
    //   250: fconst_0
    //   251: fload_2
    //   252: fload_3
    //   253: invokespecial 266	com/ireadercity/b2/curlview/a:a	(FFFF)V
    //   256: goto -250 -> 6
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	259	0	this	a
    //   0	259	1	paramBitmap	Bitmap
    //   192	60	2	f1	float
    //   200	53	3	f2	float
    //   13	173	4	i1	int
    //   19	175	5	i2	int
    //   26	163	6	i3	int
    //   33	164	7	i4	int
    //   235	3	8	localOutOfMemoryError	OutOfMemoryError
    // Exception table:
    //   from	to	target	type
    //   9	87	230	finally
    //   87	102	230	finally
    //   102	137	230	finally
    //   141	155	230	finally
    //   155	227	230	finally
    //   237	245	230	finally
    //   248	256	230	finally
    //   87	102	235	java/lang/OutOfMemoryError
  }
  
  public final void a(PointF paramPointF1, PointF paramPointF2, double paramDouble)
  {
    double d1;
    Object localObject1;
    int i2;
    label132:
    Object localObject2;
    Object localObject3;
    Object localObject4;
    double d3;
    double d4;
    for (;;)
    {
      label555:
      try
      {
        this.d.position(0);
        this.f.position(0);
        this.e.position(0);
        d1 = Math.acos(paramPointF2.x);
        if (paramPointF2.y <= 0.0F) {
          break label2097;
        }
        d1 = -d1;
        this.r.a(this.u);
        this.u.a();
        i1 = 0;
        if (i1 < 4)
        {
          localObject1 = (d)this.r.b();
          ((d)localObject1).a(this.n[i1]);
          ((d)localObject1).a(-paramPointF1.x, -paramPointF1.y);
          ((d)localObject1).a(-d1);
          i2 = 0;
          if (i2 < this.u.c())
          {
            localObject2 = (d)this.u.a(i2);
            if ((((d)localObject1).a <= ((d)localObject2).a) && ((((d)localObject1).a != ((d)localObject2).a) || (((d)localObject1).b <= ((d)localObject2).b))) {
              break label2088;
            }
          }
          this.u.a(i2, localObject1);
          i1 += 1;
          continue;
        }
        localObject1 = new int[4][];
        localObject1[0] = { 0, 1 };
        localObject1[1] = { 0, 2 };
        localObject1[2] = { 1, 3 };
        localObject1[3] = { 2, 3 };
        localObject2 = (d)this.u.a(0);
        localObject3 = (d)this.u.a(2);
        localObject4 = (d)this.u.a(3);
        d2 = Math.sqrt((((d)localObject2).a - ((d)localObject3).a) * (((d)localObject2).a - ((d)localObject3).a) + (((d)localObject2).b - ((d)localObject3).b) * (((d)localObject2).b - ((d)localObject3).b));
        d3 = ((d)localObject2).a;
        d4 = ((d)localObject4).a;
        double d5 = ((d)localObject2).a;
        double d6 = ((d)localObject4).a;
        double d7 = ((d)localObject2).b;
        double d8 = ((d)localObject4).b;
        if (d2 > Math.sqrt((((d)localObject2).b - ((d)localObject4).b) * (d7 - d8) + (d3 - d4) * (d5 - d6)))
        {
          localObject1[1][1] = 3;
          localObject1[2][1] = 2;
        }
        this.h = 0;
        this.g = 0;
        this.w.a(this.y);
        this.w.a(this.x);
        this.y.a();
        this.x.a();
        d4 = 3.141592653589793D * paramDouble;
        this.v.a();
        if (this.m <= 0) {
          break label2100;
        }
        this.v.a(Double.valueOf(0.0D));
      }
      finally {}
      if (i1 >= this.m) {
        continue;
      }
      this.v.a(Double.valueOf(-d4 * i1 / (this.m - 1)));
      i1 += 1;
    }
    this.v.a(Double.valueOf(((d)this.u.a(3)).a - 1.0D));
    double d2 = ((d)this.u.a(0)).a;
    int i1 = 0;
    for (d2 += 1.0D;; d2 = d3)
    {
      if (i1 < this.v.c())
      {
        d3 = ((Double)this.v.a(i1)).doubleValue();
        i2 = 0;
        label681:
        if (i2 < this.u.c())
        {
          localObject2 = (d)this.u.a(i2);
          if ((((d)localObject2).a < d3) || (((d)localObject2).a > d2)) {
            break label2106;
          }
          localObject3 = (d)this.r.b();
          ((d)localObject3).a((d)localObject2);
          localObject4 = a(this.u, (int[][])localObject1, ((d)localObject3).a);
          if ((((b)localObject4).c() == 1) && (((d)((b)localObject4).a(0)).b > ((d)localObject2).b))
          {
            this.t.a((b)localObject4);
            this.t.a(localObject3);
            break label2106;
          }
          if (((b)localObject4).c() <= 1)
          {
            this.t.a(localObject3);
            this.t.a((b)localObject4);
            break label2106;
          }
          this.r.a(localObject3);
          this.r.a((b)localObject4);
          break label2106;
        }
        localObject2 = a(this.u, (int[][])localObject1, d3);
        if (((b)localObject2).c() == 2)
        {
          localObject3 = (d)((b)localObject2).a(0);
          localObject4 = (d)((b)localObject2).a(1);
          if (((d)localObject3).b < ((d)localObject4).b)
          {
            this.t.a(localObject4);
            this.t.a(localObject3);
            if (this.t.c() <= 0) {
              break label2143;
            }
            localObject2 = (d)this.t.b();
            this.r.a(localObject2);
            if (i1 != 0) {
              break label1355;
            }
            if (!this.c) {
              break label2115;
            }
            d2 = 0.800000011920929D;
            label997:
            ((d)localObject2).i = d2;
            this.g += 1;
          }
        }
        for (;;)
        {
          label1014:
          ((d)localObject2).a(d1);
          ((d)localObject2).a(paramPointF1.x, paramPointF1.y);
          a((d)localObject2);
          if ((((d)localObject2).c > 0.0D) && (((d)localObject2).c <= paramDouble))
          {
            localObject3 = (c)this.w.b();
            ((c)localObject3).a = ((d)localObject2).a;
            ((c)localObject3).b = ((d)localObject2).b;
            ((c)localObject3).c = ((d)localObject2).c;
            ((c)localObject3).d = (((d)localObject2).c / 2.0D * -paramPointF2.x);
            ((c)localObject3).e = (((d)localObject2).c / 2.0D * -paramPointF2.y);
            ((c)localObject3).f = (((d)localObject2).c / paramDouble);
            i2 = (this.y.c() + 1) / 2;
            this.y.a(i2, localObject3);
          }
          if (((d)localObject2).c <= paramDouble) {
            break;
          }
          localObject3 = (c)this.w.b();
          ((c)localObject3).a = ((d)localObject2).a;
          ((c)localObject3).b = ((d)localObject2).b;
          ((c)localObject3).c = ((d)localObject2).c;
          ((c)localObject3).d = ((((d)localObject2).c - paramDouble) / 3.0D * ((d)localObject2).f);
          ((c)localObject3).e = ((((d)localObject2).c - paramDouble) / 3.0D * ((d)localObject2).g);
          ((c)localObject3).f = ((((d)localObject2).c - paramDouble) / (2.0D * paramDouble));
          i2 = (this.x.c() + 1) / 2;
          this.x.a(i2, localObject3);
          break;
          this.t.a((b)localObject2);
          break;
          if (((b)localObject2).c() == 0) {
            break;
          }
          this.r.a((b)localObject2);
          break;
          label1355:
          if ((i1 == this.v.c() - 1) || (d4 == 0.0D))
          {
            ((d)localObject2).a = (-(((d)localObject2).a + d4));
            ((d)localObject2).c = (2.0D * paramDouble);
            ((d)localObject2).f = (-((d)localObject2).f);
            if (!this.c) {
              break label2121;
            }
            d2 = 1.0D;
            label1421:
            ((d)localObject2).i = d2;
            this.h += 1;
          }
          else
          {
            d2 = 3.141592653589793D * (((d)localObject2).a / d4);
            ((d)localObject2).a = (Math.sin(d2) * paramDouble);
            ((d)localObject2).c = (paramDouble - Math.cos(d2) * paramDouble);
            ((d)localObject2).f *= Math.cos(d2);
            ((d)localObject2).h = (Math.sqrt(Math.sin(d2) + 1.0D) * 0.8999999761581421D + 0.10000000149011612D);
            if (((d)localObject2).c < paramDouble) {
              break label1560;
            }
            if (!this.c) {
              break label2129;
            }
            d2 = 1.0D;
            label1540:
            ((d)localObject2).i = d2;
            this.h += 1;
          }
        }
        label1560:
        if (!this.c) {
          break label2137;
        }
      }
      label2088:
      label2097:
      label2100:
      label2106:
      label2115:
      label2121:
      label2129:
      label2137:
      for (d2 = 0.800000011920929D;; d2 = 1.0D)
      {
        ((d)localObject2).i = d2;
        this.g += 1;
        break label1014;
        this.d.position(0);
        this.f.position(0);
        this.e.position(0);
        this.i.position(0);
        this.j.position(0);
        this.k = 0;
        i1 = 0;
        while (i1 < this.y.c())
        {
          paramPointF1 = (c)this.y.a(i1);
          this.j.put((float)paramPointF1.a);
          this.j.put((float)paramPointF1.b);
          this.j.put((float)paramPointF1.c);
          this.j.put((float)(paramPointF1.a + paramPointF1.d));
          this.j.put((float)(paramPointF1.b + paramPointF1.e));
          this.j.put((float)paramPointF1.c);
          i2 = 0;
          while (i2 < 4)
          {
            paramDouble = b[i2];
            d1 = a[i2] - b[i2];
            d2 = paramPointF1.f;
            this.i.put((float)(paramDouble + d1 * d2));
            i2 += 1;
          }
          this.i.put(b);
          this.k += 2;
          i1 += 1;
        }
        this.l = 0;
        i1 = 0;
        while (i1 < this.x.c())
        {
          paramPointF1 = (c)this.x.a(i1);
          this.j.put((float)paramPointF1.a);
          this.j.put((float)paramPointF1.b);
          this.j.put((float)paramPointF1.c);
          this.j.put((float)(paramPointF1.a + paramPointF1.d));
          this.j.put((float)(paramPointF1.b + paramPointF1.e));
          this.j.put((float)paramPointF1.c);
          i2 = 0;
          while (i2 < 4)
          {
            paramDouble = b[i2];
            d1 = a[i2] - b[i2];
            d2 = paramPointF1.f;
            this.i.put((float)(paramDouble + d1 * d2));
            i2 += 1;
          }
          this.i.put(b);
          this.l += 2;
          i1 += 1;
        }
        this.i.position(0);
        this.j.position(0);
        return;
        i2 += 1;
        break label132;
        break;
        i1 = 1;
        break label555;
        i2 += 1;
        break label681;
        d2 = 1.0D;
        break label997;
        d2 = 0.800000011920929D;
        break label1421;
        d2 = 0.800000011920929D;
        break label1540;
      }
      label2143:
      i1 += 1;
    }
  }
  
  public final void a(RectF paramRectF)
  {
    this.n[0].a = paramRectF.left;
    this.n[0].b = paramRectF.top;
    this.n[1].a = paramRectF.left;
    this.n[1].b = paramRectF.bottom;
    this.n[2].a = paramRectF.right;
    this.n[2].b = paramRectF.top;
    this.n[3].a = paramRectF.right;
    this.n[3].b = paramRectF.bottom;
  }
  
  public final void a(GL10 paramGL10)
  {
    try
    {
      if (this.o == null)
      {
        this.o = new int[1];
        paramGL10.glGenTextures(1, this.o, 0);
        paramGL10.glBindTexture(3553, this.o[0]);
        paramGL10.glTexParameterf(3553, 10241, 9729.0F);
        paramGL10.glTexParameterf(3553, 10240, 9729.0F);
        paramGL10.glTexParameterf(3553, 10242, 33071.0F);
        paramGL10.glTexParameterf(3553, 10243, 33071.0F);
      }
      if (this.p != null)
      {
        paramGL10.glBindTexture(3553, this.o[0]);
        GLUtils.texImage2D(3553, 0, this.p, 0);
        new StringBuilder("release  mBitMap after set  mBitmap=").append(this.p).toString();
        this.p.recycle();
        this.p = null;
      }
      paramGL10.glBindTexture(3553, this.o[0]);
      paramGL10.glEnableClientState(32884);
      paramGL10.glEnable(3042);
      paramGL10.glBlendFunc(770, 771);
      paramGL10.glEnableClientState(32886);
      paramGL10.glColorPointer(4, 5126, 0, this.i);
      paramGL10.glVertexPointer(3, 5126, 0, this.j);
      paramGL10.glDrawArrays(5, 0, this.k);
      paramGL10.glDisableClientState(32886);
      paramGL10.glDisable(3042);
      paramGL10.glEnableClientState(32888);
      paramGL10.glTexCoordPointer(2, 5126, 0, this.e);
      paramGL10.glVertexPointer(3, 5126, 0, this.d);
      paramGL10.glEnableClientState(32886);
      paramGL10.glColorPointer(4, 5126, 0, this.f);
      paramGL10.glDisable(3553);
      paramGL10.glDrawArrays(5, 0, this.g);
      paramGL10.glEnable(3042);
      paramGL10.glEnable(3553);
      paramGL10.glBlendFunc(770, 771);
      paramGL10.glDrawArrays(5, 0, this.g);
      paramGL10.glDisable(3553);
      paramGL10.glDisable(3042);
      int i1 = Math.max(0, this.g - 2);
      int i2 = this.g + this.h - i1;
      paramGL10.glDrawArrays(5, i1, i2);
      paramGL10.glEnable(3042);
      paramGL10.glEnable(3553);
      paramGL10.glBlendFunc(770, 771);
      paramGL10.glDrawArrays(5, i1, i2);
      paramGL10.glDisable(3553);
      paramGL10.glDisable(3042);
      paramGL10.glDisableClientState(32888);
      paramGL10.glDisableClientState(32886);
      paramGL10.glEnable(3042);
      paramGL10.glBlendFunc(770, 771);
      paramGL10.glEnableClientState(32886);
      paramGL10.glColorPointer(4, 5126, 0, this.i);
      paramGL10.glVertexPointer(3, 5126, 0, this.j);
      paramGL10.glDrawArrays(5, this.k, this.l);
      paramGL10.glDisableClientState(32886);
      paramGL10.glDisable(3042);
      paramGL10.glDisableClientState(32884);
      return;
    }
    finally {}
  }
  
  public final void a(boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        this.c = paramBoolean;
        if (this.c)
        {
          a(this.q.right, this.q.top, this.q.left, this.q.bottom);
          break label140;
          if (i1 >= 4) {
            break label137;
          }
          d locald = this.n[i1];
          if (this.c)
          {
            d1 = 0.800000011920929D;
            locald.i = d1;
            i1 += 1;
            continue;
          }
        }
        else
        {
          a(this.q.left, this.q.top, this.q.right, this.q.bottom);
        }
      }
      finally {}
      double d1 = 1.0D;
      continue;
      label137:
      return;
      label140:
      int i1 = 0;
    }
  }
  
  public final void b()
  {
    try
    {
      this.o = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void c()
  {
    try
    {
      new StringBuilder("freeBitmap mBitmap=").append(this.p).toString();
      if ((this.p != null) && (!this.p.isRecycled()))
      {
        this.p.recycle();
        this.p = null;
        com.ireadercity.b2.a.d();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\curlview\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */