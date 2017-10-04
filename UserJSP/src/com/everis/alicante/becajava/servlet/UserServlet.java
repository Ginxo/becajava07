package com.everis.alicante.becajava.servlet;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.everis.alicante.becajava.domain.Booking;
import com.everis.alicante.becajava.domain.User;
import com.everis.alicante.becajava.implementaciones.UserDAOJPAImpl;
import com.everis.alicante.becajava.interfaces.UserDAO;

public class UserServlet extends HttpServlet {
	
	private static Logger logger=Logger.getLogger(UserServlet.class);
	
	private final String PAGINAUSUARIO="userInfo.jsp";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String option=req.getParameter("option");
			
		logger.info("#### han elegido la opcion : " + option +", desde el equipo: " + req.getLocalName());
				
		System.out.println("hola");
		
		switch (option) {
		case "1":
			
			logger.debug("voy a redireccionar a insertuser.jsp");
			
			resp.sendRedirect("insertuser.jsp");
			break;
			
		case "2":
			
			resp.sendRedirect("searchuser.jsp");
			break;
		default:
			
			resp.sendRedirect("menu.jsp");
			break;
		}
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String option=req.getParameter("option");
		
		switch (option) {
		
		case "1":
			
		//dar de alta usuario
			
			User user= new User();
			user.setName(req.getParameter("name"));
			user.setSurname(req.getParameter("surname"));
			
			UserDAO dao=new UserDAOJPAImpl();
			dao.insertUser(user);
					
			resp.sendRedirect("menu.jsp");
			
			break;
			
		case "2":
			
			String id=req.getParameter("id");
			String name=req.getParameter("name");
			
			Booking booking= new Booking();
			booking.setBookingdate(Calendar.getInstance().getTime());

			
			if(id!=null&&!id.isEmpty()) {
			
				logger.debug("busqueda de usuario con id: " + id);			
				
				UserDAO dao2=new UserDAOJPAImpl();
				User user2=dao2.findUserById(Integer.parseInt(id));									
				
				if(user2 !=null) {
				
					RequestDispatcher dispatcher = req.getRequestDispatcher(PAGINAUSUARIO);
					
					req.setAttribute("user", user2);	
					req.setAttribute("reserva", booking);	
					dispatcher.forward(req, resp);
				
				}{
					RequestDispatcher dispatcher = req.getRequestDispatcher(PAGINAUSUARIO);
					
					req.setAttribute("name", "No se ha encontrado el nombre del usuario");
					req.setAttribute("surname", "No se ha encontrado el apellido del usuario");
					dispatcher.forward(req, resp);
				}
			
			}else {
				
				logger.debug("busqueda de usuario con name: " + name);			
				
				UserDAO dao2=new UserDAOJPAImpl();
				User user2=dao2.findUserByName(name);			
					
				//logica de pasarle las clase java user a la pagina de resultado
				
				if(user2 !=null) {
				
					RequestDispatcher dispatcher = req.getRequestDispatcher(PAGINAUSUARIO);
					
					req.setAttribute("user", user2);	
					req.setAttribute("reserva", booking);	
					dispatcher.forward(req, resp);
				
				}{
					RequestDispatcher dispatcher = req.getRequestDispatcher(PAGINAUSUARIO);
					
					req.setAttribute("name", "No se ha encontrado el nombre del usuario");
					req.setAttribute("surname", "No se ha encontrado el apellido del usuario");
					dispatcher.forward(req, resp);
				}
				
				
				
			}
			
			
			break;
			
		default:
			
			break;
			
		}
		
	}
	
	

}
