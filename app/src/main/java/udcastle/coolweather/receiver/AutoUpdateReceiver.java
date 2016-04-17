package udcastle.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import udcastle.coolweather.service.AutoUpdateService;

/**
 * Created by Administrator on 2016/4/17.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent intent1 = new Intent(context, AutoUpdateService.class);
        context.startService(intent);
    }
}
