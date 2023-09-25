import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/servlet1")
public class Servlet1 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("servlet1 INIT");
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("id", "user");
        cookie.setMaxAge(-1);
        resp.addCookie(cookie);
        PrintWriter writer = resp.getWriter();
        writer.println("Servlet 1 here!");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}
