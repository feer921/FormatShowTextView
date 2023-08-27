package com.fee.formatshowtextview

import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.fee.showtextview.FormatShowTextView

/**
 ******************(^_^)***********************<br>
 * Author: fee(QQ/WeiXin:1176610771)<br>
 * <P>DESC:
 * [FormatShowTextView] 示例界面
 * </p>
 * ******************(^_^)***********************
 */
class FormatShowTextDemoActivity : AppCompatActivity(),FormatShowTextView.ICanShowTextView {

    private lateinit var tvVerifyCode: FormatShowTextView
    private lateinit var tvCustomSettings: FormatShowTextView
    private lateinit var tvHideText: FormatShowTextView
    private lateinit var tvShowCustomView: FormatShowTextView

    private lateinit var tvShowBgView: FormatShowTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.format_show_text_view_demo)

        tvVerifyCode = findViewById(R.id.tvVerifyCode)

        tvCustomSettings = findViewById(R.id.tvCustomSettings)

        tvHideText = findViewById(R.id.tvHideText)
        tvShowCustomView = findViewById(R.id.tvShowCustomView)

        tvShowBgView = findViewById(R.id.tvShowBgView)
        tvShowBgView.defShowTextViews?.forEach {
            it.typeface = Typeface.DEFAULT_BOLD
        }
    }

    override fun showText(textToShow: CharSequence?,textIndex: Int) {
    }

    override fun theViewSelf(belongIndex: Int): View? {
        return null
    }

}