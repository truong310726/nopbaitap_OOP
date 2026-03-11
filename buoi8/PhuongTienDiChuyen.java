package buoi8;

public abstract class PhuongTienDiChuyen {
    protected String tenPhuongTien;
    
    public String getTenPhuongTien() {
        return tenPhuongTien;
    }

    public void batDau()
    {
        System.out.println(tenPhuongTien + " bat dau di chuyen");
    };
    public void tangToc()
    {
        System.out.println(tenPhuongTien + " tang toc");
    };
    public void dungLai()
    {
        System.out.println(tenPhuongTien + " dung lai");
    };

    public abstract double layVanToc();
}

class MayBay extends PhuongTienDiChuyen
{
    private String loaiNhienLieu;
    @Override
    public double layVanToc() {
        return 800; // van toc cua may bay la 800 km/h
    }

    public void catCanh()
    {
        System.out.println("May bay cat canh");
    }

    public void haCanh()
    {
        System.out.println("May bay ha canh");
    }
}

class XeOto extends PhuongTienDiChuyen
{
    private String loaiNhienLieu;
    @Override
    public double layVanToc() {
        return 120; // van toc cua xe oto la 120 km/h
    }
}

class XeDap extends PhuongTienDiChuyen
{
    @Override
    public double layVanToc() {
        return 20; // van toc cua xe dap la 20 km/h
    }
}
