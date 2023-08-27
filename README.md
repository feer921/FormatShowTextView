# FormatShowTextView
一个格式化显示所输入的文本的控件，可用于验证码的输入显示等可自定义显示格式的控件

## 本自定义控件能实现以下功能以及可扩展

![使用控件效果图](https://github.com/Lyphy999/FormatShowTextView/blob/master/arts/demo1.png)

## 使用

```xml
<com.fee.showtextview.FormatShowTextView
        android:id="@+id/tvCustomSettings"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        app:showDebugInputText="true"
        app:showTextColor="#f00"
        app:showTextViewBackground="#0af"
        app:showTextViewCount="6"
        tools:showDebugText="999999" />
```

## 自定义属性:

| 属性名称               | 功能作用                                                     |
| ---------------------- | :----------------------------------------------------------- |
| showDebugText          | 在xml中写控件时，可用于预览效果，推荐使用 tools:命名空间     |
| showTextReplacedToStr  | 设置用户所输入的文本将被替代要显示成的字符串，如："*",让用户输入字符后被替换为"\*"这个字符 |
| showTextViewCount      | 要显示文本的控件个数,如：需求验证码为6位数，则配置成　6      |
| showTextViewWidth      | 设置显示文本的控件的宽                                       |
| showTextViewHeight     | 设置显示文本的控件的高                                       |
| showTextViewGapWidth   | 显示文本控件间的间距宽                                       |
| showTextSize           | 设置显示文本的字体大小                                       |
| showTextColor          | 设置显示文本的颜色                                           |
| showTextViewBackground | 设置显示文本的控件的背景                                     |
| showDebugInputText     | 是否显示出内部EditText输入的文本(主要用于调试时查看)         |
| editTextBg             | 内部的输入控件的背景                                         |
| android:inputType      | 用于指定本控件的输入类型，如：不是用于验证码功能时，可以指定"text" |

## 默认情况下

可以直接使用控件的实例对象，获取内部的默认实现的　TextView[] 控件进一步来设置显示文本的控件样式，如：

```kotlin
val tvShowBgView: FormatShowTextView = findViewById(R.id.tvShowBgView)
tvShowBgView.defShowTextViews?.forEach {
            it.typeface = Typeface.DEFAULT_BOLD //给显示文本的控件设置成粗体显示
        }
```

