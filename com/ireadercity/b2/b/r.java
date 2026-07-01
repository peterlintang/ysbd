package com.ireadercity.b2.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.RectF;
import com.ireadercity.b2.a;
import com.ireadercity.b2.bean.h;
import com.ireadercity.b2.bean.i;
import com.ireadercity.b2.bean.j;
import com.ireadercity.b2.bean.m;
import com.ireadercity.b2.bean.n;
import com.ireadercity.b2.bean.o;
import com.ireadercity.b2.h.w;
import com.ireadercity.b2.h.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class r
{
  boolean a = false;
  boolean b = false;
  String c;
  private List<o> d;
  private f e;
  private List<m> f;
  private Paint g;
  private String h;
  private String i;
  private String j;
  
  public r(Paint paramPaint, String paramString, boolean paramBoolean)
  {
    this.b = paramBoolean;
    this.d = new ArrayList();
    this.f = new ArrayList();
    this.g = paramPaint;
    this.j = paramString;
  }
  
  private static int[] b(String paramString)
  {
    int[] arrayOfInt = new int[2];
    int[] tmp5_4 = arrayOfInt;
    tmp5_4[0] = 0;
    int[] tmp9_5 = tmp5_4;
    tmp9_5[1] = 0;
    tmp9_5;
    if (paramString == null) {}
    for (;;)
    {
      return arrayOfInt;
      if (new File(paramString).exists()) {
        try
        {
          paramString = g.a(paramString);
          if (paramString != null)
          {
            arrayOfInt[0] = paramString.getWidth();
            arrayOfInt[1] = paramString.getHeight();
            paramString.recycle();
            if (arrayOfInt[1] > com.ireadercity.b2.bean.g.e - com.ireadercity.b2.bean.g.j) {
              arrayOfInt[1] = ((int)(com.ireadercity.b2.bean.g.e - com.ireadercity.b2.bean.g.j));
            }
            if (arrayOfInt[0] > com.ireadercity.b2.bean.g.d)
            {
              arrayOfInt[0] = ((int)(arrayOfInt[1] * (com.ireadercity.b2.bean.g.d / (com.ireadercity.b2.bean.g.e + 0.0F))));
              return arrayOfInt;
            }
          }
        }
        catch (Exception paramString)
        {
          paramString.printStackTrace();
          return arrayOfInt;
        }
        catch (OutOfMemoryError paramString)
        {
          paramString.printStackTrace();
          a.d();
        }
      }
    }
    return arrayOfInt;
  }
  
  public final String a(int paramInt)
  {
    Object localObject = (m)this.f.get(paramInt);
    if (localObject == null) {
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    localObject = ((m)localObject).a.iterator();
    while (((Iterator)localObject).hasNext())
    {
      o localo = (o)((Iterator)localObject).next();
      if ((localo instanceof n))
      {
        localo.a();
        localStringBuffer.append(localo.a());
        localStringBuffer.append("\n");
      }
    }
    return localStringBuffer.toString();
  }
  
  public final void a(Paint paramPaint)
  {
    this.g = paramPaint;
  }
  
  public final void a(f paramf)
  {
    this.e = paramf;
  }
  
  public final void a(String paramString)
  {
    this.h = paramString;
  }
  
  public final boolean a()
  {
    return this.b;
  }
  
  public final boolean a(Context paramContext, i parami, Canvas paramCanvas, int paramInt, String paramString)
  {
    boolean bool = false;
    if (paramCanvas == null) {
      return false;
    }
    new StringBuilder("Settings.CURRENTSETTINGS.getSimpleorTraditional()=").append(j.p.l()).toString();
    if ((paramInt >= this.f.size()) || (paramInt < 0)) {
      return false;
    }
    if (w.b == null) {}
    for (;;)
    {
      try
      {
        if (parami.s() == 1) {
          continue;
        }
        paramContext = BitmapFactory.decodeResource(paramContext.getResources(), parami.e());
        w.b = paramContext;
        if (paramContext != null) {
          new StringBuilder("UIUtils.themeBgBitmap height=").append(w.b.getHeight()).append(" width=").append(w.b.getWidth()).toString();
        }
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
        a.d();
        continue;
        paramContext = new RectF(0.0F, 0.0F, w.b.getWidth(), w.b.getHeight());
        parami = new RectF(0.0F, 0.0F, a.D, a.E);
        localObject = new Matrix();
        ((Matrix)localObject).setRectToRect(paramContext, parami, Matrix.ScaleToFit.FILL);
        try
        {
          paramCanvas.drawBitmap(w.b, (Matrix)localObject, this.g);
        }
        catch (Exception paramContext) {}
        continue;
        f1 = com.ireadercity.b2.bean.g.j + com.ireadercity.b2.bean.g.c;
        parami = paramContext.a.iterator();
      }
      if (w.b != null) {
        continue;
      }
      paramCanvas.drawColor(-16777216);
      paramContext = (m)this.f.get(paramInt);
      if (paramContext != null) {
        continue;
      }
      return false;
      if ((parami.u() != null) && (parami.u().trim() != ""))
      {
        new StringBuilder("executing UIUtils.themeBgBitmap = BitmapFactory.decodeFile(setReader.getCustomBgPath());setReader.getCustomBgPath()=").append(parami.u()).toString();
        paramContext = BitmapFactory.decodeFile(parami.u());
        w.b = paramContext;
        if (paramContext != null) {
          new StringBuilder("UIUtils.themeBgBitmap height=").append(w.b.getHeight()).append(" width=").append(w.b.getWidth()).toString();
        }
      }
    }
    Object localObject;
    float f1;
    if (parami.hasNext())
    {
      paramContext = (o)parami.next();
      new StringBuilder("DRAWing:").append(paramContext.a()).toString();
      if ((paramContext instanceof n))
      {
        paramContext = paramContext.a();
        if (j.p.l() == 1) {
          paramContext = s.a(paramContext);
        }
      }
    }
    label432:
    label795:
    for (;;)
    {
      if ((paramString != null) && (paramString.length() > 0) && (paramContext.indexOf(paramString) >= 0))
      {
        this.g.setUnderlineText(true);
        bool = true;
      }
      for (;;)
      {
        paramCanvas.drawText(paramContext, com.ireadercity.b2.bean.g.b, f1, this.g);
        if ((paramString != null) && (paramString.length() > 0) && (paramContext.indexOf(paramString) >= 0)) {
          this.g.setUnderlineText(false);
        }
        f1 += com.ireadercity.b2.bean.g.h;
        break;
        if (j.p.l() != 2) {
          break label795;
        }
        paramContext = s.b(paramContext);
        break label432;
        new StringBuilder("howable.getContent()=").append(paramContext.a()).toString();
        paramContext = y.a(paramContext.a());
        if (this.i == null)
        {
          int k = y.c(paramContext);
          paramInt = 1;
          while (paramInt < k)
          {
            this.c = new File(this.c).getParent();
            paramInt += 1;
          }
          this.i = this.c;
        }
        paramContext = g.a(this.i + "/" + y.b(paramContext));
        Matrix localMatrix;
        if (paramContext != null)
        {
          localObject = new RectF(0.0F, 0.0F, paramContext.getWidth(), paramContext.getHeight());
          RectF localRectF = new RectF(com.ireadercity.b2.bean.g.b, (int)f1, a.D - com.ireadercity.b2.bean.g.b, (int)f1 + paramContext.getHeight());
          localMatrix = new Matrix();
          localMatrix.setRectToRect((RectF)localObject, localRectF, Matrix.ScaleToFit.START);
        }
        for (;;)
        {
          try
          {
            paramCanvas.drawBitmap(paramContext, localMatrix, this.g);
            f1 = paramContext.getHeight() + f1;
            paramContext.recycle();
            a.d();
            break;
            this.a = true;
            return bool;
          }
          catch (Exception localException) {}
        }
      }
    }
  }
  
  public final List<m> b()
  {
    return this.f;
  }
  
  public final int c()
  {
    return this.f.size();
  }
  
  public final void d()
  {
    float f3 = com.ireadercity.b2.bean.g.h;
    com.ireadercity.b2.bean.g.e = (int)((int)Math.floor(a.E / f3) * f3);
    Object localObject1 = new m();
    float f1 = com.ireadercity.b2.bean.g.j;
    String.format("height=%d width=%d", new Object[] { Integer.valueOf(a.E), Integer.valueOf(a.D) });
    String.format("showables.size()=%d", new Object[] { Integer.valueOf(this.d.size()) });
    String.format("SCREEN_HEIGHT=%f BELOW_DISTANCE=%f pagepadding_tb=%d ABOVE_DISTANCE=%f row_height=%f", new Object[] { Float.valueOf(com.ireadercity.b2.bean.g.f), Float.valueOf(com.ireadercity.b2.bean.g.k), Integer.valueOf(com.ireadercity.b2.bean.g.c), Float.valueOf(com.ireadercity.b2.bean.g.j), Float.valueOf(f3) });
    int n = 0;
    if (n < this.d.size())
    {
      Object localObject3 = (o)this.d.get(n);
      Object localObject2;
      int m;
      int k;
      float f2;
      if ((localObject3 instanceof n))
      {
        localObject2 = ((o)localObject3).a();
        localObject3 = new float[1];
        localObject3[0] = 1.0F;
        int i1 = 0;
        while (localObject3[0] > 0.0F)
        {
          int i2 = this.g.breakText((CharSequence)localObject2, i1, ((String)localObject2).length(), true, com.ireadercity.b2.bean.g.d, (float[])localObject3);
          if (i2 <= 0) {
            break;
          }
          if (f1 > com.ireadercity.b2.bean.g.f - com.ireadercity.b2.bean.g.k - com.ireadercity.b2.bean.g.c)
          {
            this.f.add(localObject1);
            f1 = com.ireadercity.b2.bean.g.j;
            localObject1 = new m();
          }
          else
          {
            int i3 = i2 + i1;
            m = i2;
            if (i3 < ((String)localObject2).length())
            {
              localObject4 = ((String)localObject2).substring(i3, i3 + 1);
              k = i2;
              if (localObject4 != null) {
                if ((!((String)localObject4).equals("，")) && (!((String)localObject4).equals("。")) && (!((String)localObject4).equals("；")) && (!((String)localObject4).equals("、")) && (!((String)localObject4).equals("！")) && (!((String)localObject4).equals("？")) && (!((String)localObject4).equals("”")) && (!((String)localObject4).equals(".")))
                {
                  k = i2;
                  if (!((String)localObject4).equals(",")) {}
                }
                else
                {
                  k = i2 - 1;
                }
              }
              m = k;
              if (localObject4 != null)
              {
                m = k;
                if (((String)localObject4).toCharArray().length == 1)
                {
                  m = k;
                  if (y.a(localObject4.toCharArray()[0]))
                  {
                    i2 = i3;
                    i3 = 0;
                    for (;;)
                    {
                      m = k;
                      if (i3 >= 20) {
                        break;
                      }
                      m = k;
                      if (k <= 0) {
                        break;
                      }
                      i3 += 1;
                      localObject4 = ((String)localObject2).substring(i2 - 1, i2);
                      m = k;
                      if (((String)localObject4).toCharArray().length != 1) {
                        break;
                      }
                      m = k;
                      if (!y.a(localObject4.toCharArray()[0])) {
                        break;
                      }
                      i2 -= 1;
                      k -= 1;
                    }
                  }
                }
              }
            }
            Object localObject4 = new n(((String)localObject2).substring(i1, i1 + m));
            ((m)localObject1).a.add(localObject4);
            i1 += m;
            f1 += f3;
          }
        }
        f2 = f1;
        if (f1 < com.ireadercity.b2.bean.g.f - com.ireadercity.b2.bean.g.c)
        {
          f2 = f1;
          if (!this.b)
          {
            f2 = f1 + f3;
            localObject2 = new n(" ");
            ((m)localObject1).a.add(localObject2);
          }
        }
        f1 = f2;
      }
      for (;;)
      {
        n += 1;
        break;
        new StringBuilder(" wow ,img ............").append(this.h).append("/").append(((o)localObject3).a()).toString();
        localObject2 = y.a(((o)localObject3).a());
        if ((this.i == null) && (this.h != null))
        {
          m = y.c((String)localObject2);
          k = 0;
          while (k < m)
          {
            this.h = new File(this.h).getParent();
            k += 1;
          }
          this.i = this.h;
        }
        f2 = b(this.i + "/" + y.b(localObject2))[1];
        if (f2 > com.ireadercity.b2.bean.g.e - com.ireadercity.b2.bean.g.j - f3)
        {
          if (((m)localObject1).a.size() > 0) {
            this.f.add(localObject1);
          }
          localObject1 = new m();
          ((m)localObject1).a.add(localObject3);
          this.f.add(localObject1);
          localObject1 = new m();
          f1 = com.ireadercity.b2.bean.g.j;
        }
        else if (f1 + f2 > a.E - com.ireadercity.b2.bean.g.c)
        {
          this.f.add(localObject1);
          f1 = com.ireadercity.b2.bean.g.j;
          localObject2 = new m();
          ((m)localObject2).a.add(localObject3);
          f2 += f1;
          f1 = f2;
          localObject1 = localObject2;
          if (f2 > com.ireadercity.b2.bean.g.f - com.ireadercity.b2.bean.g.k - com.ireadercity.b2.bean.g.c)
          {
            this.f.add(localObject2);
            f1 = com.ireadercity.b2.bean.g.j;
            localObject1 = new m();
          }
        }
        else
        {
          ((m)localObject1).a.add(localObject3);
          f1 = f2 + f1;
        }
      }
    }
    if ((((m)localObject1).a.size() > 0) && (((o)((m)localObject1).a.get(0)).a().length() > 0)) {
      this.f.add(localObject1);
    }
    if (this.f.size() <= 0)
    {
      localObject1 = new m();
      ((m)localObject1).a.add(new n("  "));
      this.f.add(localObject1);
    }
  }
  
  public final void e()
  {
    int i1 = -3;
    new StringBuilder("fileBasePath=").append(this.h).toString();
    long l = System.currentTimeMillis();
    ConcurrentLinkedQueue localConcurrentLinkedQueue = new ConcurrentLinkedQueue();
    if (this.j == null) {
      return;
    }
    int n;
    int m;
    Object localObject1;
    if (!this.b)
    {
      k = this.j.indexOf("<body");
      if (k >= 0)
      {
        k = this.j.indexOf(">", k) + 1;
        n = this.j.lastIndexOf("</body>");
        m = n;
        if (n == -1) {
          m = this.j.lastIndexOf("</BODY>");
        }
        n = m;
        if (m == -1) {
          n = this.j.length();
        }
        localObject1 = this.j.substring(k, n).trim();
      }
    }
    label141:
    Object localObject2;
    for (;;)
    {
      if (!this.b)
      {
        localObject2 = Pattern.compile("<img[^>]*\\s+src\\s*=\\s*['\"]([^'\"]+)['\"][^>]*>", 2).matcher((CharSequence)localObject1);
        for (;;)
        {
          if (((Matcher)localObject2).find())
          {
            new StringBuilder("group 1=").append(((Matcher)localObject2).group(1)).toString();
            localConcurrentLinkedQueue.add(((Matcher)localObject2).group(1));
            continue;
            k = this.j.indexOf("<BODY");
            if (k >= 0)
            {
              k = this.j.indexOf(">", k) + 1;
              break;
            }
            k = 0;
            break;
            localObject1 = this.j;
            break label141;
          }
        }
        localObject2 = localConcurrentLinkedQueue.iterator();
        while (((Iterator)localObject2).hasNext()) {
          ((Iterator)localObject2).next();
        }
        if (localConcurrentLinkedQueue.size() <= 0) {
          this.b = true;
        }
        localObject1 = ((String)localObject1).replaceAll("<img[^>]*\\s+src\\s*=\\s*['\"]([^'\"]+)['\"][^>]*>", "##i#");
        new StringBuilder("img regex time taken :").append(System.currentTimeMillis() - l).toString();
        l = System.currentTimeMillis();
        new StringBuilder("br regex time taken :").append(System.currentTimeMillis() - l).toString();
        l = System.currentTimeMillis();
        localObject1 = ((String)localObject1).replaceAll("<[h|H]+[0-9]([^/]*)>", "");
        new StringBuilder(" pre h* regex time taken :").append(System.currentTimeMillis() - l).toString();
        l = System.currentTimeMillis();
        a.d();
        localObject1 = ((String)localObject1).replaceAll("</(p|P)>", "##p#" + "  ").replaceAll("</(b|B)>", "##p#" + "  ");
        new StringBuilder(" tail p tag  regex time taken :").append(System.currentTimeMillis() - l).toString();
        l = System.currentTimeMillis();
        localObject1 = ((String)localObject1).replaceAll("</(h|H)[0-9]>", "##p#");
        new StringBuilder("tail H* regex time taken :").append(System.currentTimeMillis() - l).toString();
        l = System.currentTimeMillis();
        localObject1 = ((String)localObject1).replaceAll("</([^>]*)>", "");
        new StringBuilder("all </*> regex time taken :").append(System.currentTimeMillis() - l).toString();
        l = System.currentTimeMillis();
        localObject1 = ((String)localObject1).replaceAll("<div(/s)*[^>]*>", "");
        new StringBuilder("all<div(/s)*.*> regex time taken :").append(System.currentTimeMillis() - l).toString();
        l = System.currentTimeMillis();
        localObject1 = ((String)localObject1).replaceAll("<p(/s)*[^>]*>", "  ");
        new StringBuilder("all <p(/s)*.*> regex time taken :").append(System.currentTimeMillis() - l).toString();
        l = System.currentTimeMillis();
        localObject1 = ((String)localObject1).replaceAll("<[a-zA-Z]+[1-9]?[^><]*>", "").replaceAll("[(\n)?\r]", "  ").replaceAll("(<script[\\s\\S]+</script *>)|( no[\\s\\S]*=)|(<iframe[\\s\\S]+</iframe *>)|(<frameset[\\s\\S]+</frameset *>)|(<style[\\s\\S]+</style *>)", "");
        a.d();
        new StringBuilder("Others regex time taken :").append(System.currentTimeMillis() - l).toString();
        l = System.currentTimeMillis();
        localObject1 = ((String)localObject1).replaceAll("&(quot|#34);", "\"").replaceAll("&(amp|#38);", "&").replaceAll("&(lt|#60);", "<").replaceAll("&(gt|#62);", ">");
        a.d();
        localObject1 = ((String)localObject1).replaceAll("&(nbsp|#160);", " ").replaceAll("&(iexcl|#161);", "¡").replaceAll("&(cent|#162);", "¢").replaceAll("&(pound|#163);", "£");
        a.d();
        localObject1 = ((String)localObject1).replaceAll("&(yen|#165);", "¥").replaceAll("&(copy|#169);", "©").replaceAll("&(trade|#153);", "™");
        a.d();
        localObject1 = ((String)localObject1).replaceAll("&145;", "‘").replaceAll("&146;", "’").replaceAll("&147;", "“").replaceAll("&148;", "”").replaceAll("&ldquo;", "“").replaceAll("&rdquo;", "”").replaceAll("&#(\\d+);", "");
        a.d();
        new StringBuilder("Special text time taken :").append(System.currentTimeMillis() - l).toString();
        l = System.currentTimeMillis();
        new StringBuilder("all escape regex time taken :").append(System.currentTimeMillis() - l).toString();
        l = System.currentTimeMillis();
        new StringBuilder("all tap enters regex time taken :").append(System.currentTimeMillis() - l).toString();
        l = System.currentTimeMillis();
        localObject1 = ((String)localObject1).trim();
        new StringBuilder(" regex time taken :").append(System.currentTimeMillis() - l).toString();
        l = System.currentTimeMillis();
        localObject2 = new ArrayList();
        n = -3;
        k = i1;
      }
    }
    for (;;)
    {
      if ((n == -1) && (k == -1)) {
        break label1246;
      }
      m = n;
      if (n != -1)
      {
        n = ((String)localObject1).indexOf("##p#", n + 3);
        m = n;
        if (n >= 0)
        {
          ((List)localObject2).add(Boolean.valueOf(false));
          m = n;
        }
      }
      n = m;
      if (k != -1)
      {
        i1 = ((String)localObject1).indexOf("##i#", k + 3);
        n = m;
        k = i1;
        if (i1 >= 0)
        {
          if (i1 > m)
          {
            ((List)localObject2).add(Boolean.valueOf(true));
            n = m;
            k = i1;
            continue;
            localObject1 = ((String)localObject1).replaceAll("[(\n)?\r]", "##p#" + "      ").replaceAll("<[a-zA-Z]+[1-9]?[^><]*>", "").replaceAll("</([^>]*)>", "");
            a.d();
            break;
          }
          ((List)localObject2).add(((List)localObject2).size() - 1, Boolean.valueOf(true));
          n = m;
          k = i1;
        }
      }
    }
    label1246:
    if ((!this.b) && (((String)localObject1).startsWith("##i#"))) {
      localObject1 = "..." + (String)localObject1;
    }
    for (int k = 1;; k = 0)
    {
      localObject1 = ((String)localObject1).split("##i#");
      m = k;
      Object localObject3;
      if (m < localObject1.length) {
        if (localObject1[m].trim().length() > 0)
        {
          localObject2 = localObject1[m].split("##p#");
          if ((m != 1) || (k != 1)) {
            break label1632;
          }
          localObject3 = (String)localConcurrentLinkedQueue.poll();
          if (localObject3 != null)
          {
            h localh = new h();
            localh.a((String)localObject3);
            this.d.add(localh);
            this.d.add(new n("   "));
          }
        }
      }
      label1632:
      for (n = 0;; n = 1)
      {
        i1 = 0;
        while (i1 < localObject2.length)
        {
          localObject3 = new n();
          ((o)localObject3).a(localObject2[i1]);
          this.d.add(localObject3);
          i1 += 1;
        }
        if (n != 0)
        {
          localObject2 = (String)localConcurrentLinkedQueue.poll();
          if (localObject2 != null)
          {
            localObject3 = new h();
            ((o)localObject3).a((String)localObject2);
            this.d.add(localObject3);
            this.d.add(new n("   "));
          }
        }
        m += 1;
        break;
        while (!localConcurrentLinkedQueue.isEmpty())
        {
          localObject1 = (String)localConcurrentLinkedQueue.poll();
          if (localObject1 != null)
          {
            localObject2 = new h();
            ((o)localObject2).a((String)localObject1);
            this.d.add(localObject2);
          }
        }
        new StringBuilder(" alalysis to array time taken :").append(System.currentTimeMillis() - l).toString();
        this.j = null;
        a.d();
        return;
      }
    }
  }
  
  public final void f()
  {
    try
    {
      this.d.clear();
      this.f.clear();
      this.j = null;
      a.d();
      return;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\b\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */