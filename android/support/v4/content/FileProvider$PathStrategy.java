package android.support.v4.content;

import android.net.Uri;
import java.io.File;

abstract interface FileProvider$PathStrategy
{
  public abstract File getFileForUri(Uri paramUri);
  
  public abstract Uri getUriForFile(File paramFile);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\content\FileProvider$PathStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */