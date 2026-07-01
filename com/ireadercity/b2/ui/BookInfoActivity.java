package com.ireadercity.b2.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Debug;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.ireadercity.b2.b.g;
import com.ireadercity.b2.bean.b;
import com.ireadercity.b2.bean.j;
import com.ireadercity.b2.h.s;
import com.ireadercity.b2.h.y;
import com.ireadercity.b2.ui.widget.RecycleableImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class BookInfoActivity
  extends Activity
{
  private String A;
  g a;
  private TextView b;
  private ArrayList<HashMap<String, String>> c = null;
  private ArrayList<HashMap<String, Object>> d = null;
  private RecycleableImageView e;
  private ImageButton f;
  private Button g;
  private ImageView h;
  private ImageView i;
  private ImageButton j;
  private TextView k;
  private ListView l;
  private Context m = this;
  private String[] n;
  private float[] o;
  private b p;
  private String q;
  private View r;
  private View s;
  private int t;
  private ScrollView u;
  private Animation v;
  private Animation w;
  private Animation x;
  private Animation y;
  private int z;
  
  private void d()
  {
    int i2 = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    int i1;
    if (!com.ireadercity.b2.a.ar)
    {
      i1 = this.p.e();
      new StringBuilder().append(i1).append("===lastOpfChapterID").toString();
      if (this.p.y())
      {
        if (i1 < this.p.x().size()) {
          break label363;
        }
        i1 = i2;
      }
    }
    label231:
    label363:
    for (;;)
    {
      HashMap localHashMap = (HashMap)this.p.x().get(i1);
      if (localHashMap == null) {}
      do
      {
        return;
        String str = (String)localHashMap.get("progress");
        f1 = f2;
        if (str != null)
        {
          f1 = f2;
          if (!"".equals(str.trim()))
          {
            if (!"null".equals(str.trim().toLowerCase())) {
              break label231;
            }
            f1 = f2;
          }
        }
        for (;;)
        {
          new StringBuilder().append(str).append("strProgress").toString();
          new StringBuilder().append(f1).append("progress").toString();
          a((String)localHashMap.get("src"), this.p, -1, i1, f1);
          return;
          try
          {
            f1 = Float.parseFloat(str);
          }
          catch (Exception localException2)
          {
            f1 = f2;
          }
        }
      } while (!this.p.z());
      if (i1 >= this.p.q().size()) {
        i1 = 0;
      }
      for (;;)
      {
        localHashMap = (HashMap)this.p.q().get(i1);
        Integer.parseInt((String)localHashMap.get("order"));
        try
        {
          f2 = Float.parseFloat((String)localHashMap.get("progress"));
          f1 = f2;
        }
        catch (Exception localException1)
        {
          for (;;)
          {
            localException1.printStackTrace();
          }
        }
        a(null, this.p, i1, i1, f1);
        return;
        com.ireadercity.b2.a.ar = false;
        return;
        break;
      }
    }
  }
  
  private void e()
  {
    this.c = this.p.q();
    if (this.c == null) {}
    for (;;)
    {
      return;
      String str = this.p.j();
      this.d = com.ireadercity.b2.c.a.a(this.m).j(str);
      if (this.d != null)
      {
        this.n = new String[this.d.size()];
        this.o = new float[this.d.size()];
        int i1 = 0;
        while (i1 < this.d.size())
        {
          if (this.d.get(i1) != null)
          {
            this.n[i1] = ((HashMap)this.d.get(i1)).get("title");
            this.o[i1] = Float.parseFloat(((HashMap)this.d.get(i1)).get("progress"));
          }
          i1 += 1;
        }
      }
    }
  }
  
  public final void a()
  {
    AlertDialog localAlertDialog = new AlertDialog.Builder(this.m).setItems(this.n, new bd(this)).create();
    localAlertDialog.setTitle(this.p.k());
    localAlertDialog.getWindow().setFlags(1024, 1024);
    localAlertDialog.setButton2("清除所有", new be(this, localAlertDialog));
    bf localbf = new bf(this, localAlertDialog);
    localAlertDialog.setButton(getString(2131230845), localbf);
    localAlertDialog.show();
  }
  
  public final void a(String paramString)
  {
    Toast.makeText(this, paramString, 0).show();
  }
  
  public final void a(String paramString, b paramb, int paramInt1, int paramInt2, float paramFloat)
  {
    try
    {
      new StringBuilder("showContent url=").append(paramString).append(" book.getBook_id()").append(paramb.j()).toString();
      if (j.p.b() == 1) {}
      for (paramb = new Intent(this, ShowContentScrollUpAndDown.class);; paramb = new Intent(this, BookReadingActivityNew.class))
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("reURL", paramString);
        localBundle.putInt("chapterIndex", paramInt1);
        localBundle.putInt("chapterIndexSpine", paramInt2);
        localBundle.putFloat("progress", paramFloat);
        if (paramFloat != 0.0D) {
          localBundle.putString("chapterChange", "mark");
        }
        paramb.putExtras(localBundle);
        startActivityForResult(paramb, 0);
        return;
      }
      return;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  public final void b()
  {
    Object localObject = com.ireadercity.b2.c.a.a(this.m);
    ((com.ireadercity.b2.c.a)localObject).k(this.p.j());
    ((com.ireadercity.b2.c.a)localObject).l(this.p.j());
    ((com.ireadercity.b2.c.a)localObject).a(this.p.j(), 0);
    int i1 = 0;
    while (i1 < this.c.size())
    {
      ((HashMap)this.c.get(i1)).put("image", "0");
      i1 += 1;
    }
    localObject = new ArrayList();
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      HashMap localHashMap1 = (HashMap)localIterator.next();
      HashMap localHashMap2 = new HashMap();
      localHashMap1.put("progress", "0");
      localHashMap2.put("image", Integer.valueOf(2130838197));
      localHashMap2.put("title", localHashMap1.get("title"));
      ((ArrayList)localObject).add(localHashMap2);
    }
    localObject = new SimpleAdapter(this, (List)localObject, 2130903058, new String[] { "image", "title" }, new int[] { 2131361922, 2131361923 });
    this.l.setAdapter((ListAdapter)localObject);
  }
  
  public final void c()
  {
    finish();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    new StringBuilder("BookInfo onActivityResult requestCode=").append(paramInt1).toString();
    if (paramIntent != null) {
      this.A = paramIntent.getStringExtra("lastSrc");
    }
    if ((paramInt1 == 0) && (paramInt2 == 10087)) {
      finish();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    new StringBuilder("===***getNativeHeapAllocatedSize()=").append(Debug.getNativeHeapAllocatedSize()).append("***===").toString();
    super.onCreate(paramBundle);
    this.a = new g(getApplicationContext(), 2);
    for (;;)
    {
      try
      {
        localObject2 = com.ireadercity.b2.c.a.a(this.m);
        this.p = b.a;
        if (this.p == null) {
          finish();
        }
        this.q = this.p.j();
        setContentView(2130903048);
        this.t = ((int)TypedValue.applyDimension(1, 120.0F, getResources().getDisplayMetrics()));
        this.b = ((TextView)findViewById(2131361877));
        this.e = ((RecycleableImageView)findViewById(2131361875));
        this.l = ((ListView)findViewById(2131361884));
        this.j = ((ImageButton)findViewById(2131361817));
        this.k = ((TextView)findViewById(2131361822));
        this.r = findViewById(2131361874);
        this.s = findViewById(2131361883);
        this.u = ((ScrollView)findViewById(2131361876));
        this.v = AnimationUtils.loadAnimation(this, 2130968582);
        this.w = AnimationUtils.loadAnimation(this, 2130968584);
        this.x = AnimationUtils.loadAnimation(this, 2130968583);
        this.y = AnimationUtils.loadAnimation(this, 2130968585);
      }
      catch (Exception paramBundle)
      {
        HashMap localHashMap;
        paramBundle.printStackTrace();
        finish();
        return;
      }
      try
      {
        if (y.d(this.p.r()))
        {
          paramBundle = s.a(this.p.l());
          this.p.l(paramBundle);
        }
        this.p.t();
        if (this.p.k().length() <= 8) {
          break label914;
        }
        paramBundle = this.p.k().substring(0, 8);
        this.k.setText("   " + paramBundle);
        this.f = ((ImageButton)findViewById(2131361872));
        this.g = ((Button)findViewById(2131361882));
        this.i = ((ImageView)findViewById(2131361878));
        this.h = ((ImageView)findViewById(2131361885));
        localObject4 = this.p;
        localObject3 = this.e;
        localObject1 = ((b)localObject4).r();
        if (!y.d((String)localObject1))
        {
          paramBundle = (Bundle)localObject1;
          if (new File((String)localObject1).exists()) {}
        }
        else
        {
          localObject1 = s.a(((b)localObject4).l());
          if (!y.d((String)localObject1))
          {
            paramBundle = (Bundle)localObject1;
            if (new File((String)localObject1).exists()) {}
          }
          else
          {
            paramBundle = y.k(((b)localObject4).l());
          }
        }
        new StringBuilder("coverPath=").append(paramBundle).toString();
        if ((!y.d(paramBundle)) && (new File(paramBundle).exists())) {
          break label925;
        }
        g.a(this.m);
        ((RecycleableImageView)localObject3).b();
        localObject1 = this.p.m();
        paramBundle = (Bundle)localObject1;
        if (localObject1 != null)
        {
          paramBundle = (Bundle)localObject1;
          if ("".equals(((String)localObject1).trim())) {
            paramBundle = "  ^_^ 此书没有添加描述\n  更多书籍请访问 http://ibooks." + com.ireadercity.b2.a.y;
          }
        }
        this.b.setText(paramBundle);
        this.j.setOnClickListener(new aw(this));
        this.f.setOnClickListener(new ax(this));
        this.g.setOnClickListener(new ay(this));
        this.i.setOnClickListener(new ba(this));
        this.h.setOnClickListener(new bb(this));
      }
      catch (NullPointerException paramBundle)
      {
        paramBundle.printStackTrace();
        Toast.makeText(this, "书籍信息错误", 1).show();
        finish();
        continue;
        if (!this.p.y()) {
          continue;
        }
        paramBundle = ((com.ireadercity.b2.c.a)localObject2).h(this.q);
        localObject1 = this.p.x().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (HashMap)((Iterator)localObject1).next();
          localObject3 = paramBundle.iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject4 = (HashMap)((Iterator)localObject3).next();
            if (Integer.parseInt((String)((HashMap)localObject2).get("order")) == Integer.parseInt((String)((HashMap)localObject4).get("spine_order")))
            {
              ((HashMap)localObject2).put("progress", (String)((HashMap)localObject4).get("progress"));
              new StringBuilder("fileChapter order=").append((String)((HashMap)localObject2).get("order")).append(" order=").append((String)((HashMap)localObject4).get("progress")).toString();
            }
          }
          for (i1 = 1;; i1 = 0)
          {
            if (i1 != 0) {
              break label1194;
            }
            ((HashMap)localObject2).put("progress", "0");
            break;
          }
        }
        i1 = 0;
        continue;
      }
      paramBundle = ((com.ireadercity.b2.c.a)localObject2).i(this.q);
      localObject1 = this.p.q().iterator();
      if (!((Iterator)localObject1).hasNext()) {
        break;
      }
      localObject3 = (HashMap)((Iterator)localObject1).next();
      localObject4 = paramBundle.iterator();
      if (!((Iterator)localObject4).hasNext()) {
        break label1196;
      }
      localHashMap = (HashMap)((Iterator)localObject4).next();
      if (Integer.parseInt((String)((HashMap)localObject3).get("order")) == Integer.parseInt((String)localHashMap.get("chapter_order")))
      {
        ((HashMap)localObject3).put("progress", (String)localHashMap.get("progress"));
        ((HashMap)localObject3).put("image", (String)localHashMap.get("image"));
        new StringBuilder("fileChapter order=").append((String)((HashMap)localObject3).get("order")).append(" order=").append((String)localHashMap.get("progress")).toString();
        i1 = 1;
        if (i1 == 0)
        {
          ((HashMap)localObject3).put("progress", "0");
          continue;
          label914:
          paramBundle = this.p.k();
          continue;
          label925:
          localObject1 = this.a;
          if (!g.a(new File(paramBundle), (ImageView)localObject3))
          {
            g.a(this.m);
            ((RecycleableImageView)localObject3).b();
          }
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    try
    {
      this.e.setImageBitmap(null);
      super.onDestroy();
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0)) {
      finish();
    }
    return true;
  }
  
  protected void onResume()
  {
    super.onResume();
    d();
    this.z = this.p.e();
    new StringBuilder("onResume lastReadingChaperId=").append(this.z).toString();
    for (;;)
    {
      try
      {
        e();
        com.ireadercity.b2.c.a locala = com.ireadercity.b2.c.a.a(this.m);
        localObject2 = locala.i(this.q);
        localObject3 = this.p.q().iterator();
        if (((Iterator)localObject3).hasNext())
        {
          localObject4 = (HashMap)((Iterator)localObject3).next();
          localObject5 = ((ArrayList)localObject2).iterator();
          if (!((Iterator)localObject5).hasNext()) {
            break label961;
          }
          HashMap localHashMap = (HashMap)((Iterator)localObject5).next();
          if (Integer.parseInt((String)((HashMap)localObject4).get("order")) != Integer.parseInt((String)localHashMap.get("chapter_order"))) {
            continue;
          }
          ((HashMap)localObject4).put("progress", (String)localHashMap.get("progress"));
          ((HashMap)localObject4).put("image", (String)localHashMap.get("image"));
          new StringBuilder("fileChapter order=").append((String)((HashMap)localObject4).get("order")).append(" order=").append((String)localHashMap.get("progress")).toString();
          i1 = 1;
          if (i1 != 0) {
            continue;
          }
          ((HashMap)localObject4).put("progress", "0");
          continue;
        }
      }
      catch (Exception localException)
      {
        Object localObject3;
        Object localObject4;
        Object localObject5;
        localException.printStackTrace();
        continue;
        if (this.p.y())
        {
          localObject1 = localException.h(this.q);
          localObject2 = this.p.x().iterator();
          if (((Iterator)localObject2).hasNext())
          {
            localObject3 = (HashMap)((Iterator)localObject2).next();
            localObject4 = ((ArrayList)localObject1).iterator();
            if (!((Iterator)localObject4).hasNext()) {
              break label956;
            }
            localObject5 = (HashMap)((Iterator)localObject4).next();
            if (Integer.parseInt((String)((HashMap)localObject3).get("order")) != Integer.parseInt((String)((HashMap)localObject5).get("spine_order"))) {
              continue;
            }
            ((HashMap)localObject3).put("progress", (String)((HashMap)localObject5).get("progress"));
            new StringBuilder("fileChapter order=").append((String)((HashMap)localObject3).get("order")).append(" order=").append((String)((HashMap)localObject5).get("progress")).toString();
            i1 = 1;
            if (i1 != 0) {
              continue;
            }
            ((HashMap)localObject3).put("progress", "0");
            continue;
          }
        }
        Object localObject1 = new ArrayList();
        Object localObject2 = this.c.iterator();
        if (((Iterator)localObject2).hasNext())
        {
          localObject3 = (HashMap)((Iterator)localObject2).next();
          localObject4 = new HashMap();
          float f1 = Float.parseFloat((String)((HashMap)localObject3).get("progress"));
          if (f1 == 0.0F)
          {
            i1 = 2130838197;
            ((HashMap)localObject4).put("image", Integer.valueOf(i1));
            ((HashMap)localObject4).put("title", ((HashMap)localObject3).get("title"));
            ((ArrayList)localObject1).add(localObject4);
            continue;
          }
          if ((f1 > 0.0F) && (f1 <= 10.0F))
          {
            i1 = 2130837859;
            continue;
          }
          if ((f1 > 10.0F) && (f1 <= 20.0F))
          {
            i1 = 2130837960;
            continue;
          }
          if ((f1 > 20.0F) && (f1 <= 30.0F))
          {
            i1 = 2130837956;
            continue;
          }
          if ((f1 > 30.0F) && (f1 <= 40.0F))
          {
            i1 = 2130837702;
            continue;
          }
          if ((f1 > 40.0F) && (f1 <= 50.0F))
          {
            i1 = 2130837701;
            continue;
          }
          if ((f1 > 50.0F) && (f1 <= 60.0F))
          {
            i1 = 2130837906;
            continue;
          }
          if ((f1 > 60.0F) && (f1 <= 70.0F))
          {
            i1 = 2130837897;
            continue;
          }
          if ((f1 > 70.0F) && (f1 <= 80.0F))
          {
            i1 = 2130837605;
            continue;
          }
          if ((f1 > 80.0F) && (f1 <= 90.0F))
          {
            i1 = 2130837854;
            continue;
          }
          if ((f1 > 90.0F) && (f1 <= 100.0F))
          {
            i1 = 2130837928;
            continue;
          }
        }
        else
        {
          localObject1 = new SimpleAdapter(this, (List)localObject1, 2130903058, new String[] { "image", "title" }, new int[] { 2131361922, 2131361923 });
          this.l.setAdapter((ListAdapter)localObject1);
          this.l.setOnItemClickListener(new bc(this));
          new StringBuilder("chapterList.setSelection=").append(this.z).toString();
          this.l.setSelection(this.z);
          return;
        }
      }
      int i1 = 0;
      continue;
      label956:
      i1 = 0;
      continue;
      label961:
      i1 = 0;
    }
  }
  
  protected void onStart()
  {
    super.onStart();
  }
  
  protected void onStop()
  {
    super.onStop();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\BookInfoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */