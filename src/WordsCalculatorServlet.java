import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WordsCalculatorServlet", value="/wordsCalculator")
public class WordsCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tekst = request.getParameter("area");

        String[] tab = WordsCalculator.count(tekst);

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println(tekst + "<br>" + "<br>");
        writer.println("Ilość słów: " + tab[0] + "<br>");
        writer.println("Ilość znaków: " + tab[1] + "<br>");
        writer.println("Ilość znaków (bez spacji): " + tab[2] + "<br>");
        writer.println("Palindrom: " + tab[3]);

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
