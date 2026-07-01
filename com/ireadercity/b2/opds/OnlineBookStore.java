package com.ireadercity.b2.opds;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.ireadercity.b2.bean.NetBookInfo;
import com.ireadercity.b2.h.v;
import com.ireadercity.b2.store.CloudStoreActivity;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public class OnlineBookStore
  extends Activity
  implements View.OnClickListener, AdapterView.OnItemClickListener
{
  Handler A;
  com.ireadercity.b2.c.a B;
  Toast C;
  NetBookInfo D;
  String E;
  String F;
  ImageButton a;
  TextView b;
  TextView c;
  TextView d;
  Button e;
  ListView f;
  View g;
  ImageView h;
  TextView i;
  TextView j;
  TextView k;
  TextView l;
  TextView m;
  Button n;
  Button o;
  LinearLayout p;
  RelativeLayout q;
  ArrayList<b> r;
  boolean s = false;
  boolean t = true;
  boolean u = false;
  g v;
  ArrayList<String> w;
  ArrayList<String> x;
  String y = "";
  k z;
  
  private void a(Context paramContext, NetBookInfo paramNetBookInfo, String paramString)
  {
    String str = paramNetBookInfo.i();
    Object localObject = v.a(str, paramString);
    if (!this.B.f(com.ireadercity.b2.a.l + "/" + (String)localObject))
    {
      if (com.ireadercity.b2.e.a.a(paramNetBookInfo.d()) == null)
      {
        if (com.ireadercity.b2.a.e)
        {
          if (!com.ireadercity.b2.f.b.a(paramContext, com.ireadercity.b2.a.g)) {
            return;
          }
          int i1 = com.ireadercity.b2.f.b.a();
          this.d.setText("积分：需要" + com.ireadercity.b2.a.g + ",你有" + i1 + "分");
          if (com.ireadercity.b2.a.g > i1) {
            this.d.setTextColor(-65536);
          }
        }
        localObject = new com.ireadercity.b2.bean.d();
        paramContext = str;
        if (!str.startsWith("http://")) {
          paramContext = com.ireadercity.b2.a.B + str;
        }
        ((com.ireadercity.b2.bean.d)localObject).f(paramContext);
        ((com.ireadercity.b2.bean.d)localObject).e(paramNetBookInfo.d());
        ((com.ireadercity.b2.bean.d)localObject).b(paramNetBookInfo.g());
        ((com.ireadercity.b2.bean.d)localObject).d(paramNetBookInfo.f());
        ((com.ireadercity.b2.bean.d)localObject).c(paramNetBookInfo.e());
        ((com.ireadercity.b2.bean.d)localObject).b();
        ((com.ireadercity.b2.bean.d)localObject).a(paramString);
        ((com.ireadercity.b2.bean.d)localObject).a(paramNetBookInfo);
        paramNetBookInfo.l();
        com.ireadercity.b2.e.a.a(getApplicationContext()).b((com.ireadercity.b2.bean.d)localObject);
        this.C.setText("已加入到下载列表");
        this.C.show();
        return;
      }
      this.C.setText("你已加入过本书到下载列表!");
      this.C.show();
      return;
    }
    this.C.setText("书架上已经有此书，不用重复下载!");
    this.C.show();
  }
  
  private void a(String paramString)
  {
    this.q.setVisibility(0);
    this.p.setVisibility(4);
    new Thread(new f(this, this.A, paramString)).start();
  }
  
  private void a(String paramString1, String paramString2)
  {
    this.w.add(this.y);
    this.x.add(paramString2);
    a(paramString1);
  }
  
  private static InputStream b(String paramString1, String paramString2, String paramString3)
  {
    paramString1 = new HttpPost(paramString1);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("user", paramString2));
    localArrayList.add(new BasicNameValuePair("password", paramString3));
    try
    {
      paramString1.setEntity(new UrlEncodedFormEntity(localArrayList, "UTF-8"));
      paramString1 = new DefaultHttpClient().execute(paramString1);
      if (paramString1.getStatusLine().getStatusCode() == 200) {
        return paramString1.getEntity().getContent();
      }
      new StringBuilder("-à").append(paramString1.getStatusLine().getStatusCode()).toString();
      return null;
    }
    catch (Exception paramString1) {}
    return null;
  }
  
  final AlertDialog.Builder a(String paramString, View paramView)
  {
    return new AlertDialog.Builder(this).setTitle("书仓登陆").setView(paramView).setCancelable(false).setPositiveButton(getResources().getText(2131230902), new e(this, paramView, paramString)).setNegativeButton(getResources().getText(2131230903), new d(this));
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    case 2131362201: 
    default: 
      return;
    case 2131361905: 
      this.a.setClickable(false);
      if (this.u)
      {
        this.p.setVisibility(0);
        this.g.setVisibility(4);
      }
      if (this.t)
      {
        this.v.a();
        finish();
        return;
      }
      a((String)this.w.get(this.w.size() - 1));
      this.b.setText((CharSequence)this.x.get(this.x.size() - 1));
      this.w.remove(this.w.size() - 1);
      this.x.remove(this.x.size() - 1);
      return;
    case 2131362187: 
      this.v.a();
      finish();
      return;
    case 2131362203: 
      paramView = this.D;
      localk = this.z;
      paramView.g(k.a(this.y, this.E));
      paramView = this.D;
      localk = this.z;
      paramView.f(k.a(this.y, this.D.h()));
      this.D.c();
      a(this, this.D, "pdf");
      return;
    }
    paramView = this.D;
    k localk = this.z;
    paramView.g(k.a(this.y, this.F));
    paramView = this.D;
    localk = this.z;
    paramView.f(k.a(this.y, this.D.h()));
    this.D.c();
    a(this, this.D, "epub");
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = LayoutInflater.from(this).inflate(2130903122, null);
    setContentView(paramBundle);
    this.p = ((LinearLayout)paramBundle.findViewById(2131362189));
    this.q = ((RelativeLayout)paramBundle.findViewById(2131362192));
    this.q.setVisibility(4);
    this.g = paramBundle.findViewById(2131362188);
    this.h = ((ImageView)this.g.findViewById(2131362194));
    this.i = ((TextView)this.g.findViewById(2131362198));
    this.j = ((TextView)this.g.findViewById(2131362199));
    this.k = ((TextView)this.g.findViewById(2131362200));
    this.l = ((TextView)this.g.findViewById(2131362206));
    this.m = ((TextView)this.g.findViewById(2131362201));
    this.n = ((Button)this.g.findViewById(2131362203));
    this.o = ((Button)this.g.findViewById(2131362204));
    this.n.setOnClickListener(this);
    this.o.setOnClickListener(this);
    this.m.setOnClickListener(this);
    this.g.setVisibility(4);
    this.a = ((ImageButton)paramBundle.findViewById(2131361905));
    this.b = ((TextView)paramBundle.findViewById(2131361822));
    this.c = ((TextView)paramBundle.findViewById(2131362190));
    this.e = ((Button)paramBundle.findViewById(2131362187));
    this.f = ((ListView)paramBundle.findViewById(2131362191));
    this.a.setOnClickListener(this);
    this.e.setOnClickListener(this);
    this.w = new ArrayList();
    this.x = new ArrayList();
    this.A = new c(this);
    this.C = Toast.makeText(this, "", 0);
    this.C.setGravity(17, 0, 0);
    this.B = com.ireadercity.b2.c.a.a(this);
    a("", "在线书库");
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i2 = 1;
    if (this.r == null) {}
    while (this.r.get(paramInt) == null) {
      return;
    }
    if (((b)this.r.get(paramInt)).p)
    {
      paramAdapterView = (b)this.r.get(paramInt);
      if (this.D == null) {
        this.D = new NetBookInfo();
      }
      this.D.a(paramAdapterView.a);
      this.D.e(paramAdapterView.f);
      this.D.d(paramAdapterView.k);
      this.D.b(paramAdapterView.b);
      this.D.c(paramAdapterView.b);
      this.D.f(paramAdapterView.i);
      paramView = this.z;
      paramView = k.a(this.y, this.D.h());
      this.h.setImageBitmap(com.ireadercity.b2.b.g.a(this));
      this.h.invalidate();
      new com.ireadercity.b2.b.g(getApplicationContext(), 2).a(paramView, this.h);
      this.E = paramAdapterView.g;
      this.F = paramAdapterView.h;
      this.u = true;
      this.w.add(this.y);
      this.x.add(this.b.getText().toString());
      this.p.setVisibility(4);
      this.g.setVisibility(0);
      this.i.setText(paramAdapterView.b);
      this.j.setText(paramAdapterView.k);
      int i1;
      if ("".endsWith(paramAdapterView.f))
      {
        this.k.setText("语言：未知");
        this.l.setMovementMethod(LinkMovementMethod.getInstance());
        this.l.setText(Html.fromHtml(paramAdapterView.c));
        this.n.setVisibility(8);
        if (paramAdapterView.h == null) {
          break label429;
        }
        i1 = 1;
        label349:
        if ("".endsWith(paramAdapterView.h)) {
          break label435;
        }
        label361:
        if ((i1 & i2) == 0) {
          break label441;
        }
        this.o.setVisibility(0);
      }
      for (;;)
      {
        this.b.setText(((b)this.r.get(paramInt)).b);
        return;
        this.k.setText("语言：" + paramAdapterView.f);
        break;
        label429:
        i1 = 0;
        break label349;
        label435:
        i2 = 0;
        break label361;
        label441:
        this.o.setVisibility(8);
      }
    }
    if ("云端书库，您的专属书库".equals(((b)this.r.get(paramInt)).b))
    {
      startActivity(new Intent(this, CloudStoreActivity.class));
      return;
    }
    if ("书朋-在线阅读".equals(((b)this.r.get(paramInt)).b))
    {
      startActivity(new Intent(this, OnlineBook_Shupeng.class));
      return;
    }
    if ("http://registe.shucang.org/mo/passport/signup".equals(((b)this.r.get(paramInt)).e))
    {
      Toast.makeText(getApplicationContext(), "请到书仓网站注册", 1).show();
      return;
    }
    a(((b)this.r.get(paramInt)).e, this.b.getText().toString());
    this.b.setText(((b)this.r.get(paramInt)).b);
  }
  
  protected void onResume()
  {
    if (com.ireadercity.b2.a.e)
    {
      this.d = ((TextView)this.g.findViewById(2131361845));
      int i1 = com.ireadercity.b2.f.b.a();
      this.d.setText("积分：需要" + com.ireadercity.b2.a.g + ",你有" + i1 + "分");
      if (com.ireadercity.b2.a.g > i1) {
        this.d.setTextColor(-65536);
      }
    }
    super.onResume();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\opds\OnlineBookStore.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */