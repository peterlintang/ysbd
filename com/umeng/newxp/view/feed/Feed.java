package com.umeng.newxp.view.feed;

import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Feed
{
  List<Promoter> a = new ArrayList();
  Object b;
  ExchangeDataService c;
  protected Set<Integer> d = new HashSet();
  public Feed.a style = Feed.a.a;
  
  public Feed(ExchangeDataService paramExchangeDataService)
  {
    this.c = paramExchangeDataService;
    if (paramExchangeDataService.displayType.equals("icon")) {}
    for (paramExchangeDataService = Feed.a.a;; paramExchangeDataService = Feed.a.b)
    {
      this.style = paramExchangeDataService;
      return;
    }
  }
  
  void a()
  {
    Promoter localPromoter = Promoter.buildMockPromoter();
    localPromoter.title = "冬季";
    localPromoter.ad_words = "呢大衣 打底裙 搭配 英伦马丁女靴。帅气大方简约...";
    localPromoter.img = "http://img01.taobaocdn.com/imgextra/i1/13556028616646963/T1H8u.Ff8XXXXXXXXX_!!52323556-0-tstar.jpg";
    this.a.add(localPromoter);
    localPromoter = Promoter.buildMockPromoter();
    localPromoter.title = "动感运动";
    localPromoter.ad_words = "正品男士太阳镜 男女款 潮 蛤蟆镜墨镜酷驾驶镜 ...";
    localPromoter.img = "http://img04.taobaocdn.com/imgextra/i4/19300028392261010/T16u96FdXaXXXXXXXX_!!539549300-0-tstar.jpg";
    this.a.add(localPromoter);
    localPromoter = Promoter.buildMockPromoter();
    localPromoter.title = "日系浪漫";
    localPromoter.ad_words = "一般来说格子用于衬衫比较多，外套很少的。这款外套...";
    localPromoter.img = "http://img02.taobaocdn.com/imgextra/i2/17951028248501012/T1F_O0Fh8bXXXXXXXX_!!33197951-0-tstar.jpg";
    this.a.add(localPromoter);
    localPromoter = Promoter.buildMockPromoter();
    localPromoter.title = "性感内衣";
    localPromoter.ad_words = "修身不规则黑白格子连身裙 气质短裙 百搭短裙";
    localPromoter.img = "http://img02.taobaocdn.com/imgextra/i2/10202027243306451/T1hyGDFdJcXXXXXXXX_!!672240202-0-tstar.jpg";
    this.a.add(localPromoter);
    localPromoter = Promoter.buildMockPromoter();
    localPromoter.title = "淑女";
    localPromoter.ad_words = "这次的首饰很是大爱, 每一款都很美,~ 耳钉...";
    localPromoter.img = "http://img03.taobaocdn.com/imgextra/i3/15828023136386845/T1PDuFXp0aXXXXXXXX_!!59635828-0-tstar.jpg";
    this.a.add(localPromoter);
    localPromoter = Promoter.buildMockPromoter();
    localPromoter.title = "韩式淑女";
    localPromoter.ad_words = "韩版大码气质时尚棉孕妇装风衣女2013秋装新款产...";
    localPromoter.img = "http://img01.taobaocdn.com/imgextra/i1/19649028934033382/T1R2i5FllhXXXXXXXX_!!108869649-0-tstar.jpg";
    this.a.add(localPromoter);
  }
  
  public void cleanReportFlag()
  {
    this.d.clear();
  }
  
  public Object getTag()
  {
    return this.b;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\Feed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */