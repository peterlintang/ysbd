package com.umeng.socialize.view.a;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.Toast;

public abstract class g
  extends LinearLayout
  implements af
{
  protected String a = "com.umeng.view.SocialView";
  private ae b;
  private int c = 0;
  private int d = 0;
  private boolean e = false;
  private Toast f;
  
  public g(Context paramContext)
  {
    super(paramContext);
  }
  
  public g(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected int a(View paramView)
  {
    int j;
    int i;
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      int m = paramView.getChildCount();
      if (m > 0)
      {
        j = 0;
        i = 0;
        if (j >= m)
        {
          label33:
          if (i >= this.d)
          {
            this.d = (i + 1);
            return this.d;
          }
        }
        else
        {
          int k = paramView.getChildAt(j).getId();
          if (k <= i) {
            break label100;
          }
          i = k;
        }
      }
    }
    label100:
    for (;;)
    {
      j += 1;
      break;
      i += 1;
      break label33;
      i = this.d + 1;
      this.d = i;
      return i;
    }
  }
  
  protected void a()
  {
    this.c += 1;
  }
  
  protected void a(int paramInt1, int paramInt2)
  {
    if (!this.e)
    {
      this.e = true;
      onViewRendered(paramInt1, paramInt2);
    }
  }
  
  public void assignId(View paramView)
  {
    setId(a(paramView));
  }
  
  protected boolean b()
  {
    if (this.c > 0) {}
    for (boolean bool = true;; bool = false)
    {
      a();
      return bool;
    }
  }
  
  protected View c()
  {
    return null;
  }
  
  protected View d()
  {
    ViewParent localViewParent = getParent();
    if ((localViewParent instanceof View)) {
      return (View)localViewParent;
    }
    return this;
  }
  
  protected void e()
  {
    this.c = 0;
    this.d = 0;
  }
  
  public Activity getActivity()
  {
    Context localContext = getContext();
    if ((localContext instanceof Activity)) {
      return (Activity)localContext;
    }
    return null;
  }
  
  public ae getErrorHandler()
  {
    return this.b;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    a(paramInt1, paramInt2);
  }
  
  public void onViewLoad()
  {
    if (getChildCount() > 0) {
      removeAllViews();
    }
  }
  
  public void onViewRendered(int paramInt1, int paramInt2) {}
  
  public void onViewUpdate() {}
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    String str = this.a;
    StringBuilder localStringBuilder = new StringBuilder("onWindowVisibilityChanged    ");
    if (paramInt == 0) {}
    for (str = "Vis";; str = "Hide")
    {
      localStringBuilder.append(str).toString();
      if (paramInt != 0) {
        break label63;
      }
      if (b()) {
        break;
      }
      onViewLoad();
      return;
    }
    onViewUpdate();
    return;
    label63:
    this.e = false;
  }
  
  public void setErrorHandler(ae paramae)
  {
    this.b = paramae;
  }
  
  public void showError(Context paramContext, Exception paramException)
  {
    if (this.b != null)
    {
      this.b.a(paramContext, paramException);
      return;
    }
    paramContext = this.a;
  }
  
  public void showErrorToast(Context paramContext, Exception paramException)
  {
    if (this.f != null) {
      this.f.cancel();
    }
    this.f = Toast.makeText(paramContext, "Error: " + paramException.getMessage(), 1);
    this.f.show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */