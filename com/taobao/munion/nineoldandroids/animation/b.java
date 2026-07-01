package com.taobao.munion.nineoldandroids.animation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

public class b
{
  private static final int[] a = { 16843490 };
  private static final int b = 0;
  private static final int[] c = { 16843489 };
  private static final int d = 0;
  private static final int[] e = { 16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488 };
  private static final int f = 0;
  private static final int g = 1;
  private static final int h = 2;
  private static final int i = 3;
  private static final int j = 4;
  private static final int k = 5;
  private static final int l = 6;
  private static final int m = 7;
  private static final int n = 0;
  private static final int o = 0;
  
  /* Error */
  public static a a(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore 4
    //   5: aconst_null
    //   6: astore_3
    //   7: aload_0
    //   8: invokevirtual 62	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   11: iload_1
    //   12: invokevirtual 68	android/content/res/Resources:getAnimation	(I)Landroid/content/res/XmlResourceParser;
    //   15: astore 5
    //   17: aload 5
    //   19: astore_3
    //   20: aload 5
    //   22: astore_2
    //   23: aload 5
    //   25: astore 4
    //   27: aload_0
    //   28: aload 5
    //   30: invokestatic 71	com/taobao/munion/nineoldandroids/animation/b:a	(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)Lcom/taobao/munion/nineoldandroids/animation/a;
    //   33: astore_0
    //   34: aload 5
    //   36: ifnull +10 -> 46
    //   39: aload 5
    //   41: invokeinterface 76 1 0
    //   46: aload_0
    //   47: areturn
    //   48: astore_0
    //   49: aload_3
    //   50: astore_2
    //   51: new 78	android/content/res/Resources$NotFoundException
    //   54: dup
    //   55: new 80	java/lang/StringBuilder
    //   58: dup
    //   59: ldc 82
    //   61: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   64: iload_1
    //   65: invokestatic 91	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   68: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: invokespecial 100	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   77: astore 4
    //   79: aload_3
    //   80: astore_2
    //   81: aload 4
    //   83: aload_0
    //   84: invokevirtual 104	android/content/res/Resources$NotFoundException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   87: pop
    //   88: aload_3
    //   89: astore_2
    //   90: aload 4
    //   92: athrow
    //   93: astore_0
    //   94: aload_2
    //   95: ifnull +9 -> 104
    //   98: aload_2
    //   99: invokeinterface 76 1 0
    //   104: aload_0
    //   105: athrow
    //   106: astore_0
    //   107: aload 4
    //   109: astore_2
    //   110: new 78	android/content/res/Resources$NotFoundException
    //   113: dup
    //   114: new 80	java/lang/StringBuilder
    //   117: dup
    //   118: ldc 82
    //   120: invokespecial 85	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   123: iload_1
    //   124: invokestatic 91	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   127: invokevirtual 95	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: invokevirtual 99	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   133: invokespecial 100	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   136: astore_3
    //   137: aload 4
    //   139: astore_2
    //   140: aload_3
    //   141: aload_0
    //   142: invokevirtual 104	android/content/res/Resources$NotFoundException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   145: pop
    //   146: aload 4
    //   148: astore_2
    //   149: aload_3
    //   150: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	151	0	paramContext	Context
    //   0	151	1	paramInt	int
    //   1	148	2	localObject1	Object
    //   6	144	3	localObject2	Object
    //   3	144	4	localObject3	Object
    //   15	25	5	localXmlResourceParser	android.content.res.XmlResourceParser
    // Exception table:
    //   from	to	target	type
    //   7	17	48	org/xmlpull/v1/XmlPullParserException
    //   27	34	48	org/xmlpull/v1/XmlPullParserException
    //   7	17	93	finally
    //   27	34	93	finally
    //   51	79	93	finally
    //   81	88	93	finally
    //   90	93	93	finally
    //   110	137	93	finally
    //   140	146	93	finally
    //   149	151	93	finally
    //   7	17	106	java/io/IOException
    //   27	34	106	java/io/IOException
  }
  
  private static a a(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    return a(paramContext, paramXmlPullParser, Xml.asAttributeSet(paramXmlPullParser), null, 0);
  }
  
  private static a a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, d paramd, int paramInt)
  {
    int i2 = 0;
    int i3 = paramXmlPullParser.getDepth();
    ArrayList localArrayList = null;
    Object localObject = null;
    int i1;
    do
    {
      i1 = paramXmlPullParser.next();
      if (((i1 == 3) && (paramXmlPullParser.getDepth() <= i3)) || (i1 == 1)) {
        break;
      }
    } while (i1 != 2);
    localObject = paramXmlPullParser.getName();
    if (((String)localObject).equals("objectAnimator"))
    {
      localObject = a(paramContext, paramAttributeSet);
      label79:
      if (paramd == null) {
        break label333;
      }
      if (localArrayList != null) {
        break label330;
      }
      localArrayList = new ArrayList();
      label97:
      localArrayList.add(localObject);
    }
    label330:
    label333:
    for (;;)
    {
      break;
      if (((String)localObject).equals("animator"))
      {
        localObject = a(paramContext, paramAttributeSet, null);
        break label79;
      }
      if (((String)localObject).equals("set"))
      {
        localObject = new d();
        TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, a);
        TypedValue localTypedValue = new TypedValue();
        localTypedArray.getValue(0, localTypedValue);
        if (localTypedValue.type == 16) {}
        for (i1 = localTypedValue.data;; i1 = 0)
        {
          a(paramContext, paramXmlPullParser, paramAttributeSet, (d)localObject, i1);
          localTypedArray.recycle();
          break;
        }
      }
      throw new RuntimeException("Unknown animator name: " + paramXmlPullParser.getName());
      if ((paramd != null) && (localArrayList != null))
      {
        paramContext = new a[localArrayList.size()];
        paramXmlPullParser = localArrayList.iterator();
        i1 = i2;
        while (paramXmlPullParser.hasNext())
        {
          paramContext[i1] = ((a)paramXmlPullParser.next());
          i1 += 1;
        }
        if (paramInt == 0) {
          paramd.a(paramContext);
        }
      }
      else
      {
        return (a)localObject;
      }
      paramd.b(paramContext);
      return (a)localObject;
      break label97;
    }
  }
  
  private static l a(Context paramContext, AttributeSet paramAttributeSet)
  {
    l locall = new l();
    a(paramContext, paramAttributeSet, locall);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, c);
    locall.a(paramContext.getString(0));
    paramContext.recycle();
    return locall;
  }
  
  private static q a(Context paramContext, AttributeSet paramAttributeSet, q paramq)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, e);
    long l1 = localTypedArray.getInt(1, 0);
    long l2 = localTypedArray.getInt(2, 0);
    int i1 = localTypedArray.getInt(7, 0);
    paramAttributeSet = paramq;
    if (paramq == null) {
      paramAttributeSet = new q();
    }
    int i2;
    label76:
    int i4;
    label87:
    int i3;
    label102:
    int i5;
    label113:
    float f1;
    label201:
    float f2;
    if (i1 == 0)
    {
      i1 = 1;
      paramq = localTypedArray.peekValue(5);
      if (paramq == null) {
        break label328;
      }
      i2 = 1;
      if (i2 == 0) {
        break label334;
      }
      i4 = paramq.type;
      paramq = localTypedArray.peekValue(6);
      if (paramq == null) {
        break label340;
      }
      i3 = 1;
      if (i3 == 0) {
        break label346;
      }
      i5 = paramq.type;
      int i6;
      if ((i2 == 0) || (i4 < 28) || (i4 > 31))
      {
        i6 = i1;
        if (i3 != 0)
        {
          i6 = i1;
          if (i5 >= 28)
          {
            i6 = i1;
            if (i5 > 31) {}
          }
        }
      }
      else
      {
        i6 = 0;
        paramAttributeSet.a(new e());
      }
      if (i6 == 0) {
        break label431;
      }
      if (i2 == 0) {
        break label390;
      }
      if (i4 != 5) {
        break label352;
      }
      f1 = localTypedArray.getDimension(5, 0.0F);
      if (i3 == 0) {
        break label376;
      }
      if (i5 != 5) {
        break label363;
      }
      f2 = localTypedArray.getDimension(6, 0.0F);
      label222:
      paramAttributeSet.a(new float[] { f1, f2 });
    }
    label328:
    label334:
    label340:
    label346:
    label352:
    label363:
    label376:
    label390:
    label431:
    label452:
    label532:
    label572:
    label587:
    do
    {
      for (;;)
      {
        paramAttributeSet.d(l1);
        paramAttributeSet.a(l2);
        if (localTypedArray.hasValue(3)) {
          paramAttributeSet.a(localTypedArray.getInt(3, 0));
        }
        if (localTypedArray.hasValue(4)) {
          paramAttributeSet.b(localTypedArray.getInt(4, 1));
        }
        i1 = localTypedArray.getResourceId(0, 0);
        if (i1 > 0) {
          paramAttributeSet.a(AnimationUtils.loadInterpolator(paramContext, i1));
        }
        localTypedArray.recycle();
        return paramAttributeSet;
        i1 = 0;
        break;
        i2 = 0;
        break label76;
        i4 = 0;
        break label87;
        i3 = 0;
        break label102;
        i5 = 0;
        break label113;
        f1 = localTypedArray.getFloat(5, 0.0F);
        break label201;
        f2 = localTypedArray.getFloat(6, 0.0F);
        break label222;
        paramAttributeSet.a(new float[] { f1 });
        continue;
        if (i5 == 5) {}
        for (f1 = localTypedArray.getDimension(6, 0.0F);; f1 = localTypedArray.getFloat(6, 0.0F))
        {
          paramAttributeSet.a(new float[] { f1 });
          break;
        }
        if (i2 == 0) {
          break label587;
        }
        if (i4 == 5)
        {
          i1 = (int)localTypedArray.getDimension(5, 0.0F);
          if (i3 == 0) {
            break label572;
          }
          if (i5 != 5) {
            break label532;
          }
          i2 = (int)localTypedArray.getDimension(6, 0.0F);
        }
        for (;;)
        {
          paramAttributeSet.a(new int[] { i1, i2 });
          break;
          if ((i4 >= 28) && (i4 <= 31))
          {
            i1 = localTypedArray.getColor(5, 0);
            break label452;
          }
          i1 = localTypedArray.getInt(5, 0);
          break label452;
          if ((i5 >= 28) && (i5 <= 31)) {
            i2 = localTypedArray.getColor(6, 0);
          } else {
            i2 = localTypedArray.getInt(6, 0);
          }
        }
        paramAttributeSet.a(new int[] { i1 });
      }
    } while (i3 == 0);
    if (i5 == 5) {
      i1 = (int)localTypedArray.getDimension(6, 0.0F);
    }
    for (;;)
    {
      paramAttributeSet.a(new int[] { i1 });
      break;
      if ((i5 >= 28) && (i5 <= 31)) {
        i1 = localTypedArray.getColor(6, 0);
      } else {
        i1 = localTypedArray.getInt(6, 0);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */