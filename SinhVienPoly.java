
package lab4;
public class SinhVienPoly {

 class SinhVienPoly {
    protected String hoTen;
    protected String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public double getDiem() {
        return 0;
    }

    public String getHocLuc() {
        return "";
    }

    public void xuat() {
        System.out.println("Họ tên: " + hoTen + ", Ngành học: " + nganh);
    }
}

class SinhVienIT extends SinhVienPoly {
    public SinhVienIT(String hoTen, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }
    private double diemJava;
    private double diemCss;
    private double diemHtml;
}