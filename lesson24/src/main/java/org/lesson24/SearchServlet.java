package org.lesson24;

import org.lesson24.domain.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {

    private final DataBase dataBase = new DataBase();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String brandName = req.getParameter("car_brand");

        List<Car> cars = dataBase.getByBrand(brandName);

        req.setAttribute("cars" , cars);
        req.getRequestDispatcher("/home.jsp").forward(req, resp);

    }
}
