
package lab4;
 class ChuNhat {
    protected double rong, dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getChuVi() {
        return (rong + dai) * 2;
    }

    public double getDienTich() {
        return rong * dai;
    }

    public void xuat() {
        System.out.println("Chieu rong: " + rong);
        System.out.println("Chieu dai: " + dai);
        System.out.println("Dien tich: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}

class Vuong extends ChuNhat {
    public Vuong(double canh) {
        super(canh, canh);
    }

