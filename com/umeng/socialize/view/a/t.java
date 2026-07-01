package com.umeng.socialize.view.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View.OnClickListener;

public abstract class t
  extends Activity
{
  protected static final int i = 267390721;
  protected static final int j = 267390722;
  private byte[] a;
  private Bitmap b;
  private View.OnClickListener c;
  
  private void b()
  {
    new AlertDialog.Builder(this).setMessage("是否删除上传的图片？").setCancelable(false).setPositiveButton("是", new v(this)).setNegativeButton("否", new w(this)).create().show();
  }
  
  private void c()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    x localx = new x(this);
    localBuilder.setItems(new CharSequence[] { "相册图片", "相机拍摄" }, localx);
    localBuilder.create().show();
  }
  
  protected abstract void a();
  
  protected abstract void a(Bitmap paramBitmap);
  
  protected void e()
  {
    setImageBytes(null);
    if (getPreviewImg() != null) {
      getPreviewImg().recycle();
    }
    a();
  }
  
  public byte[] getImageBytes()
  {
    return this.a;
  }
  
  public Bitmap getPreviewImg()
  {
    return this.b;
  }
  
  public View.OnClickListener getReceiveImageClick()
  {
    return this.c;
  }
  
  /* Error */
  protected void onActivityResult(int paramInt1, int paramInt2, android.content.Intent paramIntent)
  {
    // Byte code:
    //   0: ldc 7
    //   2: iload_1
    //   3: if_icmpne +81 -> 84
    //   6: aload_3
    //   7: ifnull +77 -> 84
    //   10: aload_3
    //   11: invokevirtual 117	android/content/Intent:getData	()Landroid/net/Uri;
    //   14: ifnull +70 -> 84
    //   17: aload_0
    //   18: aload_0
    //   19: aload_3
    //   20: invokevirtual 117	android/content/Intent:getData	()Landroid/net/Uri;
    //   23: invokestatic 122	com/umeng/socialize/common/m:a	(Landroid/app/Activity;Landroid/net/Uri;)[B
    //   26: invokevirtual 86	com/umeng/socialize/view/a/t:setImageBytes	([B)V
    //   29: aload_0
    //   30: invokevirtual 124	com/umeng/socialize/view/a/t:getImageBytes	()[B
    //   33: ifnull +42 -> 75
    //   36: aload_0
    //   37: invokevirtual 124	com/umeng/socialize/view/a/t:getImageBytes	()[B
    //   40: arraylength
    //   41: ifle +34 -> 75
    //   44: new 126	android/graphics/BitmapFactory$Options
    //   47: dup
    //   48: invokespecial 127	android/graphics/BitmapFactory$Options:<init>	()V
    //   51: astore_3
    //   52: aload_3
    //   53: iconst_4
    //   54: putfield 130	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   57: aload_0
    //   58: aload_0
    //   59: invokevirtual 124	com/umeng/socialize/view/a/t:getImageBytes	()[B
    //   62: iconst_0
    //   63: aload_0
    //   64: invokevirtual 124	com/umeng/socialize/view/a/t:getImageBytes	()[B
    //   67: arraylength
    //   68: aload_3
    //   69: invokestatic 136	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   72: invokevirtual 139	com/umeng/socialize/view/a/t:setPreviewImg	(Landroid/graphics/Bitmap;)V
    //   75: aload_0
    //   76: aload_0
    //   77: invokevirtual 90	com/umeng/socialize/view/a/t:getPreviewImg	()Landroid/graphics/Bitmap;
    //   80: invokevirtual 141	com/umeng/socialize/view/a/t:a	(Landroid/graphics/Bitmap;)V
    //   83: return
    //   84: ldc 9
    //   86: iload_1
    //   87: if_icmpne -12 -> 75
    //   90: aload_3
    //   91: ifnull -16 -> 75
    //   94: aload_3
    //   95: invokevirtual 117	android/content/Intent:getData	()Landroid/net/Uri;
    //   98: ifnull -23 -> 75
    //   101: aload_0
    //   102: aload_3
    //   103: invokevirtual 145	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   106: ldc -109
    //   108: invokevirtual 153	android/os/Bundle:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   111: checkcast 92	android/graphics/Bitmap
    //   114: invokevirtual 139	com/umeng/socialize/view/a/t:setPreviewImg	(Landroid/graphics/Bitmap;)V
    //   117: new 155	java/io/ByteArrayOutputStream
    //   120: dup
    //   121: invokespecial 156	java/io/ByteArrayOutputStream:<init>	()V
    //   124: astore 4
    //   126: aload_0
    //   127: invokevirtual 90	com/umeng/socialize/view/a/t:getPreviewImg	()Landroid/graphics/Bitmap;
    //   130: getstatic 162	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   133: bipush 100
    //   135: aload 4
    //   137: invokevirtual 166	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   140: pop
    //   141: aload_0
    //   142: aload 4
    //   144: invokevirtual 169	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   147: invokevirtual 86	com/umeng/socialize/view/a/t:setImageBytes	([B)V
    //   150: aload 4
    //   152: invokevirtual 172	java/io/ByteArrayOutputStream:close	()V
    //   155: goto -80 -> 75
    //   158: astore_3
    //   159: goto -84 -> 75
    //   162: astore_3
    //   163: aconst_null
    //   164: astore 4
    //   166: aload 4
    //   168: ifnull +8 -> 176
    //   171: aload 4
    //   173: invokevirtual 172	java/io/ByteArrayOutputStream:close	()V
    //   176: aload_3
    //   177: athrow
    //   178: astore 4
    //   180: goto -4 -> 176
    //   183: astore_3
    //   184: goto -18 -> 166
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	187	0	this	t
    //   0	187	1	paramInt1	int
    //   0	187	2	paramInt2	int
    //   0	187	3	paramIntent	android.content.Intent
    //   124	48	4	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   178	1	4	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   150	155	158	java/io/IOException
    //   101	126	162	finally
    //   171	176	178	java/io/IOException
    //   126	150	183	finally
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.c = new u(this);
  }
  
  public void setImageBytes(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
  }
  
  public void setPreviewImg(Bitmap paramBitmap)
  {
    this.b = paramBitmap;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */