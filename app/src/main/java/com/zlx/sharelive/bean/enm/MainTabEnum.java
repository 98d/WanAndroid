package com.zlx.sharelive.bean.enm;

import com.zlx.sharelive.R;
import com.zlx.sharelive.ui.FourthFg;
import com.zlx.sharelive.ui.HomeFg;
import com.zlx.sharelive.ui.SecondFg;
import com.zlx.sharelive.ui.ThirdFg;

/**
 * @date: 2019\3\5 0005
 * @author: zlx
 * @email: 1170762202@qq.com
 * @description:
 */
public enum MainTabEnum {
    TAB1(0, "home", HomeFg.class, R.color.tab_text, R.color.white, R.drawable.icon_tab1_normal,
            R.drawable.icon_tab1_press, R.color.tab),
    TAB2(1, "beauty", SecondFg.class, R.color.tab_text, R.color.white, R.drawable.icon_beauty_normal,
            R.drawable.icon_beauty_pressed, R.color.tab_light),
    TAB3(2, "test", ThirdFg.class, R.color.tab_text, R.color.white, R.drawable.icon_tab1_normal,
            R.drawable.icon_tab1_press, R.color.tab_dark),
    TAB4(3, "test", FourthFg.class, R.color.tab_text, R.color.white, R.drawable.icon_tab1_normal,
            R.drawable.icon_tab1_press, R.color.gray);

    private int id;
    private String text;
    private int text_normal;
    private int text_pressed;
    private int drawable_normal;
    private int drawable_pressed;
    private int rippleColor;
    private Class<?> cls;

    MainTabEnum() {
    }


    MainTabEnum(int id, String text, Class<?> cls, int text_normal, int text_pressed,
                int drawable_normal, int drawable_pressed, int rippleColor) {
        this.id = id;
        this.cls = cls;
        this.text = text;
        this.text_normal = text_normal;
        this.text_pressed = text_pressed;
        this.drawable_normal = drawable_normal;
        this.drawable_pressed = drawable_pressed;
        this.rippleColor = rippleColor;
    }

    public static MainTabEnum getTab(int pos) {
        for (MainTabEnum tab : values()) {
            if (pos == tab.getId()) {
                return tab;
            }
        }
        return null;
    }

    public int getText_normal() {
        return text_normal;
    }

    public void setText_normal(int text_normal) {
        this.text_normal = text_normal;
    }

    public int getText_pressed() {
        return text_pressed;
    }

    public void setText_pressed(int text_pressed) {
        this.text_pressed = text_pressed;
    }

    public int getDrawable_normal() {
        return drawable_normal;
    }

    public void setDrawable_normal(int drawable_normal) {
        this.drawable_normal = drawable_normal;
    }

    public int getDrawable_pressed() {
        return drawable_pressed;
    }

    public void setDrawable_pressed(int drawable_pressed) {
        this.drawable_pressed = drawable_pressed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Class<?> getCls() {
        return cls;
    }

    public void setCls(Class<?> cls) {
        this.cls = cls;
    }

    public int getRippleColor() {
        return rippleColor;
    }

    public void setRippleColor(int rippleColor) {
        this.rippleColor = rippleColor;
    }
}
