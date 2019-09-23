package com.fee.showtextview;

import android.content.Context;

/**
 * ******************(^_^)***********************<br>
 * User: fee(QQ/WeiXin:1176610771)<br>
 * Date: 2019/9/23<br>
 * Time: 17:45<br>
 * <P>DESC:
 * </p>
 * ******************(^_^)***********************
 */
public class PxUtil {
    /**
     * 根据资源文件中的dimen Res id 来获取对应的像素值
     * @param context
     * @param dimeResId
     * @return
     */
    public static int getDimenResPixelSize(Context context, int dimeResId) {
        return context.getResources().getDimensionPixelSize(dimeResId);
    }
}
