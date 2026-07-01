package android.support.v4.content;

import android.content.Intent;
import java.util.ArrayList;

class LocalBroadcastManager$BroadcastRecord
{
  final Intent intent;
  final ArrayList<LocalBroadcastManager.ReceiverRecord> receivers;
  
  LocalBroadcastManager$BroadcastRecord(Intent paramIntent, ArrayList<LocalBroadcastManager.ReceiverRecord> paramArrayList)
  {
    this.intent = paramIntent;
    this.receivers = paramArrayList;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\content\LocalBroadcastManager$BroadcastRecord.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */