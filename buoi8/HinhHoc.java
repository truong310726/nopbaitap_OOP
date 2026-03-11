package buoi8;

public abstract class HinhHoc
{
    public final float PI = 3.14f;
    public String ten;
    public float chuVi;
    public float dienTich;
    public float theTich;

    public HinhHoc(){}
    public void xuatTen()
    {
        System.out.println("Ten: " + ten);
    }
    public void xuatChuVi()
    {
        System.out.println("Chu vi: " + chuVi);
    }
    public void xuatDienTich()
    {
        System.out.println("Dien tich: " + dienTich);
    }
    public void xuatTheTich()
    {
        System.out.println("The tich: " + theTich);
    }
}
class HinhTron extends HinhHoc
{
    public float banKinh;
    public HinhTron()
    {
        this.banKinh = 0;
        ten = "Hinh tron";
        super.chuVi = 2 * PI * banKinh;
        super.dienTich = PI * banKinh * banKinh;
    }

    public void nhapBanKinh(float banKinh)
    {
        this.banKinh = banKinh;
        super.chuVi = 2 * PI * banKinh;
        super.dienTich = PI * banKinh * banKinh;
    }

    public void tinhChuVi()
    {
        super.chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich()
    {
        super.dienTich = PI * banKinh * banKinh;
    }
}

class HinhTru extends HinhTron
{
    public float chieuCao;
    public HinhTru()
    {
        this.chieuCao = 0;
        ten = "Hinh tru";
        super.theTich = super.dienTich * this.chieuCao;
    }

    public void nhapChieuCao(float chieuCao)
    {
        this.chieuCao = chieuCao;
        super.theTich = super.dienTich * this.chieuCao;
    }

    public void tinhTheTich()
    {
        super.theTich = super.dienTich * this.chieuCao;
    }
}

class HinhChuNhat extends HinhHoc
{
    public float chieuDai;
    public float chieuRong;
    public HinhChuNhat()
    {
        this.chieuDai = 0;
        this.chieuRong = 0;
        ten = "Hinh chu nhat";
        super.chuVi = 2 * (chieuDai + chieuRong);
        super.dienTich = chieuDai * chieuRong;
    }

    public void nhapChieuDai(float chieuDai)
    {
        this.chieuDai = chieuDai;
        super.chuVi = 2 * (chieuDai + chieuRong);
        super.dienTich = chieuDai * chieuRong;
    }

    public void nhapChieuRong(float chieuRong)
    {
        this.chieuRong = chieuRong;
        super.chuVi = 2 * (chieuDai + chieuRong);
        super.dienTich = chieuDai * chieuRong;
    }

    public void tinhChuVi()
    {
        super.chuVi = 2 * (chieuDai + chieuRong);
    }

    public void tinhDienTich()
    {
        super.dienTich = chieuDai * chieuRong;
    }
}

class HinhVuong extends HinhChuNhat
{
    public HinhVuong()
    {
        ten = "Hinh vuong";
    }

    public void nhapCanh(float canh)
    {
        super.chieuDai = canh;
        super.chieuRong = canh;
        super.chuVi = 2 * (super.chieuDai + super.chieuRong);
        super.dienTich = super.chieuDai * super.chieuRong;
    }
}