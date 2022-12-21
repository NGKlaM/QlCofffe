package g;
import java.time.LocalDate;


public class PhongTro {
    private String tenPhongTro;
    private Integer soPhong;
    private Double giaThue;
    private LocalDate ngayThue;
    private LocalDate ngayKetThuc;
    private String tenNguoiThue;

    public PhongTro(){}

    public PhongTro(String tenPhongTro, Integer soPhong, Double giaThue, LocalDate ngayThue, LocalDate ngayKetThuc, String tenNguoiThue) {
        this.tenPhongTro = tenPhongTro;
        this.soPhong = soPhong;
        this.giaThue = giaThue;
        this.ngayThue = ngayThue;
        this.ngayKetThuc = ngayKetThuc;
        this.tenNguoiThue = tenNguoiThue;
    }

    public String getTenPhongTro() {
        return tenPhongTro;
    }

    public void setTenPhongTro(String tenPhongTro) {
        this.tenPhongTro = tenPhongTro;
    }

    public Integer getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(Integer soPhong) {
        this.soPhong = soPhong;
    }

    public Double getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(Double giaThue) {
        this.giaThue = giaThue;
    }

    public LocalDate getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(LocalDate ngayThue) {
        this.ngayThue = ngayThue;
    }

    public LocalDate getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(LocalDate ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getTenNguoiThue() {
        return tenNguoiThue;
    }

    public void setTenNguoiThue(String tenNguoiThue) {
        this.tenNguoiThue = tenNguoiThue;
    }

    @Override
    public String toString() {
        return "PhongTro{" +
                "tenPhongTro='" + tenPhongTro + '\'' +
                ", soPhong=" + soPhong +
                ", giaThue=" + giaThue +
                ", ngayThue=" + ngayThue +
                ", ngayKetThuc=" + ngayKetThuc +
                ", tenNguoiThue='" + tenNguoiThue + '\'' +
                '}';
    }

}
