package com.jason.springcloud;

/**
 * @author jasonLu
 * @date 2017/5/17 10:01
 * @Description:
 */
public enum TestEnum
{
    RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);

    private String colorName;

    private int index;

    TestEnum(String colorName, int index)
    {
        this.colorName = colorName;
        this.index = index;
    }

    public String getName(int index)
    {
        for (TestEnum testEnum : TestEnum.values()) {
            if (testEnum.getIndex() == index) {
                return testEnum.colorName;
            }
        }
        return null;
    }

    public String getColorName()
    {
        return colorName;
    }

    public void setColorName(String colorName)
    {
        this.colorName = colorName;
    }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }
}
