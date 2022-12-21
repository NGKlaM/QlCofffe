package g;


    import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

    public class Qlpt {
        public static void main(String[] args) {
            List<PhongTro> danhSachPhongTro = new ArrayList<>();
            PhongTro phongTro1 = new PhongTro("pt1",1,2000.5, null,null,null);
            PhongTro phongTro2 = new PhongTro("pt2",1,2000.5, LocalDate.now(),LocalDate.now().plusDays(5),"kien");
            PhongTro phongTro3 = new PhongTro("pt3",1,2000.5, LocalDate.now(),LocalDate.now().plusDays(5),"dung");
            PhongTro phongTro4 = new PhongTro("pt4",1,2000.5, LocalDate.now(),LocalDate.now().plusDays(5),"loc");
            PhongTro phongTro5 = new PhongTro("pt5",1,2000.5, LocalDate.now(),LocalDate.now().plusDays(5),"thai");
            PhongTro phongTro6 = new PhongTro("pt6",1,2000.5, null,null,null);
            danhSachPhongTro.add(phongTro1);
            danhSachPhongTro.add(phongTro2);
            danhSachPhongTro.add(phongTro3);
            danhSachPhongTro.add(phongTro4);
            danhSachPhongTro.add(phongTro5);
            danhSachPhongTro.add(phongTro6);
            for (PhongTro phongTro : danhSachPhongTro) {
                System.out.println(phongTro);
            }
            System.out.println("phong tro chưa có người thuê :");
            for (int i = 0; i < danhSachPhongTro.size(); i++) {
                LocalDate ngayThue = danhSachPhongTro.get(i).getNgayThue();
                LocalDate ngayKetThuc = danhSachPhongTro.get(i).getNgayKetThuc();
                String ngThue = danhSachPhongTro.get(i).getTenNguoiThue();
                if (ngayThue == null && ngayKetThuc == null && ngThue == null){
                    System.out.println(danhSachPhongTro.get(i));
                }
            }
            System.out.println();
            System.out.println();
            System.out.println("tìm kiếm phòng trọ theo ngày kết thúc: ");
            for (int i = 0; i < danhSachPhongTro.size(); i++) {
                LocalDate ngayKetThuc = danhSachPhongTro.get(i).getNgayKetThuc();
                if (ngayKetThuc != null && ngayKetThuc.isBefore(LocalDate.now().plusDays(10))){
                    System.out.println(danhSachPhongTro.get(i));
                }
            }

            System.out.println("cau 4: ");
            System.out.println("danh sach phong cho thue");
            for (int i = 0; i < danhSachPhongTro.size(); i++) {
                LocalDate ngayThue = danhSachPhongTro.get(i).getNgayThue();
                LocalDate ngayKetThuc = danhSachPhongTro.get(i).getNgayKetThuc();
                String ngThue = danhSachPhongTro.get(i).getTenNguoiThue();
                if (ngayThue == null && ngayKetThuc == null && ngThue == null){
                    System.out.println(danhSachPhongTro.get(i));
                }
            }
            System.out.println("xin mời nhập ten phòng muốn thuê");
            String ten = "pt1";
            PhongTro phongTroK = new PhongTro() ;
            int viTri = 0;
            for (int i = 0; i < danhSachPhongTro.size(); i++) {
                String tenPhong = danhSachPhongTro.get(i).getTenPhongTro();
                if (tenPhong.equals(ten)){
                    phongTroK = danhSachPhongTro.get(i);
                    viTri = i;
                }
            }
            System.out.println("sau khi tim kiếm tên");
            System.out.println(phongTroK);
            phongTroK.setNgayThue(LocalDate.now());
            phongTroK.setNgayKetThuc(LocalDate.now().plusMonths(1));
            phongTroK.setTenNguoiThue("kiên");
            danhSachPhongTro.set(viTri,phongTroK);
            System.out.println("danh sách sau khi cho thuê:");
            for (PhongTro phongTro : danhSachPhongTro) {
                System.out.println(phongTro);
            }
            System.out.println("phong tro chưa có người thuê :");
            for (int i = 0; i < danhSachPhongTro.size(); i++) {
                LocalDate ngayThue = danhSachPhongTro.get(i).getNgayThue();
                LocalDate ngayKetThuc = danhSachPhongTro.get(i).getNgayKetThuc();
                String ngThue = danhSachPhongTro.get(i).getTenNguoiThue();
                if (ngayThue == null && ngayKetThuc == null && ngThue == null){
                    System.out.println(danhSachPhongTro.get(i));
                }
            }
            System.out.println("xóa: ");
            System.out.println("nhập tên cần xóa");
            for (int i = 0; i < danhSachPhongTro.size(); i++) {
                String tenPT = danhSachPhongTro.get(i).getTenPhongTro();
                if (tenPT.equals(ten)){
                    danhSachPhongTro.remove(i);
                }
            }

            System.out.println("sau khi xóa");
            for (PhongTro phongTro : danhSachPhongTro) {
                System.out.println(phongTro);
            }

        }
    }