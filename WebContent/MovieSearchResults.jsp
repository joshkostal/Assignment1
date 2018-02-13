<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="NiceLayout.css">
<title>Search Results</title>
</head>
<body>
<div id="topsection"><div class="innertube"><h1>
<a type="button" class="btn btn-info" href="CustomerHomePage.jsp">Home</a>
<a type="button" class="btn btn-warning" href="ViewOrders.jsp">View Order</a>
<a type="button" class="btn btn-danger" href="Login.jsp">Log out</a></h1></div></div>
<table>
  <tr>
    <th>Theater Name</th>
    <th>Screen Number</th>
    <th>Showtime</th>
    <th>Available Seats</th>
    <th>Price</th>
    <th>Poster</th>
    <th></th>
  </tr>
  <tr>
    <td>Marcus Grande</td>
    <td>5</td>
    <td>6:30pm</td>
    <td>34</td>
    <td>$10.50</td>
    <td><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR83_t_x7tsPJuDTDr-ki38X9wMJAP7sFDTq_aql1FmDpmqEnlRng"></td>
    <td><a type="button" class="btn btn-warning" href="MovieDetailsSelection.jsp">View Details</a></td>
  </tr>
  <tr>
    <td>Community Playhouse</td>
    <td>2</td>
    <td>4:15pm</td>
    <td>10</td>
    <td>$6.00</td>
    <td><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR83_t_x7tsPJuDTDr-ki38X9wMJAP7sFDTq_aql1FmDpmqEnlRng"></td>
    <td><a type="button" class="btn btn-warning" href="MovieDetailsSelection.jsp">View Details</a></td>
  </tr>
  <tr>
    <td>Marcus Grande East</td>
    <td>12</td>
    <td>12:30pm</td>
    <td>8</td>
    <td>$8.00</td>
    <td><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2k7b8gFohCLPcg1C6rChgur99xh1G2FtnnoJ7-7S6H14pBIP37w"></td>
    <td><a type="button" class="btn btn-warning" href="MovieDetailsSelection.jsp">View Details</a></td>
  </tr>
  <tr>
    <td>AMC Cinema</td>
    <td>7</td>
    <td>2:00pm</td>
    <td>40</td>
    <td>$10.00</td>
    <td><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2k7b8gFohCLPcg1C6rChgur99xh1G2FtnnoJ7-7S6H14pBIP37w"></td>
    <td><a type="button" class="btn btn-warning" href="MovieDetailsSelection.jsp">View Details</a></td>
  </tr>
</table>

</body>
</html>

<!-- This page displays a list of movie showings that satisfy the search query (movie name matches and the movie is shown at the selected theatre). -->
<!-- For Assignment 1, you should only display random results since no query is being executed. -->
<!-- The random data you generate should be of tabular format with the following columns: -->
	<!-- Names of the theatre building showing the movie -->
	<!-- Theatre number in the building showing the movie -->
	<!-- Showtime of the movie -->
	<!-- Number of available seats -->
	<!-- Price -->
	<!-- Thumbnail of the movie poster -->
<!-- Each result must have a “View Details” button (this takes to the MovieDetailsAndSelection.jsp page) to view more details and purchase seats for the movie. -->
<!-- For this assignment, use placeholder values for all variables. -->
<!-- This page should also have a link to the ViewOrder.jsp page. -->
<!-- It should have logout option upon clicking that takes to the Login page. -->

<!-- Displays the Movie object received from the Theatre and Movie Search Query -->
<!-- servlet in a suitable format to the user with the following information: -->
<!-- ! Movie name -->
<!-- ! Name of the theatre building showing the movie -->
<!-- ! Showtime of the movie -->
<!-- ! Price -->
<!-- ! Number of available seats -->
<!-- ! Movie poster thumbnail -->
<!-- o Each entry must also have a “View Movie Details” button that allows the -->
<!-- customer to view more movie details and add tickets for the movie to the -->
<!-- shopping cart. -->
<!-- o Clicking on the “View Movie Details” button calls the Movie Search Results -->
<!-- servlet and passes the movie object. -->