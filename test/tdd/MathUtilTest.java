/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import fu.util.MathUtil;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author innoc
 */
public class MathUtilTest {
    
    @Test
    public void testSuccessfulCases() {
        //hàm này test nhưng tình huống thành công
        //tức là đưa đầu vào tử tế cho hàm cF()
        //Assert.assertEquals(55, 55);
        Assert.assertEquals(1 ,MathUtil.computeFactorial(0));
        Assert.assertEquals(1 ,MathUtil.computeFactorial(1));
        Assert.assertEquals(2 ,MathUtil.computeFactorial(2));
        Assert.assertEquals(6 ,MathUtil.computeFactorial(3));
        Assert.assertEquals(24 ,MathUtil.computeFactorial(4));
        Assert.assertEquals(120 ,MathUtil.computeFactorial(5));
        
    }   
    
        //-> Mỗi @Test biến hàm thành một hàm main() riêng biệt và Shift-F6 chạy
        // cmt @Test phế hàm này thành hàm bth, ko chạy đc trong lần shift-F6
        // trò này do thu viện JUnit nó bày ra, bày thêm màu sắc XANH, ĐỎ nữa
    @Test(expected = IllegalArgumentException.class) 
    public void testFailedCases() {
        //hàm này test những huống cà chớn, tức là đưa đầu vào cà chớn
        //ví dụ cF(-5) sao mà tính đc, cF(20) to quá, tràn số
        //Ngoại lệ là 1 tình huống ko thể so sánh
        //Exception là 1 tình huống ko dự liệu đc, do đó nó ko có value
        //do đó ko thể so sánh đc, do đó ko thể xài hàm assertEquals()
        //do hàm này nó so sánh theo values để đưa ra màu sắc
        //do đó ta phải xài chiêu khác khi chơi với ngoại lệ
        //ta kì vọng rằng khi đưa ra cF(-5) thì hàm cF(-5) m sẽ ném 
        //ra cái ngoại lệ thông báo rằng hàm số cà chớn
        //câu này viết thế nào trong code để ra đc màu xanh hay đỏ
        MathUtil.computeFactorial(-5);
        
    }
}

//dù code bạn sai logic nhưng bạn vẫn ra được file.rar, .war khi clean & build
//nguy hiểm, ko tốt tẹo nào
//ta sẽ chơi trò disable nút bấm clean & build nếu code còn đang màu đỏ
//tức là sai logic do xử lí ko như kì vọng
//chơi với JUnit thì làm đc trò này
//chơi truyền thống sout() JOptionPane, ghi ra file log môn thầy Khánh.
//thua, kiểu nào cũng ra đc .jar, .war nếu ko sai cú pháp
//hãy nhớ 2 con số : NB 8.2  1005, NB trở lên : 1204
