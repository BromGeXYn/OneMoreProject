package org.lesson24;

import org.lesson24.domain.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/add")
public class AddServlet extends HttpServlet {

    private final DataBase dataBase = new DataBase();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String model = req.getParameter("model");
        String brand = req.getParameter("car_brand");
        int year = Integer.parseInt(req.getParameter("year"));
        String color = req.getParameter("color");
        Car car = new Car();
        car.setModel(model);
        car.setBrandName(brand);
        car.setYear(year);
        car.setColor(color);
        dataBase.createCar(car);

        req.getRequestDispatcher("/home").forward(req, resp);

    }
}
