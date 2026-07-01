package com.taobao.munion.filecache;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class c
{
  private int a = 0;
  private int b = 0;
  private FileChannel c;
  private ReentrantReadWriteLock d;
  private int[] e;
  private int f;
  private boolean g;
  
  protected c(int[] paramArrayOfInt, int paramInt, FileChannel paramFileChannel)
  {
    this.a = (paramArrayOfInt.length * paramInt);
    this.f = paramInt;
    this.e = paramArrayOfInt;
    this.c = paramFileChannel;
    this.g = true;
    this.d = new ReentrantReadWriteLock();
  }
  
  public int a()
  {
    return this.a;
  }
  
  public boolean a(byte[] paramArrayOfByte)
  {
    this.d.writeLock().lock();
    try
    {
      boolean bool = this.g;
      if (!bool) {
        return false;
      }
      if (paramArrayOfByte.length > this.a) {
        throw new c.a(this, "write data is too large. data length is " + paramArrayOfByte.length + ". buffer capacity is " + this.a);
      }
    }
    finally
    {
      this.d.writeLock().unlock();
    }
    this.b = 0;
    int j = paramArrayOfByte.length;
    int i = 0;
    while (j > 0) {
      try
      {
        if (j >= this.f) {}
        for (ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte, this.f * i, this.f);; localByteBuffer = ByteBuffer.wrap(paramArrayOfByte, this.f * i, j))
        {
          this.c.write(localByteBuffer, this.e[i]);
          j -= this.f;
          i += 1;
          break;
        }
        this.b = paramArrayOfByte.length;
      }
      catch (IOException paramArrayOfByte)
      {
        paramArrayOfByte.printStackTrace();
        this.d.writeLock().unlock();
        return false;
      }
    }
    this.d.writeLock().unlock();
    return true;
  }
  
  public byte[] b()
  {
    this.d.readLock().lock();
    try
    {
      boolean bool = this.g;
      if (!bool) {
        return null;
      }
      int i;
      if (this.b > this.a) {
        i = this.a;
      }
      byte[] arrayOfByte;
      for (;;)
      {
        arrayOfByte = new byte[i];
        int k = 0;
        int j = i;
        i = k;
        label60:
        if (j > 0) {
          try
          {
            if (j >= this.f) {}
            for (ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte, this.f * i, this.f);; localByteBuffer = ByteBuffer.wrap(arrayOfByte, this.f * i, j))
            {
              this.c.read(localByteBuffer, this.e[i]);
              k = this.f;
              j -= k;
              i += 1;
              break label60;
              i = this.b;
              break;
            }
          }
          catch (IOException localIOException)
          {
            localIOException.printStackTrace();
            return null;
          }
        }
      }
      return arrayOfByte;
    }
    finally
    {
      this.d.readLock().unlock();
    }
  }
  
  protected int[] c()
  {
    return this.e;
  }
  
  protected int d()
  {
    return this.f;
  }
  
  protected FileChannel e()
  {
    return this.c;
  }
  
  protected void f()
  {
    this.c = null;
    this.g = false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\filecache\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */