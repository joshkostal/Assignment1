package order;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Movie;
import models.MovieShowing;
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
		
		HttpSession session = request.getSession();
		
		if(type.equals("add")){
			int quantity = (Integer) request.getAttribute("quantity");
			double price = quantity * showing.getPrice();
			
			HashMap cartItem = new HashMap(7);
			cartItem.put("movieId", movie.getId());
			cartItem.put("ticketQuantity", quantity);
			cartItem.put("movieName", movie.getTitle());
			cartItem.put("moviePoster", movie.getThumbnail());
			cartItem.put("theaterName", theater.getName());
			cartItem.put("showtime", showing.getStartTime());
			cartItem.put("price", price);
			
			List<HashMap> cart = (List<HashMap>) session.getAttribute("cart");
			cart.add(cartItem);
			
			session.setAttribute("cart", cart);
		}
		else if(type.equals("delete")){
			
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

//	o This servlet should also handle delete requests to delete the items from the
//	shopping cart, which means removing from the shopping cart session object.
//	o After handling an update (add or delete) request, it should verify the availability
//	of the movie tickets for the specified showing based on the requested quantity. If
//	success, compute the total cost of the entire shopping cart.
//	o Now redirect the customer to the View & Checkout Shopping Cart jsp page with
//	all the above shopping cart information stored in the session object.

}
