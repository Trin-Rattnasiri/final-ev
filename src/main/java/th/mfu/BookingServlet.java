import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // รับข้อมูลจากฟอร์ม
        String station = request.getParameter("station");
        String timeslot = request.getParameter("timeslot");

        // ทำการจอง (ตรวจสอบความถูกต้องและเช็คสถานะการจอง)
        boolean isBookingSuccessful = performBookingLogic(station, timeslot);

        // ส่งผลลัพธ์กลับไปยังหน้าเว็บ
        if (isBookingSuccessful) {
            response.getWriter().write("Booking Successful!");
        } else {
            response.getWriter().write("Booking Failed. Please try again.");
        }
    }

    private boolean performBookingLogic(String station, String timeslot) {
        // นี่คือที่ที่คุณจะวางโค้ดที่จะดำเนินการจอง
        // ตัวอย่างเช่น: ตรวจสอบว่าช่องเวลานั้นๆ ว่างหรือไม่ และบันทึกข้อมูลการจองลงในฐานข้อมูล
        // คืนค่า true หากการจองสำเร็จ, false ถ้าไม่สำเร็จ
        return true;
    }
}
