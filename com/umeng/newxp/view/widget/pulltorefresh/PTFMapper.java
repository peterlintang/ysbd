package com.umeng.newxp.view.widget.pulltorefresh;

import android.content.Context;
import com.umeng.common.ufp.c;
import java.lang.reflect.Field;

public class PTFMapper
{
  public static int A(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrSubHeaderTextAppearance");
  }
  
  public static int B(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrHeaderTextColor");
  }
  
  public static int C(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrHeaderSubTextColor");
  }
  
  public static int D(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrDrawable");
  }
  
  public static int E(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrDrawableStart");
  }
  
  public static int F(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrDrawableEnd");
  }
  
  public static int G(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrDrawableTop");
  }
  
  public static int H(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrDrawableBottom");
  }
  
  public static int I(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrRotateDrawableWhilePulling");
  }
  
  public static int J(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrShowIndicator");
  }
  
  public static int[] K(Context paramContext)
  {
    try
    {
      paramContext = Class.forName(paramContext.getPackageName() + ".R$styleable").getFields();
      int j = paramContext.length;
      int i = 0;
      while (i < j)
      {
        Object localObject = paramContext[i];
        if (((Field)localObject).getName().equals("PullToRefresh"))
        {
          paramContext = (int[])((Field)localObject).get(null);
          return paramContext;
        }
        i += 1;
      }
      return null;
    }
    catch (Throwable paramContext) {}
  }
  
  public static int L(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrMode");
  }
  
  public static int M(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrAnimationStyle");
  }
  
  public static int N(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrRefreshableViewBackground");
  }
  
  public static int O(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrAdapterViewBackground");
  }
  
  public static int P(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrOverScroll");
  }
  
  public static int Q(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrScrollingWhileRefreshingEnabled");
  }
  
  public static int R(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrListViewExtrasEnabled");
  }
  
  public static int a(Context paramContext)
  {
    return c.a(paramContext).g("umeng_xp_cm_ptf_header_horizontal");
  }
  
  public static int b(Context paramContext)
  {
    return c.a(paramContext).g("umeng_xp_cm_ptf_header_vertical");
  }
  
  public static int c(Context paramContext)
  {
    return c.a(paramContext).j("pull_to_refresh_pull_label");
  }
  
  public static int d(Context paramContext)
  {
    return c.a(paramContext).j("pull_to_refresh_release_label");
  }
  
  public static int e(Context paramContext)
  {
    return c.a(paramContext).j("pull_to_refresh_refreshing_label");
  }
  
  public static int f(Context paramContext)
  {
    return c.a(paramContext).j("pull_to_refresh_pull_label");
  }
  
  public static int g(Context paramContext)
  {
    return c.a(paramContext).j("pull_to_refresh_from_bottom_release_label");
  }
  
  public static int h(Context paramContext)
  {
    return c.a(paramContext).j("pull_to_refresh_from_bottom_refreshing_label");
  }
  
  public static int i(Context paramContext)
  {
    return c.a(paramContext).d("umeng_xp_cm_ptr_flip");
  }
  
  public static int j(Context paramContext)
  {
    return c.a(paramContext).d("umeng_xp_cm_ptf_indicator_bg_top");
  }
  
  public static int k(Context paramContext)
  {
    return c.a(paramContext).d("umeng_xp_cm_ptf_indicator_bg_bottom");
  }
  
  public static int l(Context paramContext)
  {
    return c.a(paramContext).d("umeng_xp_cm_ptf_indicator_arrow");
  }
  
  public static int m(Context paramContext)
  {
    return c.a(paramContext).d("umeng_xp_cm_ptf_default_ptr_rotate");
  }
  
  public static int n(Context paramContext)
  {
    return c.a(paramContext).e("indicator_internal_padding");
  }
  
  public static int o(Context paramContext)
  {
    return c.a(paramContext).e("indicator_right_padding");
  }
  
  public static int p(Context paramContext)
  {
    return c.a(paramContext).b("fl_inner");
  }
  
  public static int q(Context paramContext)
  {
    return c.a(paramContext).b("pull_to_refresh_text");
  }
  
  public static int r(Context paramContext)
  {
    return c.a(paramContext).b("pull_to_refresh_progress");
  }
  
  public static int s(Context paramContext)
  {
    return c.a(paramContext).b("pull_to_refresh_sub_text");
  }
  
  public static int t(Context paramContext)
  {
    return c.a(paramContext).b("pull_to_refresh_image");
  }
  
  public static int u(Context paramContext)
  {
    return c.a(paramContext).a("umeng_xp_cm_ptf_slide_in_from_bottom");
  }
  
  public static int v(Context paramContext)
  {
    return c.a(paramContext).a("umeng_xp_cm_ptf_slide_in_from_top");
  }
  
  public static int w(Context paramContext)
  {
    return c.a(paramContext).a("umeng_xp_cm_ptf_slide_out_to_top");
  }
  
  public static int x(Context paramContext)
  {
    return c.a(paramContext).a("umeng_xp_cm_ptf_slide_out_to_bottom");
  }
  
  public static int y(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrHeaderBackground");
  }
  
  public static int z(Context paramContext)
  {
    return c.a(paramContext).f("PullToRefresh_ptrHeaderTextAppearance");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\pulltorefresh\PTFMapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */