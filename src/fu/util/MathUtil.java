/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util;

/**
 *
 * @author innoc
 */
//class này chứa các hàm tiện ích để hộ trợ các phép tính toán
//vì mày là tiện ích hàm ý dùng chung cho mọi nơi
//do đó chúng mày sẽ là static
public class MathUtil {
    //hàm giai thừa n! = 1.2.3.4.....n bùng nổ kết quả rất nhanh 
    //nên tràn int (2 tỉ 1) rất sớm, ta trả về long có 15!.
    public static long computeFactorial(int n){
        //cứ viết, sai đúng từ từ tính
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
