package behavioral.template_method.d1;

public class KimCuong extends HoaDon {

    @Override
    protected double tinhChietKhau(double tongTien) {
        if(tongTien<500){
            return tongTien;
        } else
            if (tongTien<1000) {
            return tongTien * 0.03;
            } else
                if (tongTien<1500) {
                    return tongTien*0.05;
                }else {
                    return tongTien*0.06;
                }
    }

}
