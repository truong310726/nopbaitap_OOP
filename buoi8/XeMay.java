package buoi8;

public abstract class XeMay
{
    public abstract void brake();
}

class XeMayTT extends XeMay
{
    @Override
    public void brake()
    {
        System.out.println("Xe may TT");
    }
}

class XeMayLeoNui extends XeMay
{
    @Override
    public void brake()
    {
        System.out.println("Xe may leo nui");
    }
}