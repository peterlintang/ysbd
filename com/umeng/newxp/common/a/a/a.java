package com.umeng.newxp.common.a.a;

public class a
  extends g
{
  private static final int a = 5;
  private static final int m = 8;
  private static final int n = 5;
  private static final byte[] o = { 13, 10 };
  private static final byte[] p = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 63, -1, -1, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
  private static final byte[] q = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55 };
  private static final byte[] r = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 63, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32 };
  private static final byte[] s = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86 };
  private static final int t = 31;
  private long u;
  private final int v;
  private final byte[] w;
  private final int x;
  private final byte[] y;
  private final byte[] z;
  
  public a()
  {
    this(false);
  }
  
  public a(int paramInt)
  {
    this(paramInt, o);
  }
  
  public a(int paramInt, byte[] paramArrayOfByte)
  {
    this(paramInt, paramArrayOfByte, false);
  }
  
  public a(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean) {}
  
  public a(boolean paramBoolean)
  {
    this(0, null, paramBoolean);
  }
  
  void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.j) {
      return;
    }
    if (paramInt2 < 0) {
      this.j = true;
    }
    int i = 0;
    for (;;)
    {
      int j;
      if (i < paramInt2)
      {
        j = paramArrayOfByte[paramInt1];
        if (j == 61) {
          this.j = true;
        }
      }
      else
      {
        if ((!this.j) || (this.l < 2)) {
          break;
        }
        a(this.v);
      }
      switch (this.l)
      {
      default: 
        return;
      case 2: 
        paramArrayOfByte = this.h;
        paramInt1 = this.i;
        this.i = (paramInt1 + 1);
        paramArrayOfByte[paramInt1] = ((byte)(int)(this.u >> 2 & 0xFF));
        return;
        a(this.v);
        if ((j >= 0) && (j < this.w.length))
        {
          j = this.w[j];
          if (j >= 0)
          {
            this.l = ((this.l + 1) % 8);
            this.u = ((this.u << 5) + j);
            if (this.l == 0)
            {
              byte[] arrayOfByte = this.h;
              j = this.i;
              this.i = (j + 1);
              arrayOfByte[j] = ((byte)(int)(this.u >> 32 & 0xFF));
              arrayOfByte = this.h;
              j = this.i;
              this.i = (j + 1);
              arrayOfByte[j] = ((byte)(int)(this.u >> 24 & 0xFF));
              arrayOfByte = this.h;
              j = this.i;
              this.i = (j + 1);
              arrayOfByte[j] = ((byte)(int)(this.u >> 16 & 0xFF));
              arrayOfByte = this.h;
              j = this.i;
              this.i = (j + 1);
              arrayOfByte[j] = ((byte)(int)(this.u >> 8 & 0xFF));
              arrayOfByte = this.h;
              j = this.i;
              this.i = (j + 1);
              arrayOfByte[j] = ((byte)(int)(this.u & 0xFF));
            }
          }
        }
        i += 1;
        paramInt1 += 1;
      }
    }
    paramArrayOfByte = this.h;
    paramInt1 = this.i;
    this.i = (paramInt1 + 1);
    paramArrayOfByte[paramInt1] = ((byte)(int)(this.u >> 7 & 0xFF));
    return;
    this.u >>= 4;
    paramArrayOfByte = this.h;
    paramInt1 = this.i;
    this.i = (paramInt1 + 1);
    paramArrayOfByte[paramInt1] = ((byte)(int)(this.u >> 8 & 0xFF));
    paramArrayOfByte = this.h;
    paramInt1 = this.i;
    this.i = (paramInt1 + 1);
    paramArrayOfByte[paramInt1] = ((byte)(int)(this.u & 0xFF));
    return;
    this.u >>= 1;
    paramArrayOfByte = this.h;
    paramInt1 = this.i;
    this.i = (paramInt1 + 1);
    paramArrayOfByte[paramInt1] = ((byte)(int)(this.u >> 16 & 0xFF));
    paramArrayOfByte = this.h;
    paramInt1 = this.i;
    this.i = (paramInt1 + 1);
    paramArrayOfByte[paramInt1] = ((byte)(int)(this.u >> 8 & 0xFF));
    paramArrayOfByte = this.h;
    paramInt1 = this.i;
    this.i = (paramInt1 + 1);
    paramArrayOfByte[paramInt1] = ((byte)(int)(this.u & 0xFF));
    return;
    this.u >>= 6;
    paramArrayOfByte = this.h;
    paramInt1 = this.i;
    this.i = (paramInt1 + 1);
    paramArrayOfByte[paramInt1] = ((byte)(int)(this.u >> 16 & 0xFF));
    paramArrayOfByte = this.h;
    paramInt1 = this.i;
    this.i = (paramInt1 + 1);
    paramArrayOfByte[paramInt1] = ((byte)(int)(this.u >> 8 & 0xFF));
    paramArrayOfByte = this.h;
    paramInt1 = this.i;
    this.i = (paramInt1 + 1);
    paramArrayOfByte[paramInt1] = ((byte)(int)(this.u & 0xFF));
    return;
    this.u >>= 3;
    paramArrayOfByte = this.h;
    paramInt1 = this.i;
    this.i = (paramInt1 + 1);
    paramArrayOfByte[paramInt1] = ((byte)(int)(this.u >> 24 & 0xFF));
    paramArrayOfByte = this.h;
    paramInt1 = this.i;
    this.i = (paramInt1 + 1);
    paramArrayOfByte[paramInt1] = ((byte)(int)(this.u >> 16 & 0xFF));
    paramArrayOfByte = this.h;
    paramInt1 = this.i;
    this.i = (paramInt1 + 1);
    paramArrayOfByte[paramInt1] = ((byte)(int)(this.u >> 8 & 0xFF));
    paramArrayOfByte = this.h;
    paramInt1 = this.i;
    this.i = (paramInt1 + 1);
    paramArrayOfByte[paramInt1] = ((byte)(int)(this.u & 0xFF));
  }
  
  public boolean a(byte paramByte)
  {
    return (paramByte >= 0) && (paramByte < this.w.length) && (this.w[paramByte] != -1);
  }
  
  void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.j) {}
    for (;;)
    {
      return;
      if (paramInt2 < 0)
      {
        this.j = true;
        if ((this.l != 0) || (this.g != 0))
        {
          a(this.x);
          paramInt1 = this.i;
          switch (this.l)
          {
          }
          for (;;)
          {
            paramInt2 = this.k;
            this.k = (this.i - paramInt1 + paramInt2);
            if ((this.g <= 0) || (this.k <= 0)) {
              break;
            }
            System.arraycopy(this.z, 0, this.h, this.i, this.z.length);
            this.i += this.z.length;
            return;
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = this.y[((int)(this.u >> 3) & 0x1F)];
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = this.y[((int)(this.u << 2) & 0x1F)];
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = 61;
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = 61;
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = 61;
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = 61;
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = 61;
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = 61;
            continue;
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = this.y[((int)(this.u >> 11) & 0x1F)];
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = this.y[((int)(this.u >> 6) & 0x1F)];
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = this.y[((int)(this.u >> 1) & 0x1F)];
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = this.y[((int)(this.u << 4) & 0x1F)];
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = 61;
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = 61;
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = 61;
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = 61;
            continue;
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = this.y[((int)(this.u >> 19) & 0x1F)];
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = this.y[((int)(this.u >> 14) & 0x1F)];
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = this.y[((int)(this.u >> 9) & 0x1F)];
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = this.y[((int)(this.u >> 4) & 0x1F)];
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = this.y[((int)(this.u << 1) & 0x1F)];
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = 61;
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = 61;
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = 61;
            continue;
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = this.y[((int)(this.u >> 27) & 0x1F)];
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = this.y[((int)(this.u >> 22) & 0x1F)];
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = this.y[((int)(this.u >> 17) & 0x1F)];
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = this.y[((int)(this.u >> 12) & 0x1F)];
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = this.y[((int)(this.u >> 7) & 0x1F)];
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = this.y[((int)(this.u >> 2) & 0x1F)];
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = this.y[((int)(this.u << 3) & 0x1F)];
            paramArrayOfByte = this.h;
            paramInt2 = this.i;
            this.i = (paramInt2 + 1);
            paramArrayOfByte[paramInt2] = 61;
          }
        }
      }
      else
      {
        int i = 0;
        while (i < paramInt2)
        {
          a(this.x);
          this.l = ((this.l + 1) % 5);
          int k = paramArrayOfByte[paramInt1];
          int j = k;
          if (k < 0) {
            j = k + 256;
          }
          this.u = ((this.u << 8) + j);
          if (this.l == 0)
          {
            byte[] arrayOfByte = this.h;
            j = this.i;
            this.i = (j + 1);
            arrayOfByte[j] = this.y[((int)(this.u >> 35) & 0x1F)];
            arrayOfByte = this.h;
            j = this.i;
            this.i = (j + 1);
            arrayOfByte[j] = this.y[((int)(this.u >> 30) & 0x1F)];
            arrayOfByte = this.h;
            j = this.i;
            this.i = (j + 1);
            arrayOfByte[j] = this.y[((int)(this.u >> 25) & 0x1F)];
            arrayOfByte = this.h;
            j = this.i;
            this.i = (j + 1);
            arrayOfByte[j] = this.y[((int)(this.u >> 20) & 0x1F)];
            arrayOfByte = this.h;
            j = this.i;
            this.i = (j + 1);
            arrayOfByte[j] = this.y[((int)(this.u >> 15) & 0x1F)];
            arrayOfByte = this.h;
            j = this.i;
            this.i = (j + 1);
            arrayOfByte[j] = this.y[((int)(this.u >> 10) & 0x1F)];
            arrayOfByte = this.h;
            j = this.i;
            this.i = (j + 1);
            arrayOfByte[j] = this.y[((int)(this.u >> 5) & 0x1F)];
            arrayOfByte = this.h;
            j = this.i;
            this.i = (j + 1);
            arrayOfByte[j] = this.y[((int)this.u & 0x1F)];
            this.k += 8;
            if ((this.g > 0) && (this.g <= this.k))
            {
              System.arraycopy(this.z, 0, this.h, this.i, this.z.length);
              this.i += this.z.length;
              this.k = 0;
            }
          }
          i += 1;
          paramInt1 += 1;
        }
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */