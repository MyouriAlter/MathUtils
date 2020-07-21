/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import static fu.util.MathUtil.computeFactorial;

/**
 *
 * @author innoc
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        //hy vọng ra 720 khi đưa số 6 cho
        System.out.println("6! = " + computeFactorial(6));
        
        //hy vọng ra 120 khi đưa số 5 cho
        System.out.println("5! = " + computeFactorial(5));

        //hy vọng ra 1 khi đưa số 1 cho
        System.out.println("1! = " + computeFactorial(1));

  
        //hy vọng ra 1 khi đưa số 0 cho
        System.out.println("0! = " + computeFactorial(0));

        
        //hy vọng ra ngoại lệ khi đưa số -5
        System.out.println("-5! = " + computeFactorial(-5));

        
        
        //phần code của hàm main() ta đang viết kiểu này gọi là test app
        //xem thử xem cái hàm cF() tính giai thừa chạy có đúng ko
        //để test phần mềm ta làm việc sau : 
        //1. Chuẩn bị data, ví dụ 5,6,7,0,1,2
        
        //2.Tính toán trước bằng tay xem
        //ví dụ tính trước đc rằng 6! = 720, 720 gọi là giá trị kì vọng (EXPECTED VALUE)
        
        //3. Gọi lệnh, gọi app, gọi hàm chạy thử với data đã chuẩn bị
        //coi xem hàm trả về số mấy, kết quả mấy
        //ví dụ khi chạy hàm cF(6) mà nó trả về 120, thì giá trị khi trả về
        //lúc chạy hàm gọi là ACTUAL VALUE
        
        //4. Cái hồi, mình phải so sánh xem EXPECTED VALUE và ACTUAL VALUE có trùng nhay hay ko
        //nếu trùng : tức là hàm xử lí ra kết quả như mình dự kiến -> hàm chạy 
        //đúng
        
        //nếu ko trùng : chết mẹ, tính sai, hay hàm tính sai, nói chung là sai
        
        //TEST : bản chất là chạy thử APP/Hàm, so sánh kết quả kì vọng có trước
        //với kết quả hàm thực sự xử lí và trả về
       
        //cách test này đơn giẩn, nhưng chưa hay
        //vì : mình nhìn kết quả = mắt, tự so sánh giữa giá trị trả về của hàm
        //và kì vọng
        //thêm nữa nó ko cầm mình disable nút Clean & Build
        //code sai logic mà vẫn ra file .jar, .ửa
        //ta cần 1 cách khác để đảm báo chất lượng code ngay khi viết code
        //ta cần dùng thêm thư viện phụ trợ giúp kiếm soát chất lượng code
        //đó là kĩ thuật TDD kèm UNIT TESTING
        //Xài thư viện JUnit, NUnit, TestNG
        //thư viện này ko bắt
        
    }
}
