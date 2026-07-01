package com.ireadercity.b2.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.ireadercity.b2.c.a;
import com.ireadercity.b2.h.v;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class SynchronizeLocalBooksActivity
  extends Activity
  implements View.OnClickListener
{
  private static int m = 10;
  private static String n = "SynchronizeLocalBooks";
  private static String o = "正在扫描本地书籍";
  private static String p = "请选择添加到书库的书籍";
  Context a = this;
  ArrayAdapter<String> b;
  Handler c;
  ArrayList<Integer> d;
  a e;
  ImageButton f;
  ProgressBar g;
  Button h;
  Button i;
  boolean j = true;
  du k;
  public gw l = new gw(this);
  
  private static long a(File paramFile)
  {
    if (paramFile.exists()) {
      return new FileInputStream(paramFile).available();
    }
    paramFile.createNewFile();
    System.out.println("文件不存在");
    return 0L;
  }
  
  private void b(String paramString)
  {
    for (;;)
    {
      int i1;
      try
      {
        arrayOfFile = new File(paramString).listFiles();
        if (arrayOfFile != null) {
          break label308;
        }
        return;
      }
      catch (Exception paramString)
      {
        File[] arrayOfFile;
        paramString.printStackTrace();
        return;
      }
      if ((i1 < arrayOfFile.length) && (this.j))
      {
        String str = arrayOfFile[i1].getName().toLowerCase();
        if ((arrayOfFile[i1].isDirectory()) && (!str.equals("aireader")))
        {
          b(paramString + File.separator + str);
        }
        else
        {
          Message localMessage;
          if (str.endsWith("epub"))
          {
            this.l.a.add(paramString + File.separator + str);
            localMessage = new Message();
            localMessage.what = 1;
            localMessage.obj = str;
            this.c.sendMessage(localMessage);
          }
          else if ((str.endsWith("txt")) && (a(new File(paramString + File.separator + str)) > m * 1024))
          {
            this.l.a.add(paramString + File.separator + str);
            localMessage = new Message();
            localMessage.what = 1;
            localMessage.obj = str;
            this.c.sendMessage(localMessage);
          }
        }
      }
      else
      {
        return;
        label308:
        i1 = 0;
        continue;
      }
      i1 += 1;
    }
  }
  
  protected final void a()
  {
    this.b.notifyDataSetChanged();
  }
  
  public final void a(String paramString)
  {
    for (;;)
    {
      int i1;
      try
      {
        arrayOfFile = new File(paramString).listFiles();
        if (arrayOfFile != null) {
          break label325;
        }
        return;
      }
      catch (Exception paramString)
      {
        File[] arrayOfFile;
        paramString.printStackTrace();
        return;
      }
      if ((i1 < arrayOfFile.length) && (this.j))
      {
        String str = arrayOfFile[i1].getName().toLowerCase();
        if ((arrayOfFile[i1].isDirectory()) && (!str.equals("aireader")))
        {
          b(paramString + File.separator + str);
          if (arrayOfFile.length == i1 + 1) {
            this.c.sendEmptyMessage(2);
          }
        }
        else
        {
          Message localMessage;
          if (str.endsWith("epub"))
          {
            this.l.a.add(paramString + File.separator + str);
            localMessage = new Message();
            localMessage.what = 1;
            localMessage.obj = str;
            this.c.sendMessage(localMessage);
          }
          else
          {
            if (!str.endsWith("txt")) {
              continue;
            }
            if (a(new File(paramString + File.separator + str)) > m * 1024)
            {
              this.l.a.add(paramString + File.separator + str);
              localMessage = new Message();
              localMessage.what = 1;
              localMessage.obj = str;
              this.c.sendMessage(localMessage);
            }
          }
        }
      }
      else
      {
        return;
        label325:
        i1 = 0;
        continue;
      }
      i1 += 1;
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131361905: 
      finish();
      return;
    case 2131362356: 
      this.j = false;
      this.g.setVisibility(4);
      return;
    }
    paramView = "";
    int i1 = 0;
    if (i1 < this.d.size())
    {
      String str1 = (String)this.l.b.get(((Integer)this.d.get(i1)).intValue());
      String str2;
      if (!this.e.e((String)this.l.b.get(((Integer)this.d.get(i1)).intValue())))
      {
        str2 = v.a(str1);
        if (str2.equals("txt"))
        {
          this.e.a((String)this.l.a.get(((Integer)this.d.get(i1)).intValue()), str1, "", "", "", "", "", "", 1, str2);
          label208:
          paramView = paramView + str1 + ",";
        }
      }
      for (;;)
      {
        i1 += 1;
        break;
        this.e.a((String)this.l.a.get(((Integer)this.d.get(i1)).intValue()), str1, "", "", "", "", "", "", 0, str2);
        break label208;
        Toast.makeText(this.a, str1 + " 已经存在", 0).show();
      }
    }
    if (!"".equals(paramView))
    {
      Toast.makeText(this.a, "添加：" + paramView + " 成功！", 0).show();
      return;
    }
    Toast.makeText(this.a, "你没有选择任何需要导入的书籍", 0).show();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903152);
    this.f = ((ImageButton)findViewById(2131361905));
    this.g = ((ProgressBar)findViewById(2131362354));
    this.h = ((Button)findViewById(2131362356));
    this.i = ((Button)findViewById(2131362357));
    this.f.setOnClickListener(this);
    this.h.setOnClickListener(this);
    this.i.setOnClickListener(this);
    this.d = new ArrayList();
    this.l.b.clear();
    this.l.a.clear();
    this.e = a.a(this.a);
    this.c = new gt(this);
    this.k = new du((Activity)this.a);
    paramBundle = this.k;
    Object localObject = o;
    paramBundle.a(this.a.getString(2131230852));
    new gu(this).start();
    paramBundle = this.a;
    localObject = this.a;
    paramBundle.getSystemService("layout_inflater");
    paramBundle = (ListView)findViewById(2131362358);
    this.b = new ArrayAdapter(this.a, 2130903142, this.l.b);
    paramBundle.setAdapter(this.b);
    paramBundle.setChoiceMode(2);
    paramBundle.setOnItemClickListener(new gv(this));
    Toast.makeText(getApplicationContext(), "本地书籍大小必须在" + m + "k才会被扫描出来", 1).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\SynchronizeLocalBooksActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */