package com.ireadercity.b2.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

final class b
  extends SQLiteOpenHelper
{
  b(Context paramContext)
  {
    super(paramContext, "aireader_v2", null, 3);
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("create table if not exists book (book_id text primary key , path text  not null unique, title text not null, summary text, author text, publisher text, cover_path text, subject text, language text, status integer not null, type text not null, row_index integer, txt_chapter_size integer,store_bookurl text, store_bookid text,createddate text,last_reading_date text,last_chapter_id integer)");
    paramSQLiteDatabase.execSQL("create table if not exists chapter (_id integer primary key autoincrement, title text, src text, progress real, chapter_order integer, book_id text)");
    paramSQLiteDatabase.execSQL("create table if not exists bookmark (_id integer primary key autoincrement, title text , progress real , spine_id integer , chapter_id integer , createddate text ,book_id text)");
    paramSQLiteDatabase.execSQL("create table if not exists chapterspine(_id integer primary key autoincrement,title text,src text ,progress real,spine_order integer,book_id text)");
    paramSQLiteDatabase.execSQL("create table if not exists category(category_id integer primary key autoincrement,categoryname text,parentcategoryid integer,categorylevel integer,latestmodifytime text,createdtime text)");
    paramSQLiteDatabase.execSQL("create table if not exists rsbookcategory(rs_id integer primary key autoincrement,category_id integer ,book_id text)");
    paramSQLiteDatabase.execSQL("create table if not exists downloadinfo (_id integer primary key autoincrement, storebookid text unique, book_full_url text unique, current_step integer , local_abs_path text , totle_size long, downloaded_size long , book_author text , book_title text , book_desc text  , last_operationtime long)");
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    new StringBuilder("更新表----------------------->oldversion").append(paramInt1).append("newversion:").append(paramInt2).toString();
    if (paramInt1 == 1)
    {
      paramSQLiteDatabase.execSQL("create table if not exists category(category_id integer primary key autoincrement,categoryname text,parentcategoryid integer,categorylevel integer,latestmodifytime text,createdtime text)");
      paramSQLiteDatabase.execSQL("create table if not exists rsbookcategory(rs_id integer primary key autoincrement,category_id integer ,book_id text)");
    }
    if (paramInt2 == 3) {
      paramSQLiteDatabase.execSQL("create table if not exists downloadinfo (_id integer primary key autoincrement, storebookid text unique, book_full_url text unique, current_step integer , local_abs_path text , totle_size long, downloaded_size long , book_author text , book_title text , book_desc text  , last_operationtime long)");
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */