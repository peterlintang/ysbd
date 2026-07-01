package com.ireadercity.b2.h;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ireadercity.b2.a;
import com.ireadercity.b2.bean.g;
import com.ireadercity.b2.bean.i;

public final class w
{
  public static String a = "AIReader.UIUtils";
  public static Bitmap b;
  private static String c = "UIUtils";
  private static PopupWindow d;
  private static PopupWindow e;
  private static PopupWindow f;
  
  public static Paint a(i parami, Context paramContext)
  {
    return b(parami, paramContext);
  }
  
  public static void a(Activity paramActivity, View paramView, String[] paramArrayOfString, int paramInt, View.OnClickListener paramOnClickListener)
  {
    Object localObject1 = c;
    if (d == null)
    {
      localObject1 = c;
      d = new PopupWindow(paramActivity);
    }
    d.setHeight(a.E / 4 + 10);
    d.setWidth(a.D / 3 + 50);
    localObject1 = new LinearLayout(paramActivity);
    ((LinearLayout)localObject1).setLayoutParams(new ViewGroup.LayoutParams(a.D / 3 + 50, -2));
    ((LinearLayout)localObject1).setOrientation(1);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(a.D / 3 + 50, a.E / 12);
    localLayoutParams1.gravity = 19;
    int j = a.D / 24;
    int i;
    if (j < 13) {
      i = 13;
    }
    for (;;)
    {
      j = 0;
      while (j < paramArrayOfString.length)
      {
        Object localObject2 = new TextView(paramActivity);
        ((TextView)localObject2).setGravity(19);
        ((TextView)localObject2).setLayoutParams(localLayoutParams1);
        if (paramInt == j)
        {
          ((TextView)localObject2).setClickable(false);
          ((TextView)localObject2).setTextColor(Color.rgb(28, 130, 172));
        }
        ((TextView)localObject2).setBackgroundResource(2130837582);
        ((TextView)localObject2).setText(paramArrayOfString[j]);
        ((TextView)localObject2).setTextSize(i);
        ((TextView)localObject2).setTag(Integer.valueOf(j));
        ((TextView)localObject2).setOnClickListener(paramOnClickListener);
        ((LinearLayout)localObject1).addView((View)localObject2);
        if (j != paramArrayOfString.length - 1)
        {
          localObject2 = new View(paramActivity);
          LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, 1);
          ((View)localObject2).setBackgroundColor(Color.rgb(210, 210, 210));
          ((View)localObject2).setLayoutParams(localLayoutParams2);
          ((LinearLayout)localObject1).addView((View)localObject2);
        }
        j += 1;
      }
      i = j;
      if (j > 20) {
        i = 20;
      }
    }
    d.setContentView((View)localObject1);
    d.setTouchable(true);
    paramActivity = Drawable.createFromStream(paramActivity.getResources().openRawResource(2130837542), "bg_popupwindow.9.png");
    d.setBackgroundDrawable(paramActivity);
    d.setOutsideTouchable(true);
    d.setWindowLayoutMode(-2, -2);
    d.setAnimationStyle(2130968606);
    d.showAtLocation(paramView, 83, 3, 68);
  }
  
  public static void a(Activity paramActivity, View paramView, String[] paramArrayOfString, View.OnClickListener paramOnClickListener)
  {
    if (f == null) {
      f = new PopupWindow(paramActivity);
    }
    f.setHeight(a.a(paramActivity, paramArrayOfString.length * 52) + 10);
    f.setWidth(a.D / 2);
    LinearLayout localLinearLayout = new LinearLayout(paramActivity);
    localLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(a.D / 2, a.E / 2 + 10));
    localLinearLayout.setOrientation(1);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(a.D / 2, a.E / 12);
    localLayoutParams.gravity = 19;
    RelativeLayout localRelativeLayout = (RelativeLayout)paramActivity.getLayoutInflater().inflate(2130903153, null);
    TextView localTextView1 = (TextView)localRelativeLayout.findViewById(2131362359);
    TextView localTextView2 = (TextView)localRelativeLayout.findViewById(2131362362);
    TextView localTextView3 = (TextView)localRelativeLayout.findViewById(2131362363);
    TextView localTextView4 = (TextView)localRelativeLayout.findViewById(2131362360);
    TextView localTextView5 = (TextView)localRelativeLayout.findViewById(2131362364);
    TextView localTextView6 = (TextView)localRelativeLayout.findViewById(2131362365);
    TextView localTextView7 = (TextView)localRelativeLayout.findViewById(2131362366);
    int j = a.D / 24;
    int i;
    label236:
    Object localObject1;
    if (j < 13)
    {
      i = 13;
      j = 0;
      if (j >= paramArrayOfString.length) {
        break label556;
      }
      localObject1 = null;
      switch (j)
      {
      }
    }
    for (;;)
    {
      ((TextView)localObject1).setLayoutParams(localLayoutParams);
      ((TextView)localObject1).setGravity(16);
      ((TextView)localObject1).setTextColor(Color.rgb(28, 130, 172));
      ((TextView)localObject1).setPadding(10, 0, 0, 0);
      ((TextView)localObject1).setBackgroundResource(2130837582);
      ((TextView)localObject1).setText(paramArrayOfString[j]);
      Object localObject2 = a;
      new StringBuilder().append(j).append("=").append(paramArrayOfString[j]).toString();
      ((TextView)localObject1).setTextSize(i);
      ((TextView)localObject1).setTag(Integer.valueOf(j));
      ((TextView)localObject1).setOnClickListener(paramOnClickListener);
      localRelativeLayout.removeView((View)localObject1);
      localLinearLayout.addView((View)localObject1);
      if (j != paramArrayOfString.length - 1)
      {
        localObject1 = new View(paramActivity);
        localObject2 = new LinearLayout.LayoutParams(-1, 1);
        ((View)localObject1).setBackgroundColor(Color.rgb(210, 210, 210));
        ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
        localLinearLayout.addView((View)localObject1);
      }
      j += 1;
      break label236;
      i = j;
      if (j <= 20) {
        break;
      }
      i = 20;
      break;
      localObject1 = localTextView1;
      continue;
      localObject1 = localTextView4;
      continue;
      localObject1 = localTextView3;
      continue;
      localObject1 = localTextView2;
      continue;
      localObject1 = localTextView5;
      continue;
      localObject1 = localTextView6;
      continue;
      localObject1 = localTextView7;
    }
    label556:
    f.setContentView(localLinearLayout);
    f.setTouchable(true);
    paramActivity = Drawable.createFromStream(paramActivity.getResources().openRawResource(2130837542), "bg_popupwindow.9.png");
    f.setBackgroundDrawable(paramActivity);
    f.setOutsideTouchable(true);
    f.setWindowLayoutMode(-2, -2);
    f.setAnimationStyle(2130968606);
    f.showAtLocation(paramView, 81, 3, 68);
  }
  
  @Deprecated
  public static void a(Context paramContext)
  {
    Object localObject = c;
    localObject = new PopupWindow(paramContext);
    e = (PopupWindow)localObject;
    ((PopupWindow)localObject).setHeight(a.E / 4 + 10);
    e.setWidth(a.D / 3 + 50);
    paramContext = new TextView(paramContext);
    paramContext.setTextSize(20.0F);
    paramContext.setTextColor(-16777216);
    paramContext.setHeight(a.D / 4);
    paramContext.setWidth(a.D / 2);
    paramContext.setGravity(17);
    paramContext.setBackgroundResource(2130837864);
    paramContext.setText("读取中...");
    e.setContentView(paramContext);
    e.setBackgroundDrawable(null);
    e.setOutsideTouchable(true);
    e.setWindowLayoutMode(-2, -2);
    e.setAnimationStyle(2130968606);
  }
  
  @Deprecated
  public static void a(View paramView)
  {
    if (paramView == null) {}
    try
    {
      paramView = c;
      for (;;)
      {
        return;
        String str = c;
        new StringBuilder().append(paramView).append("  parentView->popLoadingWindow").toString();
        if (e == null) {
          a(paramView.getContext());
        }
        boolean bool = e.isShowing();
        if (!bool) {
          try
          {
            e.showAtLocation(paramView, 17, 0, 0);
          }
          catch (Throwable paramView)
          {
            paramView.printStackTrace();
          }
        }
      }
    }
    catch (Throwable paramView)
    {
      for (;;)
      {
        paramView.printStackTrace();
      }
    }
    finally {}
  }
  
  public static boolean a()
  {
    return (e != null) && (e.isShowing());
  }
  
  private static Paint b(i parami, Context paramContext)
  {
    localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.setFlags(3);
    localPaint.setTextAlign(Paint.Align.LEFT);
    localPaint.setTextSize(parami.i() + 8);
    Object localObject1 = a;
    new StringBuilder("paint.getTextSize()=").append(localPaint.getTextSize()).toString();
    if (parami.k() == 0)
    {
      localPaint.setFakeBoldText(false);
      localObject1 = Typeface.DEFAULT;
    }
    for (;;)
    {
      try
      {
        if (!parami.j().endsWith("默认(新版)")) {
          continue;
        }
        localObject2 = Typeface.createFromAsset(paramContext.getAssets(), "AXHFont.ttc");
        localObject1 = localObject2;
      }
      catch (Exception localException)
      {
        Object localObject2;
        str = a;
        continue;
        localPaint.setColor(parami.t());
        continue;
        if ((parami.u() == null) || (parami.u().trim() == "")) {
          continue;
        }
        paramContext = a;
        new StringBuilder("executing UIUtils.themeBgBitmap = BitmapFactory.decodeFile(setReader.getCustomBgPath());setReader.getCustomBgPath()=").append(parami.u()).toString();
        paramContext = BitmapFactory.decodeFile(parami.u());
        b = paramContext;
        if (paramContext == null) {
          break label630;
        }
        paramContext = a;
        new StringBuilder("UIUtils.themeBgBitmap height=").append(b.getHeight()).append(" width=").append(b.getWidth()).toString();
        continue;
      }
      localPaint.setTypeface((Typeface)localObject1);
      if (parami.s() == 1) {
        continue;
      }
      localPaint.setColor(Color.parseColor(parami.h()));
      localObject1 = a;
      new StringBuilder("paint.setColor=").append(localPaint.getColor()).append(" setReader.getIsCustomSetting()=").append(parami.s()).toString();
      g.a(localPaint, parami);
      try
      {
        if ((b != null) && (!b.isRecycled()))
        {
          b.recycle();
          b = null;
          a.d();
        }
        if (parami.s() == 1) {
          continue;
        }
        paramContext = BitmapFactory.decodeResource(paramContext.getResources(), parami.e());
        b = paramContext;
        if (paramContext != null)
        {
          paramContext = a;
          new StringBuilder("UIUtils.themeBgBitmap height=").append(b.getHeight()).append(" width=").append(b.getWidth()).toString();
        }
      }
      catch (Throwable paramContext)
      {
        String str;
        paramContext.printStackTrace();
        a.d();
        a.d();
        a.d();
        continue;
        paramContext = a;
        continue;
      }
      paramContext = a;
      new StringBuilder("getPaint END getIsCustomSetting=").append(parami.s()).append(" setReader.getsFontColor()=").append(parami.h()).append(" setReader.setsBackground()=").append(parami.e()).append(" setReader.setCustomBgPath()=").append(parami.u()).toString();
      return localPaint;
      localPaint.setFakeBoldText(true);
      break;
      if (parami.j().endsWith("默认(旧版)"))
      {
        localObject2 = Typeface.DEFAULT;
        localObject1 = localObject2;
      }
      else if (parami.j().startsWith("[自定义]"))
      {
        localObject2 = a;
        new StringBuilder("font=").append(a.t).append(parami.j().replace("[自定义]", "")).toString();
        localObject2 = Typeface.createFromFile(a.t + parami.j().replace("[自定义]", ""));
        localObject1 = localObject2;
      }
      else
      {
        localObject2 = Typeface.create(parami.j(), 0);
        localObject1 = localObject2;
      }
    }
  }
  
  /* Error */
  public static void b()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 232	com/ireadercity/b2/h/w:e	Landroid/widget/PopupWindow;
    //   6: ifnull +20 -> 26
    //   9: getstatic 232	com/ireadercity/b2/h/w:e	Landroid/widget/PopupWindow;
    //   12: invokevirtual 257	android/widget/PopupWindow:isShowing	()Z
    //   15: istore_0
    //   16: iload_0
    //   17: ifeq +9 -> 26
    //   20: getstatic 232	com/ireadercity/b2/h/w:e	Landroid/widget/PopupWindow;
    //   23: invokevirtual 446	android/widget/PopupWindow:dismiss	()V
    //   26: ldc 2
    //   28: monitorexit
    //   29: return
    //   30: astore_1
    //   31: aload_1
    //   32: invokevirtual 447	java/lang/Exception:printStackTrace	()V
    //   35: goto -9 -> 26
    //   38: astore_1
    //   39: ldc 2
    //   41: monitorexit
    //   42: aload_1
    //   43: athrow
    //   44: astore_1
    //   45: aload_1
    //   46: invokevirtual 260	java/lang/Throwable:printStackTrace	()V
    //   49: goto -23 -> 26
    // Local variable table:
    //   start	length	slot	name	signature
    //   15	2	0	bool	boolean
    //   30	2	1	localException	Exception
    //   38	5	1	localObject	Object
    //   44	2	1	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   20	26	30	java/lang/Exception
    //   3	16	38	finally
    //   20	26	38	finally
    //   31	35	38	finally
    //   45	49	38	finally
    //   20	26	44	java/lang/Throwable
  }
  
  public static boolean c()
  {
    try
    {
      if ((d != null) && (d.isShowing()))
      {
        d.dismiss();
        return true;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return false;
  }
  
  public static boolean d()
  {
    try
    {
      if ((f != null) && (f.isShowing()))
      {
        f.dismiss();
        return true;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */