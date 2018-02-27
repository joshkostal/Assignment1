package order;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Movie;
import models.MovieShowing;
import models.Orders;
import models.Theatres;

@WebServlet("/UpdateShoppingCart")
public class UpdateShoppingCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateShoppingCart() {
        super();
    }

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Movie movie = (Movie) request.getAttribute("movie");
		Theatres theater = (Theatres) request.getAttribute("theater");
		MovieShowing showing = (MovieShowing) request.getAttribute("showing");
		String type = (String) request.getAttribute("type");
		int quantity = (Integer) request.getAttribute("quantity");
		
		HttpSession session = request.getSession();
		List<HashMap> cart = (List<HashMap>) session.getAttribute("cart");
		
		if(type.equals("add")){
			double price = quantity * showing.getPrice();
			
			Orders order = new Orders();
			if(order.checkValidQuantity(quantity)){
				HashMap cartItem = new HashMap(7);
				cartItem.put("movieId", movie.getId());
				cartItem.put("ticketQuantity", quantity);
				cartItem.put("movieName", movie.getTitle());
				cartItem.put("moviePoster", movie.getThumbnail());
				cartItem.put("theaterName", theater.getName());
				cartItem.put("showtime", showing.getStartTime());
				cartItem.put("price", price);
				
				cart.add(cartItem);
				
				session.setAttribute("cart", cart);
				
				int totalPrice = 0;
				for(HashMap item: cart){
					totalPrice += (Integer) item.get("price");
				}
				session.setAttribute("totalPrice", totalPrice);
			}			
		}
		else if(type.equals("delete")){
			int i=0;
			double price = 0;
			for(HashMap item: cart){
				if((Integer)item.get("movieId") == movie.getId() && (Integer) item.get("ticketQuantity") == quantity){
					price = (Double) item.get("price");
					cart.remove(i);
					break;
				}
				i++;
			}
			double totalPrice = (Double) session.getAttribute("totalPrice");
			totalPrice -= price;
			
			session.setAttribute("totalPrice", totalPrice);
			session.setAttribute("cart", cart);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("ViewAndCheckoutShoppingCart.jsp");
	    dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}