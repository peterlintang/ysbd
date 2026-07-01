package com.umeng.newxp.view.common.actionbar;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.taobao.munion.common.fragment.BaseFragment.OnFragmentFinishListener;
import com.taobao.munion.common.fragment.UMFragmentPageManager;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.a.c;
import com.umeng.newxp.view.UMCityFragment;
import com.umeng.newxp.view.widget.indexlist.City;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b
  extends ActionBar.b
{
  static final String a = "UMENG_GROUP_CITY";
  static final String b = "UMENG_GROUP_CITY_CURRENT";
  static final String c = b.class.getName();
  public static final String d = "全国";
  public static final int e = 9213;
  private static String h = "北京,beijing,B  上海,shanghai,S  广州,guangzhou,G  深圳,shenzhen,S  天津,tianjin,T  西安,xian,X  福州,fuzhou,F  重庆,chongqing,C  杭州,hangzhou,H  宁波,ningbo,N  无锡,wuxi,W  南京,nanjing,N  合肥,hefei,H  武汉,wuhan,W  成都,chengdu,C  青岛,qingdao,Q  厦门,xiamen,X  大连,dalian,D  沈阳,shenyang,S  长沙,changsha,C  郑州,zhengzhou,Z  石家庄,shijiazhuang,S  苏州,suzhou,S  淄博,zibo,Z  南通,nantong,N  南昌,nanchang,N  保定,baoding,B  蚌埠,bengbu,B  常州,changzhou,C  大庆,daqing,D  东莞,dongguan,D  佛山,foshan,F  桂林,guilin,G  海口,haikou,H  葫芦岛,huludao,H  济南,jinan,J  焦作,jiaozuo,J  锦州,jinzhou,J  南宁,nanning,N  太原,taiyuan,T  芜湖,wuhu,W  新乡,xinxiang,X  烟台,yantai,Y  哈尔滨,haerbin,H  廊坊,langfang,L  贵阳,guiyang,G  珠海,zhuhai,Z  齐齐哈尔,qiqihaer,Q  泉州,quanzhou,Q  三亚,sanya,S  温州,wenzhou,W  中山,zhongshan,Z  昆明,kunming,K  九江,jiujiang,J  长春,changchun,C  汕头,shantou,S  香港,xianggang,X  徐州,xuzhou,X  扬州,yangzhou,Y  唐山,tangshan,T  秦皇岛,qinhuangdao,Q  邯郸,handan,H  邢台,xingtai,X  张家口,zhangjiakou,Z  承德,chengde,C  沧州,cangzhou,C  衡水,hengshui,H  大同,datong,D  阳泉,yangquan,Y  长治,changzhi,C  晋城,jincheng,J  朔州,shuozhou,S  晋中,jinzhong,J  运城,yuncheng,Y  忻州,xinzhou,X  临汾,linfen,L  吕梁,lvliang,L  呼和浩特,huhehaote,H  包头,baotou,B  乌海,wuhai,W  赤峰,chifeng,C  通辽,tongliao,T  鄂尔多斯,eerduosi,E  呼伦贝尔,hulunbeier,H  巴彦淖尔,bayannaoer,B  乌兰察布,wulanchabu,W  兴安,xinganmeng,X  锡林郭勒,xilinguolemeng,X  阿拉善,alashanmeng,A  鞍山,anshan,A  抚顺,fushun,F  本溪,benxi,B  丹东,dandong,D  营口,yingkou,Y  阜新,fuxin,F  辽阳,liaoyang,L  盘锦,panjin,P  铁岭,tieling,T  朝阳,chaoyang,C  吉林,jilin,J  四平,siping,S  辽源,liaoyuan,L  通化,tonghua,T  白山,baishan,B  松原,songyuan,S  白城,baicheng,B  延边,yanbian,Y  鸡西,jixi,J  鹤岗,hegang,H  双鸭山,shuangyashan,S  伊春,yichunyc,Y  佳木斯,jiamusi,J  七台河,qitaihe,Q  牡丹江,mudanjiang,M  黑河,heihe,H  绥化,suihua,S  大兴安岭,daxinganling,D  连云港,lianyungang,L  淮安,huaian,H  盐城,yancheng,Y  镇江,zhenjiang,Z  泰州,taizhou,T  宿迁,suqian,S  嘉兴,jiaxing,J  湖州,huzhou,H  绍兴,shaoxing,S  金华,jinhua,J  衢州,quzhou,Q  舟山,zhoushan,Z  台州,taizhoutz,T  丽水,lishui,L  淮南,huainan,H  马鞍山,maanshan,M  淮北,huaibei,H  铜陵,tongling,T  安庆,anqing,A  黄山,huangshan,H  滁州,chuzhou,C  阜阳,fuyang,F  宿州,suzhousz,S  巢湖,chaohu,C  六安,liuan,L  亳州,bozhou,B  池州,chizhou,C  宣城,xuancheng,X  莆田,putian,P  三明,sanming,S  漳州,zhangzhou,Z  南平,nanping,N  龙岩,longyan,L  宁德,ningde,N  景德镇,jingdezhen,J  萍乡,pingxiang,P  新余,xinyu,X  鹰潭,yingtan,Y  赣州,ganzhou,G  吉安,jian,J  宜春,yichun,Y  抚州,fuzhoufz,F  上饶,shangrao,S  枣庄,zaozhuang,Z  东营,dongying,D  潍坊,weifang,W  济宁,jining,J  泰安,taian,T  威海,weihai,W  日照,rizhao,R  莱芜,laiwu,L  临沂,linyi,L  德州,dezhou,D  聊城,liaocheng,L  滨州,binzhou,B  菏泽,heze,H  开封,kaifeng,K  洛阳,luoyang,L  平顶山,pingdingshan,P  安阳,anyang,A  鹤壁,hebi,H  濮阳,puyang,P  许昌,xuchang,X  漯河,luohe,L  三门峡,sanmenxia,S  南阳,nanyang,N  商丘,shangqiu,S  信阳,xinyang,X  周口,zhoukou,Z  驻马店,zhumadian,Z  济源,jiyuan,J  黄石,huangshi,H  十堰,shiyan,S  宜昌,yichang,Y  襄阳,xiangyang,X  鄂州,ezhou,E  荆门,jingmen,J  孝感,xiaogan,X  荆州,jingzhou,J  黄冈,huanggang,H  咸宁,xianning,X  随州,suizhou,S  恩施,enshi,E  三峡,sanxia,S  株洲,zhuzhou,Z  湘潭,xiangtan,X  衡阳,hengyang,H  邵阳,shaoyang,S  岳阳,yueyang,Y  常德,changde,C  张家界,zhangjiajie,Z  益阳,yiyang,Y  郴州,chenzhou,C  永州,yongzhou,Y  怀化,huaihua,H  娄底,loudi,L  湘西,xiangxi,X  韶关,shaoguan,S  江门,jiangmen,J  湛江,zhanjiang,Z  茂名,maoming,M  肇庆,zhaoqing,Z  惠州,huizhou,H  梅州,meizhou,M  汕尾,shanwei,S  河源,heyuan,H  阳江,yangjiang,Y  清远,qingyuan,Q  潮州,chaozhou,C  揭阳,jieyang,J  云浮,yunfu,Y  柳州,liuzhou,L  梧州,wuzhou,W  北海,beihai,B  防城港,fangchenggang,F  钦州,qinzhou,Q  贵港,guigang,G  玉林,yulin,Y  百色,baise,B  贺州,hezhou,H  河池,hechi,H  来宾,laibin,L  崇左,chongzuo,C  自贡,zigong,Z  攀枝花,panzhihua,P  泸州,luzhou,L  德阳,deyang,D  绵阳,mianyang,M  广元,guangyuan,G  遂宁,suining,S  内江,neijiang,N  乐山,leshan,L  南充,nanchong,N  眉山,meishan,M  宜宾,yibin,Y  广安,guangan,G  达州,dazhou,D  雅安,yaan,Y  巴中,bazhong,B  资阳,ziyang,Z  阿坝,aba,A  甘孜,ganzi,G  凉山,liangshan,L  六盘水,liupanshui,L  遵义,zunyi,Z  安顺,anshun,A  铜仁,tongrendiqu,T  黔西南,qianxinan,Q  毕节,bijiediqu,B  黔东南,qiandongnan,Q  黔南,qiannan,Q  曲靖,qujing,Q  玉溪,yuxi,Y  保山,baoshan,B  昭通,zhaotong,Z  丽江,lijiang,L  普洱,puer,P  临沧,lincang,L  楚雄,chuxiong,C  红河,honghe,H  文山,wenshan,W  西双版纳,xishuangbanna,X  大理,dali,D  德宏,dehong,D  怒江,nujiang,N  迪庆,diqing,D  拉萨,lasa,L  昌都,changdu,C  山南,shannan,S  日喀则,rikaze,R  那曲,naqu,N  阿里,ali,A  林芝,linzhi,L  铜川,tongchuan,T  宝鸡,baoji,B  咸阳,xianyang,X  渭南,weinan,W  延安,yanan,Y  汉中,hanzhong,H  榆林,yulinyl,Y  安康,ankang,A  商洛,shangluo,S  兰州,lanzhou,L  金昌,jinchang,J  白银,baiyin,B  天水,tianshui,T  武威,wuwei,W  张掖,zhangye,Z  平凉,pingliang,P  酒泉,jiuquan,J  庆阳,qingyang,Q  定西,dingxi,D  陇南,longnan,L  临夏,linxia,L  甘南,gannan,G  西宁,xining,X  海东,haidong,H  海北,haibei,H  黄南,huangnan,H  海南州,hainanzhou,H  果洛,guoluo,G  玉树,yushu,Y  海西,haixi,H  银川,yinchuan,Y  石嘴山,shizuishan,S  吴忠,wuzhong,W  固原,guyuan,G  中卫,zhongwei,Z  乌鲁木齐,wulumuqi,W  克拉玛依,kelamayi,K  吐鲁番,tulufan,T  哈密,hami,H  昌吉,changji,C  博尔塔拉,boertala,B  巴州,bazhou,B  阿克苏,akesu,A  克州,kezhou,K  喀什,kashi,K  和田,hetian,H  伊犁,yili,Y  塔城,tacheng,T  阿勒泰,aletai,A  台北,taibei,T  澳门,aomen,A  昆山,kunshan,K  江阴,jiangyin,J  义乌,yiwu,Y  顺德,shunde,S  石河子,shihezi,S  嘉峪关,jiayuguan,J  花都,huadu,H  番禺,panyu,P  仙桃,xiantao,X  富阳,fuyangfy,F  峨眉山,emeishan,E  琼海,qionghai,Q  张家港,zhangjiagang,Z  晋江,jinjiang,J  从化,conghua,C  常熟,changshu,C  延吉,yanji,Y  海宁,haining,H  桐乡,tongxiang,T  涿州,zhuozhou,Z  涪陵,fuling,F  万州,wanzhou,W  江宁,jiangning,J  迁安,qianan,Q  丹阳,danyang,D  太仓,taicang,T  敦煌,dunhunag,D  塘沽,tanggu,T  石狮,shishi,S  武夷山,wuyishan,W  萧山,xiaoshan,X  武安,wuan,W  溧阳,liyang,L  慈溪,cixi,C  长兴,changxing,C  兖州,yanzhou,Y";
  Activity f;
  View g;
  private BaseFragment.OnFragmentFinishListener i;
  
  public b(Activity paramActivity, View paramView)
  {
    super(paramView);
    this.f = paramActivity;
    if ((paramActivity instanceof BaseFragment.OnFragmentFinishListener)) {
      this.i = ((BaseFragment.OnFragmentFinishListener)paramActivity);
    }
    this.g = paramView;
  }
  
  public b(Activity paramActivity, View paramView, boolean paramBoolean)
  {
    super(paramView, paramBoolean);
    this.f = paramActivity;
    this.g = paramView;
  }
  
  public static String a(Context paramContext)
  {
    return paramContext.getSharedPreferences("UMENG_GROUP_CITY", 1).getString("UMENG_GROUP_CITY_CURRENT", "全国");
  }
  
  public static void a(Context paramContext, String paramString)
  {
    synchronized (paramContext.getSharedPreferences("UMENG_GROUP_CITY", 1))
    {
      SharedPreferences.Editor localEditor = ???.edit();
      paramContext = paramString;
      if (TextUtils.isEmpty(paramString)) {
        paramContext = "全国";
      }
      localEditor.putString("UMENG_GROUP_CITY_CURRENT", paramContext);
      localEditor.commit();
      Log.c(c, "Save platform UMENG_GROUP_CITY_CURRENT   " + paramContext);
      return;
    }
  }
  
  public static List<City> d()
  {
    int j = 0;
    localArrayList = new ArrayList();
    for (;;)
    {
      try
      {
        String[] arrayOfString = h.split(" ");
        int k = arrayOfString.length;
        if (j < k) {
          localObject = arrayOfString[j];
        }
      }
      catch (Exception localException1)
      {
        Object localObject;
        String str;
        System.setProperty("java.util.Arrays.useLegacyMergeSort", "true");
        Collections.sort(localArrayList, new b.a(null));
        return localArrayList;
      }
      try
      {
        localObject = ((String)localObject).split(",");
        str = localObject[0];
        localArrayList.add(new City(localObject[1], localObject[2], str));
      }
      catch (Exception localException2)
      {
        continue;
      }
      j += 1;
    }
  }
  
  public void a(View paramView)
  {
    paramView = this.f;
    UMFragmentPageManager.getInstance().pushPageForResult(UMCityFragment.class.getName(), 9213, this.i);
  }
  
  public void a(BaseFragment.OnFragmentFinishListener paramOnFragmentFinishListener)
  {
    this.i = paramOnFragmentFinishListener;
  }
  
  public void a(String paramString)
  {
    ((TextView)this.g.findViewById(c.aq(this.f))).setText(paramString);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\actionbar\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */