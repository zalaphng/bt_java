package behavioral.template_method.d1;

public class ThanThiet extends HoaDon {

    @Override
    protected double tinhChietKhau(double tongTien) {

        if(tongTien<500){
            return 0;
        }
        else
        {
            return tongTien*0.02;
        }
    }

}
