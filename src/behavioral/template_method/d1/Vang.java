package behavioral.template_method.d1;

public class Vang extends HoaDon {

    @Override
    protected double tinhChietKhau(double tongTien) {
        if(tongTien<500){
            return 0;
        } else
            if (tongTien<1000) {
                return tongTien*0.03;
            }
            else {
                return tongTien * 0.05;
            }

    }
}
