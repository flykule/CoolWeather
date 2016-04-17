package udcastle.coolweather.util;

/**
 * Created by Administrator on 2016/4/16.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
