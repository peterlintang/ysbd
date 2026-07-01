package android.support.v4.print;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentAdapter.LayoutResultCallback;
import android.print.PrintDocumentInfo.Builder;

class PrintHelperKitkat$1
  extends PrintDocumentAdapter
{
  private PrintAttributes mAttributes;
  
  PrintHelperKitkat$1(PrintHelperKitkat paramPrintHelperKitkat, String paramString, Bitmap paramBitmap, int paramInt) {}
  
  public void onLayout(PrintAttributes paramPrintAttributes1, PrintAttributes paramPrintAttributes2, CancellationSignal paramCancellationSignal, PrintDocumentAdapter.LayoutResultCallback paramLayoutResultCallback, Bundle paramBundle)
  {
    boolean bool = true;
    this.mAttributes = paramPrintAttributes2;
    paramCancellationSignal = new PrintDocumentInfo.Builder(this.val$jobName).setContentType(1).setPageCount(1).build();
    if (!paramPrintAttributes2.equals(paramPrintAttributes1)) {}
    for (;;)
    {
      paramLayoutResultCallback.onLayoutFinished(paramCancellationSignal, bool);
      return;
      bool = false;
    }
  }
  
  /* Error */
  public void onWrite(android.print.PageRange[] paramArrayOfPageRange, android.os.ParcelFileDescriptor paramParcelFileDescriptor, CancellationSignal paramCancellationSignal, android.print.PrintDocumentAdapter.WriteResultCallback paramWriteResultCallback)
  {
    // Byte code:
    //   0: new 66	android/print/pdf/PrintedPdfDocument
    //   3: dup
    //   4: aload_0
    //   5: getfield 18	android/support/v4/print/PrintHelperKitkat$1:this$0	Landroid/support/v4/print/PrintHelperKitkat;
    //   8: getfield 72	android/support/v4/print/PrintHelperKitkat:mContext	Landroid/content/Context;
    //   11: aload_0
    //   12: getfield 32	android/support/v4/print/PrintHelperKitkat$1:mAttributes	Landroid/print/PrintAttributes;
    //   15: invokespecial 75	android/print/pdf/PrintedPdfDocument:<init>	(Landroid/content/Context;Landroid/print/PrintAttributes;)V
    //   18: astore_1
    //   19: aload_1
    //   20: iconst_1
    //   21: invokevirtual 79	android/print/pdf/PrintedPdfDocument:startPage	(I)Landroid/graphics/pdf/PdfDocument$Page;
    //   24: astore_3
    //   25: new 81	android/graphics/RectF
    //   28: dup
    //   29: aload_3
    //   30: invokevirtual 87	android/graphics/pdf/PdfDocument$Page:getInfo	()Landroid/graphics/pdf/PdfDocument$PageInfo;
    //   33: invokevirtual 93	android/graphics/pdf/PdfDocument$PageInfo:getContentRect	()Landroid/graphics/Rect;
    //   36: invokespecial 96	android/graphics/RectF:<init>	(Landroid/graphics/Rect;)V
    //   39: astore 6
    //   41: new 98	android/graphics/Matrix
    //   44: dup
    //   45: invokespecial 99	android/graphics/Matrix:<init>	()V
    //   48: astore 7
    //   50: aload 6
    //   52: invokevirtual 103	android/graphics/RectF:width	()F
    //   55: aload_0
    //   56: getfield 22	android/support/v4/print/PrintHelperKitkat$1:val$bitmap	Landroid/graphics/Bitmap;
    //   59: invokevirtual 109	android/graphics/Bitmap:getWidth	()I
    //   62: i2f
    //   63: fdiv
    //   64: fstore 5
    //   66: aload_0
    //   67: getfield 24	android/support/v4/print/PrintHelperKitkat$1:val$fittingMode	I
    //   70: iconst_2
    //   71: if_icmpne +140 -> 211
    //   74: fload 5
    //   76: aload 6
    //   78: invokevirtual 112	android/graphics/RectF:height	()F
    //   81: aload_0
    //   82: getfield 22	android/support/v4/print/PrintHelperKitkat$1:val$bitmap	Landroid/graphics/Bitmap;
    //   85: invokevirtual 115	android/graphics/Bitmap:getHeight	()I
    //   88: i2f
    //   89: fdiv
    //   90: invokestatic 121	java/lang/Math:max	(FF)F
    //   93: fstore 5
    //   95: aload 7
    //   97: fload 5
    //   99: fload 5
    //   101: invokevirtual 125	android/graphics/Matrix:postScale	(FF)Z
    //   104: pop
    //   105: aload 7
    //   107: aload 6
    //   109: invokevirtual 103	android/graphics/RectF:width	()F
    //   112: aload_0
    //   113: getfield 22	android/support/v4/print/PrintHelperKitkat$1:val$bitmap	Landroid/graphics/Bitmap;
    //   116: invokevirtual 109	android/graphics/Bitmap:getWidth	()I
    //   119: i2f
    //   120: fload 5
    //   122: fmul
    //   123: fsub
    //   124: fconst_2
    //   125: fdiv
    //   126: aload 6
    //   128: invokevirtual 112	android/graphics/RectF:height	()F
    //   131: fload 5
    //   133: aload_0
    //   134: getfield 22	android/support/v4/print/PrintHelperKitkat$1:val$bitmap	Landroid/graphics/Bitmap;
    //   137: invokevirtual 115	android/graphics/Bitmap:getHeight	()I
    //   140: i2f
    //   141: fmul
    //   142: fsub
    //   143: fconst_2
    //   144: fdiv
    //   145: invokevirtual 128	android/graphics/Matrix:postTranslate	(FF)Z
    //   148: pop
    //   149: aload_3
    //   150: invokevirtual 132	android/graphics/pdf/PdfDocument$Page:getCanvas	()Landroid/graphics/Canvas;
    //   153: aload_0
    //   154: getfield 22	android/support/v4/print/PrintHelperKitkat$1:val$bitmap	Landroid/graphics/Bitmap;
    //   157: aload 7
    //   159: aconst_null
    //   160: invokevirtual 138	android/graphics/Canvas:drawBitmap	(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
    //   163: aload_1
    //   164: aload_3
    //   165: invokevirtual 142	android/print/pdf/PrintedPdfDocument:finishPage	(Landroid/graphics/pdf/PdfDocument$Page;)V
    //   168: aload_1
    //   169: new 144	java/io/FileOutputStream
    //   172: dup
    //   173: aload_2
    //   174: invokevirtual 150	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   177: invokespecial 153	java/io/FileOutputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   180: invokevirtual 157	android/print/pdf/PrintedPdfDocument:writeTo	(Ljava/io/OutputStream;)V
    //   183: aload 4
    //   185: iconst_1
    //   186: anewarray 159	android/print/PageRange
    //   189: dup
    //   190: iconst_0
    //   191: getstatic 163	android/print/PageRange:ALL_PAGES	Landroid/print/PageRange;
    //   194: aastore
    //   195: invokevirtual 169	android/print/PrintDocumentAdapter$WriteResultCallback:onWriteFinished	([Landroid/print/PageRange;)V
    //   198: aload_1
    //   199: invokevirtual 172	android/print/pdf/PrintedPdfDocument:close	()V
    //   202: aload_2
    //   203: ifnull +7 -> 210
    //   206: aload_2
    //   207: invokevirtual 173	android/os/ParcelFileDescriptor:close	()V
    //   210: return
    //   211: fload 5
    //   213: aload 6
    //   215: invokevirtual 112	android/graphics/RectF:height	()F
    //   218: aload_0
    //   219: getfield 22	android/support/v4/print/PrintHelperKitkat$1:val$bitmap	Landroid/graphics/Bitmap;
    //   222: invokevirtual 115	android/graphics/Bitmap:getHeight	()I
    //   225: i2f
    //   226: fdiv
    //   227: invokestatic 176	java/lang/Math:min	(FF)F
    //   230: fstore 5
    //   232: goto -137 -> 95
    //   235: astore_3
    //   236: aload 4
    //   238: aconst_null
    //   239: invokevirtual 180	android/print/PrintDocumentAdapter$WriteResultCallback:onWriteFailed	(Ljava/lang/CharSequence;)V
    //   242: goto -44 -> 198
    //   245: astore_3
    //   246: aload_1
    //   247: invokevirtual 172	android/print/pdf/PrintedPdfDocument:close	()V
    //   250: aload_2
    //   251: ifnull +7 -> 258
    //   254: aload_2
    //   255: invokevirtual 173	android/os/ParcelFileDescriptor:close	()V
    //   258: aload_3
    //   259: athrow
    //   260: astore_1
    //   261: return
    //   262: astore_1
    //   263: goto -5 -> 258
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	266	0	this	1
    //   0	266	1	paramArrayOfPageRange	android.print.PageRange[]
    //   0	266	2	paramParcelFileDescriptor	android.os.ParcelFileDescriptor
    //   0	266	3	paramCancellationSignal	CancellationSignal
    //   0	266	4	paramWriteResultCallback	android.print.PrintDocumentAdapter.WriteResultCallback
    //   64	167	5	f	float
    //   39	175	6	localRectF	android.graphics.RectF
    //   48	110	7	localMatrix	android.graphics.Matrix
    // Exception table:
    //   from	to	target	type
    //   168	198	235	java/io/IOException
    //   19	95	245	finally
    //   95	168	245	finally
    //   168	198	245	finally
    //   211	232	245	finally
    //   236	242	245	finally
    //   206	210	260	java/io/IOException
    //   254	258	262	java/io/IOException
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\print\PrintHelperKitkat$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */